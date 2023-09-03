class Task_12_8 {
	public static void main (String[] args){

	int x, y, down = 10, up = 99, countEq = 0;
	for (int i = down; i <= up; i++) {

		if (Math.abs((i%10)-(i/10)) <= 3) {
			countEq++;
			System.out.println("Число i: " + i);
		}
	}
		System.out.println("Результат: "+countEq);
	}
}
