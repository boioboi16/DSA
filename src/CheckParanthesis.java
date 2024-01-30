import java.util.Stack;

public class CheckParanthesis {

	public static void main(String[] args) {
		String sampleString = "I { love [ the {rains}()]}";
		String sampleString2 = "I { love [ the {rains ] ()";
		System.out.println(checkParanthesis(sampleString));
		System.out.println(checkParanthesis(sampleString2));

	}
	
	public static boolean checkParanthesis(String s) {//determines if all the open-parenthesis have a corresponding closing parenthesis
		 Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {// for loop to iterate over the string
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {// while iterating if it finds an open bracket it will push it to the stack
				stack.push(s.charAt(i));
			}
			
			else if(s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == '}' && stack.peek() == '{' || s.charAt(i) == ']' && stack.peek() == '[') {
					stack.pop(); //if we come across a closed bracket while iterating we will check the top of the stack. If it matches then we pop it from the stack
			}
		}
		if(stack.isEmpty()) {
			return true;// after we are done iterating over the string we will check whether the stack is empty or not. If it is empty then it means that each open bracket had its corresponding closing bracket
		}
		return false;// if the stack is not empty then we return false
	}

}
// Time Complexity of O(N) because it iterates over a string of size N
//Space Complexity of O(N) because it depends on the length of the string and the number of open brackets in the string.