package p2;

public class Z {

	import p1.M;
	import p1.N;
	import p1.P;

	public class Z extends M{
	    

		public static void main(String[] args) {
			M objM = new M();
	        N objN = new N();
	        P objp= new P();
	        X objx= new X();
	        System.out.println("this is the long variable from X class "+objx.h);
	        System.out.println("this is the long variable from X class "+objx.i);
	        System.out.println("this is the long variable from X class "+objx.v);
			

		}

	}
