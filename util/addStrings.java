package util;

import raw.Challenge2_8;

public class addStrings {
    public static void main(String[] args) {
        StringBuilder builder1=new StringBuilder("""
                ["Solution","getRandom","getRandom"]
                """);
        StringBuilder builder2=new StringBuilder("""
                [[[10,1,10,20,100]],[],[]]""");
        //写个循环，每次往builder1的括号里面添加一个"getRandom"，往builder2的括号里面添加一个"[]"
        for (int i = 0; i < 9998; i++) {
            builder1.insert(builder1.indexOf("getRandom")+11,"\"getRandom\",");
            builder2.insert(builder2.indexOf("]")+3,"[],");
        }
        CountStrings.counting(builder2.toString());
        //输出
        System.out.println(builder1);
        System.out.println(builder2);
    }
}
