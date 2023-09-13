import java.util.*;
class Task_13_14 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int x, y, addTicket = 0, sumOrdinary = 0, sumPriveleged = 0;
	for (int i = 1; i <= 5; i++){
		System.out.println("Введите количество обычных билетов: ");
		x = in.nextInt();
		System.out.println("Введите количество привилегированных билетов: ");
		y = in.nextInt();
		if (x > 10) addTicket++;
		sumOrdinary+=x;
		sumPriveleged+=y;
	}
	System.out.println("Количество проданных обычных билетов "+sumOrdinary
			+"\nКоличество проданных привилегированных билетов "+sumPriveleged
			+"\nКоличество подаренных обычных билетов "+addTicket);
	}
}
