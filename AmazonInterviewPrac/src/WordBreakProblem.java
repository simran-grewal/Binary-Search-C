import java.util.*;
import java.util.List;

/**
 * Created by i_amg on 07-04-2017.
 */
class BreakWord{
    String[] str = {"arrays", "dynamic", "heaps", "IDeserve", "learn", "learning", "linked", "list", "platform", "programming", "stacks", "trees"};
    Set<String> dictionary = new HashSet<String>(Arrays.asList(str));

    public boolean hasValidWords(String words){

        if(words == null || words.length() == 0){
            return true;
        }

        boolean[] validWord = new boolean[words.length()];
        for(int i = 0; i < words.length(); i++){

            if(dictionary.contains(words.substring(0, i + 1))){
                validWord[i] = true;
            }

            if(validWord[i] && i == words.length() -1){
                return true;
            }

            if(validWord[i]){

                for(int j = i + 1; j < words.length(); j++){

                    if(dictionary.contains(words.substring(i + 1, j + 1))){
                        validWord[j] = true;
                    }

                    if(validWord[j] && j == words.length() - 1){
                        return true;
                    }
                }
            }
        }

        return false;

    }
}
public class WordBreakProblem
{
    public static void main(String[] args) {

        BreakWord obj = new BreakWord();
        boolean is = obj.hasValidWords("IDeservelearningplatform");
        System.out.println(is);


    }

}
