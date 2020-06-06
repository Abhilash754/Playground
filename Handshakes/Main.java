#include<iostream>
using namespace std;
int maxHandshake(int n)
{
  return(n*(n-1))/2;
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<maxHandshake(n);
  return 0;
}
       
 