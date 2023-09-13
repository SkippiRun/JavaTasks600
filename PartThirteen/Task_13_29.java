import java.util.*;
class Task_13_29 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int first, second, down0 =30, up0 = 50, sum = 0, count0 = 0, count1 = 0;
	//System.out.println("Введите число членов последовательности: ");
	//x = in.nextInt();
	for (int i = 0; i < 20; i++) {
		first = down0+(int)((up0 - down0 + 1)*Math.random());
		second = down0+(int)((up0 - down0 + 1)*Math.random());
		sum = first+ second;
		System.out.println("Участник с номером "+i+" имеет следующий результат: "+sum+"\nБаллы за первый этап: "+first+"\tБаллы за второй этап: "+second);
		if (sum < 80) {
			count1++;
			System.out.println("Участник с номером "+i+" не прошел отбор");
		}
		else {
			count0++;
			System.out.println("Участник с номером "+i+" прошел отбор");
	
		}
	}
	System.out.println("\n\n\nКоличество участников, прошедших отбор: "+count0+"\n"+"Количество участников, не прошедших отбор: "+count1);
	}
}
