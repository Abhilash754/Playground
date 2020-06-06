#include<iostream>
using namespace std;
int main()
{
  int p,d;
  float m;
  std::cin>>m>>p>>d;
  int res=m*p;
  if(res>=d)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
}