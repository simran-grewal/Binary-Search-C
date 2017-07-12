package String;
import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;
import java.util.regex.*;

/**
 * Created by i_amg on 05-07-2017.
 */
public class JavaString
{

    public static void find(String str, int n, int zero, int one) {

        if(zero > one) {
            return;
        }

        if(n == 0) {
            System.out.println(str);
            return;
        }

        find(str + "1", n - 1, zero, one + 1);

        find(str + "0", n - 1, zero + 1, one);

    }
    public static void main(String[] args) {

        String str = "";

        find(str, 5, 0, 0);

    }
}
