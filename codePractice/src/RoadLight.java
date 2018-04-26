/**
 * Created by Xiaozhe on 2018/4/24.
 */

import java.util.Scanner;

public class RoadLight {
    /**
     * 小Q正在给一条长度为n的道路设计路灯安置方案。
     * 为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示, 不需要照亮的障碍物格子用'X'表示。
     * 小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。
     * 小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。
     * 输入描述:
     * 输入的第一行包含一个正整数t(1 <= t <= 1000), 表示测试用例数
     * 接下来每两行一个测试数据, 第一行一个正整数n(1 <= n <= 1000),表示道路的长度。
     * 第二行一个字符串s表示道路的构造,只包含'.'和'X'
     * <p>
     * 输出描述:对于每个测试用例, 输出一个正整数表示最少需要多少盏路灯。
     * <p>
     * 输入例子:
     * 2
     * 3
     * .X.
     * 11
     * ...XX....XX
     * <p>
     * 输出例子:
     * 1
     * 3
     */

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = 0;
        String s = "";
        int i = 0;
        int j = 0;
        int[] result = new int[t];
        int total = 0;
        if (t > 1000) {
            System.out.println(0);
        }

        for (j = 0; j < t; j++) {
            n = sc.nextInt();
            s = sc.next();

            for (i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (c == '.') {
                    result[j]++;
                    i += 2;

                    if (i >= n) {
                        break;
                    }
                }
            }
        }

        for (i = 0; i < t; i++) {
            System.out.println(result[i]);
        }

        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}
