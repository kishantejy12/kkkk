package data;
	import java.time.*;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class date{
public void fff(){
	Scanner sc = new Scanner(System.in);

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the numbers of dates your giving ");
	System.out.println("enter the dates in the formate of dd-mm-yyyy");
	int n =sc.nextInt();
	String[] dates = new String[n];
	while(sc.hasNext())
	{
	for(int i=0;i<n;i++)
	{
	dates[i] = input.nextLine();
	}break;
	}

	List<LocalDate> list = new ArrayList<LocalDate>();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "dd-MM-yyyy" );
	for ( String string : dates ) {
	   LocalDate localDate = LocalDate.parse(string,formatter);
	   list.add( localDate );
	}
	Collections.sort( list );
	System.out.println( "list: " + list );

	}}

