package com.evergent.corejava.casestudy_library;

import java.util.Scanner;

public class LibraryInterfaceDemo {
	static {
		System.out.println("**WELCOME TO  NOMULA'S LIBRARY**");
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your username");
		String username=sc.nextLine();
		System.out.println("enter your password");
		String password=sc.nextLine();
		
		try {
			new LoginDetails(username,password);
		} catch (InvalidLoginDetailsException e) {
			System.out.println("LoginError :"+e.getMessage());
			System.out.println(e);
		}
	   
		System.out.println("please enter you login details to login");
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your booktype");
		String bookType=sc.next();
		try {
			new KidUsers(age, bookType);
		   
		} catch (InvalidAgeException|InvalidBookTypeException e) {
			System.out.println("kidUsersException :"+e.getMessage());
			System.out.println(e);
		}
		try {
			 new AdultUser(age, bookType);
		} catch (InvalidAgeException|InvalidBookTypeException e) {
			System.out.println("childUsersException :"+e.getMessage());
		}
		
	}

}
