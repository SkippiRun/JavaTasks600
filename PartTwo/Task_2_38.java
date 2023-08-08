import java.util.*;
class Task_2_38{
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args){
		String name1, name2, name3;
		System.out.print("Введите ваше имя: ");
		name1 = reader.next();
		System.out.print("Введите вашу фамилию: ");
		name2 = reader.next();
		System.out.print("Введите ваше отчество: ");
		name3 = reader.next();
		System.out.println("ФИО "+name2.charAt(0)+"."+ name1.charAt(0)+"."+ name3.charAt(0)+".");
	}
}
