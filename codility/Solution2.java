package codility;

public class Solution2 
{
	public static void main(String[] args)
	{
		int[] A = {1,2,3,4,5,6};
		int ans = solution(A);
		System.out.println(ans);
		
	}
	
	public static int solution(int[] A) 
	{
       long count = 0;
       for(int i = 0; i < A.length-2; i++)
       {
    	   if((A[i]-A[i+1]) == (A[i+1]-A[i+2]))
    	   {
    		   int start = i;
    		   int end = i,temp;
    		   while(true)
    		   {
    			   i++;
    			   if((i+2) > A.length-1)
    				   break;
    			   if((A[i]-A[i+1]) != (A[i+1]-A[i+2]))
    				   break;
    			   end = i+2;
    		   }
    		   
    		   temp = end-start;
    		   count += ((temp*(temp-1))/2);
    	   }
    	   else
    		   continue;
    		   
       }
       
       if(count > 1000000000)
    	   return -1;
       else
    	   return (int)count;
    }
	

}
