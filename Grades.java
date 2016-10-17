
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;//used this package for reversal of array
public class Grades {
	public static void main(String arg[]){
		int[] arr ={99, 92, 91, 91, 89, 85, 83, 82, 80, 79, 78, 78, 77, 76, 75, 74, 62, 55, 43, 20};
		GradeCalculator(arr);
	}
	
	public static void GradeCalculator(int[] array) {// the required function
		
		
		  Arrays.sort( array );
		  ArrayUtils.reverse(array);//sorted the scores in descending order
		  
		  Set<Integer> setUniqueNumbers = new LinkedHashSet<Integer>();
		  for(int x : array) {
		      setUniqueNumbers.add(x);
		  }
		  int j =0;
		  int count = 0;
		  
		  for(Integer x : setUniqueNumbers) {
		      
		      count++;//counted the number of unique scores
		     
		  }
		
		  int[] arr = new int[count];
		  for(Integer x : setUniqueNumbers) {
		      
		      arr[j]=x;
		      
		      j++;
		      
		  }
		
		
		for (int i = 0; i <= (arr.length-1); i++) {//unique scores are graded according to the requirement.
		    if( i< (arr.length/5)){
		       System.out.println((arr[i]+" A"));  
		}

		else if   ( i< (2* arr.length/5)){
			
			System.out.println(arr[i]+" B");
			} 
		else if ( i< (3* arr.length/5)){
			
				System.out.println(arr[i]+" C");
				} 

		else if ( i< (4* arr.length/5)){
			
				System.out.println(arr[i]+" D");
				} 

		else{
			
			System.out.println(arr[i]+" F");    
			} 
		}
		}
	
}
