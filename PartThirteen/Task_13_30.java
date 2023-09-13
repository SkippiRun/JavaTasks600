import java.util.*;
class Task_13_30 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int di, mass, down0 = 15, up0 = 35, down1 = 65, up1 = 85, sum = 0;
	//System.out.println("Введите число членов последовательности: ");
	//x = in.nextInt();
	for (int i = 0; i < 120; i++) {
		di = down0+(int)((up0 - down0 + 1)*Math.random());
		mass = down1+(int)((up1 - down1 + 1)*Math.random());
		if ((di >= 22 && di <= 26) && (mass >= 71 && mass <= 77)) sum++;
		System.out.println("i = "+i+"\tdi = "+di+"\tmass = "+mass);
	}
	System.out.println("Сумма равна "+sum);
	}
}
