package lab_seven_first;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_Seven_First {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the lenght of the array:");
		
		int len=s.nextInt(); 
		s.nextLine();		
		String[] string = new String[len];	
		System.out.println("Enter the Names");
		
		for(int i=0; i<len; i++) {
			String names=s.nextLine();	
			string[i] = names;
		}		
		Arrays.sort(string);
		
	for(String pro : string) {
		System.out.println(pro);
	}
		

	}}
