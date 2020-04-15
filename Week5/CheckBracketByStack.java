package Week5;

import java.util.Stack;

public class CheckBracketByStack {
	public static void main(String[] args) {
		String text1 = "( 10 - 8 / ( ( 2 + 5 ) * 17 )";
		String text2 = ") 1 - 4 ) * ( 4 + 4 )";
		String text3 = "( 10 - 8 ) / ( ( 2 + 5 ) * 17 )";
		String text4 = "( 1 + ( ( 2 + 3 )  ( -4  -5 ) ) )";
		String text5 = "( ( 5 + ( ( 8 - 4 )  ( 2 + 3 ) ) )  ( 3 * 4 ) )";
		String text6 = "( -5  ( ( 2 + -3 )  ( -4 * -5 ) ) )";
		String text7 = "( (-5)  ( ( (-2) - -3 )  ( -4 * -5 ) ) )";
		String text8 = "( (-5)  ( ( (-2) - x )  ( -4 * -5 ) ) )";
		String text9 = "( (-5)  ( ( (-2)a - 3 )  ( -4 * -5 ) ) )";
		String text10 = "[ ( { 1 + 2 } ) ]";

		if (check(text10)) {
			System.out.println("The expression " + text10 + " is valid on accents");
			Double result = calcExp(text10);
			if (result != null)
				System.out.println("The value of the expression = " + result);
			else
				System.out.println("Expression contains invalid variable");
		} else {
			System.out.println("Illegal");
		}
	}

	public static boolean check(String text) {
		ArrayListStack<String> stack = new ArrayListStack<>();
		String[] array = text.split("\\s");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("(") || array[i].equals("[") || array[i].equals("{")) {
				stack.push(array[i]);
			} else if (array[i].equals("}") || array[i].equals("]") || array[i].equals(")")) {
				if (stack.size() > 0) {
					if (array[i].equals(convertInvalid(stack.top()))) {
						stack.pop();
					} else
						return false;
				} else {
					return false;
				}
			}
		}
		if (stack.size() != 0)
			return false;
		return true;
	}

	public static double calculate(String exp, double x, double y) {
		if (exp.equals("+")) {
			return x + y;
		} else if (exp.equals("-")) {
			return y - x;
		} else if (exp.equals("*")) {
			return x * y;
		} else if (exp.equals("/")) {
			return y / x;
		}
		return 0;
	}

	public static boolean regexExpress(String t) {
		if (t.matches("\\)|\\(|\\-|\\+|\\*|\\/|\\{|\\}|\\[|\\]")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkNumber(String number) {
		number = number.replaceAll("\\)|\\(", "");
		if (number.matches("(\\-)*[0-9]+"))
			return true;
		return false;
	}

	public static String convertInvalid(String inv) {
		switch (inv) {
		case "(":
			return ")";
		case "[":
			return "]";
		case "{":
			return "}";
		}
		return null;
	}

	public static double convertNumber(String number) {
		Double num = 0.0;
		number = number.replaceAll("\\)|\\(", "");
		if (number.matches("(\\-)+[0-9]+")) {
			number = number.replaceAll("\\-", "");
			num = Double.parseDouble(number) * (-1);
		} else {
			num = Double.parseDouble(number);
		}
		return num;
	}

	public static Double calcExp(String text) {
		ArrayListStack<String> t = new ArrayListStack<>();
		ArrayListStack<Double> num = new ArrayListStack<>();
		String[] array = text.split("\\s");
		for (int i = 0; i < array.length; i++) {
			if (regexExpress(array[i])) {
				if (array[i].equals(")") || array[i].equals("]") || array[i].equals("}")) {
					if (num.size() == 1)
						return num.get(0);
					double a = calculate(t.pop(), num.pop(), num.pop());
					num.push(a);
					t.pop();
				} else {
					t.push(array[i]);
				}
			} else {
				if (checkNumber(array[i])) {
					num.push(convertNumber(array[i]));
				} else {
					return null;
				}
			}
		}
		if (num.size() == 2) {
			Double a = calculate(t.pop(), num.pop(), num.pop());
			num.push(a);
		}
		return num.get(0);
	}
}
