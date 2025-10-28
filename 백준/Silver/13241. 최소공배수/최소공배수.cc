#include <iostream>
#include <stack>
using namespace std;

long long gcd(long long a, long long b)
{
    if (b == 0)
        return a;
    return (gcd(b, a%b));
    
}

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    long long a, b;
    cin >> a >> b;
    long long c = gcd(a,b);
    cout<<(a*b)/c<<'\n';
    return 0;
}