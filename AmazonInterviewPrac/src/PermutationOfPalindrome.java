import java.text.ParsePosition;

/**
 * Created by i_amg on 09-06-2017.
 */

public class PermutationOfPalindrome
{

    public static int getNumber(char c){
        if(Character.isUpperCase(c)){
            c = Character.toLowerCase(c);
        }

        if('a' <= c && c <= 'z'){
            return c - 'a';
        }
        else{
            return -1;
        }
    }
    public static int[] frequencyTable(String str){
        int[] table = new int[26];

        for(char c : str.toCharArray()){

            int x = getNumber(c);
            if(x != -1){
                table[x]++;
            }
        }

        return table;
    }
    public static void main(String[] args) {

        String str = "Tact Coa";
        int[] table = frequencyTable(str);
        boolean odd = false;
        for(int count : table){

            if(count % 2 == 1){

                if(odd){
                    System.out.println("false");
                    return;
                } else{
                    odd = true;
                }
            }
        }

        System.out.println("True");
    }
}
