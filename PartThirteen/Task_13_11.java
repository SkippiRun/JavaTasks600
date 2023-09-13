import java.util.*;
class Task_13_11 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, sum = 0, avr = 0, sumTuesday = 0;
	for (int i = 1; i <= 10; i++){
		System.out.println("Введите день недели (1 - 10): ");
		x = in.nextInt();
		System.out.println("Введите уровень загрязнения (1 - 10): ");
		y = in.nextInt();
		sum+=y;
		if (((x == 2) || (x == 9)) && (y <= 5)) System.out.println("Спокойный вторник");
		if (y >= 7) System.out.println("Опасно!");
	}
	}
}
