/**
 * Created by i_amg on 08-06-2017.
 */
// To check the given string has unique character or not
class uniqueString{

    public void checkUnique(String str){
        boolean[] count = new boolean[128];

        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);

            if(count[val]){
                System.out.println("False");
                return;
            } else{
                count[val] = true;
            }
        }

        System.out.println("True");
    }

    public void checkUniqueWithoutUsingExtraSpace(String str){
        // For this solution to work our alphabet must be in lower case
        if(str == null){
            System.out.print("Yes");
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++){

            int val = str.charAt(i) - 'a';
            if((count & 1 << val) > 0){
                System.out.println("False");
                return;
            }
            count |= (1 << val);
        }

        System.out.println("True");
    }

}
public class IsUnique
{
    public static void main(String[] args) {
        String str = "manjit";

        uniqueString obj = new uniqueString();
        obj.checkUnique(str);

        obj.checkUniqueWithoutUsingExtraSpace(str);

    }
}
