import java.util.*;
class Task_14_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int min0, min1 = -1, min2 = 0, down0 = -40, up0 = 40;
	//System.out.println("Введите число членов последовательности: ");
	//x = in.nextInt();
	for (int i = 0; i < 20; i++) {
		min0 = down0+(int)((up0 - down0 + 1)*Math.random());
		//System.out.println("Участник с номером "+i+" имеет следующий результат: "+min0);
		if (min0 < 0 && min1 > min0) min1 = min0;	
		if (min0 >= 0 && min2 < min0) min2 = min0;
		}
	System.out.println("\nНаибольший результат: "+min2+"\nНаименьший результат: "+min1);
	}
}
