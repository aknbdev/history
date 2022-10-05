#include <iostream>
using namespace std;
int main()
{
    // |- For structure -|

    // for ( boshlanish; shart; inc/dec ){
    //     task
    // }

    // |- Cource work 1 -|

    // int S=1;
    // for(int b=2;b<=10;b++){
    //     S*=b;
    //     cout<<b<<"!="<<S<<endl;
    // }

    // |- Cource work 2 -|

    // int k=2, S;
    // for(int a=1;a<=10;a++){
    //     S=k*a;
    //     cout<<k<<"*"<<a<<"="<<S<<endl;
    // }

    // |- Cource work 3 -|

    // for(int i=2; i<=9; i++){
    //     for(int a=1;a<=10;a++){
    //         cout<<i<<"*"<<a<<"="<<i*a<<endl;
    //     }
    //     cout<<endl;
    // }

    // |- Cource work 4 -|

    // int S = 1;
    // for (int b = 2; b <= 10; b++)
    // {
    //     S *= b;
    //     cout << b << "!=";
    //     for (int k = 1; k <= b; k++)
    //     {
    //         if (k < b)
    //         {
    //             cout << k << "*";
    //         }
    //         else
    //         {
    //             cout << k << "=" << S;
    //         }
    //     }
    //     cout << endl;
    // }

    // | -Cource work 5 - |
    // for (int u; u <= 10; u++)
    // {
    //     for (int j = 1; j <= u; j++)
    //     {
    //         cout << "* ";
    //     }
    //     cout << endl;
    // }

    // |- Homework -|

    // |- Ch6 P6 -|

    // for (int a = 4; a >= 0; a--)
    // {
    //     for (int b = 1; b <= a; b++)
    //     {
    //         cout << " ";
    //     }
    //     for (int j = 4; j >= a; j--)
    //     {
    //         cout << "*";
    //     }
    //     for (int k = 3; k >= a; k--)
    //     {
    //         cout << "*";
    //     }
    //     cout << "\n";
    // }
    // for (int c = 1; c <= 4; c++)
    // {
    //     for (int d = 1; d <= c; d++)
    //     {
    //         cout << " ";
    //     }
    //     for (int m = 4; m >= c; m--)
    //     {
    //         cout << "*";
    //     }
    //     for (int n = 3; n >= c; n--)
    //     {
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

    // |- 2 methud -|

    //for (int i = 1; i <= 5; i++)
    // {
    //     for (int a = 1; a <= 5 - i; a++)
    //     {
    //         cout << " ";
    //     }
    //     for (int b = 1; b <= 9 - 2 * (5 - i); b++)
    //     {
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

    // for (int c = 4; c >= 1; c--)
    // {
    //     for (int d = 1; d <= 5 - c; d++)
    //     {
    //         cout << " ";
    //     }
    //     for (int e = 1; e <= 9 - 2 * (5 - c); e++)
    //     {
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

    // |- Ch P7 -|

    // for (int i = 1; i <= 10; i++)
    // {
    //     for (int a = i; a <= 10; a++)
    //     {
    //         if (a == 10)
    //         {
    //             cout << 0 << " ";
    //         }
    //         else
    //         {
    //             cout << a << " ";
    //         }
    //     }
    //     for (int s = i; s <= i; s++)
    //     {
    //         for (int b = 2; b <= s; b++)
    //         {
    //             cout << b - 1 << " ";
    //         }
    //     }
    //     cout << endl;
    // }

    // |- 2 Methud -|
    // for (int i = 1; i <= 10; i++)
    // {
    //     for (int a = i; a <= 9; a++)
    //     {
    //         cout << a << " ";
    //     }
    //     for (int b = 0; b < i; b++)
    //     {
    //         cout << b << " ";
    //     }
    //     cout << endl;
    // }

    // |- Ch6 P8 -|

    // int N, S = 0;
    // cout << "Enter the Number :";
    // cin >> N;
    // for (int i = 1; i <= N; i++)
    // {
    //     int K = i;
    //     while (K)
    //     {
    //         if (K % 10 == 3)
    //         {
    //             S++;
    //         }
    //         K = K / 10;
    //     }
    // }
    // cout << S;

    // |- Ch6 P9 -|

    // int S = 1, input;
    // cout << "Enter the N:";
    // cin >> input;
    // for (int i = 1; i <= input; i++)
    // {
    //     for (int a = 1; a <= input - i; a++)
    //     {
    //         cout << " ";
    //     }
    //     for (int b = 1; b <= i; b++)
    //     {
    //         cout << S << " ";
    //         S++;
    //         if (S == 9)
    //         {
    //             S = 0;
    //         }
    //     }
    //     cout << endl;
    // }

    // |- Ch6 P11 -|

    // int u = 0;
    // for (int a = 1; a <= 6; a++)
    // {
    //     for (int b = 1; b <= 6; b++)
    //     {
    //         for (int c = 1; c <= 6; c++)
    //         {
    //             if ((a + b + c) == 10)
    //             {
    //                 cout << a << b << c << endl;
    //                 u++;
    //             }
    //         }
    //     }
    // }
    // cout << "\n\n"
    //      << u;

    // |- Ch6 P12 -|

    // int input, S;
    // cout << "Enter the Number :";
    // cin >> input;
    // for (int i = 1; i <= input; i++)
    // {
    //     S += i;
    // }
    // cout << "Sum: " << S;

    return 0;
}