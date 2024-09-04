package com.evergent.corejava.ram.Application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{

	int eno;
	double sal;
	String address;
	public void employeeInfo(int eno, float sal){//interface override methods.
		this.eno=eno;
		this.sal=sal;
	}
	public void employeeAddress(String add) {
		this.address=add;
	}
	public void employeeDetails() {
		System.out.println("Employee No: "+eno);
		System.out.println("Employee sal : "+sal);
		System.out.println("Employee Address: "+address);
	}
	public void accountDetails() {//abstract class implementation.
		System.out.println("My account details is: 12345667");
	}
	public void show() {
		System.out.println("This is show local method");
	}
	public static void main(String[] args) {
		//Interface methods calling.
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100,5000);
		emp.employeeAddress("Bangalore");
		emp.employeeDetails();
		//Abstract class.
		emp.accountDetails();
		emp.bankDetails();
		//calling bankRBI with HAS-A
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.2,3.2);
		BankRBI.getBankDetails();
		//call local methods
		emp.show();
	}
}
