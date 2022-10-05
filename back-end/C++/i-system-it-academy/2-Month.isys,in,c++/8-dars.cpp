#include <iostream>
using namespace std;
string username = "i_tech2003";
string parol = "2003";
void ui();
void signUp();
void logIn();
void sistema();
void newparol();
void logout();
int main()
{
    ui();
}
void ui()
{
    int k;
    cout << "1.Log in    2.Sign Up\n";
    cin >> k;
    switch (k)
    {
    case 1:
    {
        logIn();
        break;
    }
    case 2:
    {
        signUp();
        break;
    }
    }
}
void signUp()
{
    string user, parol1, parol2;
k:
    cout << "Username:";
    cin >> user;
    cout << "Parol:";
    cin >> parol1;
    cout << "Parolni qaytadan kiriting:";
    cin >> parol2;
    if (parol1 == parol2)
    {
        username = user;
        parol = parol1;
        cout << "Registratsiyadan muvaffaqiyatli o'tdingiz!\n";
        ui();
    }
    else
    {
        cout << "Parollar mos kelmadi!\n";
        goto k;
    }
}

void logIn()
{
    string user, password;
k:
    cout << "Username:";
    cin >> user;
    cout << "Parol:";
    cin >> password;
    if (user != username)
    {
        cout << "Bunday foydalanuvchi mavjud emas!\n";
        goto k;
    }
    else if (username == user && parol != password)
    {
        cout << "Parol xato! Qaytadan kiriting!\n";
        goto k;
    }
    else
    {
        cout << "Succesfully entered to the Account!\n";
        sistema();
    }
}
void sistema()
{
    int sis;
    cout << "1.Parolni o'zgartirish    2.Log Out\n";
    cin >> sis;
    switch (sis)
    {
    case 1:
    {
        newparol();
        break;
    }

    case 2:
    {
        logout();
    }

    default:
        break;
    }
}
void newparol()
{
    string newp;
    cout << "Enter new parol:";
    cin >> newp;
    parol = newp;
    cout << "Parol Changed!\n";
    sistema();
}
void logout()
{
    username = "";
    parol = "";
    cout << "Logged Out!\nNew Account!\n";
    signUp();
}