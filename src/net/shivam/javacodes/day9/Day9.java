package net.shivam.javacodes.day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day9 {
	public static void main(String args[]) throws FileNotFoundException {
		String fileL = "C:/Users/Administrator/Desktop/Test.txt";
		File Text = new File(fileL);
		Scanner in = new Scanner(Text);
		int count = 1;
		while (in.hasNextLine()) {
			
			if (in.hasNextBigInteger()) {
				int value = in.nextInt();
				System.out.printf("%2d : %d \n",count,value);
				count++;
			}
			if (in.hasNextLine()) {
				String Line = in.nextLine();
				System.out.println(count + " : "+ Line);
				count++;

			}

		}
		in.close();
	}

}
