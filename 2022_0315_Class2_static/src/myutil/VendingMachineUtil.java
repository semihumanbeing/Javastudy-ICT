package myutil;

public class VendingMachineUtil {
	
	
// drink 단가 상수선언	
public static final int COLA = 500;
public static final int CIDER = 600;
public static final int JUICE = 800;
public static final int MILK = 400;

//drink 종류별 상수선언
public static final int DRINK_COLA = 1;
public static final int DRINK_CIDER = 2;
public static final int DRINK_JUICE = 3;
public static final int DRINK_MILK = 4;

int money; //받은금액
int drink; //선택음료

public void insertCoin(int money) {
	this.money = money;
}
public void selectDrink(int drink) {
	this.drink = drink;
}
	
public void displayResult() {
	
	
	int price = 0;
	if (money>=COLA||money>=CIDER||money>=JUICE|| money>= MILK) {
		
		if(drink == DRINK_COLA) {
			price = COLA;
			System.out.printf("받은금액: %d 선택음료: 콜라(%d), 거스름돈 %d",money,COLA,(money-COLA));
		} else if (drink == DRINK_CIDER) {
			price = CIDER;
			System.out.printf("받은금액: %d 선택음료: 사이다(%d), 거스름돈 %d",money,CIDER,(money-CIDER));
		} else if (drink == DRINK_JUICE) {
			price = JUICE;
			System.out.printf("받은금액: %d 선택음료: 쥬스(%d), 거스름돈 %d",money,JUICE,(money-JUICE));
		} else if (drink == DRINK_MILK) {
			price = MILK;
			System.out.printf("받은금액: %d 선택음료: 우유(%d), 거스름돈 %d",money,MILK,(money-MILK));
		} 
	} else {
		System.out.print("잔액이 부족합니다.");
	}
	
		
}
	
	

}
