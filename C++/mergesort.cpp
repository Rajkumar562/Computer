#include <iostream>
using namespace std;

void merge(int arr[], int l, int m, int r)
{
	int i,j,k;
	int n1 = m - l + 1;
	int n2 = r - m;

	int p[n1];int q[n2];
	
	
	for (int i = 0; i < n1; i++)
		p[i] = arr[l + i];
	for (int j = 0; j < n2; j++)
		q[j] = arr[m + 1 + j];

	i = 0, 
	j = 0; 
	k = l; 

	while (i < n1 && j < n2) {
		if (p[i] <= q[j]) {
			arr[k] = p[i];
			i++;
		}
		else {
			arr[k] = q[j];
			j++;
		}
		k++;
	}
	
	while (i < n1) {
		arr[k] = p[i];
		i++;
		k++;
	}
	
	while (j < n2) {
		arr[k] = q[j];
		j++;
		k++;
	}
}

void mergeSort(int arr[], int l, int r)
{
	if (l < r)
	{
	int m = l + (r - l) / 2;
	mergeSort(arr, l, m);
	mergeSort(arr, m + 1, r);
	merge(arr, l, m, r);
	}
}

int main()
{
	int n;
	cout << "Enter the Size of the Array :";cin>> n;cout <<endl;
	int a[n];
	cout << "Enter The Elements :";
	for(int i=0;i<n;i++)
	{
		cin >> a[i];
	}
	mergeSort(a,0,n-1);
	cout<<endl;
	cout << "Sorted Array :";
	for(int i=0;i<n;i++)
	{
		cout << a[i] << " ";
	}
}
