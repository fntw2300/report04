import java.util.Stack;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine();
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
//
//	===========================================
//	Scanner scanner = new Scanner(System.in);
//	String str = scanner.nextLine();
//	
//	StringBuffer sb = new StringBuffer();
//	sb.append(str);
//	
//	System.out.println(sb.reverse());
//  ===========================================	
	
	Stack<Character> stack = new Stack<Character>();
	String str = "String reverse using Stack";
	
	for(int i=0; i<str.length(); i++)
		stack.push(str.charAt(i));
	
	while(!stack.empty())
		System.out.print(stack.pop());
	
	
	}
}
