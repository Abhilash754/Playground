#include<iostream>
using namespace std;
int calculatePower(int,int);
int main()
{
  int a,powerRaised,result;
  std::cout<<"Enter the value of a "<<"\n";
  std::cin>>a;
  std::cout<<"Enter the value of n "<<"\n";
  std::cin>>powerRaised;
  result=calculatePower(a,powerRaised);
  std::cout<<"The value of " <<a<< " power " <<powerRaised << " is " <<result;
  return 0;
}
int calculatePower(int a, int powerRaised)
{
  if(powerRaised!=0)
    return(a*calculatePower(a,powerRaised-1));
  else
    return 1;
}