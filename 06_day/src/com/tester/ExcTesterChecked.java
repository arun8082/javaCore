package com.tester;

//Checked exception are checked by Javac
//To handle that we can use that within try-catch or using throws

public class ExcTesterChecked {

	public static void main(String[] args) /*throws InterruptedException*/{

		try {
			Thread.sleep(1000000);//IntrupptedException
			System.out.println(10 / 10);
		} catch (Exception e) {

		}
		System.out.println("dncbfdh");
	}

}
