//import java.util.*;
public class Task_10_21 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	double x, y, angle=0, down = -30, up = 30;

	x = down + (double)((up-down)*Math.random());
	y = down + (double)((up-down)*Math.random());

	System.out.println("x\ty\n"+x+"\t"+y);

	System.out.println("Округленное значени точки по оси X " + Math.floor(x));
	System.out.println("Округленное значени точки по оси Y " + Math.floor(y));

	if (x>0 && y>0) System.out.println("Точка расположена в 1 четверти ");
	else if (x<0 && y>0) System.out.println("Точка расположена во 2 четверти ");
	else if (x<0 && y<0) System.out.println("Точка расположена в 3 четверти ");
	else if (x>0 && y<0) System.out.println("Точка расположена в 4 четверти ");

	if (x>y) System.out.println("Точка ближе к оси Y");
	else System.out.println("Точка ближе к оси X");

	System.out.println("Расстояние между началом координат и точкой составляет: "+  Math.round(Math.sqrt(x*x+y*y)));

	if (x<0 && y<0)	angle = Math.round(180+Math.toDegrees(Math.atan(y/x)));
	else if (x<0 && y>0) angle = Math.round(Math.toDegrees(Math.atan(((y)/(x))))+180);
	else if (x>0 && y<0) angle = Math.round(Math.toDegrees(Math.atan(((y)/(x))))+360);
	else if (x>0 && y>0) angle = Math.round(Math.toDegrees(Math.atan(((y)/(x)))));

	System.out.println("Угол в градусах, который образует линия соединяющая точку с началом координат: " + angle+" градусов");
}
}
