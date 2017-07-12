/**
 * Created by i_amg on 19-05-2017.
 */
class FindNth{

    public int Find(int n, int[] memo){
        if(n == 0 || n == 1){
            return n;
        }

        if(memo[n] == 0){

            memo[n] = Find(n - 1, memo) + Find(n - 2, memo);
        }

        return memo[n];
    }

}
public class Fibbo
{
    public static void main(String[] args) {
        int n = 7;

        FindNth obj = new FindNth();
        System.out.println(obj.Find(n, new int[n + 1]));
    }
}
