#include <iostream>
#include <string.h>
#include <stdlib.h>
using namespace std;
int main()
{
  int a[50],m=2,x=3;
  a[0]=1;
  a[1]=1;
  int n;
  cin>>n;
  if(n%2==0)
  {
  for(int i=0;i<(n/2);i++)
  {a[m]=a[m-2]*2;
   m+=2;
  }
  for(int i=0;i<(n/2);i++)
  {a[x]=a[x-2]*3;
   x+=2;
  }
  }
  else
  {
     for(int i=0;i<(n/2)+1;i++)
  {a[m]=a[m-2]*2;
   m+=2;
  }
  for(int i=0;i<(n/2);i++)
  {a[x]=a[x-2]*2;
   x+=2;
  }
  }
  
  if(n%2==0)
  cout<<a[n-1];
  else
    cout<<a[n-1];
}
  