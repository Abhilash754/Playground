#include<iostream>
using namespace std;
int main()
{
  int start,end,sum;
  std::cin>>start>>end;
  for(int i=start;i<=end;i++)
  {
    sum=0;
    for(int j=1;j<=i/2;j++)
    {
      if(i%j==0)
        sum=sum+j;
    }
    if(sum==i)
      std::cout<<sum<<" ";
  }
  return 0;
}