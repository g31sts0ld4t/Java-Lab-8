package lab8;

import java.util.Scanner;

public class onlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Input integer for array length");
		int int1 = input1.nextInt();
		input1.close();
		
		int numLoops = 0;
		for(int i = 1; i < int1; i++) {
			for(int j = 1; j <= int1; j = j * 2) {
				numLoops++;
			}
		}
		System.out.println(numLoops);
		
	}

}
