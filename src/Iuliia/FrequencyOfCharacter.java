package Iuliia;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    public static void frequencyTest(String str) {


        Map<Character, Integer> frequencyMap = new LinkedHashMap<>(); //we want to keep insertion order
        for (Character each : str.toCharArray()){ // loopnthrough string by turning it into an array
            //if frequencyMap contains the character, I will increase it's value by 1, if not then i will add that
            //key with a value 1 to the map

            if(frequencyMap.containsKey(each)) {
                frequencyMap.put(each, frequencyMap.get(each) + 1);
            }else{
                frequencyMap.put(each,1); //if not then i will add that key with a value1 to the map

            }
            System.out.println("FrequencyMap "+ frequencyMap);

        }
    }

    public static void main(String[] args) {

        frequencyTest("AAABBCDD");
    }
}

