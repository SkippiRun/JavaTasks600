class Task_12_9 {
	public static void main (String[] args){

	int x, y, z, down = 100, up = 999, countEq = 0;
	for (int i = down; i <= up; i++) {
		x = i/100;
		y = i%100/10;
		z = i%10;
		if ( (x*x+z*z) == Math.pow(y, 2) ) {
			countEq++;
			System.out.println("Число i: " + i);
		}
	}
		System.out.println("Результат: "+countEq);
	}
}
