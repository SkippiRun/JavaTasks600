import java.util.Scanner;
class Task_2_31{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		double a, b, constKPHtoMPS = 0.27778;
		System.out.print("Введите массу тела в киллограммах: ");
		a = reader.nextInt();
		System.out.print("Введите скорость тела в километрах в час: ");
		b = reader.nextInt();
		System.out.println("Масса тела "+ a + "кг.\tСкорость тела " + b + "км/ч");
		System.out.print("Кинетическая энергия тела равна ");
		b*= constKPHtoMPS;
		System.out.println((a*(b*b))/2 + " Дж.");
	}
}
