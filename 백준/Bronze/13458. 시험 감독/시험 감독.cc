#include <iostream>
#include <vector>
using namespace std;

int main(){
    int n, b, c;
    long long count = 0;
    vector <int> a;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int temp;
        cin >> temp;
        a.push_back(temp);
    }
    count += n;
    cin >> b >> c;
    for (int i = 0; i < n; i++)
    {
        a[i] -= b;
        if (a[i] <= 0)
            continue;
        if (a[i] % c == 0)
            count += a[i] / c;
        else
            count += (a[i] / c + 1);
        
    }
    cout<<count;
}