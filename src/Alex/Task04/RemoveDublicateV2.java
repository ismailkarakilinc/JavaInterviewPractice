package Alex.Task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDublicateV2 {
    public static void main(String[] args) {

        rem("AAABBBCCCDD");
    }

    public static void rem(String str) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        HashSet<String> arr2 = new HashSet<>(arr);
        String result = "";

        for (String each:arr2
             ){
            result += "" + each;
        }
        System.out.println(result);
    }

}
