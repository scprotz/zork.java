package zork;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareSave
{

	public static void main(String[] args) throws IOException
	{
		Vars vj = load_vars("dsave.java.dat");
		Vars vc = load_vars("../../zork/dsave.c.dat");
//		Supp.println(vj.findex_1);
//		Supp.println(vc.findex_1);
//		Supp.println("Working Directory = " + System.getProperty("user.dir"));

		if (vj.findex_1.trollf != vc.findex_1.trollf)
			Supp.errln("error for vj.findex_1.		trollf");
		if (vj.findex_1.cagesf != vc.findex_1.cagesf)
			Supp.errln("error for vj.findex_1. cagesf");
		if (vj.findex_1.bucktf != vc.findex_1.bucktf)
			Supp.errln("error for vj.findex_1. bucktf");
		if (vj.findex_1.caroff != vc.findex_1.caroff)
			Supp.errln("error for vj.findex_1. caroff");
		if (vj.findex_1.carozf != vc.findex_1.carozf)
			Supp.errln("error for vj.findex_1. carozf");
		if (vj.findex_1.lwtidf != vc.findex_1.lwtidf)
			Supp.errln("error for vj.findex_1. lwtidf");
		if (vj.findex_1.domef != vc.findex_1.domef)
			Supp.errln("error for vj.findex_1. domef");
		if (vj.findex_1.glacrf != vc.findex_1.glacrf)
			Supp.errln("error for vj.findex_1. glacrf");
		if (vj.findex_1.echof != vc.findex_1.echof)
			Supp.errln("error for vj.findex_1. echof");
		if (vj.findex_1.riddlf != vc.findex_1.riddlf)
			Supp.errln("error for vj.findex_1. riddlf");
		if (vj.findex_1.lldf != vc.findex_1.lldf)
			Supp.errln("error for vj.findex_1. lldf");

		if (vj.findex_1.cyclof != vc.findex_1.cyclof)
			Supp.errln("error for vj.findex_1.		cyclof");
		if (vj.findex_1.magicf != vc.findex_1.magicf)
			Supp.errln("error for vj.findex_1. magicf");
		if (vj.findex_1.litldf != vc.findex_1.litldf)
			Supp.errln("error for vj.findex_1. litldf");
		if (vj.findex_1.safef != vc.findex_1.safef)
			Supp.errln("error for vj.findex_1. safef");
		if (vj.findex_1.gnomef != vc.findex_1.gnomef)
			Supp.errln("error for vj.findex_1. gnomef");
		if (vj.findex_1.gnodrf != vc.findex_1.gnodrf)
			Supp.errln("error for vj.findex_1. gnodrf");
		if (vj.findex_1.mirrmf != vc.findex_1.mirrmf)
			Supp.errln("error for vj.findex_1. mirrmf");
		if (vj.findex_1.egyptf != vc.findex_1.egyptf)
			Supp.errln("error for vj.findex_1. egyptf");
		if (vj.findex_1.onpolf != vc.findex_1.onpolf)
			Supp.errln("error for vj.findex_1. onpolf");
		if (vj.findex_1.blabf != vc.findex_1.blabf)
			Supp.errln("error for vj.findex_1. blabf");

		if (vj.findex_1.brieff != vc.findex_1.brieff)
			Supp.errln("error for vj.findex_1.		brieff");
		if (vj.findex_1.superf != vc.findex_1.superf)
			Supp.errln("error for vj.findex_1. superf");
		if (vj.findex_1.buoyf != vc.findex_1.buoyf)
			Supp.errln("error for vj.findex_1. buoyf");
		if (vj.findex_1.grunlf != vc.findex_1.grunlf)
			Supp.errln("error for vj.findex_1. grunlf");
		if (vj.findex_1.gatef != vc.findex_1.gatef)
			Supp.errln("error for vj.findex_1. gatef");
		if (vj.findex_1.rainbf != vc.findex_1.rainbf)
			Supp.errln("error for vj.findex_1. rainbf");
		if (vj.findex_1.cagetf != vc.findex_1.cagetf)
			Supp.errln("error for vj.findex_1. cagetf");
		if (vj.findex_1.empthf != vc.findex_1.empthf)
			Supp.errln("error for vj.findex_1. empthf");
		if (vj.findex_1.deflaf != vc.findex_1.deflaf)
			Supp.errln("error for vj.findex_1. deflaf");
		if (vj.findex_1.glacmf != vc.findex_1.glacmf)
			Supp.errln("error for vj.findex_1. glacmf");

		if (vj.findex_1.frobzf != vc.findex_1.frobzf)
			Supp.errln("error for vj.findex_1.		frobzf");
		if (vj.findex_1.endgmf != vc.findex_1.endgmf)
			Supp.errln("error for vj.findex_1. endgmf");
		if (vj.findex_1.badlkf != vc.findex_1.badlkf)
			Supp.errln("error for vj.findex_1. badlkf");
		if (vj.findex_1.thfenf != vc.findex_1.thfenf)
			Supp.errln("error for vj.findex_1. thfenf");
		if (vj.findex_1.singsf != vc.findex_1.singsf)
			Supp.errln("error for vj.findex_1. singsf");
		if (vj.findex_1.mrpshf != vc.findex_1.mrpshf)
			Supp.errln("error for vj.findex_1. mrpshf");
		if (vj.findex_1.mropnf != vc.findex_1.mropnf)
			Supp.errln("error for vj.findex_1. mropnf");
		if (vj.findex_1.wdopnf != vc.findex_1.wdopnf)
			Supp.errln("error for vj.findex_1. wdopnf");
		if (vj.findex_1.mr1f != vc.findex_1.mr1f)
			Supp.errln("error for vj.findex_1. mr1f");
		if (vj.findex_1.mr2f != vc.findex_1.mr2f)
			Supp.errln("error for vj.findex_1. mr2f");
		if (vj.findex_1.inqstf != vc.findex_1.inqstf)
			Supp.errln("error for vj.findex_1. inqstf");

		if (vj.findex_1.follwf != vc.findex_1.follwf)
			Supp.errln("error for vj.findex_1.		follwf");
		if (vj.findex_1.spellf != vc.findex_1.spellf)
			Supp.errln("error for vj.findex_1. spellf");
		if (vj.findex_1.cpoutf != vc.findex_1.cpoutf)
			Supp.errln("error for vj.findex_1. cpoutf");
		if (vj.findex_1.cpushf != vc.findex_1.cpushf)
			Supp.errln("error for vj.findex_1. cpushf");

		if (vj.findex_1.btief != vc.findex_1.btief)
			Supp.errln("error for vj.findex_1btief");
		if (vj.findex_1.binff != vc.findex_1.binff)
			Supp.errln("error for vj.findex_1 binff");
		if (vj.findex_1.rvmnt != vc.findex_1.rvmnt)
			Supp.errln("error for vj.findex_1 rvmnt");
		if (vj.findex_1.rvclr != vc.findex_1.rvclr)
			Supp.errln("error for vj.findex_1 rvclr");
		if (vj.findex_1.rvcyc != vc.findex_1.rvcyc)
			Supp.errln("error for vj.findex_1 rvcyc");
		if (vj.findex_1.rvsnd != vc.findex_1.rvsnd)
			Supp.errln("error for vj.findex_1 rvsnd");
		if (vj.findex_1.rvgua != vc.findex_1.rvgua)
			Supp.errln("error for vj.findex_1 rvgua");
		if (vj.findex_1.orrug != vc.findex_1.orrug)
			Supp.errln("error for vj.findex_1 orrug");
		if (vj.findex_1.orcand != vc.findex_1.orcand)
			Supp.errln("error for vj.findex_1 orcand " + vj.findex_1.orcand + ","
					+ vc.findex_1.orcand);
		if (vj.findex_1.ormtch != vc.findex_1.ormtch)
			Supp.errln("error for vj.findex_1 ormtch");
		if (vj.findex_1.orlamp != vc.findex_1.orlamp)
			Supp.errln("error for vj.findex_1 orlamp");
		if (vj.findex_1.mdir != vc.findex_1.mdir)
			Supp.errln("error for vj.findex_1 mdir");

		if (vj.findex_1.mloc != vc.findex_1.mloc)
			Supp.errln("error for vj.findex_1mloc");
		if (vj.findex_1.poleuf != vc.findex_1.poleuf)
			Supp.errln("error for vj.findex_1 poleuf");
		if (vj.findex_1.quesno != vc.findex_1.quesno)
			Supp.errln("error for vj.findex_1 quesno");
		if (vj.findex_1.nqatt != vc.findex_1.nqatt)
			Supp.errln("error for vj.findex_1 nqatt");
		if (vj.findex_1.corrct != vc.findex_1.corrct)
			Supp.errln("error for vj.findex_1 corrct");
		if (vj.findex_1.lcell != vc.findex_1.lcell)
			Supp.errln("error for vj.findex_1 lcell");
		if (vj.findex_1.pnumb != vc.findex_1.pnumb)
			Supp.errln("error for vj.findex_1 pnumb");
		if (vj.findex_1.acell != vc.findex_1.acell)
			Supp.errln("error for vj.findex_1 acell");
		if (vj.findex_1.dcell != vc.findex_1.dcell)
			Supp.errln("error for vj.findex_1 dcell");
		if (vj.findex_1.cphere != vc.findex_1.cphere)
			Supp.errln("error for vj.findex_1 cphere");

		DataInputStream inputj = new DataInputStream(
				new FileInputStream(new File("dsave.java.dat")));
		DataInputStream inputc = new DataInputStream(
				new FileInputStream(new File("../../zork/dsave.c.dat")));

		boolean done = false;
		int var = 0;
		do
		{
			int[] j = new int[4];
			j[0] = inputj.read();
			j[1] = inputj.read();
			j[2] = inputj.read();
			j[3] = inputj.read();
			int[] c = new int[4];
			c[0] = inputc.read();
			c[1] = inputc.read();
			c[2] = inputc.read();
			c[3] = inputc.read();

			// skip time_1.pltime //

			if ((j[0] != c[0] || j[1] != c[1] || j[2] != c[2] || j[3] != c[3]) && var != 75)
			{
				Supp.errln(var + ": j != c: " + j[0] + " " + j[1] + " " + j[2] + " " + j[3]
						+ "," + c[0] + " " + c[1] + " " + c[2] + " " + c[3]);
				return;
			}
//			else
//				Supp.println(var + ":" + j[0] + " " + j[1] + " " +j[2] + " " + j[3] );

			if (j[0] == -1 && c[0] == -1)
				break;

			var++;

//			else if(j == -1 || c == -1)
//				throw new RuntimeException("Not the same length");
		} while (!done);

		Supp.println("Completed successfully.  Compared all " + var + " variables");

	}

	static Vars load_vars(String file_name)
	{
		Vars vars = new Vars();
		/* Local variables */

		File file = new File(file_name);

		try
		{

			DataInputStream reader = new DataInputStream(new FileInputStream(file));

//		   int time = readInt(reader);

			// 0
			Supp.println("VMAJ");
			vars.vers_1.vmaj = readInt(reader);
			Supp.println("VMIN");
			vars.vers_1.vmin = readInt(reader);
			Supp.println("VEDIT");
			vars.vers_1.vedit = readInt(reader);

			vars.play_1.winner = readInt(reader);
			vars.play_1.here = readInt(reader);
			vars.hack_1.thfpos = readInt(reader);
			vars.play_1.telflg = readInt(reader) != 0;
			vars.hack_1.thfflg = readInt(reader) != 0;
			vars.hack_1.thfact = readInt(reader) != 0;
			vars.hack_1.swdact = readInt(reader) != 0;
			vars.hack_1.swdsta = readInt(reader);
			for (int i = 0; i < 64; i++)
				vars.puzzle_1.cpvec[i] = readInt(reader);

			// 75
			vars.time_1.pltime = readInt(reader);
			vars.state_1.moves = readInt(reader);
			vars.state_1.deaths = readInt(reader);
			vars.state_1.rwscor = readInt(reader);
			vars.state_1.egscor = readInt(reader);
			vars.state_1.mxload = readInt(reader);
			vars.state_1.ltshft = readInt(reader);
			vars.state_1.bloc = readInt(reader);
			vars.state_1.mungrm = readInt(reader);
			vars.state_1.hs = readInt(reader);
			vars.screen_1.fromdr = readInt(reader);
			vars.screen_1.scolrm = readInt(reader);
			vars.screen_1.scolac = readInt(reader);

			// 87
			for (int i = 0; i < 220; i++)
				vars.objcts_1.odesc1[i] = readInt(reader);
			// 307
			for (int i = 0; i < 220; i++)
				vars.objcts_1.odesc2[i] = readInt(reader);
			// 427
			for (int i = 0; i < 220; i++)
				vars.objcts_1.oflag1[i] = readInt(reader);
			// 647
			for (int i = 0; i < 220; i++)
				vars.objcts_1.oflag2[i] = readInt(reader);
			// 867
			for (int i = 0; i < 220; i++)
				vars.objcts_1.ofval[i] = readInt(reader);

			// 1187
			for (int i = 0; i < 220; i++)
				vars.objcts_1.otval[i] = readInt(reader);
			for (int i = 0; i < 220; i++)
				vars.objcts_1.osize[i] = readInt(reader);
			for (int i = 0; i < 220; i++)
				vars.objcts_1.ocapac[i] = readInt(reader);
			for (int i = 0; i < 220; i++)
				vars.objcts_1.oroom[i] = readInt(reader);
			for (int i = 0; i < 220; i++)
				vars.objcts_1.oadv[i] = readInt(reader);

			// 2287
			for (int i = 0; i < 220; i++)
				vars.objcts_1.ocan[i] = readInt(reader);
			// 2508
			for (int i = 0; i < 200; i++)
				vars.rooms_1.rval[i] = readInt(reader);
			// 2707 //
			for (int i = 0; i < 200; i++)
				vars.rooms_1.rflag[i] = readInt(reader);

			// 2907
			for (int i = 0; i < 4; i++)
				vars.advs_1.aroom[i] = readInt(reader);
			for (int i = 0; i < 4; i++)
				vars.advs_1.ascore[i] = readInt(reader);
			for (int i = 0; i < 4; i++)
				vars.advs_1.avehic[i] = readInt(reader);
			for (int i = 0; i < 4; i++)
				vars.advs_1.astren[i] = readInt(reader);
			for (int i = 0; i < 4; i++)
				vars.advs_1.aflag[i] = readInt(reader);

			// 2927
			for (int i = 0; i < 46; i++)
			{
				int val = readInt(reader);
				vars.findex_1.flags(i, val != 0);
			}

			// 2973
			for (int i = 0; i < 22; i++)
				vars.findex_1.switch_(i, readInt(reader));

			// 2995
			for (int i = 0; i < 4; i++)
				vars.vill_1.vprob[i] = readInt(reader);
			// 2999
			for (int i = 0; i < 25; i++)
			{
				int val = readInt(reader);
				vars.cevent_1.cflag[i] = (val != 0);
			}
			// 3024
			for (int i = 0; i < 25; i++)
				vars.cevent_1.ctick[i] = readInt(reader);

			reader.close();

		}
		catch (IOException ioe)
		{
			Supp.errln("Error loading file " + file_name);
		}

		return vars;

	} /* rstrgm_ */

	public static int readInt(DataInputStream stream) throws IOException
	{
		char[] chr = new char[4];

		chr[0] = (char) stream.read();
		chr[1] = (char) stream.read();
		chr[2] = (char) stream.read();
		chr[3] = (char) stream.read();

		long value = chr[0] & 0xFF;
		value |= (chr[1] << 8) & 0xFFFF;
		value |= (chr[2] << 16) & 0xFFFFFF;
		value |= (chr[3] << 24) & 0xFFFFFFFF;
		return (int) value;
	}

}
