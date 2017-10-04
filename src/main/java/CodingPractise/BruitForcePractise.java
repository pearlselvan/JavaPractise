package CodingPractise;

class BruitForcePractise {


  //https://dzone.com/articles/algorithm-week-brute-force
	// java code : http://algs4.cs.princeton.edu/53substring/Brute.java.html


	public static void main(String[] args) {

		BruitForcePractise bt = new BruitForcePractise();
		String subject = "Hello muthu";
		String pattern = "muthu";

		/*
		for all text char for every pattern
		H:m
		e:m
		l:m
		l:m
		o:m
 		 :m
		m:m
		u:u
		t:t
		h:h
		u:u
		 */

//		System.out.println(bt.subStringUsingBruitForce(pattern,subject));
		System.out.println(bt.subStringUsingBruitForce(pattern,subject));


		//(1,3,5) => 1+3*5
		int[] data = {1,2,3};
		for (int i=0;i<3;i++) {

			for (int j=i+1;j<3;j++) {
				// System.out.println(i +"+"+ j);
			}

		}

	}




	// return offset of first match or n if no match
	public static int subStringUsingBruitForce(String pat, String txt) {
		int patLength = pat.length();
		int txtLength = txt.length();

		for (int sindex = 0; sindex <= txtLength - patLength; sindex++) {
			int pindex; // Declare this inside outer loop bcz this will reset to 0

			for (pindex = 0; pindex < patLength; pindex++) {
				System.out.println(txt.charAt(sindex+pindex)+ ":" +pat.charAt(pindex));
				if (txt.charAt(sindex+pindex) != pat.charAt(pindex))
					break; // Please note this break inside for loop
			} // inner for loop

			// found at offset i
			if (pindex == patLength) return sindex; //Please note this inside outer for loop

		} //outer for loop
		return -1;                            // not found
	}



}

