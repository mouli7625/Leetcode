class Solution {
public:
    int sumBase(int n, int k) {
         int Num = 0, placeValue = 1, sum=0, p=0;
   while (n != 0) 
   {
      Num += (n % k) * placeValue;
     n /= k;
      placeValue *= 10;
    }
    while(Num!=0)
    {
        p=Num%10;
        sum=sum+p;
        Num=Num/10;
    }
        return sum;
    }
};