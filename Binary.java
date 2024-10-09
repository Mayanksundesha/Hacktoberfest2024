//BINARY IN JAVA
import java.util.*;
public class Binary{
    public static int BinaryNumber(int number[] , int key){
        int start = 0 ; int end = number.length-1;
        while(start <= end){
           int mid = (start + end)/2;
            if(number[mid] == key){
                return number[mid] ;
            }
            if( number[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1 ;
        }
        
    }
    return -1;
    }
        
        public static void main(String args[]){
        int number[] = {1,2,3,4,5,6,7,};
        int keys =  2; 
        int num = BinaryNumber(number , keys );
        System.out.println(num);
    }
}
