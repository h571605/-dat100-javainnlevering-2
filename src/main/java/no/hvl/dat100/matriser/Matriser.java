package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int i = 0; i < matrise.length; i++) {
			for(int a = 0; a < matrise[i].length; a++) {
				System.out.println(matrise[i][a]);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String stringMatrise = "";
		
		for(int i = 0; i < matrise.length; i++) {
			for(int a = 0; a < matrise[i].length; a++) {
				stringMatrise += matrise[i][a] + " ";
			}
			stringMatrise += "\n";
		}
		
		return stringMatrise;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] newMatrise = new int[matrise.length][];
		
		for(int i = 0; i < matrise.length; i++) {
			newMatrise[i] = new int[matrise[i].length];
			for(int a = 0; a < matrise[i].length; a++) {
				newMatrise[i][a] = matrise[i][a] * tall;
			}
		}
		
		return newMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int outerIndex = 0; outerIndex < a.length; outerIndex++) {
			for(int innerIndex = 0; innerIndex < a[outerIndex].length; innerIndex++) {
				if(a[outerIndex][innerIndex] != b[outerIndex][innerIndex]) {
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] newMatrise = new int[matrise.length][];
		
		for(int outerIndex = 0; outerIndex < matrise.length; outerIndex++) {
			newMatrise[outerIndex] = new int[matrise[outerIndex].length];
			for(int innerIndex = 0; innerIndex < matrise[outerIndex].length; innerIndex++) {
				newMatrise[outerIndex][innerIndex] = matrise[innerIndex][outerIndex];
			}
		}
		return newMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] newMatrise;;
		
		if(a.length > b.length) {
			newMatrise = new int[a.length][];
		} else {
			newMatrise = new int[b.length][];
		}
		
		for(int outerIndex = 0; outerIndex < newMatrise.length; outerIndex++) {
			int aLength = (outerIndex >= a.length) ? (a.length - 1) : outerIndex;
			int bLength = (outerIndex >= b.length) ? (b.length - 1) : outerIndex;
			
			if(a[aLength].length > b[bLength].length) {
				newMatrise[outerIndex] = new int[a[bLength].length];
			} else{
				newMatrise[outerIndex] = new int[b[bLength].length];
			}
			
			for(int aIndex = 0; aIndex < a[outerIndex].length; aIndex++) {
				int newIndexNumber = 0;
				
				for(int bIndex = 0; bIndex < b[aIndex].length; bIndex++) {
					newIndexNumber += a[outerIndex][bIndex] * b[bIndex][aIndex];

				}
				
				newMatrise[outerIndex][aIndex] = newIndexNumber;
			}
		}
		return newMatrise;
	}
}
