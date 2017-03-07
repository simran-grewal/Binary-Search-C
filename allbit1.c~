#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
	char str[6][3];
	int i;
	for( i = 0; i < 6; i++)
	{
		scanf("%s", str[i]);
	}
	
	int *count;
	count = (int *)calloc(26 , sizeof(int));
	
	for(i = 0; i < 6; i++)
	{
		char s[3];
		strcpy(s, str[i]);
		int j = 0;
		while(s[j] != '\0')
		{
			count[s[i] - 'a']++;
			j++;
		}
	}
	
	
	for( i = 0; i < 26; i++)
	{
		if(count[i] >=1)
		{
           
			printf("%d\n", i);
		}
	}
}


