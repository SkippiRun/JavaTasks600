import java.util.*;
class Task_13_12 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, sum = 0, sumFail = 0, avr = 0;
	for (int i = 1; i <= 10; i++){
		System.out.println("Оценку ученика (1 - 5): ");
		x = in.nextInt();
		sum+=x;
		if (x <= 2) sumFail++;
		
	}
	avr = sum/10;
	System.out.println("Средняя оценка в классе "+avr+"\tКоличество неудов "+sumFail);
	}
}
