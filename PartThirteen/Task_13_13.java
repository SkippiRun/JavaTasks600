import java.util.*;
class Task_13_13 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x;
	double countOk = 0, countFail = 0, sumOk = 0, sumFail = 0, avrOk = 0, avrFail = 0;
	for (int i = 1; i <= 10; i++){
		System.out.println("Оценку ученика (1 - 5): ");
		x = in.nextInt();
		if (x >= 3) {
			sumOk+=x;
			countOk++;
		}
		if (x <= 2) {
		       sumFail+=x;
		       countFail++;	
		}
	}
	if (countOk >= 1) avrOk = sumOk/countOk;
	if (countFail >= 1) avrFail = sumFail/countFail;
	System.out.println("Средняя оценка удв "+avrOk+"\t Средняя оценка неудв "+avrFail);
	}
}
