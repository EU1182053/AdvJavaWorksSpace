package bubblesort;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	
	public  ArrayList<Integer> sortArrayUsingBubble(ArrayList<Integer> myArray) {
		int temp = 0;  // local variable for swapping
		for (int i = 0; i < myArray.size(); i++) {
			for (int j = 1; j < myArray.size(); j++) {
				if(myArray.get(j-1)>myArray.get(j)) {  // eg. 0th element > 1st element, then it will be swapped
					temp = myArray.get(j-1);   // swapping element storing in temp
					myArray.set(j-1, myArray.get(j));  // eg. swap the smaller element
					myArray.set(j, temp); // swap the bigger element, which have stored in temp
				}
			}
		}
		return myArray;
		
	}
	public  ArrayList<Integer> sortArrayUsingInsertion(ArrayList<Integer> myArray) {
		int n = myArray.size();
        for (int i = 1; i < n; ++i) {
            int key = myArray.get(i);
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && myArray.get(j) > key) {
            	myArray.set(j+1, myArray.get(j));
                
                j = j - 1;
            }
            myArray.set(j+1, key);
            
        }
        
        return myArray;

		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		Array arr = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int len = sc.nextInt();
		System.out.println("Enter the elemnt and press enter.");
		for (int i = 0; i < len; i++) {
			int data = sc.nextInt();
			myArray.add(data);
		}
		System.out.println("1.Using Bubble Sort 2.Using Insertion Sort.");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: {
			myArray =arr.sortArrayUsingBubble(myArray);
			System.out.println("After sorting, the array is");
			for (int i = 0; i < myArray.size(); i++) {
				System.out.print(myArray.get(i)+",\t");
			}
			break;
		}
			case 2:
				myArray =arr.sortArrayUsingInsertion(myArray);
				System.out.println("After sorting, the array is");
				for (int i = 0; i < myArray.size(); i++) {
					System.out.print(myArray.get(i)+",\t");
				}
		
		default:
			break;
		}
		
		
		
	}

}
