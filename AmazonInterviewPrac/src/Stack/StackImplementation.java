package Stack;

/**
 * Created by i_amg on 28-04-2017.
 */
class myStack{

    int size;
    int[] arr;
    int top;

    public myStack(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    public boolean IsFull(){

        return top == size - 1;
    }
    public void push(int data)
    {
        if(!IsFull())
        {
            arr[++top] = data;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public int pop(){
        if(!isEmpty()){
            return arr[top--];
        }

        return -1;
    }

}
public class StackImplementation
{
    public static void main(String[] args)
    {
        myStack obj = new myStack(6);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
