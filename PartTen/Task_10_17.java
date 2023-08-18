//import java.util.*;
public class Task_10_17 {
//	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args){
	double k1, k2, g, p, s, down = 1, up = 10.5;

	k1 = down + (double)((up-down)*Math.random());
	k2 = down + (double)((up-down)*Math.random());

	g = Math.sqrt(k1*k1+k2*k2);
	p = g+k1+k2;
	s = 0.5*k1*k2;

	System.out.println("k1="+k1+"\nk2="+k2+"\ng="+g+"\np="+p+"\ns="+s);
	k1 = Math.round(k1);
	k2 = Math.round(k2);
	g = Math.round(g);
	p = Math.round(p);
	s = Math.round(s);
	System.out.println("k1="+k1+"\nk2="+k2+"\ng="+g+"\np="+p+"\ns="+s);

}
}
