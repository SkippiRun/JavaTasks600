import java.util.*;
class Task_12_13 {
	public static Scanner in=new Scanner(System.in);
	public static void main (String[] args){

	int y, down = 0, up = 1;
	double avrHead = 0, avrTail = 0, countHead = 0, countTail = 0;
		for (int i = 0; i < 10; i++) {
			y = down + (int)((up-down+1)*Math.random());
			if (y == 1) countHead++;
			else countTail++;
		}
		avrHead = countHead/10;
		avrTail = countTail/10;
		System.out.println("The first time, number of attemps 10");
		System.out.println("Quantity Heads: "+countHead+"\tQuantity Tails: "+countTail);
		System.out.println("Chance Head is "+avrHead+"\tChance Tail is "+avrTail);
		System.out.println("Abs "+Math.abs(avrHead-avrTail)+"\tRelative "+(avrHead-avrTail)+"\n");
		countHead = countTail = 0;

		for (int i = 0; i < 100; i++) {
			y = down + (int)((up-down+1)*Math.random());
			if (y == 1) countHead++;
			else countTail++;
		}
		avrHead = countHead/100;
		avrTail = countTail/100;
		System.out.println("The second time, number of attemps 100");
		System.out.println("Quantity Heads: "+countHead+"\tQuantity Tails: "+countTail);
		System.out.println("Chance Head is "+avrHead+"\tChance Tail is "+avrTail);
		System.out.println("Abs "+Math.abs(avrHead-avrTail)+"\tRelative "+(avrHead-avrTail)+"\n");
		countHead = countTail = 0;

		for (int i = 0; i < 1000; i++) {
			y = down + (int)((up-down+1)*Math.random());
			if (y == 1) countHead++;
			else countTail++;
		}
		avrHead = countHead/1000;
		avrTail = countTail/1000;
		System.out.println("The third time, number of attemps 1000");
		System.out.println("Quantity Heads: "+countHead+"\tQuantity Tails: "+countTail);
		System.out.println("Chance Head is "+avrHead+"\tChance Tail is "+avrTail);
		System.out.println("Abs "+Math.abs(avrHead-avrTail)+"\tRelative "+(avrHead-avrTail)+"\n");
		countHead = countTail = 0;

		for (int i = 0; i < 10000; i++) {
			y = down + (int)((up-down+1)*Math.random());
			if (y == 1) countHead++;
			else countTail++;
		}
		avrHead = countHead/10000;
		avrTail = countTail/10000;
		System.out.println("The third time, number of attemps 10000");
		System.out.println("Quantity Heads: "+countHead+"\tQuantity Tails: "+countTail);
		System.out.println("Chance Head is "+avrHead+"\tChance Tail is "+avrTail);
		System.out.println("Abs "+Math.abs(avrHead-avrTail)+"\tRelative "+(avrHead-avrTail)+"\n");
	}
}
