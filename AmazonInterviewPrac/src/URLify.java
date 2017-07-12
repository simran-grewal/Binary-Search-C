/**
 * Created by i_amg on 08-06-2017.
 */
class URL {

    public void replaceSpaces(char[] str, int trueLength){

        int spaces = 0;
        for(int i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaces++;
            }
        }

        int newLength = trueLength + spaces*2;

        str[newLength] = '\0';

        for(int i = trueLength - 1; i >= 0; i--){
            if(str[i] == ' '){
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength -= 3;
            } else{
                str[newLength - 1] = str[i];
                newLength--;
            }
        }
    }
}
public class URLify
{
    public static void main(String[] args) {
        String s = "Mr john Smith     ";
        char[] str = s.toCharArray();
        URL obj = new URL();
        obj.replaceSpaces(str, 13);
//        System.out.print(str.length);
        System.out.println(str);
    }
}
