#include <stdio.h>
#include <sys/time.h>
void swap(long long int *arr, int a, int b);
void qsort1(long long int *arr, int l, long long int r);
int main()
{
  long long int arr[32000];
  long long  int i;

    for(i = 0; i < 32000; i++)
    {
        arr[i] = i;
    }    
    
    long long int n = sizeof(arr)/sizeof(arr[0]);

    struct timeval t;
    gettimeofday(&t, NULL);
    double t1, t2, t3, t4;
    t1 = t.tv_sec * 1000000 + t.tv_usec;
    qsort1(arr, 0, n - 1);
    gettimeofday(&t, NULL);
    t2 = t.tv_sec * 1000000 + t.tv_usec;
    printf("%g\n", t2 - t1);
    
   // for(i = 0; i < n; i++)
   //     printf("%d ", arr[i]);
}

void qsort1(long long int *arr, int l, long long int r)
{
    if(l >= r ) return;

    long long int last = l;
  long long  int i;

    for(i = l + 1; i <= r; i++)
    {
        if(arr[i] < arr[l])
            swap(arr, i, ++last);
    }


    swap(arr, l, last);

    qsort1(arr, l, last - 1);
    
    qsort1(arr, last + 1, r);

  
}

void swap(long long int *arr, int a, int b)
{
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;    
}
