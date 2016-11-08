package data;

import java.util.Arrays;
import java.util.Scanner;

public class names {
	
	public void hhh(){
	System.out.println("entre the  number of names");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
String[] arr =new String[n];
System.out.println("enter the names");

for(int i=0;i<n;i++)
	arr[i]=sc.next();
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
	
}
}