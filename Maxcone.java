import java.util.*;
public class Maxcone{
    public static void main(String[] args){
        int count=0;
        int maxCount=0;
        int[] ar = {1, 1, 1, 1, 1, 0, 1, 0, 0};
        for(int i=0;i<ar.length;i++){
            if(ar[i]==1){
                count++;
                if(count>maxCount)
                    maxCount = count;
            }
            else{
                count=0;
            }
        }        
        System.out.println("The maximum number of ones :"+maxCount);
    }
}