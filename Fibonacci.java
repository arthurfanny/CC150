public class Fibonacci{
	public static long fib(int n){
		if (n <=1) return n;
		else return fib(n-1) + fib(n-2);
	}

	public static void main(String []args){
		int N = Integer.parseInt(args[0]);
		System.out.println("The number of Fibonacci" is fib(N));
	}
}


