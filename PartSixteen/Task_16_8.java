import java.util.*;
class Task_16_8 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
		for (int i = 1; i <= 75; i++){
			System.out.println("Число:"+i);
			System.out.print("Сумма делителей: ");
			int sum = 0;
			for (int j = 1; j <= i/2; j++){
				if (i%j == 0) sum += j;//System.out.print(j+" ");
			}
			System.out.println(sum+" ");
		System.out.println("\n############################################");
		}
	}
}
