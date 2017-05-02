/**
 * Created by i_amg on 27-04-2017.
 */
class NNNode{

    int data;
    NNNode left;
    NNNode right;

    public NNNode(int data){

        this.data = data;
        this.left = null;
        this.right = null;

    }

}

class TTree{

    NNNode root;

    public TTree(){
        root = null;
    }


    public void Insert(int data){

        root = Insert(root, data);
    }

    public NNNode Insert(NNNode root, int data){
        if(root == null){
            return new NNNode(data);
        }

        if(root.data < data){
            root.right = Insert(root.right, data);
        }
        if(root.data > data){
            root.left = Insert(root.left, data);
        }

        return root;
    }


    public void Print(){
        Print(root);
    }

    public void Print(NNNode root){
        if(root == null){
            return;
        }

        Print(root.left);
        System.out.println(root.data);
        Print(root.right);
    }

}
public class BoundryofTree
{
    public static void main(String[] args)
    {

            TTree tree = new TTree();

        tree.Insert(20);
        tree.Insert(8);
        tree.Insert(4);
        tree.Insert(22);
        tree.Insert(25);
        tree.Insert(12);
        tree.Insert(10);
        tree.Insert(14);

        tree.Print();

    }
}
