import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by i_amg on 29-04-2017.
 */
public class WordBreak
{

    public static void main(String[] args) {


        String[] strings = {"simran", "harman", "jared Hanson", "rahn Dhal"};

        Set<String> set = new HashSet<String>(Arrays.asList(strings));

        System.out.println(set);

        System.out.println(set.contains("simran"));
    }

}
