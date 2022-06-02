#include <iostream>
using namespace std;

void swap(int a[],int x, int y)
{
	int t = a[x];
	a[x]= a[y];
	a[y]= t;
}

int partition (int a[], int first, int last)
{
	int piv = a[first];
	int i = (first + 1);
	
	for (int j = first+1; j <= last; j++)
	{
		
		if (a[j] < piv)
		{ 
			swap(a,i,j);
			i++;
		}
	}
	swap(a, first, i-1);
	return i-1;
}

void quickSort(int a[], int first, int last)
{
	if (first < last)
	{
		int p = partition(a, first, last);
		
		quickSort(a, first,p - 1);
		quickSort(a, p + 1, last);
	}
}

int main()
{
	int n;
	cout << "Enter the Size of the Array :";cin>> n;cout << endl;
	int a[n];
	cout << "Enter The Elements :";
	for(int i=0;i<n;i++)
	{
		cin >> a[i];
	}
	quickSort(a,0,n-1);
	cout<<endl;
	cout << "Sorted Array :";
	for(int i=0;i<n;i++)
	{
		cout << a[i] << " ";
	}
}
