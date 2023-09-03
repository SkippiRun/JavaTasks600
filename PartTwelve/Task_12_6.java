import java.util.*;
class Task_12_6 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y, down = 10, up = 99, countDivide = 0; //countPositive = 0, countEven = 0, countSingle = 0;
	System.out.print("Введите число от 10 до 99: ");
	x = in.nextInt();
	if (x < 10 || x >= 100) System.out.println("Число вне заданного диапазона");
	else if (x >= 10 && x < 100){
		for (int i = 10; i <= 99; i++) {
		//y = down + (int)((up-down+1)*Math.random());
		//System.out.println("Число: "+x);
			if (i%x == 0) {
				countDivide++;
				System.out.println("Число i: " + i + "\nСчетчик: "+countDivide);
			}
		}
		System.out.println("Количество двухзначных чисел, на которые делится вводимое число: "+countDivide);
	}
	}
}
