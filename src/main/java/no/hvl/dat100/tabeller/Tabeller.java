package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int index : tabell) {
			System.out.println(index);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
			String tableString = "[";
			for(int i = 0; i < tabell.length; i++) {
				if(i == tabell.length -1) {
					tableString += tabell[i];
				} else {
					tableString += tabell[i] + ",";
				}
			}
			System.out.println(tableString);
			return tableString + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int index : tabell) {
			sum += index;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int index : tabell) {
			if(index == tall) {
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] newTable = new int[tabell.length];
		
		for(int i = 1; i <= tabell.length; i++) {
			newTable[i-1] = tabell[tabell.length - i];
		}
		
		return newTable;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for(int i = 0; i < tabell.length-1; i++) {
			if(tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] newTable = new int[tabell1.length + tabell2.length];
		int i = 0;
		for(i = 0; i < tabell1.length; i++) {
			newTable[i] = tabell1[i];
		}
		for(int a = 0; a < tabell2.length; a++, i++) {
			newTable[i] = tabell2[a];
		}
		return newTable;
	}
}
