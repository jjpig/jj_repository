import java.util.Arrays;
import java.util.Scanner;

/**
 * 小易老师是非常严厉的,它会要求所有学生在进入教室前都排成一列,并且他要求学生按照身高不递减的顺序排列。有一次,n个学生在列队的时候,
 * 小易老师正好去卫生间了。学生们终于有机会反击了,于是学生们决定来一次疯狂的队列,他们定义一个队列的疯狂值为每对相邻排列学生身高差的
 * 绝对值总和。由于按照身高顺序排列的队列的疯狂值是最小的,他们当然决定按照疯狂值最大的顺序来进行列队。现在给出n个学生的身高,请计算
 * 出这些学生列队的最大可能的疯狂值。小易老师回来一定会气得半死。
 * 输入描述:
 * 输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),表示学生的人数
 * 第二行为n个整数h[i](1 ≤ h[i] ≤ 1000),表示每个学生的身高
 * <p>
 * 输出描述: 输出一个整数,表示n个学生列队可以获得的最大的疯狂值。
 * <p>
 * 如样例所示:
 * 当队列排列顺序是: 25-10-40-5-25, 身高差绝对值的总和为15+30+35+20=100。这是最大的疯狂值了。
 * <p>
 * 输入例子1:
 * 5
 * 5 10 25 40 25
 * <p>
 * 输出例子1: 100
 * Created by Xiaozhe on 2018/4/27.
 */
public class CrazyQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(h);

        if(n==0 || n==1){
            System.out.println(0);
            return;
        }

        if(n == 2){
            System.out.println(h[1]-h[0]);
            return;
        }

        int start = 1;
        int end = n-2;
        int max = h[n-1];
        int min = h[0];
        int result = h[n-1]-h[0];
        while(start <= end){
            if(start == end){                              //最后剩下1个元素的情况  
                result += Math.max(Math.abs(h[start]-min),Math.abs(h[start]-max));
                break;
            }
            int maxt = h[end];
            int mint = h[start];
            result += Math.abs(min-maxt);
            result += Math.abs(max-mint);
            min = mint;
            max = maxt;
            start++;
            end--;
        }
        System.out.println(result);

    }
}
