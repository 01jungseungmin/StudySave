import java.util.*;
public class Q1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      
    System.out.print("�Է��� ������ ������?: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
    	System.out.print("���ڸ� �Է��ϼ���: ");
      arr[i] = sc.nextInt();
    }
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();        
    for (int str : arr) {            
    	Integer count = map.get(str);            
    	if (count == null) {                
    		map.put(str, 1);            
    		} else {                
    			map.put(str, count + 1);            
    			}        
    }      
    
    Arrays.sort(arr);
    
    for (Integer key : map.keySet()) {            
    	System.out.println(key + " : " + map.get(key)+"��");        
    	}
  }
}