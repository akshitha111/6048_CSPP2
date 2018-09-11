import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.*;

class SortedSet extends Set{
	private int[] set;
	private int size;
    public SortedSet() {
	}
    public int[] subSet(int fromElement, int toElement) {
    	int[] result = new int[10];
	if(fromElement > toElement) {
		System.out.println("Invalid​ ​ Arguments​ ​ to​ ​ Subset​ ​ Exception");
	}else {
		
		int j = 0;
		for(int i : set) {
			if(i >= fromElement && i < toElement) {
				result[j] = i;
				j++;
			}
        
			
		}

     
	}
	return result;
}
public int[] headSet(int toElement) {
	int[] result = new int[10];
	int j = 0;
	for(int i : set) {
		if(i < toElement)
		result[j] = i;
	    j++;
	}return result;
}
public int last() {
	return set[size-1];
}



}
