import java.util.*;
class Task_5_6 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int x, y;
	x = in.nextInt();
	y = in.nextInt();
	if ((x<y) || (x<100)) System.out.println("True");
	else System.out.println("False");
	}
}
