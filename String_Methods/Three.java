package String_Methods;

import java.util.StringJoiner;

//String concat
public class Three {
    public static void main(String[] args) {

        System.out.println(40 + 40 + "Swaroop" + 40 + 40);// 80Swaroop4040
        // After a string literal, all the + will be treated as string concatenation
        // operator.

        String s1 = "A";
        String s2 = "B";
        System.out.println(s1.concat(s2));

        String res = String.format("%s%s", s1, s2);
        System.out.println(res);

        StringBuilder s3 = new StringBuilder("Swaroop");
        StringBuilder s4 = new StringBuilder(" Acharya");
        System.out.println(s3.append(s4));

        StringJoiner obj = new StringJoiner(","); // , is delimeter
        obj.add("HeLLOW");
        obj.add("Swaroop");
        obj.add("Acharya");
        System.out.println(obj.toString());

    }
}
