import java.util.*;
class Task_16_3 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	//int a, b, x, count = 0, sum = 0;// down = 1, up = 9;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	//b = a;
	//x = down + (int)((up - down + 1)*Math.random());
	for (int i = 0; i < 5; i++){
		int s = 0;
		for (int j = 0; j < i; j++){
			s = s+i+j;
			System.out.println("i:"+i+"\tj:"+j+"\ts:"+s);
		}
	}
	}
}
