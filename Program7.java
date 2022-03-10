public class Program7 {

	public static void main(String[] args) {
		int total = sum3(3,4,5);
		System.out.println(total);

	}
	public static int sum3(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		return total;
	}
	
	// Write a method that calculates the average of n numbers, from 1 up to n and
	// n is a parameter, and return a double
	
	public static double averageOfN(int n, int sum) {
		double average = sum/n;
		return average;
	}
	
}
