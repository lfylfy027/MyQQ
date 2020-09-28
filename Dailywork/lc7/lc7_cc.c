#include <stdio.h>
int reverse(int x);
int main(void){
	int x;
	printf("number:");
	scanf("%d",&x);
	printf("%d\n",reverse(x));
	return 0;
}
int reverse(int x){
	int sum=0;
	while(x!=0){
		int pop = x%10;
		x=x/10;
		if ((sum > 214748364) ||(sum==214748364 && pop>7))return 0;
		if ((sum < -214748364) ||(sum== -214748364&& pop<-8))return 0;
		sum=sum*10+pop;
	}return sum;
}
