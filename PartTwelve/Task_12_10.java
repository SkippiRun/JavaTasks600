import java.util.*;
class Task_12_10 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, y;
	double avrSum, avrSumCurr, sum = 0;
	System.out.print("Введите количество учеников: ");
	x = in.nextInt();
	if (x < 1 || x >= 20) System.out.println("Слишком большое введенное число");
	else {
		for (int i = 1; i <= x; i++) {
		System.out.print("Введите оценку ученика "+i+" : ");
		y = in.nextInt();
		sum += y;
		avrSumCurr = sum/i;
		System.out.println("Текущий средний балл равен "+avrSumCurr);
		}
	}
	avrSum = sum/x;
	//System.out.println("avrSum "+avrSum+"\tSum "+sum+"\tx "+x);
	if (avrSum >= 4.5) System.out.println("Средняя оценка - отлично");
	else if ((avrSum < 4.5) && (avrSum >= 3.5)) System.out.println("Средняя оценка - хорошо");
	else if ((avrSum < 3.5) && (avrSum >= 2.5)) System.out.println("Средняя оценка - удовлетворительно");
	else System.out.println("Средняя оценка - неудовлетворительно");
	}
}
