import java.util.Scanner;

/**
 * CC里面有一个土豪很喜欢一位女直播Kiki唱歌，平时就经常给她点赞、送礼、私聊。最近CC直播平台在举行中秋之星主播唱歌比赛，假设一开
 * 始该女主播的初始人气值为start， 能够晋升下一轮人气需要刚好达到end，土豪给主播增加人气的可以采取的方法有：
 * a. 点赞 花费x C币，人气 + 2
 * b. 送礼 花费y C币，人气 * 2
 * c. 私聊 花费z C币，人气 - 2
 * 其中 end 远大于start且end为偶数， 请写一个程序帮助土豪计算一下，最少花费多少C币就能帮助该主播Kiki将人气刚好达到end，从而能
 * 够晋级下一轮？
 * 输入描述:
 * 第一行输入5个数据，分别为：x y z start end，每项数据以空格分开。
 * 其中：0＜x, y, z＜＝10000， 0＜start, end＜＝1000000
 * 输出描述: 需要花费的最少C币。
 * 输入：3 100 1 2 6
 * 输出：6
 * Created by Xiaozhe on 2018/5/2.
 */
public class MoneyCalculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();


    }
}
