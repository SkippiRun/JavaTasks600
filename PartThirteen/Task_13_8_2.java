import java.util.*;
class Task_13_8_2 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int x, count = 0, sum = 0;
	x = in. nextInt();
	for (int i=1; i <= x/2; i++) {
		if (x%i == 0) {
			count++;
			sum+=i;
			System.out.print(i+" ");
		}
	}
	System.out.println();
	System.out.println("count = "+ count);
	System.out.println(sum);
	if (x%count == 0 && sum%count == 0) System.out.println("Дважды");
	else System.out.println( "Нет");
	}
}
