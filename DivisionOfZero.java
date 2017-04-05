public class DivisionOfZero {

	public static void main(String[] args) {
		double out; double num1 = 0.0; double num2 = 0.0; double num3 = 1.2;
		out = num3 / num1; // Infinity
		System.out.println(out);
		out = num1 / num2; // NaN
		System.out.println(out);
		out = num3 / num1 / num2; // Infinity
		System.out.println(out);
	}

}
