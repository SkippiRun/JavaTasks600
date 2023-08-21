class Task_11_19 {
	public static void main (String[] args) {

		int i, down = 10, up = 99;
		System.out.println("Start");
		for (i = up; i >= down; i--) {
		if(i%5 == 0) System.out.print(i+" ");
		}
		System.out.println("\nStop");
	}
}
