import java.util.*;
class Task_6_12 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
	double x, y, z, D, q1, q2;
	System.out.print("Введите первое положительное число ");
	x = in.nextInt();
	System.out.print("Введите второе положительное число ");
	y = in.nextInt();
	System.out.print("Введите третье положительное число ");
	z = in.nextInt();

	D = y*y-4*x*z;

	if (D>0) {
		q1 = (-y+Math.sqrt(D))/(2*x);
		q2 = (-y-Math.sqrt(D))/(2*x);
		System.out.println("Есть два корня, они равны " + q1 + "\t" + q2 + " соответственно");
}

	else if (D==0) {
		q1 = (-y)/(2*x);
		System.out.println("Корень один и он равен " + q1);
}
	else System.out.println("Корня нет");

}
}
