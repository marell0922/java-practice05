package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		System.out.println();
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		// 
		
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-i;j++) {
				if(array[j]<array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
				/*System.out.print( i +" [ " );
				for (int k= 0; k < count; k++) {
					System.out.print( array[ k ] + " " );
				}
				System.out.println("]" );*/
					
			}
		}
		
		System.out.println( "After sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
	}
}