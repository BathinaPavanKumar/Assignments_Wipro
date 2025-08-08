package lab_seven_second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab_Seven_Second {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Length of the List:");
		int len= s.nextInt();
		s.nextLine();
		
		ArrayList<String> arr = new ArrayList<>(len);
		System.out.println("Enter Names");
		
		for(int i=0; i<len; i++) {
			String names=s.nextLine();
			arr.add(names);
		}
		
		Collections.sort(arr);
		for(String str:arr ) {
			System.out.println(str);
		}
	}

}
