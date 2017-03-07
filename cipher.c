# include<stdio.h>
# include<string.h>
# include<stdlib.h>
int main()
{

 char *str="1110100110";
  int n=7,k=4,size=n+k-1;
  int arr[size],num=0;

  for(int i=0;i<size;i++)                               //decoding   num=arr[0]^arr[1]^arr[2] than taking xor with str[j](j=0)
                                                             //  than incrementing;
  {
    arr[i]=0;
  }
  int j=0,d=k-1;
  while(str[j]!='\0')
    {
      int y=j+3,num=0;
      for(int i=j;i<y;i++)
	{
	  num=num^arr[i];
	}
     
      int conv=(int)(str[j]-'0');        // converting character into int ('1' into 1)
      num=num^conv;
      arr[d]=num;d++;
      j++;
    }
  for(int i=3;i<size;i++)
    printf("%d",arr[i]);
}
  
