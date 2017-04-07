import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by i_amg on 27-03-2017.
 */
public class LongestSequenceOfConsecutiveNumber
{
    
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        Integer[] arr = {5, 5, 3, 1};
        hashSet.addAll(Arrays.asList(arr));

        int max = 0;
        int length = 0;
        for(int i : hashSet)
        {
            length = 0;
            if(hashSet.contains(i - 1))
            {
                continue;
            }

            while (hashSet.contains(i++)){
                length++;
            }

            max = Math.max(max, length);
        }


        System.out.println(max);

        char[] str = {'s', 'i', 'm'};
        System.out.println(str[1]);
    }
}
