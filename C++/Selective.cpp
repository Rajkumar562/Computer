//Q4. SELECTIVE REPEAT
#include <iostream>
#include<string>
#include <windows.h>
using namespace std;

string rdata="";int n=0;
int check=-1;
int send(string s);
int receive (char ch,int x);
int random();
int resend(int x,int l);
int window (int x,int l);
int main()
{
	string data;
	cout << "Enter Data to be sent : ";
	cin >> data ;
	cout << "Enter Window Size : ";
	cin >> n ; cout << endl;
	resend(0,data.length());
	send(data);
	cout << "\nReceived Data : " << rdata;
}
int send(string s)
{
        for (int i=0;i<s.length();i++)
        {
        	int l=s.length();
            int ans = receive(s[i],i);
            if(ans==1)
            {
                window(i+n,l);
            }
            else
            {
            	Sleep(3000);
                cout << "TIMEOUT - Loss Of Acknowledgement \n" << endl;
                window(i,l);
                i--;
            }
        }
}
int receive(char ch,int j)
{
    if(random()<9)
	{
		if(check==j)
		{
			cout << "Duplicate Data Found And Hence Discarded "<< endl;
			cout << "Acknowledgement Sent : " << j << endl;
		}
		else
		{
			check=j;
			cout << "Acknowledgement Sent : " << j << endl;
			rdata+=ch;
		}
		return 1;
	}
	else
	return 0;
}
int random()
{
	return rand()%10;
}
int window(int x,int l)
{
	if(x<l)
    cout << "Data Sent : " << x << endl << endl;
}
int resend(int x,int l)
{
    if(random()<9)
    {
        for(int i=0;i<n && i+x<l;i++)
        {
            cout << "Data Sent : " << i+x << endl;
        }
        cout << endl;
    }
    else
    {
    	Sleep(3000);
        cout << "TIMEOUT - Loss Of Data\n" << endl;
        resend(x,l);
    }
}
