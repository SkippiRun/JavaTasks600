import java.util.*;
class Task_11_50 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {

		int inpt, i;
		System.out.print("Enter a two-digit num: ");
		inpt = in.nextInt();
		System.out.println("Start");
		for (i = 1000; i <= 9999; i++) {
		if ( (((i/1000)+(i%1000/100)) == ((i%100/10)+(i%10))) && (((i%100/10)+(i%10)) == ((inpt/10)+(inpt%10))) ) System.out.println(i);
		//System.out.println(i+"\t"+i%100);
		}
		System.out.println("Stop");
	}
}
