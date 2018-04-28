import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * <p>
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
 * 接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
 * 接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
 * 保证不存在两项工作的报酬相同。
 * 输入
 * 3 3
 * 1 100
 * 10 1000
 * 1000000000 1001
 * 9 10 1000000000
 * 输出描述: 对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
 * 输出
 * 100
 * 1000
 * 1001
 */

public class FindWork {

    private static void myFunction() {
        //        输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int di = 0, pi = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] dai = new int[n+m];
//        int[] pi = new int[n];
        int[] ai = new int[m];

        for (int i = 0; i < n; i++) {
            di = sc.nextInt();
            pi = sc.nextInt();
            dai[i] = di;
            hashMap.put(di, pi);
        }
        for (int i = 0; i < m; i++) {
            ai[i] = sc.nextInt();
            dai[n + i] = ai[i];
            if(!hashMap.containsKey(ai[i])){
                hashMap.put(ai[i], 0);
            }
        }
        Arrays.sort(dai);

        int max = 0;
        for(int i = 0; i < n+m; i++){
            max = Math.max(max, hashMap.get(dai[i]));
            hashMap.put(dai[i], max);
        }

//        输出
        for (int i = 0; i < m; i++) {
            System.out.println(hashMap.get(ai[i]));
        }
        //        int[] result = new int[m];
//
//        for (int i = 0; i < m; i++) {
//            result[i] = 0;
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (ai[i] >= di[j] && result[i] < pi[j]) {
//                    result[i] = pi[j];
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        myFunction();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }

    // 快排（没用他）
    public static void _quickSort(int[][] array, int low, int high){
        if(low > high){
            return;
        }
        int i = low;
        int j = high;
        int key = array[low][1];
        while (i < j){
            while(i < j && array[j][1] > key){
                j--;
            }
            while(i > j && array[i][1] <= key){
                i++;
            }
            if(i < j){
                int[] p = array[i];
                array[i] = array[j];
                array[j] = p;
            }
        }
        int[] p = array[i];
        array[i] = array[low];
        array[low] = p;
        _quickSort(array, low, i-1);
        _quickSort(array, i+1, high);
    }
    public static void quickSort(int[][] array){
        if(array.length > 0){
            _quickSort(array, 0, array.length-1);
        }
    }
}
