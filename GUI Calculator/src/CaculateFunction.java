import java.util.EmptyStackException;
import java.util.Stack;

public class CaculateFunction {
	private static String[] TrnsInToSufix(String IFX)
	{
		String PFX[] = new String[IFX.length()];
		StringBuffer numBuffer = new StringBuffer();
		Stack<String> s = new Stack<String>();
		String a;
		s.push("=");
		int i = 0, j = 0;
		char ch;
		for (i = 0; i < IFX.length();) {
			ch = IFX.charAt(i);
			switch (ch) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				while (Character.isDigit(ch) || ch == '.')
				{
					numBuffer.append(ch); 
					ch = IFX.charAt(++i);
				}
				PFX[j++] = numBuffer.toString();
				numBuffer = new StringBuffer(); 
				continue; 
			case '(':
				s.push("(");
				break;
			case ')':
				while (s.peek() != "(")
					PFX[j++] = s.pop();
				break;
			case '+':
			case '-':
				while (s.size() > 1 && s.peek() != "(")
					PFX[j++] = s.pop();
				a = String.valueOf(ch);
				s.push(a);
				break;
			case '*':
			case '/':
				while (s.size() > 1 && (s.peek() == "*") || s.peek() == "/")

					PFX[j++] = s.pop();
				a = String.valueOf(ch);
				s.push(a);
				break;
			}
			i++;
		}
		while (s.size() > 1)
			PFX[j++] = s.pop();
		PFX[j] = "=";

		return PFX;
	}

	public static String Evaluate(String IFX)
	{
		String result;
		String PFX[] = null;
		try {
			PFX = TrnsInToSufix(IFX);
			int i = 0;
			double x1, x2, n;
			String str;
			Stack<String> s = new Stack<String>();
			while (PFX[i] != "=") {
				str = PFX[i];
				switch (str.charAt(0)) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					s.push(str);
					break;
				case '+':
					x1 = Double.parseDouble(s.pop());
					x2 = Double.parseDouble(s.pop());
					n = x1 + x2;
					s.push(String.valueOf(n));
					break;
				case '-':
					x1 = Double.parseDouble(s.pop());
					x2 = Double.parseDouble(s.pop());
					n = x2 - x1;
					s.push(String.valueOf(n));
					break;
				case '*':
					x1 = Double.parseDouble(s.pop());
					x2 = Double.parseDouble(s.pop());
					n = x1 * x2;
					s.push(String.valueOf(n));
					break;
				case '/':
					x1 = Double.parseDouble(s.pop());
					x2 = Double.parseDouble(s.pop());
					n = x2 / x1;
					s.push(String.valueOf(n));
					break;
				}
				i++;
			}
			result = s.pop();
		} catch (EmptyStackException e) {
			return "syntax error";
		}

		return result;
	}

	public static void main(String args[]) {
		System.out.println(Evaluate("3/0.0 = "));
		System.out.println(Integer.parseInt("3.0"));
	}
}
