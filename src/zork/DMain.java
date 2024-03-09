package zork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DMain
{
	/* DUNGEON-- MAIN PROGRAM */

	/* COPYRIGHT 1980, INFOCOM COMPUTERS AND COMMUNICATIONS, CAMBRIDGE MA. 02142 */
	/* ALL RIGHTS RESERVED, COMMERCIAL USAGE STRICTLY PROHIBITED */
	/* WRITTEN BY R. M. SUPNIK */
	public static Vars vars = null;

	public static void main(String[] args)
			throws IOException /* void changed to int, Volker Blasius, 11jul93 */
	{




		/* 1) INITIALIZE DATA STRUCTURES */
		/* 2) PLAY GAME */
		vars = new Vars();

		File points_file = new File("points.csv");
		points_file.delete();

		DInit init = new DInit(vars);
		Dgame game = new Dgame(vars, init);

		if (init.init_())
		{
			game.game_();
		}

		// Play Game //
		boolean playing = true;
		while (playing)
		{
			String word = getInput();
			game.do_cmd_(word);
		}

		// if game over //
		Supp.exit_();
		
	} /* MAIN__ */

	/**
	 * Walkthrough provided by
	 * http://www.deblauweschicht.nl/retrogaming/resources/MainframeZork_walkthrough.txt
	 **/

	public static ArrayList<String> loadActionFile(String fileName)
	{
		ArrayList<String> actions = new ArrayList<String>();
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
			
			String buf = "";
			boolean block_comment = false;
			while ((buf = reader.readLine()) != null)
			{
				buf = buf.trim();
				
				// skip empty strings //
				if (buf.length() == 0)
					continue;
				
				// check if block comment //
				if (buf.charAt(0) == '%')
				{
					block_comment = !block_comment;
					continue;
				}
			
				// strip any in-line comments //				
				if (buf.indexOf('#') != -1)
				{
					buf = buf.substring(0, buf.indexOf('#'));
					buf = buf.trim();
				}
				
				if (buf.length() > 0 )
					actions.add(buf);				
			}			
		}
		catch (IOException e)
		{
			Supp.errln("Error trying to read file : " + fileName);
//			e.printStackTrace();
		} 
		
		return actions;
	}
	

	private static ArrayList<String> actions = null;
	private static int current_action = 0;
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static String getInput()
	{
		// if actions hasn't been initialized, initialize it //
		if (actions == null)
		{
			actions = loadActionFile("tasks.properties");
		}
		
		String action = "";
		if (current_action < actions.size())
		{
			action = actions.get(current_action);
			current_action ++;

			// if it is empty somehow, try again //
			if(action.length() == 0)
				return getInput();
			
			// load another file //
			if(action.toLowerCase().startsWith("load"))
			{
				String file = null;
				if(action.indexOf("(") != -1 && action.indexOf(")") != -1 &&
						action.indexOf("(") < action.indexOf(")"))
				{
					file = action.substring(action.indexOf("(")+1, action.indexOf(")"));
					file = file.replaceAll("\"", "");
					file = file.replaceAll("'", "");
					file = file.trim();
				}
				
				ArrayList<String> new_actions = new ArrayList<String>();
				if(file != null && file.length() > 0)
					new_actions = loadActionFile(file);
				
				actions.addAll(current_action, new_actions);
				return getInput();
			}
			
			Supp.errln("> " + action);
		}
		// read from console instead //
		else
		{			
			Supp.err("> ");
			while (action.length() == 0)
				try
				{
					action = input.readLine();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
		}

		return action;
	}
}
