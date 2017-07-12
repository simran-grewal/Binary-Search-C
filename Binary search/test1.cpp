#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    int a=0;
    int count=0;
    cin>>a;
    int arr[a];
    for (int i=0;i<a;i++){
        cin>>arr[i];
    }
    for (int i=1;i<a;i++){
            int flag=0;
        for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0){
                cout<< arr[j]<<"this is multiple of "<<arr[i]<<endl;
            }
            if(arr[i]%arr[j]==0&&flag==0){
                count=count+1;
    flag=1;
            }
            else continue;
        }
    }
    cout<<count;
}

// 1
