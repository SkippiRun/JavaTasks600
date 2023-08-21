import java.util.*;
class Task_11_49 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, i;
		System.out.print("Enter a two-digit num: ");
		inpt = in.nextInt();
		System.out.println("Start");
		for (i = 1000; i <= 9999; i++) {
		if (((i%1000/10) == (inpt%100)) || ((i%100)==(inpt%100)) ) System.out.println(i);
		//System.out.println(i+"\t"+i%100);
		}
		System.out.println("Stop");
	}
}
