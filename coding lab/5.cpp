#include<bits/stdc++.h>
using namespace std;


bool palindrome(string str)
{
    string temp=str;
    reverse(temp.begin(),temp.end());
    if(str==temp)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int main()
{
    string str[50];
    cout<<"Enter the amount of elements in the list:"<<endl;
    int size=0;
    cin>>size;
    cout<<"Enter the elements in the list:"<<endl;
    for(int i=0;i<size;i++)
    {
        cin>>str[i];
    }
    string withPalindrome[50],withOutPalindrome[50];
    int x=0,y=0;
    for(int i=0;i<size;i++)
    {
        if(palindrome(str[i]))
        {
            withPalindrome[x]=str[i];
            x++;
        }
        else
        {
            withOutPalindrome[y]=str[i];
            y++;
        }
    }

    cout<<"WithPalindrome elements are:"<<endl;
    for(int i=0;i<x;i++)
    {
        cout<<withPalindrome[i]<<" ";
    }
    cout<<endl;

    cout<<"WithOutPalindrome elements are:"<<endl;
    for(int i=0;i<y;i++)
    {
        cout<<withOutPalindrome[i]<<" ";
    }
    cout<<endl;
    
}