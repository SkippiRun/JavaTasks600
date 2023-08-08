import java.util.Scanner;
class Task_2_36{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		String name1, name2;
		System.out.print("Введите вашу фамилию: ");
		name1 = reader.next();
		System.out.print("Введите город прибытия: ");
		name2 = reader.next();
		System.out.println("Пассажир "+ name1 +" отправляется в " + name2 +"!");
	}
}
