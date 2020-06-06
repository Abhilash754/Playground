#include<iostream>
using namespace std;
int main()
{
  int y;
  std::cin>>y;
  (y%4==0)?std::cout<<y<<" is a leap year":std::cout<<y<<" is not a leap year";
  
}