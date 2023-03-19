
// Write a java program to divide a string in n equal parts.
public class DivideString {
    public static void main(String[] args) {
        String s = "This a sample string";
        int n = 4;
        int part = s.length()/n;
        while(n != 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < part; i++) {
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
            s = s.substring(part);
            n--;
        }
    }
}
