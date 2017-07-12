/**
 * Created by i_amg on 30-05-2017.
 */
class LPSArray{

    public void lps(String str, int[] lps){
        int j = 0;
        int i = 1;
        lps[0] = 0;

        while (i < str.length()){
            if(str.charAt(j) == str.charAt(i)){
                lps[i] = j + 1;
                i++;
                j++;
            }else{

                if(j != 0){
                    j = lps[j  -1];
                } else {

                    lps[i] = 0;
                    i++;
                }
            }
        }

    }
}
public class LPS
{
    public static void main(String[] args) {
        String str = "ananab#banana";
        int[] lps = new int[str.length()];
        LPSArray lpsArray = new LPSArray();
        lpsArray.lps(str, lps);

        for(int i : lps){
            System.out.print(i);
        }
    }
}
