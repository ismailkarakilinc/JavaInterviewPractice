package Alex.Task04;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {
rem("AAABBBCCCDD");
    }

    public static void rem(String str) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (String each : arr) {
            if (!result.contains(each)) {
                result += "" + each;
            }
        }
        System.out.println(result);
    }

}
