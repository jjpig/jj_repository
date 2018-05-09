import java.util.*;

/**
 * 有一篇文章只包含英文单词，请按它们的出现次数排序，出现最多的先输出；如果出现次数相等的，按字符串ASCII排序升序输出。输出排序前K项
 * 输入描述:
 * <p>
 * 第一行会是行数N ( 0 < N <= 500)
 * 之后N行中的每行第一个字段是数字X (0 <= X <= 500)，表示该行后面有X个单词。数字与单词间，单词与单词间均以空格分隔。
 * N行后会有一行，包含数字K ( 0 < K <= N)
 * 数据总大小不超过100K
 * 输出描述:
 * <单词1><空格><次数1>
 * <单词2><空格><次数2>
 * 输入
 * 3
 * 3 SQL DW AND
 * 1 AND
 * 3 SQL SQL DW
 * 2
 * 输出
 * SQL 3
 * AND 2
 * Created by Xiaozhe on 2018/5/2.
 */
public class EnglishCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int nn = sc.nextInt();
            for (int j = 0; j < nn; j++ ){
                String str = sc.next();
                if(!map.containsKey(str)){
                    map.put(str, 1);
                }else {
                    int count = map.get(str) + 1;
                    map.put(str, count);
                }
            }
        }
        int k = sc.nextInt();
        sc.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<String, Integer> e : list){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
