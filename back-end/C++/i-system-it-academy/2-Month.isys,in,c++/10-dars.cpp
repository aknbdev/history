#include <iostream>
using namespace std;
int main()
{
    // |- Pointers -|
    // int a;
    // float b;
    // char c;
    // string d;

    // int *pa;
    // float *pb;
    // char *pc;
    // string *pd;

    // pa = &a;
    // pb = &b;
    // pc = &c;
    // pd = &d;

    // cout << pa << endl;
    // cout << pb << endl;
    // cout << int(pc) << endl;
    // cout << pd << endl;
    // |- pointerda saqlangan o'zgaruvchini qiymatini ko'rish -|
    // int sa = 7, *psa;
    // psa = &sa;
    // cout << *psa;
    // |- pointerda saqlangan o'zgaruvchini qiymatini o'zgartirish -|
    // int sa = 76, *psa;
    // psa = &sa;
    // *psa = 10;
    // cout << sa;

    // |- courseWork1 -|
    // char user, *pu;
    // pu = &user;
    // cin >> *pu;
    // if (*pu >= 'a' && *pu <= 'z')
    // {
    //     *pu = *pu - 32;
    // }
    // else if (*pu >= 'A' && *pu <= 'Z')
    // {
    //     *pu = *pu + 32;
    // }
    // else
    // {
    //     cout << "Unknown operation!";
    // }
    // cout << *pu;

    // |- courseWork2 -|
    // int pointer, *po;
    // po = &pointer;
    // cin >> *po;
    // *po = 10;
    // cout << *po;

    // |- courseWork3 -|
    // int input1, input2, *pin1, *pin2, S = 0;
    // pin1 = &input1;
    // pin2 = &input2;
    // cin >> *pin1 >> *pin2;
    // for (int i = *pin1; i <= *pin2; i++)
    // {
    //     S += i;
    // }
    // cout << S;

    // |- homeWorkCh9 -|
    // |- Ch6 P10 -|

    // int sum = 0, N, *psum, *pn;
    // psum = &sum;
    // pn = &N;
    // cin >> *pn;
    // do
    // {
    //     if (*psum > 10)
    //     {
    //         *pn = *psum;
    //         *psum = 0;
    //     }
    //     while (*pn)
    //     {
    //         *psum += *pn % 10;
    //         *pn /= 10;
    //     }
    // } while (*psum > 10);
    // cout << *psum;

    // |- Ch6 P11 -|
    // int input, *pin;
    // pin = &input;
    // cout << "Enter from 1 to 18!" << endl;
    // cin >> *pin;
    // for (int i = 1; i <= 6; i++)
    // {
    //     for (int a = 1; a <= 6; a++)
    //     {
    //         for (int k = 1; k <= 6; k++)
    //         {
    //             if (i + a + k == *pin)
    //             {
    //                 cout << i << "  " << a << "  " << k << "  " << endl;
    //             }
    //         }
    //     }
    // }

    // |- Ch9 P3 -|
    // int arr, arin, *parr, *parin;
    // parr = &arr;
    // parin = &arin;
    // cout << "Enter the array value: ";
    // cin >> *parr;
    // int array[100];
    // for (int i = 0; i < *parr; i++)
    // {
    //     cin >> array[i];
    // }
    // cout << "Enter array index: ";
    // cin >> *parin;
    // cout << array[*parin];

    /// |- Ch9 P4 -|
    // int arr, *parr;
    // parr = &arr;
    // cout << "Enter the array value: ";
    // cin >> *parr;
    // int array[100], *parray[100], box, *pbox;
    // parray[100] = &array[100];
    // pbox = &box;
    // for (int i = 0; i < *parr; i++)
    // {
    //     cin >> *parray[i];
    // }
    // for (int i2 = 0; i2 < *parr; i2++)
    // {
    //     for (int i1 = 0; i1 < *parr; i1++)
    //     {
    //         if (*parray[i1] > *parray[i1 + 1])
    //         {
    //             *pbox = *parray[i1];
    //             *parray[i1] = *parray[i1 + 1];
    //             *parray[i1 + 1] = *pbox;
    //         }
    //     }
    // }
    // cout << "MIN:" << *parray[0] << " Max:" << *parray[*parr - 1];

    // |- Ch9 54 -|
    // char array[20], u = 0, *parray, *pu;
    // for (int i = 0; i < 20; i++)
    // {
    //     cin >> array[i];
    //     if (array[i] == '#')
    //     {
    //         break;
    //     }
    //     u++;
    // }
    // for (int i1 = u - 1; i1 >= 0; i1--)
    // {
    //     cout << array[i1];
    // }

    return 0;
}