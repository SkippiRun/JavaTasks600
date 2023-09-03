import java.util.*;
class Task_12_19 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int  countIn = 0, countOut = 0, countOn = 0;
	double x, y, r, x1, y1;
	System.out.print("Введите координату X центра окружности: ");
	x = in.nextDouble();
	System.out.print("Введите координату Y центра окружности: ");
	y = in.nextDouble();
	System.out.print("Введите радиус окружности R: ");
	r = in.nextDouble();
	for (int i = 0; i < 15; i++) {
			System.out.print("Введите координату X: ");
			x1 = in.nextDouble();
			System.out.print("Введите координату Y: ");
			y1 = in.nextDouble();
			System.out.print("Пара координат под номером "+i);
			if ( ( Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2) ) < Math.pow(r, 2) ) {
				countIn++;
				System.out.println(" находится в круге");
			}
			else if ( ( Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2) ) > Math.pow(r, 2) ){
				 countOut++;
				System.out.println(" находится за кругом");
			}
			else if ( ( Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2) ) == Math.pow(r, 2) ){
				 countOn++;
				System.out.println(" находится на круге");
			}
	}
	}
}
