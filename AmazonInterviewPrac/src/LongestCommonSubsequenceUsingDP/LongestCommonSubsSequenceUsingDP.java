package LongestCommonSubsequenceUsingDP;

/**
 * Created by i_amg on 02-05-2017.
 */
class FindSolution{

    public int getLength(char[] str1, char[] str2){

        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                        temp[i][j] = temp[i - 1][j - 1] + 1;
                    }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }

        return max;
    }
}
public class LongestCommonSubsSequenceUsingDP
{
    public static void main(String[] args)
    {
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";

        FindSolution obj = new FindSolution();
        int res = obj.getLength(str1.toCharArray(), str2.toCharArray());
        System.out.println(res);
    }
}
