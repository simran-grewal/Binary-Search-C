import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by i_amg on 26-03-2017.
 */

class Bst {
    Node root;
    public Bst(){
        this.root = null;
    }

    public void Insert_element(int data){

        root = Insert_element(root, data);
    }


    public Node Insert_element(Node root, int data){
        if(root == null){
            return new Node(data);
        }

        if(data < root.data){
            root.left = Insert_element(root.left, data);
        }

        if(data > root.data){
            root.right = Insert_element(root.right, data);
        }

        return root;
    }

    public void Inorder(){

        Inorder(root);
    }

    public void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    public void PreOrder_iteratively(){

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        List<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){

            root = stack.pop();
            list.add(root.data);
            if(root.right != null){
                stack.push(root.right);
            }

            if(root.left != null){
                stack.push(root.left);
            }
        }

       for(int i = 0; i < list.size(); i++){
           System.out.println(list.get(i));
       }
    }

    public void  InOrder_iteratively(){

        Stack<Node> stack = new Stack<Node>();

        while (true){

            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else {

                if(stack.isEmpty()){
                    break;
                }

                root = stack.pop();
                System.out.println(root.data);
                root = root.right;
            }
        }
    }
}
public class Tree
{
    public static void main(String[] args) {

        Bst tree = new Bst();
        tree.Insert_element(5);
        tree.Insert_element(3);
        tree.Insert_element(4);
        tree.Insert_element(2);
        tree.Insert_element(8);
        tree.Insert_element(7);
        tree.Insert_element(6);
        //tree.PreOrder_iteratively();
        //tree.InOrder_iteratively();
        //tree.Inorder();
    }
}
