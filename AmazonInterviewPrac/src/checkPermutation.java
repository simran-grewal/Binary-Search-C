/**
 * Created by i_amg on 08-06-2017.
 */
class IsPermu{

    public boolean isPermutation(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[128];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
        }

        for(int i = 0; i < str1.length(); i++){

            count[str2.charAt(i)]--;

            if(count[str2.charAt(i)] < 0){
                return false;
            }
        }

        return true;
    }
}
public class checkPermutation
{
    public static void main(String[] args)
    {
        IsPermu obj = new IsPermu();
        boolean Ispermu = obj.isPermutation("simran", "mrajsi");
        System.out.println(Ispermu);

        char[] arr = {'a', 'b', 'c', 'd', 'e'};


    }
}
