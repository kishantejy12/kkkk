package data;

import java.util.Scanner;

public class dta {

	public static void main(String[] args) {
		System.out.println("select the data types        1.integer 2.String 3. DOuble 4.Date");

		Scanner s1 = new Scanner(System.in);
		int z = s1.nextInt();
		switch (z) {
		case 1:
			integer i = new integer();
			i.innt();
			break;

		case 2:

			names n = new names();
			n.hhh();
break;
		case 3:

			doublee d = new doublee();
			d.aaa();
break;
		case 4:

			date nn = new date();
			nn.fff();
			break;
		}
	}
}