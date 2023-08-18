//import java.util.*;
public class Task_10_22 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	double x1, y1, x2, y2, lengh=0, angle=0, down = -30, up = 30;

	x1 = down + (double)((up-down)*Math.random());
	y1 = down + (double)((up-down)*Math.random());
	x2 = down + (double)((up-down)*Math.random());
	y2 = down + (double)((up-down)*Math.random());

	System.out.println("x1\ty1\tx2\ty2\n"+Math.round(x1)+"\t"+Math.round(y1)+"\t"+Math.round(x2)+"\t"+Math.round(y2));
	lengh = Math.sqrt((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)));

	System.out.println("Длина отрезка " +lengh+"\t"+ Math.round(lengh));

	angle = Math.round(Math.toDegrees(Math.atan((y2-y1)/(x2-x1))));
	System.out.println("Угол, которые образует отрезок с осью X " + angle);

	if (x1*x2<0) System.out.println("Отрезок пересекает ось X ");
	if (y1*y2<0) System.out.println("Отрезок пересекает ось Y ");
	if (x1*x2>0 && y1*y2>0) System.out.println("Отрезок не пересекает оси ");
}
}
