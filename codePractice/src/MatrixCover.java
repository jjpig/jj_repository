import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
 * 如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
 * 请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。
 * <p>
 * 输入描述:
 * 输入包括五行。
 * 第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
 * 第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
 * 第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
 * 第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
 * 第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。
 * <p>
 * 输出描述: 输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。
 * <p>
 * 输入例子:
 * 2
 * 0 90
 * 0 90
 * 100 200
 * 100 200
 * <p>
 * 输出例子: 2
 * Created by Xiaozhe on 2018/4/25.
 */
class edge implements Comparable {
    Integer left;
    Integer right;
    Integer height;
    Integer value;

    edge(int left, int right, int height, int value) {
        this.left = left;
        this.right = right;
        this.height = height;
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(height, ((edge) o).height);
    }
}

public class MatrixCover { //太难！看不懂！
    public static void main(String[] args) {

        ArrayList<Integer> xAxial = new ArrayList<Integer>();
        ArrayList<edge> allEdges = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] y1 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; ++i) {
            x1[i] = in.nextInt();
            xAxial.add(x1[i]);
        }
        for (int i = 0; i < n; ++i) {
            y1[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            x2[i] = in.nextInt();
            xAxial.add(x2[i]);
        }
        for (int i = 0; i < n; ++i) {
            y2[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < n; ++i) {
            allEdges.add(new edge(x1[i], x2[i], y1[i], 1));
            allEdges.add(new edge(x1[i], x2[i], y2[i], -1));
        }
        Collections.sort(xAxial);
        Collections.sort(allEdges);
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i != xAxial.size() - 1; ++i)
            count.add(0);
        int result = 1;
        for (edge tmp : allEdges) {
            Integer index = xAxial.indexOf(tmp.left);
            while (xAxial.get(index) < tmp.right) {
                count.set(index, count.get(index) + tmp.value);
                if (count.get(index) > result) {
                    result = count.get(index);
                }
                ++index;
            }
        }
        System.out.println(result);
    }
}
