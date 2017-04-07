import java.util.HashMap;

/**
 * Created by i_amg on 29-03-2017.
 */


// To check if Any Anagram of string is palindrome or not

class CheckPali{

    public boolean CheckPalindrome(String str){

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            count[ch - 'a']++;
        }

        int OddAccur = 0;
        for(int cnt : count){

            if(OddAccur > 1){
                return false;
            }


            if(cnt % 2 == 1){
                OddAccur++;
            }
        }


        return true;
    }
}
public class Anagram
{

    public static void main(String[] args) {

        CheckPali obj = new CheckPali();
        boolean res = obj.CheckPalindrome("aaaadd");
        System.out.println(res);
    }
}
