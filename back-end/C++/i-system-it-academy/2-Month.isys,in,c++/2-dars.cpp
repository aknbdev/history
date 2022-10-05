#include <iostream>
using namespace std;
void inputName();
void output(int baho);
int main()
{
    inputName();
}
void inputName()
{
    int ball;
    cin >> ball;
    output(ball);
}
void output(int baho)
{
    if (baho >= 90 && baho <= 100)
    {
        cout << "Bahoingiz:5";
    }
    else if (baho >= 80 && baho <= 90)
    {
        cout << "Bahoingiz:4";
    }
    else if (baho >= 70 && baho <= 80)
    {
        cout << "Bahoingiz:3";
    }
    else if (baho <= 70)
    {
        cout << "Bahoingiz:0";
    }
}