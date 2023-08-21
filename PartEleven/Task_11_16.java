class Task_11_16 {
	public static void main (String[] args) {

		int i, down = 10, up = 99;
		System.out.println("Start");
		for (i = down; i <= up; i++) {
		if(i%4 == 0) System.out.print(i+"# ");
		else System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
