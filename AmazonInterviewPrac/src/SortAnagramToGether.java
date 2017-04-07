import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by i_amg on 05-04-2017.
 */
class Anag implements Comparator<String>{

    public String sortChars(String s1){

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);

        return new String(ch);
    }

    public int compare(String s1,String s2){

        return sortChars(s1).compareTo(sortChars(s2));
    }
}
public class SortAnagramToGether
{
    public static void main(String[] args) {
        String[] str =  {"abcd","abc","abce", "acd","abdc"};

        Arrays.sort(str, new Anag());

        for(String i : str) {
            System.out.println(i);
        }
    }
}
