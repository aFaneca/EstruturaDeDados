package fichas.ficha2;

import java.util.*;


public class ficha2 {
	
	//exe1
	static int [] toIntArray(List<Integer> x){
		int [] ret = new int[x.size()];
		int i=0;
		for(Integer e: x)
			ret[i++] = e.intValue();
		return ret;		
	}
	
	
	public static int [] criaArrayCom(int valor, int dimensao, boolean diferentes){
	
		Random y = new Random();
		List <Integer> x= new ArrayList<Integer> (dimensao); 
		int temp;
		x.add(valor);
		for(int i=1; i < dimensao; i++){
			do{
				temp = y.nextInt(dimensao * 2);
			}while(diferentes && x.subList(0, i-1).contains(temp));	
			
			x.add(i, temp);
		}
		Collections.sort(x);
		return toIntArray(x);
	}
	
	//exe2
	public static int [] criaArraySem(int valor, int dimensao, boolean diferentes){
		
		Random y = new Random();
		List <Integer> x= new ArrayList<Integer> (dimensao); 
		int temp;
		for(int i=0; i < dimensao; i++){
			do{
				temp = y.nextInt(dimensao * 2);
			}while(temp==valor || (diferentes && i>0 && x.subList(0, i-1).contains(temp)));	
			
			x.add(i, temp);
		}
		Collections.sort(x);
		return toIntArray(x);
	}
	
	//pesquisa binaria recursiva   ////ex3
	 //General
    public static boolean binarySearchInt(int m[], int value, int low, int high)
    {
        if (low > high)
            return false;

        int middle = (low + high) / 2;

        int middleValue = m[middle];

        if (middleValue > value)
            return binarySearchInt(m, value, low, middle - 1);

        if (middleValue < value)
            return binarySearchInt(m, value, middle + 1, high);

        return true;
    }

    public static boolean binarySearch(int m[], int value)
    {
        return binarySearchInt(m, value, 0, m.length-1);
    }
    
    //pesquisa binaria iterativa     // ex4
    //General
    public static boolean binarySearchInterativ(int m[], int value, int low, int high)
    {
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > value){
	            high= middle -1;
	            continue;
	        }
	
	        if (middleValue < value){
	            low= middle + 1;
	            continue;
	        }
	        return true;
        }
        return false;
    }

    public static boolean binarySearchIterativ(int m[], int value)
    {
        return binarySearchInterativ(m, value, 0, m.length-1);
    }
	
    //General  //// ex5
    public static int binarySearchIterEx5(int m[], int value, int low, int high)
    {
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > value){
	            high= middle -1;
	            continue;
	        }
	
	        if (middleValue < value){
	            low= middle + 1;
	            continue;
	        }
	        return middle+1;
        }
        return -1;
    }

    public static int binarySearchEx5(int m[], int value)
    {
        return binarySearchIterEx5(m, value, 0, m.length-1);
    }
    
    /// ex6
    public static int binarySearchIterEx6(int m[], int value, int low, int high)
    {
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > value){
	            high= middle -1;
	            continue;
	        }
	
	        if (middleValue < value){
	            low= middle + 1;
	            continue;
	        }
	        return middle;
        }
        return (low+1)*(-1);
    }

    public static int binarySearchEx6(int m[], int value)
    {
        return binarySearchIterEx6(m, value, 0, m.length-1);
    }
    
    /// ex7
    public static double binarySearchIterEx7(int m[], int value, int low, int high)
    {
    	int dimensao = high+1;
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > value){
	            high= middle -1;
	            continue;
	        }
	
	        if (middleValue < value){
	            low= middle + 1;
	            continue;
	        }
	        return (double) middle/ dimensao;
        }
        return (double) (low) / dimensao;
    }

    public static double binarySearchEx7(int m[], int value)
    {
        return binarySearchIterEx7(m, value, 0, m.length-1);
    }
    
    //ex8
    public static int binarySearchIterEx8(int m[], int value1, int value2, int low, int high)
    {
    	
        while(low <= high){
        	int lowValue = m[low], highValue = m[high];
        	
	        if (highValue > value2){
	            high= high -1;
	            continue;
	        }
	        if (lowValue < value1){
	            low= low + 1;
	            continue;
	        }
	        return  (high - low) + 1;
        }
        return  (high - low) + 1;
    }

    public static int binarySearchEx8(int m[], int value1, int value2)
    {
        return binarySearchIterEx8(m, value1,value2, 0, m.length-1);
    }
    
  /// ex9
    public static boolean binarySearchIterEx9(int m[], int value, int low, int high)
    {
    	int dimensao = high+1;
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > value){
	            high= middle -1;
	            continue;
	        }
	
	        if (middleValue < value){
	            low= middle + 1;
	            continue;
	        }
	        
	        if(middle < dimensao-1 && middle > 0 && (m[middle+1] == value || m[middle-1] == value))
	        	return true;
	        else
	        	return false;
        }
        return false;
    }

    public static boolean binarySearchEx9(int m[], int value)
    {
        return binarySearchIterEx9(m, value, 0, m.length-1);
    }
    
    //exercicio 10 - descobrir o valor que a fun��o recebe e de seguida andar um valor a baixo no array recebido por parametro
    
    // ex11
    public static int binarySearchIterEx11(int m[], int value, int low, int high)
    {
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	        
	        if(value >=0){	
		        if (middleValue > value){
		        	high= middle -1;
		            continue;
		        }
		
		        if (middleValue < value && middleValue < 0){
		            high= middle -1;
		            continue;
		        }
		        
		        if (middleValue < value && middleValue > 0){
		            low= middle +1;
		            continue;
		        }
	        }
	        else{
	        	if (middleValue > value){
		            high = middle - 1;
		            continue;
		        }
		
		        if (middleValue < value){
		            low= middle +1;
		            continue;
		        }
	        }
	        return middle+1;
        }
        return -1;
    }

    public static int binarySearchEx11(int m[], int value)
    {
        return binarySearchIterEx11(m, value, 0, m.length-1);
    }
    
    //ex12
    public static int binarySearchIterEx12(int m[], int low, int high)
    {
        while(low <= high){
	        int middle = (low + high) / 2;
	
	        int middleValue = m[middle];
	
	        if (middleValue > middle){
	            high= middle -1;
	            if(middle == 0){
	            	return middle;
	            }
	            continue;
	        }
	
	        if (middleValue < middle){
	            low= middle + 1;
	            continue;
	        }
	        return middle +1;
        }
        return -1;
    }

    public static int binarySearchEx12(int m[])
    {
        return binarySearchIterEx12(m, 0, m.length-1);
    }
    
	public static void main(String[] args){
		//exe1
		int valor=6, valor2=14;
		//int [] results = criaArrayCom(10, 20, true);
		//int [] results = new int [] {3,3,7,12,12,15};
		//int [] results = new int [] {3,7,12,15};
		int [] results = new int [] {3,7,12,15};
		int [] results1 = new int [] {-3,1,7,12,15};
		int [] results2 = new int [] {-15,-14,1,2,3,4};
		
		for(int x: results)
			System.out.print(x +" ");
		
//		//exe3
//		System.out.print("\n\n O valor existe?? " + binarySearchIterativ(results, valor));
//		//exe5
//		System.out.print("\n\n O valor est� na posi��o " + binarySearchEx5(results, valor));
//		//exe6
//		System.out.print("\n\nValor procurado = " + valor + "  Resultado=" + binarySearchEx6(results, valor));
//		//exe7
//		System.out.print("\n\nValor= " + valor + "  Resultado=" + binarySearchEx7(results, valor));
//		//exe8
//		System.out.print("\n\nValor=(" + valor +", "+ valor2 + ")  Resultado=" + binarySearchEx8(results, valor, valor2));
//		//exe9
//		System.out.print("\n\nValor= " + valor + "  Resultado=" + binarySearchEx9(results, valor));
//		//exe11
//		System.out.print("\n\n O valor est� na posi��o " + binarySearchEx11(results, valor));
		//exe12
		System.out.print("\n\n Resultado : " + binarySearchEx12(results));
		System.out.print("\n Resultado : " + binarySearchEx12(results1));
		System.out.print("\n Resultado : " + binarySearchEx12(results2));
		
	}
}
