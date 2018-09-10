import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.*;
public class SortedSetADT​ extends Solution {
	private int[] SortedSet;
public SortedSetADT​(int[] arr) {
	SetADT obj = new SetADT();
	for (int i = 0; i < arr.length; i++) {
		obj.add(arr[i]);
	}
	SortedSet = obj.getSet();
	Array.sort(SortedSet);
}
public int subSet(int fromElement, int toElement) {
	if(fromElement > toElement) {
		System.out.println("Invalid​ ​ Arguments​ ​ to​ ​ Subset​ ​ Exception");
	}else {
		int[] result = new int[10];
		for(int i = fromElement; i < toElement; i++) {
			result.add(i);
		}return result;

	}
}
public int headSet(int toElement) {
	int[] result = new int[10];
	for(int i = ; i < toElement; i++) {
		result.add(i);
	}return result;
}
public int last() {
	return get(size-1);
}



}
