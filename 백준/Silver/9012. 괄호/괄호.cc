#include <iostream>
#include <stack>
using namespace std;

int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n;
    stack <char> stack;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string s;
        cin >> s;
        bool check = true;
        for (int i = 0; i < s.size(); i++)
        {
            if (s[i] == '(')
                stack.push('(');
            else if (s[i] == ')')
            {
                if (!stack.empty())
                    stack.pop();
                else if(stack.empty())
                {
                    check = false;
                    break;
                }
            }
        }
        if (!stack.empty())
            check = false;
        if (check)
            cout << "YES"<<"\n";
        else
            cout << "NO"<<"\n";
        while (!stack.empty())
            stack.pop();
    }
    return 0;
}