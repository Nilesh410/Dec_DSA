import java.util.*;
public class Leetcode20_Pbm
{
    public static void main(String args[])
    {
        String s="{[(]]}";
        boolean result=isValidString(s);
        if(result)
            System.out.println("It is a valid string");
        else
            System.out.println("It is not a valid string");
    }
    public static boolean isValidString(String s)
    {
        Stack <Character> st=new Stack<Character>();
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='{'||c=='('||c=='[')
                st.push(c);
            else
            {
                if(st.empty())
                    return false;
                else
                {
                    char ch=st.peek();
                    if((ch=='{'&&c=='}')||(ch=='['&&c==']')||(ch=='('&&c==')')){
                        st.pop();
                    }
                    else
                        return false;
                }
            }
        }
        return st.empty();
    }
}