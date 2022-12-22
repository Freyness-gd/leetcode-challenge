package Java;

public class longestCommonPrefix {

    public static String solution(String[] strs) {

        int length = strs.length;
        StringBuilder s = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        if(length == 1) return strs[0];

        for(int i = 0; i < length; i++){
            if(strs[i].length() < minLength) minLength = strs[i].length();
        }

        for(int i = 0; i < minLength; i++){

            char c = strs[0].charAt(i);

            for(int j = 1; j < length; j++){
                if(!(strs[j].charAt(i) == c)) return s.toString();
                else if(j == length - 1 && strs[j].charAt(i) == c) s.append(c);
            }
        }

        return s.toString();
    }

}
