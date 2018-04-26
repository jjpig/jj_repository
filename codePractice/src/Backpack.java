import java.util.Scanner;

/**
 * Created by Xiaozhe on 2018/4/25.
 */
public class Backpack {
    /**
     * 牛牛准备参加学校组织的春游, 出发前牛牛准备往背包里装入一些零食, 牛牛的背包容量为w。
     * 牛牛家里一共有n袋零食, 第i袋零食体积为v[i]。
     * 牛牛想知道在总体积不超过背包容量的情况下,他一共有多少种零食放法(总体积为0也算一种放法)。
     * <p>
     * 输入描述: 输入包括两行
     * 第一行为两个正整数n和w(1 <= n <= 30, 1 <= w <= 2 * 10^9),表示零食的数量和背包的容量。
     * 第二行n个正整数v[i](0 <= v[i] <= 10^9),表示每袋零食的体积。
     * <p>
     * 输出描述: 输出一个正整数, 表示牛牛一共有多少种零食放法。
     * <p>
     * 输入例子:
     * 3 10
     * 1 2 4
     * <p>
     * 输出例子: 8
     * <p>
     * 例子说明: 三种零食总体积小于10,于是每种零食有放入和不放入两种情况，一共有2*2*2 = 8种情况。
     */
    private  static int count = 1;
    private static void getTotal(int[] v, int n, int w, int i, long total){
        if(i < n){
            if(total > w){
                return;
            }
//            不添加这件零食
            getTotal(v, n, w, i+1, total);
//            添加这件零食
            if(total + v[i] <= w){
                count++;
                getTotal(v, n, w, i+1, total + v[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] v = new int[n];
        long sum = 0;
        int total = 1;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            sum += v[i];
            total *= 2;
        }
        if(sum <= w){
            System.out.println(total);
        } else {
            getTotal(v, n, w, 0, 0);
            System.out.println(count);
        }
    }
}
