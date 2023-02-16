#include<bits/stdc++.h>
using namespace std;

int main()
{
    int rowSize=0,colSize=0;
    char m[50][50];
    cout<<"Enter number of rows:"<<endl;
    cin>>rowSize;
    cout<<"Enter number of columns:"<<endl;
    cin>>colSize;
    cout<<"Enter the elements of the matrix:"<<endl;

    for(int i=0;i<rowSize;i++)
    {
        for(int j=0;j<colSize;j++)
        {
            cin>>m[i][j];
        }
    }

    char target=' ';
    cout<<"Enter target: "<<endl;
    cin>>target;

    char ans[50];
    int x=0,y=0;


    for(int i=0;i<rowSize;i++)
    {
        for(int j=0;j<colSize;j++)
        {
            if(m[i][j]==target)
            {
                x=i;
                y=j;
                break;
            }
        }
    }

    int k=0;
    for(int j=0;j<y;j++)
    {
        ans[k]=m[x][j];
        k++;
    }
    for(int i=0;i<x;i++)
    {
        ans[k]=m[i][y];
        k++;
    }

    for(int i=0;i<k;i++)
    {
        cout<<ans[i]<<" ";
    }
    cout<<endl;

}