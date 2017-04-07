import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by i_amg on 16-03-2017.
 */
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST{
    Node root;

    public BST(){
        this.root = null;
    }

    public void Insert_Element(int data){

        root = Insert_Element(root, data);
    }

    public void Delete_Element(int data){
        root = Delete_Element(root, data);
    }

    public void Preorder(){
        Preorder(root);
    }

    public void Inorder(){

        Inorder(root);
    }

    public void PostOrder(){
        PostOrder(root);
    }


    public Node Insert_Element(Node root, int data){

        if(root == null){
            return new Node(data);
        }

        if(root.data < data){
            root.right = Insert_Element(root.right, data);
        }

        if(root.data > data){
            root.left = Insert_Element(root.left, data);
        }

        return root;
    }


    public void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    public void PostOrder(Node root){
        if(root == null){
            return;
        }

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }


    public void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }

    public Node Delete_Element(Node root, int data){
        if(root == null){
            return root;
        }

        else if(root.data < data){
            root.right = Delete_Element(root.right, data);
        }

        else if(root.data > data){
            root.left = Delete_Element(root.left, data);
        }

        else {
            // YO I found you

            if(root.left == null && root.right == null){
                root = null;
                return root;
            }
            else
            if(root.left == null){
                return root.right;
            }
            else
            if(root.right == null){
                return root.left;
            }

            else {

                Node temp = FindMinimum(root.right);
                root.data = temp.data;
                root.right =  Delete_Element(root.right, temp.data);
            }

        }

        return root;
    }


    public Node FindMinimum(Node root){
        if(root.left == null){
            return root;
        }

       return FindMinimum(root.left);
    }

}
public class Binary
{
    public static void main(String[] args)
    {
        BST tree = new BST();
        tree.Insert_Element(5);
        tree.Insert_Element(3);
        tree.Insert_Element(4);
        tree.Insert_Element(2);
        tree.Insert_Element(7);
        tree.Insert_Element(8);
        tree.Insert_Element(6);

        BST tree1 = new BST();
        tree1.Insert_Element(5);
        tree1.Insert_Element(3);
        tree1.Insert_Element(4);
        tree1.Insert_Element(2);
        tree1.Insert_Element(7);
        tree1.Insert_Element(8);
        tree1.Insert_Element(6);

        //tree.Inorder();
        //tree.PostOrder();
        //tree.Preorder();

       // tree.Delete_Element(8);
       // tree.Inorder();

    }
}
