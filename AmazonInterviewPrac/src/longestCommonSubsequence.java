/**
 * Created by i_amg on 08-04-2017.
 */
public class longestCommonSubsequence
{
    // this is recursive approct , may bad approch; && Complexity would be exponential time
//    public static int lca(String X, String Y, int m, int n){
//
//        if(m == 0 || n == 0){
//            return 0;
//        }
//
//        if(X.charAt(m - 1) == Y.charAt(n - 1)){
//            return 1 + lca(X, Y, m - 1, n - 1);
//        }
//
//        else
//        {
//            return Math.max(lca(X, Y, m - 1, n), lca(X, Y, m, n - 1));
//        }
//    }
    public static int lca(String X, String Y, int m, int n){

        if(m == X.length() || n == Y.length()){
            return 0;
        }

        if(X.charAt(m) == Y.charAt(n)){
            return 1 + lca(X, Y, m + 1, n + 1);
        }

        else
        {
            return Math.max(lca(X, Y, m + 1, n), lca(X, Y, m, n + 1));
        }
    }
    public static void main(String[] args)
    {
//        String X = "AGGTAB";
//        String Y = "GXTXAYB";

            String X = "simran";
            String Y = "sarman";
        int lca = lca(X, Y, 0, 0 );
        System.out.println(lca);
    }
}
