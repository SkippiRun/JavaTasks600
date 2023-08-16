import java.util.*;
class Task_8_31 {

	static Scanner reader = new Scanner (System.in);
	public static void main (String[] args){
	int a, b, c, d;
	System.out.print ("Введите трехзначное число: ");
	a = reader.nextInt();
	b = a/100;
	c = a%100/10;
	d = a%10;
	if (a%2 == 0){
		if (b%2 == 0) b++;
		else if (b%2 != 0 && b!=0) b--;
		if(c%2 == 0) c++;
		else if (c%2 != 0 && c!=0) c--;
		if(d%2 == 0) d++;
		else if (d%2 != 0 && d!=0) d--;
	}
	else {
		if (b%2 == 0) b--;
		else if (b%2 != 0 && b!=0) b++;
		if(c%2 == 0) c--;
		else if (c%2 != 0 && c!=0) c++;
		if(d%2 == 0) d--;
		else if (d%2 != 0 && d!=0) d++;
	}

 	System.out.println("Ввод "+a+"\nВывод "+(b*100+c*10+d));

}
}
