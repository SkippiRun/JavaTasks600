import java.util.*;
class Task_8_12 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a;
	System.out.print ("Введите оченку ученика ");
	a = reader.nextInt();
	if ((a < 1) | (a > 5)) System.out.println ("Чай мы не в Беларуси, оценки от 1 до 5");
	else System.out.println("Оценка ученика " + a);
}
}
