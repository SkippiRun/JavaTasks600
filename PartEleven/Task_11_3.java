import java.util.*;
class Task_11_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main(String[] args){
	int i, count = 0, sum = 0, k;
	for (i=1; i<6;i++) {
		count++;
		k = in.nextInt();
		if (k>100) sum=sum+k;
		System.out.println(count);
	}
	System.out.println(sum);
}
}
