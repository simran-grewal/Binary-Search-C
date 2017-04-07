import java.util.ArrayList;

/**
 * Created by i_amg on 03-04-2017.
 */

class TrieNode{


    Integer value;
    TrieNode[] node = new TrieNode[26];

}
class TrieBest{

    TrieNode root;

    public  TrieBest(){
        root = new TrieNode();
    }


    void Insert(String w, Integer value){
        if(w == null){
            return;
        }
        w = w.toLowerCase();

        TrieNode curr = root;

        for(int i = 0; i < w.length(); i++){
            int index = w.charAt(i) -'a';
            if(index < 0 || index >= 26){
                System.out.println("Invalid key");
                return;
            }
            if(curr.node[index] == null){
                curr.node[index] = new TrieNode();
            }

            curr = curr.node[index];
        }


         curr.value = value;

    }

    int search(String w){
        if(w == null){
            return -1;
        }

        TrieNode curr = root;

        for(int i = 0; i < w.length() && curr != null; i++){
            int index = w.charAt(i) - 'a';
            if(index < 0 || index >= 26){
                return -1;
            }
            curr = curr.node[index];
        }

        if(curr != null){

            if(curr.value != null) {
                return curr.value;
            }
            return -1;
        }

        else
        {
            return -1;
        }
    }

}
public class Trie
{
    public static void main(String[] args) {

        TrieBest trie = new TrieBest();
        trie.Insert("simranM", 16);
        int value = trie.search("simranll");
        System.out.println(value);


    }
}
