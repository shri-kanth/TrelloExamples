package codility;

public class Solution 
{
	
	public static void main(String[] args)
	{
		int[] A = {1,2,1,2,1,2,7};
		int ans = solution(A);
		System.out.println(ans);
		
	}
	
	public static int solution(int[] A) 
	{
		int max = 1;
		for(int i = 0; i < A.length-2; i++)
		{
			if(A[i] == A[i+2])
			{
				int count = 0;
				boolean first = true;
				while(true)
				{
					i++;
					
					if(i+2 > A.length-1)
						break;
					
					if(A[i] != A[i+2])
						break;
					
					if(first)
						{
						 count = 4;
						 first = false;
						}
					else
						count++ ;
				}
				
				if(max < count)
					max = count;
			}
			else
				continue;
		}
		return max;
        
    }
	
	public boolean isSwitch(int[] A)
	{
		boolean flag = true;
		for(int i = 0; i < A.length-2; i++)
		{
			if(A[i] != A[i+2])
			{
				flag = false;
				break;
			}	
		}
		
		return flag;
	}
	

}
