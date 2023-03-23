package lab8;

import java.util.Scanner;

public class On2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Input integer for loop root");
		int int1 = input1.nextInt();
		input1.close();
		
		int numLoops = 0;
		for(int i = 0; i < int1; i++) {
			for(int j = 0; j < int1; j++) {
				System.out.println(++numLoops);
			}
		}
		System.out.println(numLoops);
	}

}
