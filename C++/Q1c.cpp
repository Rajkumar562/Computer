//INSERTION sORT
#include <iostream>
using namespace std;
int main()
{
	int n,current,j;
	cout << "Enter the Size of the Array :";cin>> n;
	int a[n];
	cout << "Enter The Elements :";
	for(int i=0;i<n;i++)
	{
		cin >> a[i];
	}

	for(int i=1;i<n;i++)
	{
		current=a[i];
		j=i-1;
		while(j>=0 && a[j]>current)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=current;
	}
	cout << "Sorted Array :";
	for(int i=0;i<n;i++)
	{
		cout << a[i] << " ";
	}
}
