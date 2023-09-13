import java.util.*;
class Task_13_1 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	int s1 = 0, s2 = 0;
	for (int i=1; i<7; i++){
	int x = in.nextInt();
	if (x%2 == 0) s1 = s1+x;
	if (x%3 == 0) s2 = s2+x;
	}
	System.out.println("s1 = "+s1+"\ts2 = "+s2);
	}
}
