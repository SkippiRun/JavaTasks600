import java.util.*;
class Task_16_5 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	//int a, b, x, count = 0, sum = 0;// down = 1, up = 9;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	//b = a;
	//x = down + (int)((up - down + 1)*Math.random());
	for (int i = 1; i <= 99; i++){
		//int s = 0;
		for (int j = 10; j <= 99; j++){
			if (j%i == 0) System.out.print(j+" ");
			//System.out.print("i:"+i+"\tj:"+j);
		}
		System.out.println("\n#############################################");
	}
	}
}
