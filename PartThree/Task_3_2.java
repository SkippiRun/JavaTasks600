import java.util.*;
class Task_3_2{
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		double inch, inchToSm = 2.54;
		System.out.print("Введите размер в дюймах ");
		inch = in.nextInt();
		System.out.println("Размер в сантиметрах " + (inch*inchToSm));
	}
}
