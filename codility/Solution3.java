package codility;

public class Solution3 
{
	public static void main(String[] args)
	{
		int ans = solution(24,24);
		System.out.println(ans);
		
	}

	public static int solution(int A, int B) 
	{
		int a = (int)Math.sqrt((double)A);
		
	    while (a*a < A)
				a++;
	
	    int count = 0;
	    
	    for(int i = a; i*i <= B; i++)
	    	count++;
        
	    return count;
    }
	
	
}
