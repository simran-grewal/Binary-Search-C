//Fibonacci Series using Recursion
#include<iostream>
#include<stdlib.h>
#include<stdio.h>
using namespace std;

int fib(int a, int b) {
		if(b <= 0) return a;
		else if(a <= 0) return b;
		else if(a >= b) {
			return( a + fib(a - 1, b - 2));
		}
		return (b + fib(a - 2, b - 3));
	}

int main ()
{
    int a,b;
 cin >>a>>b;
 cout<<fib(a,b);

  return 0;
}




