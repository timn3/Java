public class DivisionOfZero {

	public static void main(String[] args) {
		double out; double num1 = 0.0; double num2 = 1.2;
		out = num2 / num1; // Infinity
		System.out.println(out);
		out = num1 / num1; // NaN
		System.out.println(out);
		out = num2 / num1 / num1; // Infinity
		System.out.println(out);
	}

}
