class Task_11_20 {
	public static void main (String[] args) {

		int i, down = 100, up = 999;
		System.out.println("Start");
		for (i = down; i <= up; i++) {
		if (i%80 == 45)System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
