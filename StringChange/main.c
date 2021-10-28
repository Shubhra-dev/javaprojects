#include <stdio.h>
#include<string.h>

int min(int a,int b,int c){
    int minimum = 0;
    if(a<=b){
        if(a<=c){
            minimum=a;
        }
    }
    if(b<=a){
        if(b<=c){
            minimum=b;
        }
    }
    if(c<=a){
        if(c<=b){
            minimum=c;
        }
    }
    return minimum;
}
int main()
{
    int i,j;
    char str1[100],str2[100];
    int arr[100][100]={0};
    printf("Enter 1st string:");
    gets(str1);
    printf("Enter 2nd string:");
    gets(str1);
    getchar();

    int x=strlen(str1);
    int y=strlen(str2);
    for( i=0;i<=x;i++){
        arr[i][0]=i;
    }
    for( j=0;j<=y;j++){
        arr[0][j]=j;
    }

    for( j=0;j<y;j++){
        for( i=0;i<x;i++){
            if(str2[j]==str1[i]){
                arr[i+1][j+1]=arr[i][j];
            }
            else{
                arr[i+1][j+1]=min(arr[i][j+1],arr[i+1][j],arr[i][j])+1;
            }
        }
    }
    printf("%d",arr[x-1][y-1]);
    return 0;
}

