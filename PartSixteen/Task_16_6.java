import java.util.*;
class Task_16_6 {
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	
	int cash = 100, bull = 10, cow = 5;
		for (int i = 1; i <= 20; i++){
			for (int j = 1; j <= 10; j++){
				if ((bull*i + cow*j) == cash) System.out.println("Great!\nWe by "+i+" Bulls and "+j+" Cows\n\n");
			//System.out.println("\n#############################################");
		}
	}
	}
}
