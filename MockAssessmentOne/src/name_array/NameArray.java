package name_array;
import java.util.Scanner;

public class NameArray {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String names = new String();
		int numNames = 0;
		System.out.println("How many names would you like to add?");
		numNames = sc.nextInt();
		String[] array = new String[numNames];
		for (int i = 0; i < array.length; i++){
			System.out.println("Please enter name " + (i + 1) + ":");
			names = sc.next();
			array[i] =  names;
		}
		
		for (int i = 0; i < array.length; i++){
			System.out.println("Name " + (i + 1) + ":\n" + array[i]);
		}
		
		for(int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i].compareTo(array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
	        }
		}
		
		for (int i = 0; i < array.length; i++){
			System.out.println("Name sorted " + (i + 1) + ":\n" + array[i]);
		}
		
		
//		int j, k;
//		String key = new String();
//		for (j = 1; j < array.length; j++) {
//		        
//			key = array[j];
//	        k = j - 1;
//		
//	        while (k >= 0 && array[k].compareTo(key) > key.compareTo(array[k])) {
//	        	array[k + 1] = array[k];
//	        	k = k - 1;
//		    }
//		    array[k + 1] = key;
//		}
//		
//		for (int i = 0; i < array.length; i++){
//			System.out.println("Name " + (i + 1) + ":\n" + array[i]);
//		}
	}
}