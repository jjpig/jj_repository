import java.util.*;

/**
 * 小易将n个棋子摆放在一张无限大的棋盘上。第i个棋子放在第x[i]行y[i]列。同一个格子允许放置多个棋子。每一次操作小易可以把一个棋子拿
 * 起并将其移动到原格子的上、下、左、右的任意一个格子中。小易想知道要让棋盘上出现有一个格子中至少有i(1 ≤ i ≤ n)个棋子所需要的最
 * 少操作次数.
 * <p>
 * 输入描述:
 * 输入包括三行,第一行一个整数n(1 ≤ n ≤ 50),表示棋子的个数
 * 第二行为n个棋子的横坐标x[i](1 ≤ x[i] ≤ 10^9)
 * 第三行为n个棋子的纵坐标y[i](1 ≤ y[i] ≤ 10^9)
 * <p>
 * 输出描述: 输出n个整数,第i个表示棋盘上有一个格子至少有i个棋子所需要的操作数,以空格分割。行末无空格
 * <p>
 * 如样例所示:
 * 对于1个棋子: 不需要操作
 * 对于2个棋子: 将前两个棋子放在(1, 1)中
 * 对于3个棋子: 将前三个棋子放在(2, 1)中
 * 对于4个棋子: 将所有棋子都放在(3, 1)中
 * <p>
 * 输入例子:
 * 4
 * 1 2 4 9
 * 1 1 1 1
 * <p>
 * 输出例子: 0 1 3 10
 * Created by Xiaozhe on 2018/4/27.
 * <p>
 * 暴力枚举法居然过了，关键在于，最后堆棋子的那个格子，横纵坐标必然在棋子初始的横纵坐
 * 标中间
 * 用反证法，xy轴其实是独立的，先只考虑x坐标，假设把k个棋子堆到x0格子所用的步骤最少，
 * a个棋子初始在x0的左边，b个棋子初始在x0的右边，且a>b,那么必然存在横坐标为x0-1的格
 * 子，这k个棋子到x0-1的步数会更少，b>a的情况，那么x0+1的目标将比x0更优，至于a=b，
 * x0-1 和x0的步数是一样的。因此，最终汇聚棋子的x坐标只要在棋子初始的x个坐标中考虑
 */
public class ChessPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xi = new int[n];
        int[] yi = new int[n];

        for (int i = 0; i < n; i++) {
            xi[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            yi[i] = sc.nextInt();
        }

        sc.close();

        List<Long> res = new ArrayList<>();
        long min, sum;
        for (int i = 1; i <= n; i++) {
            min = Long.MAX_VALUE;
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    sum = 0;
                    PriorityQueue<Integer> pq = new PriorityQueue<>(i, new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o2 - o1;
                        }
                    });
                    for (int c = 0; c < n; c++) {
                        int xc = xi[c];
                        int yc = yi[c];
                        int distance = Math.abs(xc - xi[row]) + Math.abs(yc - yi[col]);
                        sum += distance;
                        pq.add(distance);
                        if (pq.size() > i) {
                            sum -= pq.poll();
                        }
                    }
                    min = Math.min(min, sum);
                }
            }
            res.add(min);
        }
        for (int i = 0; i < n - 1; i++) System.out.print(res.get(i) + " ");
        System.out.println(res.get(n - 1));
    }
}
