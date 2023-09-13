import java.util.*;
class Task_14_1 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int min0, min1 = 1000, down0 = 100, up0 = 1000;
	//System.out.println("Введите число членов последовательности: ");
	//x = in.nextInt();
	for (int i = 0; i < 200; i++) {
		min0 = down0+(int)((up0 - down0 + 1)*Math.random());
		//System.out.println("Участник с номером "+i+" имеет следующий результат: "+min0);
		if (min1 > min0) min1 = min0;
		}
	System.out.println("Наилучший результат: "+min1);
	}
}
