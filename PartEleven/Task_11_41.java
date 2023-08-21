import java.util.*;
class Task_11_41 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, num, i, down = 100, up = 999;

//		System.out.print("Введите цифру: ");
//		inpt = in.nextInt();
		System.out.println("Start");
//		if (inpt < 0) inpt =  inpt;
		for (i = 100; i <= 999; i++) {
		//num = down + (int)((up-down+1)*Math.random());
		if (((i/100)%2 == 0) && ((i%100/10)%2 == 0) && ((i%10)%2 == 0) && ((i%100/10) != 0) && ((i%10) != 0)) System.out.println(i);
//		else System.out.println(Math.floor(Math.sqrt((num%100)/10)));
		}
		System.out.println("Stop");
	}
}
