#include <iostream>
#include<string>
using namespace std;

int find(string newdata ,string div,int len);
int divide(string newdata,string div,int len);
int main()
{
	string data,div="";
	cout << "For Sender =>" << endl;
	cout << "Enter Data: ";
	cin >> data;
	cout << "Enter Divisor: ";
	cin >> div;
	int len=div.length();
	string newdata=data;
	for (int i=1;i<len;i++)
	{
		newdata+="0";
	}
	int final=find(newdata,div,len);long long newdata1=0;
	newdata1=stoll(newdata);
	long long finalans=newdata1+(long long)final;
	string codeword=to_string(finalans);
	cout << "\nThe Codeword sent to receiver is: " << codeword << endl;
	int check=find(codeword,div,len);
	cout << "\nThe Remainder on the Receiver side is: "<< check << endl;
	if(check==0)
	cout << "This Shows us that Data is recieved Correctly";
	else
	cout << "This Shows us that Data is recieved Incorrectly";
}

int divide(string dividend,string divisor,int len)
{
	string s="";
	for(int i=0;i<len;i++)
	{
		if(dividend[i]==divisor[i])
		s+="0";
		else
		s+="1";
	}
	int ans=stoi(s);
	return ans;
}
int find(string dividend,string divisor,int len)
{
    string newdiv="";int rem=0;
    int i=0;
    for (i=0;i<len;i++)
	{
	    newdiv+=dividend[i];
	}
    while(i<=dividend.length())
    {
        int ans=divide(newdiv,divisor,len);
        string newans=to_string(ans);
        newdiv="";
        newdiv+=newans;
        int newl=newans.length();
        if(i!=dividend.length())
        {
	        for(int j=newl;j<len;j++)
	        {
	            newdiv+=dividend[i];
	            i++;
	        }
	    }
        rem=stoi(newdiv);
        if(newdiv.length()<len)
        break;
    }
    return rem;
}
