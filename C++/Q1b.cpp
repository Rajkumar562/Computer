//SELECTION sORT
#include <iostream>
using namespace std;
int main()
{
	int n,temp;
	cout << "Enter the Size of the Array :";cin>> n;
	int a[n];
	cout << "Enter The Elements :";
	for(int i=0;i<n;i++)
	{
		cin >> a[i];
	}

	for(int i=0;i<n-1;i++)
	{
		int small =a[i];
		for(int j=i+1;j<n;j++)
		{
			if(a[j]<small)
			{
				temp=small;
				small=a[j];
				a[j]=temp;
			}
		}
		a[i]=small;
	}
	cout << "Sorted Array :";
	for(int i=0;i<n;i++)
	{
		cout << a[i] << " ";
	}
}
