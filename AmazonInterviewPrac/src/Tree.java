import com.sun.org.apache.bcel.internal.generic.StackConsumer;

import javax.swing.*;
import java.util.*;

/**
 * Created by i_amg on 01-04-2017.
 */
class Node {
    private Node left;
    private Node right;
    private int data;

    public Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }


    public void set_data(int data){
        this.data = data;
    }

    public void set_left(Node left){
        this.left = left;
    }

    public void set_right(Node right){
        this.right = right;
    }

    public int get_data(){
        return this.data;
    }

    public Node get_left(){
        return this.left;
    }

    public Node get_right(){
        return this.right;
    }
}
class TreeMaster{

    Node root;
    public TreeMaster (){
        this.root = null;
    }

    public void Insert_node(int data){
        this.root = Insert_node(root, data);
    }

    private Node Insert_node(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        Node parent = null;

        Node newNode = new Node(data);

        Node curr = root;

        while(curr != null){
            parent = curr;

            if(curr.get_data() < data){
                curr = curr.get_right();
            }

            else {
                curr = curr.get_left();
            }
        }

        if(data < parent.get_data()){
            parent.set_left(newNode);
        }

        if(data > parent.get_data()){
            parent.set_right(newNode);
        }

        return root;
    }

    public void Inorder_iteratively(){

        Stack<Node> stack = new Stack<Node>();
        Node root = this.root;
        while (true){

            if(root != null){
                stack.push(root);
                root = root.get_left();
            }

            else
            {
                if(stack.isEmpty()){
                    break;
                }
                root = stack.pop();
                System.out.print(root.get_data() + " ");
                root = root.get_right();
            }
        }
    }

    public void height(){
       int height  = height(this.root);
        System.out.println(height);
    }

    private int height(Node root){

        if(root == null){return 0;}
        return 1 +  Math.max(height(root.get_left()), height(root.get_right()));
    }

    public void size(){
        if(root == null){
            System.out.println("0");
            return;
        }
        int size = size(root);
        System.out.println(size);
    }

    private int size(Node root){
        if(root == null){
            return 0;
        }

        return size(root.get_left()) + 1 + size(root.get_right());
    }

    public void Delete(int data){

       root =  Delete(this.root, data);

        Inorder_iteratively();
    }

    private Node Delete(Node root, int data){

        if(root == null){
            return root;
        }

        if(root.get_data() < data){
           root.set_right(Delete(root.get_right(), data));
        }

        else
        if(root.get_data() > data){
            root.set_left((Delete(root.get_left(), data)));
        }

        else {

            if(root.get_left() == null && root.get_right() == null){
                return null;
            }
            else
            if(root.get_left() == null){
                return root.get_right();
            }
            else
            if(root.get_right() == null){
                return root.get_left();
            }

            else{

                Node temp = FindMinimum(root.get_right());
                root.set_data(temp.get_data());
                root.set_right(Delete(root.get_right(), temp.get_data()));

            }


        }

        return root;

    }

    private Node FindMinimum(Node root){
        if(root.get_left() == null){
            return root;
        }

       return FindMinimum(root.get_left());
    }

    public void Path(){
        Path(root, new int[10000] , 0);
    }

    private void Path(Node root, int[] arrayList, int index){
        if(root == null){
            return;
        }
        arrayList[index++] = root.get_data();

        if(root.get_left() == null && root.get_right() == null){
            Print(arrayList, index);
            System.out.println("");
        }
        else
        {
            Path(root.get_left(), arrayList, index);
            Path(root.get_right(), arrayList, index);
        }


    }

    private void Print(int[] arr, int n){
        for(int i : arr){
            if(n == 0)break;
            System.out.print(i + " ");
            --n;
        }
    }
    public void Ceil(int data){
        System.out.println(Ceil(this.root, data));
    }

    private int Ceil(Node root, int data){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        if(root.get_data() == data){
            return root.get_data();
        }
        if(root.get_data() < data){
            return Ceil(root.get_right(), data);
        }

        else
        {
            int ceil = Ceil(root.get_left(), data);
            if(ceil >= data){
                return ceil;
            }
            else {
                return root.get_data();
            }
        }

    }

    public void Floor(int data){
        System.out.println(Floor(root, data));
    }

    private int Floor(Node root, int data){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        if(root.get_data() ==  data){
            return root.get_data();
        }

        if(root.get_data() > data){

            return Floor(root.get_left(), data);
        }

        else
        {
            int floor = Floor(root.get_right(), data);
            if(floor <= data){
                return floor;
            }

            return root.get_data();
        }

    }

    public void LevelOrder(){
        System.out.println("maxium Level order sum = " + LevelOrder(root));
    }

    private int LevelOrder(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int Result = root.get_data();
        while(!queue.isEmpty()){

            int count = queue.size();
            int sum = 0;
            while (count-- != 0) {
                root = queue.poll();
                System.out.println(root.get_data());
                sum += root.get_data();
                if (root.get_left() != null) {
                    queue.add(root.get_left());
                }

                if (root.get_right() != null) {
                    queue.add(root.get_right());
                }

            }

            Result = Math.max(Result, sum);
        }

        return Result;
    }

    public void LevelOrderPrinting(){
        LevelOrderPrinting(root);
    }

    private void LevelOrderPrinting(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queue1 = new LinkedList<Node>();
        Queue<Node> queue2 = new LinkedList<Node>();
        queue1.add(root);

        while(!queue1.isEmpty() || !queue2.isEmpty()){

            while (!queue1.isEmpty()){

                root = queue1.poll();
                System.out.print(root.get_data() + "  ");
                if(root.get_left() != null){
                    queue2.add(root.get_left());
                }

                if(root.get_right() != null){
                    queue2.add(root.get_right());
                }
            }
            System.out.println("");
            while (!queue2.isEmpty()){
                root = queue2.poll();
                System.out.print(root.get_data() + "  ");

                if(root.get_left() != null){
                    queue1.add(root.get_left());
                }

                if(root.get_right() != null){
                    queue1.add(root.get_right());
                }
            }

            System.out.println("");

        }
    }

    public void ReverseLevelOrder(){

        ReverseLevelOrder(root);
    }

    private void ReverseLevelOrder(Node root){
        Stack<Node> stack = new Stack<Node>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (! queue.isEmpty()){
            root = queue.poll();
            stack.push(root);
            if(root.get_left() != null){
                queue.add(root.get_left());
            }

            if(root.get_right() != null){
                queue.add(root.get_right());
            }
        }

        while (!stack.isEmpty()){
            root = stack.pop();
            System.out.print(root.get_data() + " ");
        }

    }

    public void ReverseLevelOrderPrinting(){
        int height = height(root);

        int max = Integer.MIN_VALUE;

        for(int i = height; i >= 1; i--){
            int sum = 0;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ReverseLevelOrderPrinting(root, i, arrayList);

            for(int j = 0; j < arrayList.size(); j++){
                sum += arrayList.get(j);
            }

            max = Math.max(sum, max);
            System.out.println();
        }

        System.out.println("----------maximum level order sum-----------");
        System.out.println(max);
    }

    void ReverseLevelOrderPrinting(Node root, int level, ArrayList<Integer> arrayList){

        if(root == null){
            return;
        }

        if(level == 1){
            System.out.print(root.get_data() + " ");
            arrayList.add(root.get_data());
        }
        else if(level > 1)
        {
            ReverseLevelOrderPrinting(root.get_left(), level - 1, arrayList);
            ReverseLevelOrderPrinting(root.get_right(), level - 1, arrayList);
        }
    }

    public void get_rank(int data){
       int rank = get_rank(root, data);
        System.out.println(rank);
    }

    public int  get_rank(Node root, int data) {

        if(root == null){
            return -1;
        }

        if(root.get_data() == data){
            return size(root.get_left());
        }
        if(root.get_data() > data){

            return get_rank(root.get_left(), data);
        }
        else{

            return size(root.get_left()) + 1 + get_rank(root.get_right(), data);
        }


    }

    public void isSebling(int a, int b){
        if(isSebling(root, a, b)){
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

    private boolean isSebling(Node root, int a, int b){
        if(root == null){
            return false;
        }

        return (
                (root.get_left().get_data() == a && root.get_right().get_data() == b) ||

                        ( root.get_left().get_data() == b && root.get_right().get_data() == a )||

                 isSebling(root.get_left(), a, b) ||

                 isSebling(root.get_right(), a, b)
                );
    }


    public void spiralOrder(){

        spiralOrder(root);
    }

    private void spiralOrder(Node root){
        if(root == null){
            return;
        }

        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        stack1.add(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){

            while (!stack1.isEmpty()){
                root = stack1.pop();

                System.out.print(root.get_data() + " ");

                if(root.get_left() != null){
                    stack2.add(root.get_left());
                }
                if(root.get_right() != null){
                    stack2.add(root.get_right());
                }
            }

            System.out.println();

            while (!stack2.isEmpty()){
                root = stack2.pop();
                System.out.print(root.get_data() + " ");
                if(root.get_right() != null){
                    stack1.add(root.get_right());
                }

                if(root.get_left() != null){
                    stack1.add(root.get_left());
                }
            }

            System.out.println("");
        }
    }

    public void spiralOrderUsingRecursion(){
        boolean rightToLeft = true;
        int height = height(this.root);

        for(int i = 0; i < height; i++){
            spiralOrderUsingRecursion(this.root, i, rightToLeft);
            rightToLeft = !rightToLeft;
            System.out.println();
        }
    }

    private void spiralOrderUsingRecursion(Node root, int level, boolean rightToLeft){

        if(root == null){
            return;
        }

        if(level == 0){
            System.out.print(root.get_data() + " ");
            return;
        }

        if(rightToLeft){
            spiralOrderUsingRecursion(root.get_right(), level - 1, rightToLeft);
            spiralOrderUsingRecursion(root.get_left(), level - 1, rightToLeft);
        }
        else
        {
            spiralOrderUsingRecursion(root.get_left(), level - 1, rightToLeft);
            spiralOrderUsingRecursion(root.get_right(), level - 1, rightToLeft);
        }
    }

    public void DeleteOutsideRange(int a, int b){
        root = DeleteOutsideRange(root, a, b);

        Inorder_iteratively();
    }

    private Node DeleteOutsideRange(Node root, int a, int b){

        if(root == null){
            return root;
        }



        root.set_left(DeleteOutsideRange(root.get_left(),a, b));
        root.set_right(DeleteOutsideRange(root.get_right(), a, b));
        if(root.get_data() < a || root.get_data() > b){
            // Ready to be Deleted

            if(root.get_left() == null && root.get_right() == null){
                return null;
            }

            if(root.get_left() == null){
                return root.get_right();
            }

            if(root.get_right() == null){
                return root.get_left();
            }

            else
            {
                Node temp = GetMinimum(root.get_right());

                root.set_data(temp.get_data());

                root.set_right(DeleteMinimum(root.get_right()));

            }
        }

        return root;
    }

    private Node DeleteMinimum(Node root){
        if(root.get_left() == null){
            return root.get_right();
        }

        return DeleteMinimum(root.get_right());
    }

    private Node GetMinimum(Node root){
        if(root.get_left() == null){
            return root;
        }

        return GetMinimum(root.get_left());
    }

    public boolean hasOnlyOneChild(int[] arr){
        int maxSoFar = arr[arr.length - 1];
        int minSoFar = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            if(!(arr[i] < minSoFar || arr[i] > maxSoFar)){

                return false;
            }

            maxSoFar = Math.max(arr[i], maxSoFar);
            minSoFar = Math.min(arr[i], minSoFar);
        }

        return   true;
    }

    public int[] CreateInorderArrayFromTree(){
        int[] arr = new int[size(this.root)];
        int[] index = new int[1];
        index[0] = 0;

        CreateInorderArrayFromTree(this.root, arr, index);
        return arr;
    }

    private void CreateInorderArrayFromTree(Node root, int[] arr, int[] index){

        if(root == null){
            return;
        }

        CreateInorderArrayFromTree(root.get_left(), arr, index);
        arr[index[0]] = root.get_data();
        index[0] += 1;
        CreateInorderArrayFromTree(root.get_right(), arr, index);


    }

    public int LevelOfNode(){
        Node curr = root.get_right().get_right().get_right().get_left().get_left();

       return LevelOfNode(root, curr, 1);

    }


    private int LevelOfNode(Node root,Node curr, int CurrLevel){
        if(root == null){
            return 0;
        }

        if(root == curr){
            return CurrLevel;
        }

        int level = LevelOfNode(root.get_left(), curr,CurrLevel + 1);
        if(level != 0){
            return level;
        }
        else
        {
            return LevelOfNode(root.get_right(), curr, CurrLevel + 1);
        }
    }

    public void DoNotHaveSibling(){
        DoNotHaveSibling(this.root);
    }

    private void DoNotHaveSibling(Node root){

        if(root == null){
            return;
        }


        DoNotHaveSibling(root.get_left());
        if(root.get_left() == null && root.get_right() != null){
            System.out.println(root.get_right().get_data());
        }

        if(root.get_right() == null && root.get_left() != null){
            System.out.println(root.get_left().get_data());
        }

        DoNotHaveSibling(root.get_right());

    }

    public void sumOfLeaveNodes(){

        int[] sum = new int[1];
        sum[0] = 0;

        sumOfLeaveNodes(root, sum);
        System.out.println(sum[0]);
    }

    private void  sumOfLeaveNodes(Node root, int[] sum){
        if(root == null){
            return;
        }


        if(root.get_left() == null && root.get_right() == null){
            sum[0] += root.get_data();
        }

        sumOfLeaveNodes(root.get_left(), sum);
        sumOfLeaveNodes(root.get_right(), sum);
    }

    public void DeepestOddLevelLeafNode(){

        int[] node = new int[1];
        int result = DeepestOddLevelLeafNode(root, 1, node);


        if(result != 0){
            System.out.println(result + " and Node is=" + node[0]);
        }
    }

    private int DeepestOddLevelLeafNode(Node root, int currLevel, int[] node){

        if(root == null){
            return 0;
        }

        if(root.get_left() == null && root.get_right() == null && (currLevel & 1) != 0){
            node[0] = root.get_data();
            return currLevel;
        }

        return Integer.max(DeepestOddLevelLeafNode(root.get_left(), currLevel + 1, node), DeepestOddLevelLeafNode(root.get_right(), currLevel + 1, node));

    }


    public  void FindHeight(){

        if(FindHeight(root) != -1){

            System.out.println(true);

        }
        else {
            System.out.println("false");
        }
    }

    private int FindHeight(Node root){

        if(root == null){
            return 0;
        }

        int h1 = FindHeight(root.get_left());
        int h2 = FindHeight(root.get_right());

        if(Math.abs(h1 - h2) > 1){
            return -1;
        }

        return Math.max(h1, h2) + 1;
    }

}
public class Tree
{
    public static void main(String[] args) {

        TreeMaster tree = new TreeMaster();
        tree.Insert_node(15);
        tree.Insert_node(10);
        tree.Insert_node(25);
        tree.Insert_node(12);
        tree.Insert_node(8);
        tree.Insert_node(20);
        tree.Insert_node(30);
        tree.Insert_node(35);
        tree.Insert_node(40);
        tree.Insert_node(34);

        System.out.println("----------Height-------------");
        //tree.height();
        //tree.size();
        //tree.Delete(15);
        //tree.Inorder_iteratively();
        System.out.println("-----------Paths-------------");
        //tree.Path();

        System.out.println("----------Ceil------------");
        //tree.Ceil(41);

        System.out.println("-----------------Floor----------");

        //tree.Floor(100);

        System.out.println("--------Level Order Traversal is ----------");
     //   tree.LevelOrder();

        System.out.println("-----Level Order Printing using 2 Queue");
        //tree.LevelOrderPrinting();
        System.out.println("------Reverse Level Order using OneStack and One queue--------");
       // tree.ReverseLevelOrder();

        //tree.ReverseLevelOrderPrinting();
        System.out.println("----------Rank--------------");
       // tree.get_rank(30);
        System.out.println("-------IsSebling---------");
       // tree.isSebling(30, 20);\
        System.out.println("-------SpiralOrder-----------");
        //tree.spiralOrder();

       // tree.spiralOrderUsingRecursion();


       // tree.DeleteOutsideRange(10, 20);

        System.out.println("-------------hasOnlyOneChild-----------");
        //int[] preorder = {9,8,5,7,6};

        //System.out.println(tree.hasOnlyOneChild(preorder));


//        int[] arr = tree.CreateInorderArrayFromTree();
//
//        for(int i : arr){
//            System.out.print( i + " ");
//        }


        System.out.println("----------Lvel of Given Node is ----------");
           // int  level  =  tree.LevelOfNode();

         //  System.out.println(level);


        System.out.println("--------Print all Nodes that do not have sibling-----");

       // tree.DoNotHaveSibling();


        //tree.LevelOrderPrinting();

        System.out.println("--------Sum of Leaves Node----------");
        //tree.sumOfLeaveNodes();
        System.out.println("------Depth of Deepest odd level leaf node--------");
       // tree.DeepestOddLevelLeafNode();

        System.out.println("-------Find Height in  another way------");
        tree.FindHeight();
    }


}
