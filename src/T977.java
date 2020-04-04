import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by asd on 2020/4/4 23:55.
 *
 * 977. 有序数组的平方
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class T977 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = -4;
        array[1] = -1;
        array[2] = 0;
        array[3] = 3;
        array[4] = 10;

        T977 t = new T977();
        int[] res = t.sortedSquares(array);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }


    public int[] sortedSquares(int[] A) {
        int[] resArray = new int[A.length];
        int mid = A.length - 1;
        //寻找数组A  0 的分割下标
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                mid = i;
                break;
            }
        }
        int index = 0;
        int index1 = mid - 1;
        int index2 = mid;
        while(index1 >= 0 && index2 < A.length) {
            int v1 = A[index1] * A[index1];
            int v2 = A[index2] * A[index2];
            int v = v1 < v2 ? index1-- : index2++;
            resArray[index++] = Math.min(v1, v2);
        }
        while(index1 >= 0 && index < A.length) {
            resArray[index++] = A[index1] * A[index1];
            index1 --;
        }
        while(index2 < A.length && index < A.length) {
            resArray[index++] = A[index2] * A[index2];
            index2 ++;
        }
        return resArray;
    }
}
