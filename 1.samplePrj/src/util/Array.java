package util;
public class Array {
    
   public static int[] sort(int[] a) {    //오름차순 sorting
		int[] sort= new int[a.length] ;
		System.arraycopy(a, 0, sort, 0,a.length);
				
		for(int i=0; i<a.length-1; i++)
			for(int j=0; j<a.length-1-i; j++)
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
		return sort;
    }
}


    // 유용하게 사용 가능한  함수를 만들어 보세요.. 
    // 단 source data a는 보존이 되도록만드세요