package data;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class integer {

	public void innt(){
		System.out.println("entre the size data");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int[] arr =new int[n];
	System.out.println("enter the numbers");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
}}
