package util;

public class CountStrings {
    public static void counting(String str) {
        String substring="[]";
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        System.out.println(count);
    }
}
