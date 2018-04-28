import java.util.Scanner;

/**
 * 如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
 * 小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。
 * 输入描述: 输入包括字符串s,s的长度length(1 ≤ length ≤ 50),字符串中只包含'0'和'1'
 * <p>
 * 输出描述: 输出一个整数,表示最长的满足要求的子串长度。
 * <p>
 * 输入例子: 111101111
 * <p>
 * 输出例子: 3
 * Created by Xiaozhe on 2018/4/27.
 */
public class Cross01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        if(length > 50){
            System.out.println(0);
        }

        int temp = 0;
        int result = 0;
        for (int i = 0; i < length - 1; i++){
            char c = s.charAt(i);
            if(c == s.charAt(i + 1)){
                if(temp+ 1 > result){
                    result = temp + 1;
                }
                temp = 0;
            }else{
                temp++;
                if(i == length - 2){
                    if(temp + 1 > result){
                        result = temp + 1;
                    }
                }
            }
        }

        System.out.println(result);

    }
}
