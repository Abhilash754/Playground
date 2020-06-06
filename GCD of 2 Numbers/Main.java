#include<iostream>
using namespace std;
int func(int a,int b)
{
  int small;
  int gcd;
  if(a<b)
  {
    small=a;
  }
  else
  {
    small=b;
  }
  while(small>=1)
  {
    if((a%small==0)&&(b%small==0))
    {
      gcd=small;
      break;
    }
    small--;
  }
}
int main()
{
  int a;
  int b;
  int g;
  std::cin>>a>>b;
  g=func(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<g;
}
