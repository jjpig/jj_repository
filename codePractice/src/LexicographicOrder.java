import java.util.Scanner;

/**
 * 在数据加密和数据压缩中常需要对特殊的字符串进行编码。给定的字母表A由26个小写英文字母组成，即A={a, b...z}。该字母表产生的长序
 * 字符串是指定字符串中字母从左到右出现的次序与字母在字母表中出现的次序相同，且每个字符最多出现1次。例如，a，b，ab，bc，xyz等字
 * 符串是升序字符串。对字母表A产生的所有长度不超过6的升序字符串按照字典排列编码如下：a(1)，b(2)，c(3)……，z(26)，ab(27)，
 * ac(28)……对于任意长度不超过16的升序字符串，迅速计算出它在上述字典中的编码。
 * <p>
 * 输入描述:第1行是一个正整数N，表示接下来共有N行，在接下来的N行中，每行给出一个字符串。
 * <p>
 * 输出描述:输出N行，每行对应于一个字符串编码。
 * 输入
 * 3
 * a
 * b
 * ab
 * 输出
 * 1
 * 2
 * 27
 * Created by Xiaozhe on 2018/5/2.
 */
public class LexicographicOrder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();


    }
}
