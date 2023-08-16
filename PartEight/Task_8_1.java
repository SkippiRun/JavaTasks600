import java.util.*;
class Task_8_1 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){

	System.out.print("Введите целое число = ");
	int a = reader.nextInt();
	if (a/10 > 7){
	a++;
	System.out.println("Yes");
	}
	else{
	a--;
	System.out.println("No");
	}
	System.out.println(a);
}
}
