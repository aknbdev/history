#include <iostream>
using namespace std;
int main()
{
    // |- courseWork1 -|
    // int user[10], even = 0, odd = 0;
    // for (int i = 0; i < 10; i++)
    // {
    //     cin >> user[i];
    //     if (user[i] % 2 == 0)
    //     {
    //         even += user[i];
    //     }
    //     else
    //     {
    //         odd += user[i];
    //     }
    // }
    // cout << "even: " << even << endl
    //      << "odd: " << odd;

    // \- courseWork2 -|
    // int array[5];
    // for (int i = 0; i < 5; i++)
    // {
    //     cin >> array[i];
    // }
    // for (int k = 4; k >= 0; k--)
    // {
    //     cout << array[k] << "  ";
    // }

    // |- courseWork3 -|
    // float a[7], min;
    // for (int i = 0; i < 7; i++)
    // {
    //     cin >> a[i];
    // }
    // min = a[0];
    // for (int k = 0; k < 7; k++)
    // {
    //     if (min > a[k])
    //     {
    //         min = a[k];
    //     }
    // }
    // cout << "Minimum: " << min;

    // |- courseWork4 -|
    // float a[7], max;
    // for (int i = 0; i < 7; i++)
    // {
    //     cin >> a[i];
    // }
    // max = a[0];
    // for (int k = 0; k < 7; k++)
    // {
    //     if (max < a[k])
    //     {
    //         max = a[k];
    //     }
    // }
    // cout << "Maximum: " << max;

    // |- courseWork5 -|
    // int a[5], max = 0;
    // for (int i = 0; i < 5; i++)
    // {
    //     cin >> a[i];
    // }
    // for (int x = 0; x < 5; x++)
    // {
    //     for (int k = 0; k < 4; k++)
    //     {
    //         if (a[k] < a[k + 1])
    //         {
    //             max = a[k + 1];
    //             a[k + 1] = a[k];
    //             a[k] = max;
    //         }
    //     }
    // }
    // for (int d = 0; d < 5; d++)
    // {
    //     cout << a[d] << "  ";
    // }

    // |- courseWork6 -|
    // int size;
    // cout<<"Enter the Array:";
    // cin>>size
    // int a[100];
    // for(){

    // }

    // |- courseWork7 -|
    // int size;
    // cout << "Enter the Array:";
    // cin >> size;
    // char array[100], min;
    // for (int i = 0; i < size; i++)
    // {
    //     cin >> array[i];
    // }
    // min = array[0];
    // for (int c = 0; c < size; c++)
    // {
    //     for (int d = 1; d < size; d++)
    //     {
    //         array[d - 1] = array[d];
    //     }
    //     array[size - 1] = min;
    //     for (int j = 0; j < size; j++)
    //     {
    //         cout << array[j] << "  ";
    //     }
    //     cout << endl;
    // }

    // |- homeWorks -|

    //|- Ch8 P3 -|
    // int array[10], U1 = 0, U2 = 0, U3 = 0;
    // for (int i = 0; i < 10; i++)
    // {
    //     cin >> array[i];
    //     if (array[i] == 1)
    //     {
    //         U1++;
    //     }
    //     else if (array[i] == 2)
    //     {
    //         U2++;
    //     }
    //     else if (array[i] == 3)
    //     {
    //         U3++;
    //     }
    // }
    // cout << "1:";
    // for (int a = 1; a <= U1; a++)
    // {
    //     cout << "*";
    // }
    // cout << "\n2:";
    // for (int b = 1; b <= U2; b++)
    // {
    //     cout << "*";
    // }
    // cout << "\n3:";
    // for (int c = 1; c <= U3; c++)
    // {
    //     cout << "*";
    // }

    // |- Ch8 P4 -|
    // int array[5], bottle;
    // for (int i = 0; i < 5; i++)
    // {
    //     cin >> array[i];
    // }
    // for (int a = 0; a < 4; a++)
    // {
    //     for (int b = 0; b < 4; b++)
    //     {
    //         if (array[b] < array[b + 1])
    //         {
    //             bottle = array[b + 1];
    //             array[b + 1] = array[b];
    //             array[b] = bottle;
    //         }
    //     }
    // }
    // for (int k = 0; k < 2; k++)
    // {
    //     cout << array[k] << " ";
    // }

    // |- Ch8 P5 -|
    // char array[7];
    // int U1 = 0;
    // string box;
    // for (int a = 0; a < 7; a++)
    // {
    //     cin >> array[a];
    // }
    // for (int k = 0; k < 5; k++)
    // {
    //     for (int i = k; i <= k + 2; i++)
    //     {
    //         box += array[i];
    //     }
    //     if (box == "cat")
    //     {
    //         U1++;
    //     }
    //     box = "";
    // }
    // cout << "\nCat:" << U1 << endl;

    // |- Ch8 P6 -|
    // char array[5], bottle;
    // for (int i = 0; i < 5; i++)
    // {
    //     cin >> array[i];
    // }
    // for (int c = 0; c < 4; c++)
    // {
    //     bottle = array[4];
    //     for (int a = 4; a > 0; a--)
    //     {
    //         array[a] = array[a - 1];
    //     }
    //     array[0] = bottle;
    //     for (int b = 0; b < 5; b++)
    //     {
    //         cout << array[b];
    //     }
    //     cout << endl;
    // }
}