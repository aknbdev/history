#include <iostream>
using namespace std;

//2-dars |- Funksiyalar -|

// courseWork|- ikki sonni ayirish -|
int summa(int x, int y)
{
    int s;
    s = x + y;
    return s;
}

// courseWork|- ikki sonni qo'shish -|
int ayirma(int x, int y)
{
    int m;
    m = x - y;
    return m;
}

// courseWork|- butun qismni hisoblash -|
float butun(float x, float y)
{
    int s;
    if (x > y)
    {
        s = x / y;
    }
    else
    {
        s = y / x;
    }
    return s;
}

// courseWork|- qoldiqni hisoblash-|
float qoldiq(int x, int y)
{
    float s;
    if (x > y)
    {
        s = x % y;
    }
    else
    {
        s = y % x;
    }

    return s;
}

// courseWork|- 1 dan x gacha bo'lgan sonlarni yig'indisini hisoblash -|
int Hisob(int x)
{
    int a;
    for (int i = 1; i <= x; i++)
    {
        a += i;
    }
    return a;
}

// |- Homeork -|

// |- 1 -|
char conver(char x)
{
    if (x >= 'A' && x <= 'Z')
    {
        x += 32;
    }

    else if (x >= 'a' && x <= 'z')
    {
        x -= 32;
    }
    return x;
}

// |- 2 -|
int area(int x, int y)
{
    int S;
    S = x * y;
    return S;
}
float restangle(float x, float y)
{
    float S;
    S = x * y;
    return S;
}

// |- 3 -|
int digit(int x)
{
    int S;
    S = x / 100 % 10;
    return S;
}

int main()
{
    // int a, b;
    // cin >> a >> b;
    // cout << a << "+" << b << "=" << summa(a, b) << endl;
    // cout << a << "-" << b << "=" << ayirma(a, b) << endl;
    // cout << butun(a, b) << "\t";
    // cout << qoldiq(a, b);
    // cin >> a;
    // cout << Hisob(a);

    // |- HomeWork -|
    // |- 1 -|
    // char a;
    // cin >> a;
    // cout << conver(a);
    // |- 2 -|
    // int a, b;
    // cin >> a >> b;
    // cout << "area->" << area(a, b);
    // float c, d;
    // cin >> c >> d;
    // cout << "area->" << restangle(c, d);
    // |- 3 -|
    // int a;
    // cin >> a;
    // cout << digit(a);

    return 0;
}