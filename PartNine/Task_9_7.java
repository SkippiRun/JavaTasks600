import java.util.*;
class Task_9_7 {
	public static Scanner in = new Scanner(System.in);
	public static void main (String[] args){
	int angleOne, angleTwo, angleThree;
	System.out.println("Введите 1 угол треугольника");
	angleOne = in.nextInt();
	System.out.println("Введите 2 угол треугольника");
	angleTwo = in.nextInt();
	angleThree = 180 - angleOne - angleTwo;
	if ((angleOne+angleTwo+angleThree) == 180) {
		System.out.println("Треугольник валидирован");
		if ((angleOne)>0 && (angleOne)<90 && (angleTwo)>0 && (angleTwo)<90 && (angleThree)>0 && (angleThree)<90) System.out.println("Треугольник остроугольный");
		if (((angleOne)>90 && (angleOne)<180) | ((angleTwo)>90 && (angleTwo)<180) | ((angleThree)>90 && (angleThree)<180)) System.out.println("Треугольник тупоугольный");	
		if ((angleOne == angleTwo) || (angleOne == angleThree) || (angleThree == angleTwo)) System.out.println("Треугольник равнобедренный");
		if ((angleOne == angleTwo) && (angleOne == angleThree) && (angleThree == angleTwo)) System.out.println("Треугольник равносторонний");
	} else System.out.println("Треугольник НЕ валидирован");
}
}
