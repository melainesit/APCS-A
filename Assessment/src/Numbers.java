import static java.lang.System*;


public class Numbers{
	int num = 0;
	
	public static boolean isGoofy(int num){
		int sum;
		int stop=0;
		while (stop<=2){
			for (int i=1; i<= num; i++){
				if (num%i == 0){
					sum = sum+ i;
					stop = stop +1;
				}
			}
		}

		if (sum%2 ==0){
			return true;
		}
		return false;
		
			
	}
	public static int[] getSomeGoofyNumbers(int count){
		int arraynums[];
		for (int i=1; i<count;i=i+1){
			boolean arraynums add[i];
			
		}
		return arraynums;
			
			
		}

		
		
		
		
}