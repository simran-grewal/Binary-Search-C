import java.util.HashMap;
import java.util.Map;

/**
 * Created by i_amg on 08-04-2017.
 */
class NNode{
    int data;
    NNode parent;
    int rank;

    public NNode(int data){
        this.data = data;
        this.rank = 0;
        this.parent = this;
    }
}
class MakeUnionFind{

    Map<Integer, NNode> map = new HashMap<Integer, NNode>();

    public void makeSet(int data){
        NNode node = new NNode(data);
        map.put(data, node);
    }

  public boolean union(int data1, int data2){

      NNode n1 = map.get(data1);
      NNode n2 = map.get(data2);

      NNode parent1 = findSet(n1);
      NNode parent2 = findSet(n2);

      if(parent1 == parent2){
          return false;
      }

      if(parent1.rank >= parent2.rank){

          if(parent1.rank == parent2.rank){
              parent1.rank += 1;
          }

          parent2.parent = parent1;
      }else {
          parent1.parent = parent2;
      }

      return true;
  }

    public int findSet(int data){

        return findSet(map.get(data)).data;
    }
    private NNode findSet(NNode node){

        if(node.parent == node){
            return node.parent;
        }

        node.parent = findSet(node.parent);
        return node.parent;
    }
}
public class DisjointSet
{
    public static void main(String[] args)
    {
        MakeUnionFind obj = new MakeUnionFind();
        obj.makeSet(1);
        obj.makeSet(2);
        obj.makeSet(3);
        obj.makeSet(4);
        obj.makeSet(5);
        obj.makeSet(6);
        obj.makeSet(7);

        obj.union(1, 2);
        obj.union(2, 3);
        obj.union(4, 5);
        obj.union(6, 7);
        obj.union(5, 6);
        obj.union(3, 7);
        System.out.println(obj.findSet(7));
        System.out.println(obj.findSet(6));
        System.out.println(obj.findSet(5));
        System.out.println(obj.findSet(4));
        System.out.println(obj.findSet(3));
        System.out.println(obj.findSet(2));
        System.out.println(obj.findSet(1));
    }
}
