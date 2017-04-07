import java.util.Stack;

/**
 * Created by i_amg on 05-04-2017.
 */
class PostFix{

    public int Evaluate(String[] str){

        if(str.length == 1){
            return Integer.parseInt(str[0]);
        }

        Stack<Integer> stack = new Stack<Integer>();

        for(String exp : str){
            Integer value = null;
            String operator = null;

            if(exp.charAt(0) >= '0' && exp.charAt(0) <= '9' || exp.charAt(0) == '-' && exp.length() > 1){

                value = Integer.parseInt(exp);
            }
            else{
                operator = exp;
            }


            if(operator != null){

                Integer y = stack.pop();
                Integer x = stack.pop();

                char c = operator.charAt(0);

                switch(c){
                    case '+' : value = x +y;break;

                    case '-' : value = x - y; break;

                    case '/' : value = x /y;break;

                    case '*' : value = x * y;break;

                }
            }

            stack.push(value);

        }

        return stack.pop();
    }
}
public class postfixExpression
{
    public static void main(String[] args)
    {
        String[] str = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};

        PostFix obj = new PostFix();
        int res = obj.Evaluate(str);
        System.out.println(res);

    }
}
