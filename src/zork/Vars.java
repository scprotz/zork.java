package zork;

public class Vars
{
	/* vars.h -- variables for dungeon */

	/*
	 * These variable definitions are really ugly because they are actually
	 * translations of FORTRAN common blocks. In the original FORTRAN source the
	 * common blocks were included many times by each function that needed them; I
	 * have changed this to define them all in this one file, and include this in
	 * every source file. It's less modular, and it makes everything slower to
	 * compile, but it's easier on me. A few structures used only by the parsing
	 * routines are in parse.h.
	 */


	public static final boolean DEBUG = true;
	public static final boolean ALLOW_GDT = true;

	public class prsvec_
	{
		public int prsa, prsi, prso;
		public boolean prswon;
		public int prscon;
	};

	public prsvec_ prsvec_1 = new prsvec_();

	public class orphs_
	{
		public int oflag, oact, oslot, oprep, oname;
	};

	public orphs_ orphs_1 = new orphs_();

	public class last_
	{
		public int lastit;
	};

	public last_ last_1 = new last_();

	public class play_
	{
		public int winner, here;
		public boolean telflg;
	};

	public play_ play_1 = new play_();

	public class rooms_
	{
		public int rlnt, rdesc1[] = new int[200], rdesc2[] = new int[200], rexit[] = new int[200],
				ractio[] = new int[200], rval[] = new int[200], rflag[] = new int[200];

		public int rrand(int index)
		{
			int i = index + 601;

			int array_number = i / 200;
			switch (array_number)
			{
				case 0:
					return rdesc1[i];
				case 1:
					return rdesc2[i - 200];
				case 2:
					return rexit[i - 400];
				case 3:
					return ractio[i - 600];
				case 4:
					return rval[i - 800];
				case 5:
					return rflag[i - 1000];
				default:
					throw new RuntimeException("Could not find rrand index correctly.");
			}
		}

		public void rrand(int index, int value)
		{

			int i = index + 600;
			int array_number = i / 200;
			switch (array_number)
			{
				case 0:
					rdesc1[i] = value;
					break;
				case 1:
					rdesc2[i - 200] = value;
					break;
				case 2:
					rexit[i - 400] = value;
					break;
				case 3:
					ractio[i - 600] = value;
					break;
				case 4:
					rval[i - 800] = value;
					break;
				case 5:
					rflag[i - 1000] = value;
					break;
				default:
					throw new RuntimeException("Could not find rrand index correctly. " + index
							+ "=" + value + " : " + array_number);
			}
		}
	};

	public rooms_ rooms_1 = new rooms_();
//	#define eqr ((int *)&rooms_1 + 1)
//	#define rrand ((int *)&rooms_1 + 601)

	/* Room flags */

	public static final int RSEEN = 32768;
	public static final int RLIGHT = 16384;
	public static final int RLAND = 8192;
	public static final int RWATER = 4096;
	public static final int RAIR = 2048;
	public static final int RSACRD = 1024;
	public static final int RFILL = 512;
	public static final int RMUNG = 256;
	public static final int RBUCK = 128;
	public static final int RHOUSE = 64;
	public static final int RNWALL = 32;
	public static final int REND = 16;

	public class rindex_
	{
		public final int whous = 2;
		public final int lroom = 8;
		public final int cella = 9;
		public final int mtrol = 10;
		public final int maze1 = 11;
		public final int mgrat = 25;
		public final int maz15 = 30;
		public final int fore1 = 31;
		public final int fore3 = 33;

		public final int clear = 36;
		public final int reser = 40;
		public final int strea = 42;
		public final int egypt = 44;
		public final int echor = 49;
		public final int tshaf = 61;
		public final int bshaf = 76;
		public final int mmach = 77;
		public final int dome = 79;

		public final int mtorc = 80;
		public final int carou = 83;
		public final int riddl = 91;
		public final int lld2 = 94;
		public final int temp1 = 96;
		public final int temp2 = 97;
		public final int maint = 100;
		public final int blroo = 102;
		public final int treas = 103;

		public final int rivr1 = 107;
		public final int rivr2 = 108;
		public final int rivr3 = 109;
		public final int mcycl = 101;
		public final int rivr4 = 112;
		public final int rivr5 = 113;
		public final int fchmp = 114;
		public final int falls = 120;
		public final int mbarr = 119;

		public final int mrain = 121;
		public final int pog = 122;
		public final int vlbot = 126;
		public final int vair1 = 127;
		public final int vair2 = 128;
		public final int vair3 = 129;
		public final int vair4 = 130;
		public final int ledg2 = 131;
		public final int ledg3 = 132;

		public final int ledg4 = 133;
		public final int msafe = 135;
		public final int cager = 140;
		public final int caged = 141;
		public final int twell = 142;
		public final int bwell = 143;
		public final int alice = 144;
		public final int alism = 145;
		public final int alitr = 146;

		public final int mtree = 147;
		public final int bkent = 148;
		public final int bkvw = 151;
		public final int bktwi = 153;
		public final int bkvau = 154;
		public final int bkbox = 155;
		public final int crypt = 157;
		public final int tstrs = 158;
		public final int mrant = 159;

		public final int mreye = 160;
		public final int mra = 161;
		public final int mrb = 162;
		public final int mrc = 163;
		public final int mrg = 164;
		public final int mrd = 165;
		public final int fdoor = 166;
		public final int mrae = 167;
		public final int mrce = 171;
		public final int mrcw = 172;
		public final int mrge = 173;

		public final int mrgw = 174;
		public final int mrdw = 176;
		public final int inmir = 177;
		public final int scorr = 179;
		public final int ncorr = 182;
		public final int parap = 183;
		public final int cell = 184;
		public final int pcell = 185;
		public final int ncell = 186;
		public final int cpant = 188;

		public final int cpout = 189;
		public final int cpuzz = 190;
	};

	public rindex_ rindex_1 = new rindex_();

	public class xsrch_
	{
		public final int xmin = 1024;
		public final int xmax = 16384;
		public final int xdown = 10240;
		public final int xup = 9216;
		public final int xnorth = 1024;
		public final int xsouth = 5120;
		public final int xenter = 13312;
		public final int xexit = 14336;
		public final int xeast = 3072;
		public final int xwest = 7168;
	};

	public xsrch_ xsrch_1 = new xsrch_();

	public class objcts_
	{
		public int olnt, odesc1[] = new int[220], odesc2[] = new int[220], odesco[] = new int[220],
				oactio[] = new int[220], oflag1[] = new int[220], oflag2[] = new int[220],
				ofval[] = new int[220], otval[] = new int[220], osize[] = new int[220],
				ocapac[] = new int[220], oroom[] = new int[220], oadv[] = new int[220],
				ocan[] = new int[220], oread[] = new int[220];
	};

	public objcts_ objcts_1 = new objcts_();

	public class oroom2_
	{
		public int r2lnt, oroom2[] = new int[20], rroom2[] = new int[20];
	};

	public oroom2_ oroom2_1 = new oroom2_();

	/* Object flags (oflags) */

	public static final int VISIBT = 32768;
	public static final int READBT = 16384;
	public static final int TAKEBT = 8192;
	public static final int DOORBT = 4096;
	public static final int TRANBT = 2048;
	public static final int FOODBT = 1024;
	public static final int NDSCBT = 512;
	public static final int DRNKBT = 256;
	public static final int CONTBT = 128;
	public static final int LITEBT = 64;
	public static final int VICTBT = 32;
	public static final int BURNBT = 16;
	public static final int FLAMBT = 8;
	public static final int TOOLBT = 4;
	public static final int TURNBT = 2;
	public static final int ONBT = 1;
	public static final int FINDBT = 32768;
	public static final int SLEPBT = 16384;
	public static final int SCRDBT = 8192;
	public static final int TIEBT = 4096;
	public static final int CLMBBT = 2048;
	public static final int ACTRBT = 1024;
	public static final int WEAPBT = 512;
	public static final int FITEBT = 256;
	public static final int VILLBT = 128;
	public static final int STAGBT = 64;
	public static final int TRYBT = 32;
	public static final int NOCHBT = 16;
	public static final int OPENBT = 8;
	public static final int TCHBT = 4;
	public static final int VEHBT = 2;
	public static final int SCHBT = 1;

	public class oindex_
	{
		public final int garli = 2;
		public final int food = 3;
		public final int gunk = 4;
		public final int coal = 5;
		public final int machi = 7;
		public final int diamo = 8;
		public final int tcase = 9;
		public final int bottl = 10;
		public final int water = 11;
		public final int rope = 12;
		public final int knife = 13;
		public final int sword = 14;
		public final int lamp = 15;
		public final int blamp = 16;
		public final int rug = 17;
		public final int leave = 18;
		public final int troll = 19;

		public final int axe = 20;
		public final int rknif = 21;
		public final int keys = 23;
		public final int ice = 30;
		public final int bar = 26;
		public final int coffi = 33;
		public final int torch = 34;
		public final int tbask = 35;
		public final int fbask = 36;
		public final int irbox = 39;
		public final int ghost = 42;
		public final int trunk = 45;
		public final int bell = 46;
		public final int book = 47;
		public final int candl = 48;
		public final int match = 51;
		public final int tube = 54;
		public final int putty = 55;
		public final int wrenc = 56;
		public final int screw = 57;
		public final int cyclo = 58;
		public final int chali = 59;
		public final int thief = 61;
		public final int still = 62;
		public final int windo = 63;
		public final int grate = 65;
		public final int door = 66;
		public final int hpole = 71;
		public final int leak = 78;
		public final int rbutt = 79;
		public final int raili = 75;
		public final int pot = 85;
		public final int statu = 86;
		public final int iboat = 87;
		public final int dboat = 88;
		public final int pump = 89;
		public final int rboat = 90;
		public final int stick = 92;
		public final int buoy = 94;
		public final int shove = 96;
		public final int ballo = 98;
		public final int recep = 99;
		public final int guano = 97;
		public final int brope = 101;
		public final int hook1 = 102;
		public final int hook2 = 103;
		public final int safe = 105;
		public final int sslot = 107;
		public final int brick = 109;
		public final int fuse = 110;
		public final int gnome = 111;
		public final int blabe = 112;
		public final int dball = 113;
		public final int tomb = 119;
		public final int lcase = 123;
		public final int cage = 124;
		public final int rcage = 125;
		public final int spher = 126;
		public final int sqbut = 127;
		public final int flask = 132;

		public final int pool = 133;
		public final int saffr = 134;
		public final int bucke = 137;
		public final int ecake = 138;
		public final int orice = 139;
		public final int rdice = 140;
		public final int blice = 141;
		public final int robot = 142;
		public final int ftree = 145;
		public final int bills = 148;
		public final int portr = 149;
		public final int scol = 151;
		public final int zgnom = 152;

		public final int egg = 154;
		public final int begg = 155;
		public final int baubl = 156;
		public final int canar = 157;
		public final int bcana = 158;
		public final int ylwal = 149;
		public final int rdwal = 161;
		public final int pindr = 164;
		public final int rbeam = 171;
		public final int odoor = 172;
		public final int qdoor = 173;
		public final int cdoor = 175;
		public final int num1 = 178;

		public final int num8 = 185;
		public final int warni = 186;
		public final int cslit = 187;
		public final int gcard = 188;
		public final int stldr = 189;
		public final int hands = 200;
		public final int wall = 198;
		public final int lungs = 201;
		public final int sailo = 196;
		public final int aviat = 202;
		public final int teeth = 197;
		public final int itobj = 192;
		public final int every = 194;

		public final int valua = 195;
		public final int oplay = 193;
		public final int wnort = 205;
		public final int gwate = 209;
		public final int master = 215;
	};

	public oindex_ oindex_1 = new oindex_();

	public class cevent_
	{
		int clnt, ctick[] = new int[25], cactio[] = new int[25];
		boolean cflag[] = new boolean[25];
	};

	public cevent_ cevent_1 = new cevent_();
//	#define eqc ((int *)&cevent_1 + 1)

	public class cindex_
	{
		public final int cevcur = 1;
		public final int cevmnt = 2;
		public final int cevlnt = 3;
		public final int cevmat = 4;
		public final int cevcnd = 5;
		public final int cevbal = 6;
		public final int cevbrn = 7;
		public final int cevfus = 8;

		public final int cevled = 9;
		public final int cevsaf = 10;
		public final int cevvlg = 11;
		public final int cevgno = 12;
		public final int cevbuc = 13;
		public final int cevsph = 14;
		public final int cevegh = 15;
		public final int cevfor = 16;

		public final int cevscl = 17;
		public final int cevzgi = 18;
		public final int cevzgo = 19;
		public final int cevste = 20;
		public final int cevmrs = 21;
		public final int cevpin = 22;
		public final int cevinq = 23;
		public final int cevfol = 24;
	};

	public cindex_ cindex_1 = new cindex_();

	public class advs_
	{
		public int alnt, aroom[] = new int[4], ascore[] = new int[4], avehic[] = new int[4],
				aobj[] = new int[4], aactio[] = new int[4], astren[] = new int[4],
				aflag[] = new int[4];
	};

	public advs_ advs_1 = new advs_();

	public class aflags_
	{
		public final int astag = 32768;
	};

	public aflags_ aflags_1 = new aflags_();

	public class aindex_
	{
		public final int player = 1;
		public final int arobot = 2;
		public final int amastr = 3;
	};

	public aindex_ aindex_1 = new aindex_();

	public class vindex_
	{
		public final int cintw = 1;
		public final int deadxw = 2;
		public final int frstqw = 3;
		public final int inxw = 4;
		public final int outxw = 5;
		public final int walkiw = 6;
		public final int fightw = 7;
		public final int foow = 8;
		public final int meltw = 101;
		public final int readw = 100;
		public final int inflaw = 102;
		public final int deflaw = 103;
		public final int alarmw = 104;
		public final int exorcw = 105;
		public final int plugw = 106;

		public final int kickw = 107;
		public final int wavew = 108;
		public final int raisew = 109;
		public final int lowerw = 110;
		public final int rubw = 111;
		public final int pushw = 112;
		public final int untiew = 113;
		public final int tiew = 114;
		public final int tieupw = 115;
		public final int turnw = 116;
		public final int breatw = 117;
		public final int knockw = 118;
		public final int lookw = 119;

		public final int examiw = 120;
		public final int shakew = 121;
		public final int movew = 122;
		public final int trnonw = 123;
		public final int trnofw = 124;
		public final int openw = 125;
		public final int closew = 126;
		public final int findw = 127;
		public final int waitw = 128;
		public final int spinw = 129;
		public final int boardw = 130;
		public final int unboaw = 131;
		public final int takew = 132;

		public final int invenw = 133;
		public final int fillw = 134;
		public final int eatw = 135;
		public final int drinkw = 136;
		public final int burnw = 137;
		public final int mungw = 138;
		public final int killw = 139;
		public final int attacw = 141;
		public final int swingw = 140;
		public final int walkw = 142;
		public final int tellw = 143;
		public final int putw = 144;
		public final int dropw = 145;

		public final int givew = 146;
		public final int pourw = 147;
		public final int throww = 148;
		public final int digw = 89;
		public final int leapw = 91;
		public final int stayw = 73;
		public final int follow = 85;
		public final int hellow = 151;
		public final int lookiw = 152;
		public final int lookuw = 153;
		public final int pumpw = 154;
		public final int windw = 155;
		public final int clmbw = 156;
		public final int clmbuw = 157;

		public final int clmbdw = 158;
		public final int trntow = 159;
	};

	public vindex_ vindex_1 = new vindex_();

	public class findex_
	{
		public boolean trollf, cagesf, bucktf, caroff, carozf, lwtidf, domef, glacrf, echof, riddlf,
				lldf, cyclof, magicf, litldf, safef, gnomef, gnodrf, mirrmf, egyptf, onpolf, blabf,
				brieff, superf, buoyf, grunlf, gatef, rainbf, cagetf, empthf, deflaf, glacmf,
				frobzf, endgmf, badlkf, thfenf, singsf, mrpshf, mropnf, wdopnf, mr1f, mr2f, inqstf,
				follwf, spellf, cpoutf, cpushf;
		public int btief, binff, rvmnt, rvclr, rvcyc, rvsnd, rvgua, orrug, orcand, ormtch, orlamp,
				mdir, mloc, poleuf, quesno, nqatt, corrct, lcell, pnumb, acell, dcell, cphere;

		public boolean flags(int index)
		{
			switch (index)
			{
				case 0:
					return trollf;
				case 1:
					return cagesf;
				case 2:
					return bucktf;
				case 3:
					return caroff;
				case 4:
					return carozf;
				case 5:
					return lwtidf;
				case 6:
					return domef;
				case 7:
					return glacrf;
				case 8:
					return echof;
				case 9:
					return riddlf;
				case 10:
					return lldf;
				case 11:
					return cyclof;
				case 12:
					return magicf;
				case 13:
					return litldf;
				case 14:
					return safef;
				case 15:
					return gnomef;
				case 16:
					return gnodrf;
				case 17:
					return mirrmf;
				case 18:
					return egyptf;
				case 19:
					return onpolf;
				case 20:
					return blabf;
				case 21:
					return brieff;
				case 22:
					return superf;
				case 23:
					return buoyf;
				case 24:
					return grunlf;
				case 25:
					return gatef;
				case 26:
					return rainbf;
				case 27:
					return cagetf;
				case 28:
					return empthf;
				case 29:
					return deflaf;
				case 30:
					return glacmf;
				case 31:
					return frobzf;
				case 32:
					return endgmf;
				case 33:
					return badlkf;
				case 34:
					return thfenf;
				case 35:
					return singsf;
				case 36:
					return mrpshf;
				case 37:
					return mropnf;
				case 38:
					return wdopnf;
				case 39:
					return mr1f;
				case 40:
					return mr2f;
				case 41:
					return inqstf;
				case 42:
					return follwf;
				case 43:
					return spellf;
				case 44:
					return cpoutf;
				case 45:
					return cpushf;
			}
			throw new RuntimeException("invalid index for flags: " + index);
		}

		public void flags(int index, boolean value)
		{
			switch (index)
			{
				case 0:
					trollf = value;
					return;
				case 1:
					cagesf = value;
					return;
				case 2:
					bucktf = value;
					return;
				case 3:
					caroff = value;
					return;
				case 4:
					carozf = value;
					return;
				case 5:
					lwtidf = value;
					return;
				case 6:
					domef = value;
					return;
				case 7:
					glacrf = value;
					return;
				case 8:
					echof = value;
					return;
				case 9:
					riddlf = value;
					return;
				case 10:
					lldf = value;
					return;
				case 11:
					cyclof = value;
					return;
				case 12:
					magicf = value;
					return;
				case 13:
					litldf = value;
					return;
				case 14:
					safef = value;
					return;
				case 15:
					gnomef = value;
					return;
				case 16:
					gnodrf = value;
					return;
				case 17:
					mirrmf = value;
					return;
				case 18:
					egyptf = value;
					return;
				case 19:
					onpolf = value;
					return;
				case 20:
					blabf = value;
					return;
				case 21:
					brieff = value;
					return;
				case 22:
					superf = value;
					return;
				case 23:
					buoyf = value;
					return;
				case 24:
					grunlf = value;
					return;
				case 25:
					gatef = value;
					return;
				case 26:
					rainbf = value;
					return;
				case 27:
					cagetf = value;
					return;
				case 28:
					empthf = value;
					return;
				case 29:
					deflaf = value;
					return;
				case 30:
					glacmf = value;
					return;
				case 31:
					frobzf = value;
					return;
				case 32:
					endgmf = value;
					return;
				case 33:
					badlkf = value;
					return;
				case 34:
					thfenf = value;
					return;
				case 35:
					singsf = value;
					return;
				case 36:
					mrpshf = value;
					return;
				case 37:
					mropnf = value;
					return;
				case 38:
					wdopnf = value;
					return;
				case 39:
					mr1f = value;
					return;
				case 40:
					mr2f = value;
					return;
				case 41:
					inqstf = value;
					return;
				case 42:
					follwf = value;
					return;
				case 43:
					spellf = value;
					return;
				case 44:
					cpoutf = value;
					return;
				case 45:
					cpushf = value;
					return;
			}
			throw new RuntimeException("invalid index for flags: " + index);
		}

		public int switch_(int index)
		{
			switch (index)
			{
				case 0:
					return btief;
				case 1:
					return binff;
				case 2:
					return rvmnt;
				case 3:
					return rvclr;
				case 4:
					return rvcyc;
				case 5:
					return rvsnd;
				case 6:
					return rvgua;
				case 7:
					return orrug;
				case 8:
					return orcand;
				case 9:
					return ormtch;
				case 10:
					return orlamp;
				case 11:
					return mdir;
				case 12:
					return mloc;
				case 13:
					return poleuf;
				case 14:
					return quesno;
				case 15:
					return nqatt;
				case 16:
					return corrct;
				case 17:
					return lcell;
				case 18:
					return pnumb;
				case 19:
					return acell;
				case 20:
					return dcell;
				case 21:
					return cphere;

			};
			throw new RuntimeException("invalid index for switch_: " + index);

		}

		public void switch_(int index, int value)
		{
			switch (index)
			{
				case 0:
					btief = value;
					return;
				case 1:
					binff = value;
					return;
				case 2:
					rvmnt = value;
					return;
				case 3:
					rvclr = value;
					return;
				case 4:
					rvcyc = value;
					return;
				case 5:
					rvsnd = value;
					return;
				case 6:
					rvgua = value;
					return;
				case 7:
					orrug = value;
					return;
				case 8:
					orcand = value;
					return;
				case 9:
					ormtch = value;
					return;
				case 10:
					orlamp = value;
					return;
				case 11:
					mdir = value;
					return;
				case 12:
					mloc = value;
					return;
				case 13:
					poleuf = value;
					return;
				case 14:
					quesno = value;
					return;
				case 15:
					nqatt = value;
					return;
				case 16:
					corrct = value;
					return;
				case 17:
					lcell = value;
					return;
				case 18:
					pnumb = value;
					return;
				case 19:
					acell = value;
					return;
				case 20:
					dcell = value;
					return;
				case 21:
					cphere = value;
					return;

			}
			throw new RuntimeException("invalid index for switch_: " + index);

		}
	};

	public findex_ findex_1 = new findex_();

	public class debug_
	{
		public int dbgflg, prsflg, gdtflg;
	};

	public debug_ debug_1 = new debug_();

	public class hack_
	{
		public int thfpos;
		public boolean thfflg, thfact, swdact;
		public int swdsta;
	};

	public hack_ hack_1 = new hack_();

	public class vill_
	{
		public int vlnt, villns[] = new int[4], vprob[] = new int[4], vopps[] = new int[4],
				vbest[] = new int[4], vmelee[] = new int[4];
	};

	public vill_ vill_1 = new vill_();
//	#define eqv ((int *)&vill_1 + 1)

	public class state_
	{
		public int moves, deaths, rwscor, mxscor, mxload, ltshft, bloc, mungrm, hs, egscor, egmxsc;
	};

	public state_ state_1 = new state_();

	public class curxt_
	{
		public int xtype, xroom1, xstrng, xactio, xobj;

		public int xflag()
		{
			return xobj;
		};

		public void xflag(int val)
		{
			xobj = val;
		}
	};

	public curxt_ curxt_1 = new curxt_();
//	#define xflag ((int *)&curxt_1 + 4)

	public class xpars_
	{
		public final int xrmask = 255;
		public final int xdmask = 31744;
		public final int xfmask = 3;
		public final int xfshft = 256;
		public final int xashft = 256;
		public final int xelnt[] = new int[] { 1, 2, 3, 3 };
		public final int xnorm = 1;
		public final int xno = 2;
		public final int xcond = 3;
		public final int xdoor = 4;
		public final int xlflag = 32768;
	};

	public xpars_ xpars_1 = new xpars_();

	public class star_
	{
		public int mbase, strbit;
	};

	public star_ star_1 = new star_();

	public class input_
	{
		public int inlnt;
		public char[] inbuf = new char[78];
	};

	public input_ input_1 = new input_();

	public class screen_
	{
		public int fromdr = 0;
		public int scolrm = 0;
		public int scolac = 0;
		public int[] scoldr = new int[] { 1024, 153, 5120, 154, 3072, 152, 7168, 151 };
		public int[] scolwl = new int[] { 151, 207, 3072, 152, 208, 7168, 153, 206, 5120, 154, 205,
				1024 };
	};

	public screen_ screen_1 = new screen_();

	public class rmsg_
	{
		public int mlnt;
		public long mrloc;
		public int[] rtext = new int[1050];
	};

	public rmsg_ rmsg_1 = new rmsg_();

	public class vers_
	{
		public int vmaj = 2;
		public int vmin = 7;
		public int vedit = 'A';
	};

	public vers_ vers_1 = new vers_();

	public class time_
	{
		public int pltime;
		public int[] shour = new int[1];
		public int[] smin = new int[1];
		public int[] ssec = new int[1];
	};

	public time_ time_1 = new time_();

	public class hyper_
	{
		public final int hfactr = 500;
	};

	public hyper_ hyper_1 = new hyper_();

	public class exits_
	{
		public int xlnt, travel[] = new int[900];
	};

	public exits_ exits_1 = new exits_();

	public class puzzle_
	{
		public final int cpdr[] = new int[] { 1024, -8, 2048, -7, 3072, 1, 4096, 9, 5120, 8, 6144,
				7, 7168, -1, 8192, -9 };
		public final int cpwl[] = new int[] { 205, -8, 206, 8, 207, 1, 208, -1 };
		public final int cpvec[] = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, -1, 0, 0, -1, 0, 1, 1,
				-1, 0, 1, 0, -2, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, -3, 0, 0, -1, -1, 0, 1, 1, 0, 0,
				-1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	};

	public puzzle_ puzzle_1 = new puzzle_();

	public class bats_
	{
		public final int[] batdrp = new int[] { 66, 67, 68, 69, 70, 71, 72, 65, 73 };
	};

	public bats_ bats_1 = new bats_();

}
