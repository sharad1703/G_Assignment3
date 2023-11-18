import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        int[] f = {1,2,3,4,5,6};
        int[] g = new int[5];
        float[] c = new float[100];
        int[] a = {1,2,3,4,5,6,7,8,9,10,11};
        int[] b = new int[34];
        float[] w = new float[99];
//        Question A
        for (int i = 0; i<f.length; i++){
            if (i == 5){
                System.out.println("6th element of the array arr1 is the one present at the 5 the index: "+ f[i]);
            }
        }

//        Question B
        for (int i = 0; i<g.length; i++){
//            Initializing elements on each index using for loop and giving them value of 8.
            g[i] = 8;
        }

//        Question C
//        Setting value for 100 elements of the array
        for (int i = 0; i<c.length; i++){
            c[i] = i + 1;
        }
//        Totalling 100 elements
        float sum  = 0f;
        for (int i = 0; i<c.length; i++){
            sum += c[i];
        }

//     Question D
//        Copying array A elements into array b's first 11 indices which has in total 34 elements of size
        for (int i = 0; i<a.length; i++){
            b[i] = a[i];
        }

//        Question E
//        Setting values for array w with size 99
        for (int i = 0; i<w.length; i++){
            w[i] = i +1;
        }
//        Sorting array w.
         Arrays.sort(w);
//        Since we sorted array , the value at the 0 wille be the lowest while the one at last index i.e 99 will be the highest
        System.out.println("Lowest value: " + w[0] + ", Highest value: " + w[98] );

        
    }
}
