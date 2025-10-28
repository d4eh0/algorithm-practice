#include <iostream>
#include <stack>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    stack <int> s;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int value;
        cin>>value;
        if (value != 0)
            s.push(value);
        else
            s.pop();
    }
    int sum = 0;
    while (!s.empty())
    {
        sum += s.top();
        s.pop();
    }
    cout<<sum;
    return 0;
}