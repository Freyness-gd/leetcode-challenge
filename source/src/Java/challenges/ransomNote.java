package Java.challenges;

import java.util.HashMap;
import java.util.Map;

public class ransomNote {

    public static boolean solution(String ransomNote, String magazine){

        if(ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> mag = new HashMap<>();
        for(char c : magazine.toCharArray()){
            if(!mag.containsKey(c)){
                mag.put(c, 1);
            } else{
                mag.replace(c, mag.get(c)+1);
            }
        }

        for(char c : ransomNote.toCharArray()){
            if(!mag.containsKey(c)) return false;
            if(mag.get(c) == 0) return false;

            mag.replace(c, mag.get(c)-1);
        }

        return true;
    }

}
