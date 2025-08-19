package Stack;

import Stack.Implementation_Using_LL.*;

public class Implemented_Stack {
    
    public static void main(){
        stack newStack =  new stack();
        System.out.println(newStack.display());
        System.out.println(newStack.pop());
        System.out.println(newStack.push(10));
        System.out.println(newStack.display());
        System.out.println(newStack.push(20));
        System.out.println(newStack.push(30));
        System.out.println(newStack.push(40));
        System.out.println(newStack.display());
        System.out.println(newStack.pop());
        System.out.println(newStack.display());
        System.out.println(newStack.length());
        System.out.println(newStack.top());
    }
}
