package PracticeLinkedList;

/**
 * Created by i_amg on 05-06-2017.
 */
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node root;

   public LinkedList() {
        root = null;
    }

    public void add_element_front(int data){
        if(root == null){
            root = new Node(data);
        } else{

            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
        }
    }

    public void print_element(){
        if(root != null){
            print_element(root);
        }
    }

    public void print_element(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        print_element(root.next);
    }

    public void add_element_last(int data){
        if(root == null){
            root = new Node(data);
        } else {
            Node curr = root;
            while (curr.next != null){
                curr = curr.next;
            }

            curr.next = new Node(data);
        }
    }

    public void reverseList(){

        Node curr = root,
             prev = null,
             next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        root = prev;
    }

    public void reverseRecursivly(){
        if(root != null){
            reverseRecursivly(root);
        }
    }

    public void reverseRecursivly(Node root){


        if(root.next == null){
            this.root = root;
            return;
        }

        reverseRecursivly(root.next);
        root.next.next = root;
        root.next = null;
    }

    public void remove_duplicate(){
        Node curr = root;
        while (curr!= null){
            Node runner = curr;
            while (runner.next != null){
                if(runner.next.data == curr.data){
                    runner.next = runner.next.next;
                } else{
                    runner = runner.next;
                }
            }

            curr = curr.next;
        }
    }

}
public class List
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();

        linkedList.add_element_last(5);
        linkedList.add_element_last(6);
        linkedList.add_element_front(3);
        linkedList.add_element_front(2);
        linkedList.add_element_front(1);
        linkedList.add_element_front(3);
        linkedList.add_element_front(5);
        linkedList.add_element_front(4);
        linkedList.add_element_front(2);

        linkedList.print_element();
        linkedList.remove_duplicate();
        System.out.println();
        linkedList.print_element();
        linkedList.reverseList();
        System.out.println();
        linkedList.print_element();
        linkedList.reverseRecursivly();
        System.out.println();
        linkedList.print_element();



    }
}
