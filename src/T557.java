import com.sun.deploy.util.StringUtils;

/**
 * Created by asd on 2020/4/5 17:29.
 *
 * 557. 反转字符串中的单词 III
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 */
public class T557 {

    public static void main(String[] args) {
        T557 t = new T557();
        System.out.println(t.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        String splitCharacter = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(splitCharacter)) {
                sb.append(s.charAt(i));
                continue;
            }
            int j = i;
            while ( j < s.length() && !String.valueOf(s.charAt(j)).equals(splitCharacter)) {
                j++;
            }
            j--;
            while(j >= i) {
                sb.append(s.charAt(j--));
            }
            i = sb.length() - 1;
        }
        return sb.toString();
    }

}
