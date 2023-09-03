import java.util.*;
class Task_12_11 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int y;
	double avrSum, avrSumCurr, sum = 0;
	for (int i = 1; i <= 10; i++) {
		System.out.print("Введите 1 или 0: ");
		y = in.nextInt();
		sum += y;
		avrSumCurr = sum/i;
		System.out.println("Текущий средний балл равен "+avrSumCurr);
		}
	avrSum = sum/10;
	//System.out.println("avrSum "+avrSum+"\tSum "+sum+"\tx "+x);
	if (avrSum == 1) System.out.println("100% респондентов за");
	else if (avrSum >= 0.8) System.out.println("Более 80% респондентов за");
	else if (avrSum >= 0.6) System.out.println("Более 60% респондентов за");
	else if (avrSum >= 0.5) System.out.println("Более 50% респондентов за");
	else if (avrSum >= 0.4) System.out.println("Более 40% респондентов за");
	else if (avrSum >= 0.2) System.out.println("Более 20% респондентов за");
	else if (avrSum >= 0.1) System.out.println("Более 10% респондентов за");
	else System.out.println("100% респондентов против");
	}
}
