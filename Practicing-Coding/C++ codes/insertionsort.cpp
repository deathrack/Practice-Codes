#include<iostream>
using namespace std;
void insertionsort(int a[],int n){
    int k,j;
    for (int i = 1; i < n; i++)
    {
       k = a[i];
       j=i-1;
       while (j >= 0 && a[j]>k)
       {
          a[j+1]=a[j];
          j--;
       }
       a[j+1]=k;
    }
    for (int i = 0; i < n; i++)
    {
        cout<<a[i]<<" ";
    }
    
    
    }
int main(){
  int a[10] = {9,5,752,56465,46521,8118,163,1,5321,4};
  int n=10;
  insertionsort(a,n);
}