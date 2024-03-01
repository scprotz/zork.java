package zork;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Supp
{
	/* supp.c -- support routines for dungeon */

	/* Terminate the game */

	public static void exit_() 
	{
		Supp.errln("The game is over.");
	    System.exit(0);
	}

	/* Get time in hours, minutes and seconds */

	public static void itime_(int[] hrptr, int[] minptr, int[] secptr)
	{
		GregorianCalendar cal = new GregorianCalendar();

		hrptr[0] = cal.get(Calendar.HOUR_OF_DAY);
		minptr[0] = cal.get(Calendar.MINUTE);
		secptr[0] = cal.get(Calendar.SECOND);
	}

	/* Random number generator */
	
	private static Random random  = new Random();
	
	public static void srand(long seed)
	{
		random.setSeed(seed);
	}

	static int rndcnt = 1;
	public static int rnd_(int maxval)
	{
		rndcnt ++;
		return rndcnt % maxval;
	}

	public static void printf(String format, Object... args)
	{		
		System.out.printf(format, args);		
	}
	
	public static void println(String str)
	{
		print(str + "\n");				
	}
	
	public static void errln(String str)
	{
		err(str + "\n");
	}
	
	public static void print(String str)
	{
		System.out.print(str);		
	}
	
	public static void err(String str)
	{
		System.err.print(str);
		try
		{
			Thread.sleep(0,1);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
