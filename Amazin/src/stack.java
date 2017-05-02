import java.util.Stack;

/**
 * Created by i_amg on 28-04-2017.
 */
class stackOperation{

    public void ReverseStack(Stack<Integer> stack){

        int data;

        if(stack.isEmpty()){
            return;
        }

        data = stack.pop();

        ReverseStack(stack);

        InsertAtBottom(stack, data);

    }



    public void InsertAtBottom(Stack<Integer> stack, int data){
        int temp;

        if(stack.isEmpty()){
            stack.push(data);

            return;
        }

        temp = stack.pop();
        InsertAtBottom(stack,data);

        stack.push(temp);
    }
}
public class stack
{

    public static void main(String[] args) {

        Stack<Integer> stack  = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stackOperation Operation = new stackOperation();

        Operation.ReverseStack(stack);


        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
