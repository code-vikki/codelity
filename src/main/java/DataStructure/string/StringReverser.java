package DataStructure.string;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input){
        Stack<Character> stack = new Stack();
        for(char a:input.toCharArray()){
           stack.push(a);
        }
        StringBuffer reverse=new StringBuffer();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
       ;
        return  reverse.toString();
    }
}
