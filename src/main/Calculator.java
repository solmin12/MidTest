package main;

import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Calculator {
	// operand와 operator로 바꾼 값
	ArrayList<String> all = new ArrayList<>();
	// ASCII코드 값 (decimal)
	ArrayList<String> input = new ArrayList<>();

	static String operator = "";

	public void clearArray() {
		all.clear();
		input.clear();
	}

	public void convert(String i) { // 입력값을 ascii값으로 변환

		int count = i.length();
		for (int a = 0; a < count; a++) {
			char c = i.charAt(a);
			// String값을 ASCII값으로 변환
			int num = c;
			input.add(Integer.toString(num));
		}
	}

	public String readInput(ArrayList<String> args) {
		String operand = "";
		while (Integer.parseInt(args.get(0)) >= '0' && Integer.parseInt(args.get(0)) <= '9'
				|| Integer.parseInt(args.get(0)) == 46) {
			if (Integer.parseInt(args.get(0)) == 46) {
				operand += ".";
				args.remove(0);
			} else {
				operand += Integer.toString(Integer.parseInt(args.get(0)) - '0');
				args.remove(0);
			}
		}
		operator = Integer.toString(Integer.parseInt(args.get(0)) - '0');
		args.remove(0);
		return operand;
	}

	// 팩토리얼 ! (ASCII값 33)
	public ArrayList<String> factorial(ArrayList<String> all) {
		int count_fac = Collections.frequency(all, "-15");
		for (int i = 0; i < count_fac; i++) {
			double c = 1;
			for (int a = 1; a <= Double.parseDouble(all.get(all.indexOf("-15") - 1)); a++) {
				c *= a;
			}
			all.set(all.indexOf("-15") - 1, Double.toString(c));
			all.remove(all.indexOf("-15"));
		}
		return all;
	}

	// 루트 (ASCII값 8730)
	public ArrayList<String> sqrt(ArrayList<String> all) {
		int count_sqrt = Collections.frequency(all, "8682");
		for (int i = 0; i < count_sqrt; i++) {
			if (all.indexOf("8682") == 0) {
				double c = Math.sqrt(Double.parseDouble(all.get(all.indexOf("8682") + 1)));
				all.remove(0);
				all.set(0, Double.toString(c));
			} else if (Double.parseDouble(all.get(all.indexOf("8682") - 1)) >= 0
					&& Double.parseDouble(all.get(all.indexOf("8682") - 1)) <= 9) {
				double c = Double.parseDouble(all.get(all.indexOf("8682") - 1))
						* Math.sqrt(Double.parseDouble(all.get(all.indexOf("8682") + 1)));
				all.set(all.indexOf("8682") - 1, Double.toString(c));
				all.remove(all.indexOf("8682") + 1);
				all.remove(all.indexOf("8682"));
			} else {
				double c = Math.sqrt(Double.parseDouble(all.get(all.indexOf("8682") + 1)));
				all.remove(all.indexOf("8682") + 1);
				all.set(all.indexOf("8682"), Double.toString(c));
			}

		}
		return all;
	}

	// 제곱
	public ArrayList<String> square(ArrayList<String> all) {
		int count_square = Collections.frequency(all, "46");
		for (int i = 0; i < count_square; i++) {
			double c = Math.pow(Double.parseDouble(all.get(all.indexOf("46") - 1)),
					Double.parseDouble(all.get(all.indexOf("46") + 1)));
			all.set(all.indexOf("46") - 1, Double.toString(c));
			all.remove(all.indexOf("46") + 1);
			all.remove(all.indexOf("46"));
		}
		return all;
	}

	// 곱셈
	private ArrayList<String> multiply(ArrayList<String> all) {

//		int count_multiply = Collections.frequency(all, "-6");

//		for (int i = 0; i < count_multiply; i++) {
		double c = Double.parseDouble(all.get(all.indexOf("-6") - 1))
				* Double.parseDouble(all.get(all.indexOf("-6") + 1));
		all.set(all.indexOf("-6") - 1, Double.toString(c));
		all.remove(all.indexOf("-6") + 1);
		all.remove(all.indexOf("-6"));
		// }
		return all;
	}

	// 나눗셈
	private ArrayList<String> divison(ArrayList<String> all) {

//		int count_divison = Collections.frequency(all, "-1");

//		for (int i = 0; i < count_divison; i++) {
		double c = Double.parseDouble(all.get(all.indexOf("-1") - 1))
				/ Double.parseDouble(all.get(all.indexOf("-1") + 1));
		all.set(all.indexOf("-1") - 1, Double.toString(c));
		all.remove(all.indexOf("-1") + 1);
		all.remove(all.indexOf("-1"));
//		}
		return all;
	}

	private ArrayList<String> add(ArrayList<String> all) {

		int count_add = Collections.frequency(all, "-5");

		for (int i = 0; i < count_add; i++) {
			double c = Double.parseDouble(all.get(all.indexOf("-5") - 1))
					+ Double.parseDouble(all.get(all.indexOf("-5") + 1));
			all.set(all.indexOf("-5") - 1, Double.toString(c));
			all.remove(all.indexOf("-5") + 1);
			all.remove(all.indexOf("-5"));
		}

		return all;
	}

	private ArrayList<String> substraction(ArrayList<String> all) {

		int count_substraction = Collections.frequency(all, "-3");

		for (int i = 0; i < count_substraction; i++) {
			double c = Double.parseDouble(all.get(all.indexOf("-3") - 1))
					- Double.parseDouble(all.get(all.indexOf("-3") + 1));
			all.set(all.indexOf("-3") - 1, Double.toString(c));
			all.remove(all.indexOf("-3") + 1);
			all.remove(all.indexOf("-3"));
		}

		return all;
	}

	// 나머지
	private ArrayList<String> remain(ArrayList<String> all) {

		int count_substraction = Collections.frequency(all, "-11");

		for (int i = 0; i < count_substraction; i++) {
			double c = Double.parseDouble(all.get(all.indexOf("-11") - 1))
					% Double.parseDouble(all.get(all.indexOf("-11") + 1));
			all.set(all.indexOf("-11") - 1, Double.toString(c));
			all.remove(all.indexOf("-11") + 1);
			all.remove(all.indexOf("-11"));
		}

		return all;
	}

	public String compute() {
		String result = "";

		while (!operator.equals("13") && !operator.equals("72")) {
			String operand_ = readInput(input);
			if (operand_.equals("")) {
				all.add(operator);
			} else {
				all.add(operand_);
				all.add(operator);
			}
		}
		operator = "";

		while (Collections.frequency(all, "-6") != 0 || Collections.frequency(all, "-1") != 0) {
			int a = 0;
			int b = 0;
			if (Collections.frequency(all, "-6") >= 1 && Collections.frequency(all, "-1") >= 1) {
				a = all.indexOf("-6");
				b = all.indexOf("-1");
				if (a > b && a > 0 && b > 0) {
					divison(all);
				} else {
					multiply(all);
				}
			}else if(Collections.frequency(all, "-6")==0) {
				divison(all);
			}else {
				multiply(all);
			}
			
		}

		sqrt(all);
		square(all);
		factorial(all);
		// multiply(all);
		// divison(all);
		add(all);
		substraction(all);
		remain(all);

		if (all.size() != 0) {
			result = all.get(0);
		}

		return result;
	}

}
