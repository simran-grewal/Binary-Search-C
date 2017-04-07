import java.util.Arrays;

/**
 * Created by i_amg on 05-04-2017.
 */
class Space{

    public String  Remove(String str){
        char[] s = str.toCharArray();
        int space = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] == ' '){
                space++;
            }else{

                s[i - space] = s[i];
            }
        }

        s = Arrays.copyOf(s,s.length - space);

        return new String(s);
    }

}
public class RemoveSpaces
{
    public static void main(String[] args)
    {
        Space obj = new Space();
        String res = obj.Remove("   hii  my name  is simranjit  singh  ");
        System.out.println(res);
    }
}
