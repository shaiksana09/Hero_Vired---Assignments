import java.util.*;
class javastack{
	private static boolean isBalanced(String query) {
       Stack<Character> stack = new Stack<Character>();
       for (int i = 0; i < query.length(); i++) {
           if (query.charAt(i) == '(' || query.charAt(i) == '[' || query.charAt(i) == '{') {
               stack.push(query.charAt(i));
           }
           if (query.charAt(i) == ')' || query.charAt(i) == ']' || query.charAt(i) == '}') {
               if (stack.empty()) {
                   return false;
               }
            if (query.charAt(i) == ')') {
               if (stack.peek() == '(') {
                   stack.pop();
               } else {
                   return false;
               }
           }
           if (query.charAt(i) == ']') {
               if (stack.peek() == '[') {
                   stack.pop();
               } else {
                   return false;
               }
           }
           if (query.charAt(i) == '}') {
               if (stack.peek() == '{') {
                   stack.pop();
               } else {
                   return false;
               }
           }
           }
       }

       return stack.empty();
   }

   public static void main(String []argh)
   {
      Scanner scan = new Scanner(System.in);

      while (scan.hasNext()) {
         String input=scan.next();
            System.out.println(javastack.isBalanced(input));
        }   
        scan.close();

   }
}