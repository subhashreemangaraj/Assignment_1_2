
public class Assignmnt1_2_operators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		b = a-- - --a;
		System.out.println("a-- - --a : = " +b);
		int c = a--;
		System.out.println("a-- = " +c);
		int d= a>>2;
		System.out.println("a>>2 =" +d);
		int e = a&b;
		System.out.println("a&b =" +e);
		
	}
}
