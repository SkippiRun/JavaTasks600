import java.util.*;
class Task_12_12 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int day, month, year, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
	for (int i = 1; i <= 10; i++) {
//		System.out.print("Введите день рождения: ");
//		day = in.nextInt();
		System.out.print("Введите месяц рождения: ");
		month = in.nextInt();
//		System.out.print("Введите год рождения: ");
//		year = in.nextInt();
		switch (month){
		case 12, 1, 2:
			sum1++;
			break;
		case 3, 4, 5:
			sum2++;
			break;
		case 6, 7, 8:
			sum3++;
			break;
		case 9, 10, 11:
			sum4++;
			break;
		}
	}
	System.out.println("Зима "+sum1);
	System.out.println("Весна "+sum2);
	System.out.println("Лето "+sum3);
	System.out.println("Осень "+sum4);
	}
}
