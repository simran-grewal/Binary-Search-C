package Trie;

/**
 * Created by i_amg on 19-05-2017.
 */
class TrieNode{
    Integer value;
    TrieNode[] node = new TrieNode[26];
}

class Trie
{
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    void Insert(String w, Integer value){
        TrieNode curr = root;
        if(w == null || value == null || w.length() == 0){
            System.out.println("Cannot be inserteed");
            return;
        }

        for(int i = 0; i < w.length(); i++){
            int index = w.charAt(i) - 'a';
            if(curr.node[index] == null){
                curr.node[index] = new TrieNode();
            }
            curr = curr.node[index];
        }

        curr.value = value;
    }

    public int Search(String w){
        TrieNode curr = root;
        if(w == null || w.length() == 0){
            return -1;
        }

        for(int i = 0; i < w.length() && curr != null; i++){
            int index = w.charAt(i) - 'a';
            curr = curr.node[index];
        }

        if(curr != null){

            if(curr.value != null){
                return curr.value;
            } else{
                System.out.println("Dosnot Exist");
                return -1;
            }

        } else{
            System.out.printf("Value DosNot exist");
            return -1;
        }

    }

    public int countWords(){

        int[] noOf = new int[1];
        countWords(root, noOf);
        return noOf[0];
    }

    public void countWords(TrieNode curr,int[] noOf){

        if(curr == null){
            return;
        }

        if(curr.value != null){
            noOf[0] += 1;
        }
        for(int i = 0; i < 26; i++){

            countWords(curr.node[i], noOf);
        }
    }

    public boolean hasNoChildren(TrieNode curr){

        for(int i = 0; i < curr.node.length; i++){
            if(curr.node[i] != null){
                return false;
            }
        }
        return true;
    }
    public boolean DeleteHelper(String w, TrieNode curr, int length, int level){
        boolean selfDelete = false;
        if(curr == null){
            System.out.println("Sorry the Given Key is not existing");
            return selfDelete;
        }

        if(length == level){
            if(hasNoChildren(curr)){
                curr = null;
                selfDelete = true;
            } else {
                curr.value = null;
                selfDelete = false;
            }
        } else {

                TrieNode childNode = curr.node[w.charAt(level) - 'a'];
                boolean childDeleted = DeleteHelper(w, childNode, length, level + 1);
                if(childDeleted){
                    curr.node[w.charAt(length) - 'a'] = null;

                    if(curr.value != null){

                        selfDelete = false;
                    }

                    else if(!hasNoChildren(curr)){
                        selfDelete = false;
                    } else {

                        selfDelete = true;
                        curr = null;
                    }
                } else {

                    selfDelete = false;
                }
        }
        return selfDelete;
    }
    public void Delete(String w){
        if(w == null || w.length() == 0){
            return;
        }

        DeleteHelper(w, root, w.length(), 0);
    }

}

public class TrieDataStructures
{
    public static void main(String[] args)
    {
        Trie trie = new Trie();
        trie.Insert("simran", 10);
        trie.Insert("harman", 20);
        trie.Insert("manjit", 60);
        trie.Insert("abcd", 99);

        int value = trie.Search("harman");
        System.out.println(value);

        int count = trie.countWords();
        System.out.println(count);
        trie.Delete("simran");
    }
}
