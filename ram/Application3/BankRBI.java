package com.evergent.corejava.ram.Application3;

public class BankRBI {
	static {
		System.out.println("Welcome to Employee Details");
	}
	public BankRBI() {
		System.out.println("RBI bank home loan and personal loan interest");
	}
	public BankRBI(double p,double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails() {
		System.out.println("Home loan interest in 8.5");
		System.out.println("personal loan interest is 11%");
	}
}
