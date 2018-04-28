import java.util.Scanner;

public class ExceptThree {

    /**
     * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
     * 并且小Q对于能否被3整除这个性质很感兴趣。
     * 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
     * 输入描述: 输入包括两个整数l和r(1 <= l <= r <= 1e9), 表示要求解的区间两端。
     * 输出描述: 输出一个整数, 表示区间内能被3整除的数字个数。
     * 输入例子1: 2 5
     * 输出例子1: 3
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int length = end - start + 1;
        int cnt = length / 3 * 2;
//         如果剩余最右边一个元素
        if (length % 3 == 1) {
            if (end % 3 == 0 || end % 3 == 2) {
                cnt++;
            }
//            如果剩余最右边的两个元素，以此判断
        } else if (length % 3 == 2) {
            if (end % 3 == 0 || end % 3 == 2) {
                cnt++;
            }
            if ((end - 1) % 3 == 0 || (end - 1) % 3 == 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }
}