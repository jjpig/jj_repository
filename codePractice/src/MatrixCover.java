import java.util.Scanner;

/**
 * Created by Xiaozhe on 2018/4/25.
 */
public class MatrixCover { //太难！看不懂！
    public static void main(String[] args) {
        /**
         * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
         如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
         请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。

         输入描述:
         输入包括五行。
         第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
         第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
         第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
         第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
         第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。

         输出描述: 输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。

         输入例子1:
         2
         0 90
         0 90
         100 200
         100 200

         输出例子1: 2
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 2 || n > 50){
            System.out.println(0);
        }
        int temp = n;
        int[][] array = new int[4][temp];

        for (int i = 0; i < 4; i++){
            --temp;
            array[0][temp] = sc.nextInt();
            array[1][temp] = sc.nextInt();
            array[2][temp] = sc.nextInt();
            array[3][temp] = sc.nextInt();
        }


    }
}
