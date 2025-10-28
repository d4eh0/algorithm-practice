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
    int a, b;
    cin >> a >> b;
    int c, d;
    cin >> c >> d; 
    int deno = b * d;
    int mole = a * d + b * c;
    int igcd;
    if (deno > mole)
        igcd = gcd(deno, mole);
    else
        igcd = gcd(mole, deno);
    cout << mole/igcd << " " << deno/igcd;
    return 0;
}