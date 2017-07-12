/**
 * Created by i_amg on 04-05-2017.
 */
public class RepeatDuplicacy
{
    public static void main(String[] args) {

        String  str = "geeksforgeeks";
        char[] arr = str.toCharArray();

        int[] hash = new int[26];
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(hash[arr[i] - 'a'] == 0){
                hash[arr[i] - 'a'] = 1;
                s = s + arr[i];
            }
        }


        System.out.println(s);
    }
}

