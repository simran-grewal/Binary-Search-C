import sun.awt.image.ImageWatched;

/**
 * Created by i_amg on 04-04-2017.
 */
class node{
    int data;
    node next;

    public node(int data){
        this.data = data;
        this.next = null;
    }

}

class LinkedList{
    node root;
   public LinkedList (){
        root = null;
    }

    public void Insert(int data){

      this.root =  Insert(root, data);
    }

    private node Insert(node root, int data){
        if(root == null){
            return new node(data);
        }
       root.next  = Insert(root.next, data);

        return root;
    }

    public void print(){

        print(root);
    }

    private void print(node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        print(root.next);
    }

    public void delete(int data){
        if(root == null){return;}
        node curr = root;
        node prev = null;

        if(curr.data == data){
            root = curr.next;
            return;
        }
        while (curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }

       if(curr != null) {
               prev.next = curr.next;

       }
        else {
           System.out.println("node not present ");
           return;
       }
    }

    public void reverse(){

        reverse(root);
    }

    private void reverse(node root){

        if(root == null){
            return;
        }

        if(root.next == null){
            this.root = root;
            return;
        }

        reverse(root.next);

        root.next.next = root;
        root.next = null;
    }
}
public class List
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.Insert(1);
        linkedList.Insert(2);
        linkedList.Insert(3);
        linkedList.Insert(4);
        linkedList.Insert(5);

        linkedList.delete(1);

        linkedList.print();
        linkedList.reverse();

        linkedList.print();
    }
}
