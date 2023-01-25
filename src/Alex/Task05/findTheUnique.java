package Alex.Task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTheUnique {
    public static void main(String[] args) {

        System.out.println("The unique letter is: " + unique("AAABBBCCCDFFF"));


    }



    public static String unique(String str){
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));


        String result = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = 0; j < list.size() ; j++) {
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            if(count == 1){
                result += list.get(i);
            }
        }

        return result;

    }

/*String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";*/


}
