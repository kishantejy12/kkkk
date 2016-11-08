package data;

import java.util.Arrays;
import java.util.Scanner;

public class doublee {
public void aaa(){
	System.out.println("entre the size of data ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
Double[] arr =new Double[n];
System.out.println("enter the double numbers");

for(int i=0;i<n;i++)
	arr[i]=sc.nextDouble();
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
}
}
