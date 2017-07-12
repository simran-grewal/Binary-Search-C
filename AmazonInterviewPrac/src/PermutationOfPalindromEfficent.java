/**
 * Created by i_amg on 09-06-2017.
 */
public class PermutationOfPalindromEfficent
{
    public static int getCharNumber(char c){
        if(Character.isUpperCase(c)){
            c = Character.toLowerCase(c);
        }

        if('a' <= c && c <= 'z'){

            return c - 'a';
        }
        else {
            return -1;
        }
    }

    public static int toggle(int x, int bit){
        int mask = 1 << x;

        if((mask & bit) == 0){
            bit |= mask;
        } else{
            bit &= ~mask;
        }

        return bit;
    }
    public static int CheckIf(String str){

        int bit = 0;
        for(Character c : str.toCharArray()){
            int x = getCharNumber(c);

            if(x != -1){
                bit = toggle(x, bit);
            }
        }
        return bit;
    }
    public static void main(String[] args) {
        String str = "Tact Coa";
        int bit = CheckIf(str);

        if(bit == 0 || (bit & bit - 1) == 0){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
