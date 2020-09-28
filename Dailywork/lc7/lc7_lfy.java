public class Integerreverse {
	   public int reverse(int x) {
		         if(x==0)return 0;
		  		 int ans=0;
		  		 int len=(x+"").length();
		  		 if(x>0){
		  			 while(len>0) {
		  			 int a=x%10;
		  			 x/=10;
		  			 //大于0时如果溢出，ans+1变小于0
		             if(ans+1<0)return 0;
		  			 ans+=a*Math.pow(10, len-1);
		  			 len--;
		  			 }
		  		 } else {
		  			len--;
		  			while(len>0) {
		  				 int a=x%10;
		  				 x/=10;
		  				 //小于0时如果溢出，ans-1变大于0
		                 if(ans-1>0)return 0;
		  				 ans+=a*Math.pow(10, len-1);
		  				 len--;
		  			 }
		  		}
		  		 return ans;
		      }
	   
	   public int reverse(int x) {
		   if(x==0)return 0;
		   		 int ans=0;
		   		 while(x!=0) {
		   			 int a=x%10;
		   			 x/=10;
		   			 if(ans>214748364||(ans==214748364&&a>7)||ans<-214748364||(ans==-244748364&&a<-8))return 0;
		   			 ans=ans*10+a;
		   			 }
		   		 return ans;
		       }	   
}
 