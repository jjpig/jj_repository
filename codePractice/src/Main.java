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

public class Main {

    private static void myFunction() {
        //        输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dpi = new int[n][2];
        int[] ai = new int[m];

        for (int i = 0; i < n; i++) {
            dpi[i][0] = sc.nextInt();
            dpi[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ai[i] = sc.nextInt();
        }

//        功能
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            result[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ai[i] >= dpi[j][0] && result[i] < dpi[j][1]) {
                    result[i] = dpi[j][1];
                }
            }
        }

//        输出
        for (int i = 0; i < m; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        myFunction();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}
