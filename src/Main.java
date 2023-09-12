import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        System.out.println( binary(5));
    }
    public static int binary(int search){
        int []array= new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int ek = 0;
        int eb= array.length-1;

        int index = 0;
        while(eb>=ek){
            int orta = (ek+eb)/2;
            if(array[orta] == search){
                index = orta;
                return index;
            }
            if(array[orta] < search){
                ek = orta +1 ;
            }
            if (array[orta] > search){
                eb = orta-1;
            }
        }



return index;
    }
}