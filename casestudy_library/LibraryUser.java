package com.evergent.corejava.casestudy_library;

public interface LibraryUser {
void registerAccount(int age) throws InvalidAgeException;
void requestBook(String bookType) throws InvalidBookTypeException;
}
