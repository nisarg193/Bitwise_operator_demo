
public class BitwiseOperatorDemo {

	public static void main(String[] args) {

		// &-->1 1 -->1
		int a = 25;// 11001
		int b = 15;// 01111
		int c = a & b;// 01001-->9
		System.out.println(c);

		// |-->1 0-->1
		// |-->0 1-->1
		// |-->0 0-->0
		c = a | b;// 1111-->31
		System.out.println(c);

		// << will append 0 bit at most right side
		c = a << 2;// 1100100-->100
		System.out.println(c);

		// >> will remove bit from right side
		c = a >> 2;// 110-->6
		System.out.println(c);

	}

}
