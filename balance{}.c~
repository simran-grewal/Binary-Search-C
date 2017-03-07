#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
int stack[100];
int top = -1;
bool Matched(char close, char open)
{

   
        if(close == '}' && open == '{') return true;
        if(close == ']' && open == '[') return true;
        if(close == ')' && open == '(') return true;

        return false;
}
void push(char p)
{
    top++;
    stack[top] = p; 
    
    
}
void pop()
{
    top--;
}

bool IsEmpty()
{
    return (top == -1);
}
bool Balanced(char str[])
{
    int i = 0;
    int l = strlen(str);
    
    for(i = 0; i < l; i++)
    {
        if((str[i] == '{') || (str[i] == '[' )|| (str[i] == '('))
        {
            push(str[i]);        
           
        }

        else if(str[i] == '}' || str[i] == ']' || str[i] == ')' )
        {
            if((IsEmpty()) || !(Matched(str[i], stack[top])))
            return  false;
        
            else
            pop();
        }

    }

     return IsEmpty()? true : false;
} 
int main()
{
    char str[30];
    scanf("%s", str);
  
    if(Balanced(str))
    {
        printf("Yes");
    }

    else

    {
        printf("NO");
    }
}
