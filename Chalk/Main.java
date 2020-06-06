#include<iostream>
using namespace std;
int main()
{
  int number=0,days,cycle=50;
  float sqrt=1;
  std::cin>>number;
  while(cycle>0)
  {
    sqrt=(sqrt+(number/sqrt))/2;
    --cycle;
  }
  days=number+(int(sqrt)+1);
  std::cout<<int(days);
  return 0;
}