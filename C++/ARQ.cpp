#include <iostream>
#include<string>
#include <windows.h>
using namespace std;

string rdata="";
int check=-1;
int send(char ch,int x);
int receive (char ch,int x);
int random();
int main()
{
	string data;
	cout << "Enter Data to be sent : ";
	cin >> data ;cout << endl;
	for(int i=0;i<data.length();i++)
	{
		send(data[i],i);
	}
	cout << "Received Data : " << rdata;
}
int send(char ch,int x)
{
	cout << "Data Sent : " << x << endl;
	int ans = receive(ch,x);
	if(ans==1)
	{
		int s=random();
		if(s<9)
		{
			if(random()<9)
			cout << "Acknowledgement Received " << endl <<endl;
			else
			{
				Sleep(3000);
				cout << "TIMEOUT - Delayed Acknowledgement " << endl << endl;
				send(ch,x);
			}
		}
		else
		{
			Sleep(3000);
			cout << "TIMEOUT - Loss Of Acknowledgement " << endl << endl;
			send(ch,x);
		}
	}
	else
	{
		Sleep(3000);
		cout << "TIMEOUT - Loss Of Data " << endl << endl;
		send(ch,x);
	}
	
}
int receive(char ch,int j)
{
	int r=random();
	if(r<9)
	{
		if(check==j)
		{
			cout << "Data Received " << endl;
			cout << "Duplicate Data Found And Hence Discarded "<< endl;
			cout << "Acknowledgement Sent : " << j << endl;
		}
		else
		{
			check=j;
			cout << "Data Received " << endl;
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
