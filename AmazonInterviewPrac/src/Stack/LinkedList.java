package Stack;

/**
 * Created by i_amg on 28-04-2017.
 */
class Node{
    int data;
    Node next;

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}

class stack{
    int size;
    Node head;
    public stack(){
        head = null;
        size = 0;
    }

    public void push(int data){
        if(head == null){
            head = new Node(data);

        }else{

            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }
    }


    public int  pop(){
        if(head == null){
            return -1;

        }
            int ret = head.data;
            head = head.next;
            return ret;

    }
}
public class LinkedList
{
    public static void main(String[] args)
    {
        stack stack = new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());

    }
}
