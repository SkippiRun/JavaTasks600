import java.util.*;
class Task_16_4 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	//int a, b, x, count = 0, sum = 0;// down = 1, up = 9;
	//System.out.println("Введите число: ");
	//a = in.nextInt();
	//b = a;
	//x = down + (int)((up - down + 1)*Math.random());
	for (int i = 1; i <= 12; i++){
		//int s = 0;
		for (int j = 1; j <= 9; j++){
			System.out.print(i*j+" ");
			//System.out.println(/*"i:"+i+"\tj:"+j+"\t*/"s:"+s);
		}
		System.out.println();
	}
	}
}
