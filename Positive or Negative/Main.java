#include<iostream>
using namespace std;
int main()
{
  int x;
  std::cin>>x;
  std::cout<<x;
  if(x<0)
  {
    std::cout<<" is a negative number.";
  }
  else
  {
    std::cout<<" is a positive number.";
  }
}