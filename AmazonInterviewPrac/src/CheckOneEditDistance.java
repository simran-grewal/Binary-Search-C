/**
 * Created by i_amg on 09-06-2017.
 */
class EditDistance{


    public boolean Replacement(String s1, String s2){
        boolean foundDifference = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){

                if(foundDifference){
                    return false;
                }

                foundDifference = true;
            }
        }

        if(foundDifference)
        return true;

        return false;
    }

    public boolean EditString(String s1, String s2){
        int i = 0, j = 0;

        while ((i < s1.length()) && (j < s2.length())){

            if(s1.charAt(i) != s2.charAt(j)){

                if(i != j){
                    return false;

                }

                j++;
            } else{
                i++;
                j++;
            }
        }


        return true;
    }
    public boolean checkEditDistance(String s1, String s2){

        if(s1.length() == s2.length()){
            return Replacement(s1,s2);
        }else if(s1.length() + 1 == s2.length()){
            return EditString(s1, s2);
        } else if(s1.length() - 1 == s2.length()){
            return EditString(s2, s1);
        }

        return false;
    }
}
public class CheckOneEditDistance
{
    public static void main(String[] args) {
        EditDistance  editDistance = new EditDistance();
        System.out.println(editDistance.checkEditDistance("pae", "kpae"));
    }
}
