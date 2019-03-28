#include<iostream>
using namespace std;
int main()
{
	int n;
	float s=0;
	cout<<"enter number of processes\n";
	cin>>n;
	int at[n],ct[n],wt[n],p[n],bt[n];
	cout<<"arrival time of processes:\n\n";
	for(int i=0;i<n;i++)
	{
		p[i]=i+1;
		cout<<"enter arrival time for p"<<p[i]<<"=";
	cin>>at[i];
	}
	cout<<"enter burst time of processes:\n\n";
	for(int i=0;i<n;i++)
	{
		p[i]=i+1;
		cout<<"enter burst time for p"<<p[i]<<"=";
	cin>>bt[i];
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(bt[j]<bt[i])
			{
				int t=bt[j];
				bt[j]=bt[i];
				bt[i]=t;
				int temp=p[j];
				p[j]=p[i];
				p[i]=temp;
			}
		}
	}
	wt[0]=0;
	for(i=0;i<n;i++)
	{
		wt[i]=bt[i]-1;
		for(j=i+1;j<n;j++)
		{
            if(wt[i]>bt[j])
            {
            	bt[i]=wt[i];
            	
			}
        }
	}
