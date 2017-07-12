/**
 * Created by i_amg on 08-06-2017.
 */
public class stringBuilder
{
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] name  = {"simran","harman", "manjit", "baljinder"};

        for(String  goodName: name){
            stringBuilder.append(goodName);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);
    }
}
