package com.ustglobal.customized.checkedexception;

public class TestAmountt {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		ValidateAmount va = new ValidateAmount();
		
		try {
			va.checkAmount(50000);
			System.out.println("Withdraw Your Cash");
		
		} catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Main Ended");
	}
}
