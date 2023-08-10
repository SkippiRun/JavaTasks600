import java.util.*;
class Task_4_25 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){
		int a, a1, b, b1;
		a=in.nextInt();
		b=in.nextInt();
		a1 = a%10;
		a = a/10;
		b1 = b%10;
		b = b/10;
		a = a*10+b1;
		b = b*10+a1;
		System.out.println(a+" "+b);

	}
}
