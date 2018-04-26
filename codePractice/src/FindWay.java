import java.util.Scanner;

/**
 * Created by Xiaozhe on 2018/4/25.
 */
enum  WAY {
    N("N", 0),W("W", 1),S("S", 2),E("E", 3);

    private String name;
    private int index;

    WAY(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public static String getName(int index) {
        for (WAY w : WAY.values()) {
            if (w.getIndex() == index) {
                return w.name;
            }
        }
        return null;
    }
}
public class FindWay {
    /**
     * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
     * 输入描述:
     * 每个输入包含一个测试用例。
     * 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
     * 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
     * <p>
     * 输出描述:
     * 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
     * <p>
     * 输入例子1:
     * 3
     * LRR
     * <p>
     * 输出例子1:
     * E
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int i = 0;
        int result = 0;

        for (i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(i != n-1 && s.charAt(i+1) != c){
                i++;
                continue;
            }
            switch (c) {
                case 'L':
                    if(result == 3){
                        result = 0;
                    }else {
                        result++;
                    }
                    break;
                case 'R':
                    if(result == 0){
                        result = 3;
                    }else {
                        result--;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println(WAY.getName(result));
    }
}
