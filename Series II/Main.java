#include<iostream>
using namespace std;
int main()
{
  int a,b,n,i,c;
  std::cin>>n;
  a=121;
  b=11;
  if(n==1)
  {
    std::cout<<"121"<<" ";
  }
  else
  {
    std::cout<<"121"<<" ";
    for(i=2;i<=n;i++)
    {
      b=b+4;
      c=b*b;
      std::cout<<c<<" ";
    }
  }
}