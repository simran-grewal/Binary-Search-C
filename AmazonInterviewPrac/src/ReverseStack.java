import java.util.*;
import java.util.LinkedList;

/**
 * Created by i_amg on 07-04-2017.
 */
public class ReverseStack
{
    public static void Reverse(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }

        Integer value = stack.pop();
        Reverse(stack);
        stack.push(value);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Reverse(stack);


//        for(Integer i : stack){
//            System.out.println(i);
//        }

    }
}
