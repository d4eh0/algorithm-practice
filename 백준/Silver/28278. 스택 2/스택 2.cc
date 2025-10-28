#include <iostream>
#include <stack>
using namespace std;


int main(void)
{
    int n;
    stack<int> s;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        ios::sync_with_stdio(false);
        cin.tie(0);
        int num, value;
        cin >> num;
        switch (num)
        {
            case 1:
                cin>>value;
                s.push(value);
                break;
            case 2:
                if (!s.empty())
                {
                    cout<<s.top()<<'\n';
                    s.pop();
                }
                else
                    cout<<-1<<'\n';
                break;
            case 3:
                cout<<s.size()<<'\n';
                break;
            case 4:
                cout<<s.empty()<<'\n';
                break;
            case 5:
                if (!s.empty())
                    cout<<s.top()<<'\n';
                else
                    cout<<-1<<'\n';
                break;
        }
    }
}