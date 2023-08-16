import java.util.*;
class Task_8_4 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b;
	System.out.print("Введите число = ");
	a = reader.nextInt();

	if (a/10 >= 5) b = 20; //если введенное значение больше либо равно 50 то
	else b = 0;

	System.out.println(a +"\t"+ b);
}
}
