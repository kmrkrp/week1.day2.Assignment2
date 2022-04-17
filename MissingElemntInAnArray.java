package week1.day2;

import java.util.Arrays;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class MissingElemntInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int len = arr.length;		
		for (int i = 0; i<len;i++)
		{
			int compare = i+1;				
			if(compare != arr[i])
			{
				System.out.println( "The Missing Number in the Array: "+ compare);
				break;
			}			
		}

	}

}
