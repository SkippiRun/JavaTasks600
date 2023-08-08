import java.util.*;
class Task_3_4{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double Doll, DollToRub;
		System.out.print("Введите курс рубля по отношению к доллару ");
		DollToRub = in.nextDouble();
		System.out.print("Введите количество долларов ");
		Doll = in.nextDouble();
		System.out.println("Результат перевода долларов в рубли " + Doll*DollToRub);
	}
}
