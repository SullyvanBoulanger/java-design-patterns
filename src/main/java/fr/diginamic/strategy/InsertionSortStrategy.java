package fr.diginamic.strategy;

public class InsertionSortStrategy implements ISortStrategy {

    @Override
    public void sort(Integer[] array) {
        for(int k=1; k<array.length-1; k++)   {  
            int temp = array[k];  
            int j= k-1;  
            while(j>=0 && temp <= array[j])   {  
                array[j+1] = array[j];   
                j = j-1;  
            }  
            array[j+1] = temp;  
        }
    }
    
}
