package com.evergent.corejava.casestudy_library;

public class AdultUser implements LibraryUser {
	private int age;
	private String bookType;
	public AdultUser(int age,String bookType)throws InvalidAgeException,InvalidBookTypeException {
		if(verifyAge(age)==true){
			this.age=age;
			System.out.println("You have successfully registered under an Adult Account");
			
			if (verifyBookType(bookType)==true ) {
				this.bookType=bookType;
				System.out.println("Book Issued successfully, please return the book within 7 days");
				
			}
			else {
				throw new InvalidBookTypeException("Oops, you are allowed to take only adult Fiction books");
				
			}
			
		
		}
		else throw new InvalidAgeException("Sorry, Age must be greater than 12 to register as an adult");
	}
	private final boolean verifyAge(int age) {
		if(age>12) {
			return true;
		}
		else return false;
	}
	private final boolean verifyBookType(String bookType) {
		if(bookType.equals("fiction")) {
			if(age>12) {
				return true;
			}
			else return false;
		}
		else return false;
	}
}
