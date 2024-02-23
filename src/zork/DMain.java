package zork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
		/* !IF INIT, PLAY GAME. */
		Supp.exit_();
		/* !DONE */
	} /* MAIN__ */

	/**
	 * Walkthrough provided by
	 * http://www.deblauweschicht.nl/retrogaming/resources/MainframeZork_walkthrough.txt
	 **/

	private static String[] moves = new String[] {};

	private static int word_index;

	public static BufferedReader words_file = null;
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static String getInput() throws IOException
	{
		try
		{
			if (words_file == null)
			{
				words_file = new BufferedReader(new FileReader(new File("tasks.properties")));
		
				if (words_file != null)
				{
					ArrayList<String> words = new ArrayList<String>();
					String buf = "";
					boolean block_comment = false;
					while ((buf = words_file.readLine()) != null)
					{
						buf = buf.trim();
						 if(buf.length() != 0 && buf.charAt(0) == '%')
						 {
							 block_comment = ! block_comment;
							 continue;
						 }
						 	
						 
						if (!block_comment && buf.length() != 0 && buf.charAt(0) != '#')
						{				
							if(buf.indexOf('#') != -1)								
							{							
								buf = buf.substring(0, buf.indexOf('#'));
								buf = buf.trim();
							}
							words.add(buf);
						}
						
					}					 
					moves = words.toArray(new String[0]);
				}
			}
		}
		catch (FileNotFoundException fnfe)
		{
		}
		System.out.flush();
		System.err.flush();
		String word = "";
		if (word_index < moves.length)
		{
			
			word = moves[word_index];
			word_index++;
		
			if(word.length() > 0 && word.startsWith("?"))
			{
				word = word.substring(1);
				String conditional = word.substring(0, word.indexOf("?"));
				String true_result = word.substring(word.indexOf("?") + 1, word.indexOf(":"));
				String false_result = word.substring(word.indexOf(":") + 1);
				boolean open = false;
				switch(conditional)
				{
					case "window_closed":
						// room 5 window = obj 63
						open = (vars.objcts_1.oflag2[vars.oindex_1.windo - 1] & Vars.OPENBT) != 0;
						word = true_result;						
						if(open)
							word=false_result;						
						break;
					case "troll":
						boolean dead = vars.findex_1.trollf;
						if(!dead) word=true_result;
						else word=false_result;
						break;
					case "grate_closed":
						open = (vars.objcts_1.oflag2[vars.oindex_1.grate - 1] & Vars.OPENBT) != 0;
						word = true_result;						
						if(open)
							word=false_result;						
						break;
				}
			}
			
			if(word.length() ==0)
				word = getInput();
			else
				System.err.println(word);
			
			
		}
		else
		{
			while (word.length() == 0)
				word = reader.readLine();
		}
		
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				 
		return word;
	}		 
}
