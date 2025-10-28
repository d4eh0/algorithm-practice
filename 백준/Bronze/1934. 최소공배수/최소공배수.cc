#include <iostream>
#include <stack>
using namespace std;

int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return (gcd(b, a%b));
    
}

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int a, b;
        cin >> a >> b;
        int c = gcd(a,b);
        cout<<(a*b)/c<<"\n";
    }
    return 0;
}