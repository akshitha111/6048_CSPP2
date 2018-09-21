import java.util.*;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
class BagOfWords {
	private String text1;
	private String text2;
	public BagOfWords() {

	}
	public BagOfWords(String t1, String t2) {
		this.text1 = t1;
		this.text2 = t2;
	}

public static String fileToString(File f) {
	String str = "";
	try {
	Scanner sc = new Scanner(new FileReader(f));
	StringBuilder sb = new StringBuilder();
	while(sc.hasNext()) {
		sb.append(sc.next());
		sb.append(" ");
	}sc.close();
	str = sb.toString();
} catch(FileNotFoundException e) {
	System.out.println("no file");
}return str;
}


public static Map removeWords(String s1) {
	s1 = s1.toLowerCase();
	String[] tokens = s1.replaceAll("[^A-Za-z \\s]","").split(" ");
	Map<String, Integer> map = new HashMap<>();
	for (int i = 0; i < tokens.length; i++) {
		if(!map.containsKey(tokens[i])) {
			map.put(tokens[i],1);
		}else {
			map.put((tokens[i]),map.get(tokens[i])+1);
		}
		// System.out.println(tokens[i]);
		// System.out.println(map.toString());

	}return map;
}



public static int compareText(String s1, String s2) {
	double numerator = 0;
	double denominator = 0;
	double firstSum = 0;
	double secondSum = 0;
	Map<String,Integer> list1 = removeWords(s1);
	Map<String,Integer> list2 = removeWords(s2);
	/*System.out.println(list1.toString());
	System.out.println(list2.toString());*/
	for(String e : list1.keySet()) {
		for(String item : list2.keySet()) {
			if (e.equals(item)) {
				numerator += list1.get(e) * list2.get(item);
			}
		}
	}
	for(String inList1 : list1.keySet()) {
		firstSum += Math.pow(list1.get(inList1),2);
	}
	for(String inList2 : list2.keySet()) {
		secondSum += Math.pow(list2.get(inList2),2);
	}
	denominator = Math.sqrt(firstSum) * Math.sqrt(secondSum);
	double result = ((numerator/denominator) * 100D) / 100D;
	return (int) (result*100);
}
}

class Solution {
	public Solution() {

	}

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		//BagOfWords b = new BagOfWords();
		//while (sc.hasNext()) {
		String inputFile = sc.nextLine();
		File folder = new File(inputFile);
		File[] listOfFiles = folder.listFiles();
		//System.out.println(Arrays.toString(listOfFiles));
		int length = listOfFiles.length;
		int[][] matrix = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				matrix[i][j] = BagOfWords.compareText(BagOfWords.fileToString(listOfFiles[i]),BagOfWords.fileToString(listOfFiles[j]));
			}
		}System.out.print("\t");
			for (int i = 0; i < listOfFiles.length-1; i++) {
				System.out.print("\t"  + listOfFiles[i].getName());
			}
			System.out.println("\t" + listOfFiles[length-1].getName());
			for(int i = 0; i < length; i++) {
				System.out.print(listOfFiles[i].getName() + "\t");
			for (int j = 0; j < length; j++) {
				System.out.print(matrix[i][j] + "		");
			}
			System.out.println();
		}
	}
	
	 catch(Exception e) {
		System.out.println("empty directory");
	}
	}

}