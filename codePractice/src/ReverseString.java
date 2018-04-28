import java.util.Scanner;

/**
 * 小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
 * 1、将a_i放入b序列的末尾
 * 2、逆置b序列
 * 小易需要你计算输出操作n次之后的b序列。
 * 输入描述:
 * 输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
 * 第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。
 * <p>
 * 输出描述: 在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
 * <p>
 * 输入例子1:
 * 4
 * 1 2 3 4
 * <p>
 * 输出例子: 4 2 1 3
 * Created by Xiaozhe on 2018/4/27.(40%)
 */
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer a = new StringBuffer();
        String result = "";
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < n; i++){
            int temp = sc.nextInt();
            a.append(temp);
        }

        for (int i = 0; i < n; i++){
            b.append(a.charAt(i));
            result = b.reverse().toString();
        }
        String regex = "(.{1})";
        result = result.replaceAll (regex, "$1 ");
        System.out.println(result.substring(0, result.length()-1));

        /**
         * 正确答案
         */
//        while (in.hasNextInt()) {
//            int n = in.nextInt();
//            int[] nums = new int[n];
//            for (int i = 0; i < n; i++) {
//                nums[i] = in.nextInt();
//            }
//            for (int i = n - 1; i >= 0; i -= 2) {     // 前一半从最后一个数开始以2为步长递减
//                System.out.print(nums[i] + " ");
//            }
//            for (int i = n % 2; i < n - 2; i += 2) {  // 后一半根据整数个数的奇偶，分别从第二个或第一个数开始以2为步长递增
//                System.out.print(nums[i] + " ");
//            }
//            System.out.print(nums[n - 2]);  // 最后一个数
//        }
    }
}
