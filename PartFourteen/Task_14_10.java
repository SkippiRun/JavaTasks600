import java.util.*;
class Task_14_10 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int num, num0, num1, num2, sum0 = 0, sum1 = 0, inode0 = 0, down0 = 100, up0 = 999;
	//System.out.println("Введите число членов последовательности: ");
	//x = in.nextInt();
	for (int i = 0; i < 25; i++) {
		num = down0+(int)((up0 - down0 + 1)*Math.random());
		num0 = num%10;
		num1 = num%100/10;
		num2 = num/100;
		sum1 = num0 + num1 + num2;
		if (sum0 < sum1) {
			sum0 = sum1;
			inode0 = i;
		}
		System.out.println("Участник с номером "+i+" имеет следующий результат: "+sum1);
	}
	System.out.println("\nНаибольший результат для "+inode0+" : "+sum0);
	}
}
