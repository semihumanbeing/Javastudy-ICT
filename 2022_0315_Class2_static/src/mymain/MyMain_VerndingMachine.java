package mymain;

import java.util.Scanner;

import myutil.VendingMachineUtil;

public class MyMain_VerndingMachine {

	public static void main(String[] args) {
		int money;
		int drink;
		Scanner scanner = new Scanner(System.in);
		VendingMachineUtil vendingmachine = new VendingMachineUtil();
		
		String y;
		do{
		System.out.print("금액: ");
		money = scanner.nextInt();
		System.out.print("음료선택(1.콜라 2.사이다 3.쥬스 4.우유): ");
		drink = scanner.nextInt();
		
		vendingmachine.insertCoin(money);
		vendingmachine.selectDrink(drink);
		
		vendingmachine.displayResult();
		
		System.out.println();
		System.out.print("다시하기? y/n ");
		y = scanner.next();
		}while (y.equalsIgnoreCase("y"));
		
		
		scanner.close();
		
	}

}
