/**
 * Created by i_amg on 06-04-2017.
 */

class TriePrac{

    TrieNode root;

    public TriePrac(){
        root = new TrieNode();
    }

    public void Insert(String str, Integer value){

        TrieNode curr = root;

        if(str == null|| str.length() == 0){
            return;
        }

        for(int i = 0; i < str.length(); i++){

            int index = str.charAt(i) - 'a';

            if(curr.node[index] == null){

                curr.node[index] = new TrieNode();
            }

            curr = curr.node[index];
        }

        curr.value = value;


    }

    public int search(String str){
        if(str == null){
            return Integer.MIN_VALUE;
        }
        TrieNode curr = root;
        for(int i = 0; i < str.length() && curr != null; i++){
            int index = str.charAt(i) - 'a';


                curr = curr.node[index];

        }

        if(curr == null){
            return Integer.MIN_VALUE;
        }

        else {

            if(curr.value != null)
            return curr.value;


        }

        return Integer.MAX_VALUE;

    }
}
public class TrieAgain
{
    public static void main(String[] args) {
        TriePrac trie = new TriePrac();

        trie.Insert("simran", 16);
        trie.Insert("simu", 56);
        trie.Insert("harman", 17);

       int value =  trie.search("oi");

        System.out.println(value);
    }
}
