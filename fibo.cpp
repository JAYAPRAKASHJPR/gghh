
#include <iostream>
using namespace std;

int main() {
    int n,a=-1,b=1,d;
    cout<<"No of elements in the series: ";
    cin>>n;
    for(int i = 0;i<=n;i++){        
        d = a + b;
        a = b;
        b = d;
        if(d == 0)
            continue;        
        cout <<c<<" ";
    }
    return 0;
}
