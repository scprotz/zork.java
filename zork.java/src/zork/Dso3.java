package zork;

public class Dso3
{
	/* FINDXT- FIND EXIT FROM ROOM */

	/*COPYRIGHT 1980, INFOCOM COMPUTERS AND COMMUNICATIONS, CAMBRIDGE MA. 02142*/
	/* ALL RIGHTS RESERVED, COMMERCIAL USAGE STRICTLY PROHIBITED */
	/* WRITTEN BY R. M. SUPNIK */

//	#include <stdio.h>
//	#include "funcs.h"
//	#include "vars.h"

	boolean findxt_(int dir, int rm)
	{
//	   /* System generated locals */
//	   boolean ret_val;
//
//	   /* Local variables */
//	   int i, xi;
//	   int xxxflg;
//
//	   ret_val = TRUE_;
//	   /* 						!ASSUME WINS. */
//	   xi = rooms_1.rexit[rm - 1];
//	   /* 						!FIND FIRST ENTRY. */
//	   if (xi == 0) {
//	      /* 						!YES, LOSE. */
//	      return FALSE_;
//	   }
//	   /* 						!NO EXITS? */
//
//	   do {
//	      i = exits_1.travel[xi - 1];
//	      /* 						!GET ENTRY. */
//	      curxt_1.xroom1 = i & xpars_1.xrmask;
//	      /* mask to 16-bits to get rid of sign extension problems with 32-bit ints 
//	       */
//	      xxxflg = ~ xpars_1.xlflag & 65535;
//	      curxt_1.xtype = ((i & xxxflg) / xpars_1.xfshft & xpars_1.xfmask) + 1;
//	      switch (curxt_1.xtype) {
//	      case 4: 
//	      case 3: 
//	         curxt_1.xobj = exits_1.travel[xi + 1] & xpars_1.xrmask;
//	         curxt_1.xactio = exits_1.travel[xi + 1] / xpars_1.xashft;
//	      case 2:
//	         curxt_1.xstrng = exits_1.travel[xi];
//	      case 1:
//	         xi += xpars_1.xelnt[curxt_1.xtype - 1];
//	         /* 						!ADVANCE TO NEXT ENTRY. */
//	         if ((i & xpars_1.xdmask) == dir) {
//	            return ret_val;
//	         }
//		 break;
//	      default:
//		  /* 						!BRANCH ON ENTRY. */
//		  bug_(10, curxt_1.xtype);
//	      }
//
//	      /* 						!DOOR/CEXIT/NEXIT - STRING. */
//	   } while ((i & xpars_1.xlflag) == 0);
		throw new RuntimeException("Dso3.findxt_ not impl.");
	} /* findxt_ */

	/* FWIM- FIND WHAT I MEAN */

	/* DECLARATIONS */

//	int fwim_(int f1, int f2, int rm, 
//	              int con, int adv, boolean nocare)
//	{
//	   /* System generated locals */
//	   int ret_val;
//
//	   /* Local variables */
//	   int i, j;
//
//	   /* OBJECTS */
//	   ret_val = 0;
//	   /* 						!ASSUME NOTHING. */
//	   for (i = 1; i <= objcts_1.olnt; ++i) {
//	      /* 						!LOOP */
//	      if ((rm == 0 || objcts_1.oroom[i - 1] != rm) && (adv == 0 || 
//	               objcts_1.oadv[i - 1] != adv) && (con == 0 || objcts_1.ocan[
//	                  i - 1] != con)) {
//	         continue;
//	      }
//
//	      /* OBJECT IS ON LIST... IS IT A MATCH? */
//
//	      if ((objcts_1.oflag1[i - 1] & VISIBT) == 0) {
//	         continue;
//	      }
//	      if (~ (nocare) & (objcts_1.oflag1[i - 1] & TAKEBT) == 0 || (
//	               objcts_1.oflag1[i - 1] & f1) == 0 && (objcts_1.oflag2[i - 1] 
//	                  & f2) == 0) {
//	         goto L500;
//	      }
//	      if (ret_val != 0) {
//	         return -ret_val;
//	      }
//	      /* 						!ALREADY GOT SOMETHING? */
//	      ret_val = i;
//	      /* 						!NOTE MATCH. */
//
//	      /* DOES OBJECT CONTAIN A MATCH? */
//
//	L500:
//	      if ((objcts_1.oflag2[i - 1] & OPENBT) == 0) {
//	         continue;
//	      }
//	      for (j = 1; j <= objcts_1.olnt; ++j) {
//	         /* 						!NO, SEARCH CONTENTS. */
//	         if (objcts_1.ocan[j - 1] != i || (objcts_1.oflag1[j - 1] & 
//	                  VISIBT) == 0 || (objcts_1.oflag1[j - 1] & f1) ==
//	               0 && (objcts_1.oflag2[j - 1] & f2) == 0) {
//	            continue;
//	         }
//	         if (ret_val == 0) {
//	            ret_val = j;
//	            continue;
//	         }
//	         ret_val = -ret_val;
//	         return ret_val;
//	      }
//	   }
//	   return ret_val;
//	} /* fwim_ */

	/* YESNO- OBTAIN YES/NO ANSWER */

	/* CALLED BY- */

	/* 	YES-IS-TRUE=YESNO(QUESTION,YES-STRING,NO-STRING) */

//	boolean yesno_(int q, int y, int n)
//	{
//	   /* Local variables */
//	   char ans[100];
//
//	L100:
//	   rspeak_(q);
//	   /* 						!ASK */
//	   (void) fflush(stdout);
//	   (void) fgets(ans, sizeof ans, stdin);
//	   more_input();
//	   /* 						!GET ANSWER */
//	   if (*ans == 'Y' || *ans == 'y') {
//	      /* 						!YES, */
//	      rspeak_(y);
//	      /* 						!OUT WITH IT. */
//	      return TRUE_;
//	   }
//	   if (*ans == 'N' || *ans == 'n') {
//	      /* 						!NO, */
//	      rspeak_(n);
//	      /* 						!LIKEWISE. */
//	      return FALSE_;
//	   }
//	   rspeak_(6);
//	   /* 						!SCOLD. */
//	   goto L100;
//
//	} /* yesno_ */

}