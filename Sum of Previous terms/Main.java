#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
  cin>>n;
  if(n>=30)
    cout<<"Invalid Input";
  else
  {
  int a[50];
  a[0]=1;
  a[1]=2;
  for(int i=2;i<=n;i++)
    a[i]=a[i-1]+a[i-2];
    
    
    cout<<a[n-1];
  }
  //cout<<a[n];
    return 0;
}