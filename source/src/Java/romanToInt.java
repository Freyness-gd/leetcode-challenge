package Java;

public class romanToInt {

    public static int solution(String s) {

        char lastChar = '0';
        int result = 0;


        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            if(lastChar =='I' && c=='V'){
                result += 3;
            }
            else if(lastChar =='I' && c=='X'){
                result += 8;
            }
            else if(lastChar=='X' && c=='L'){
                result += 30;
            }
            else if(lastChar=='X' && c=='C'){
                result += 80;
            }
            else if(lastChar=='C' && c=='D'){
                result += 300;
            }
            else if(lastChar=='C' && c=='M'){
                result += 800;
            }
            else if(c =='I') result += 1;
            else if(c=='X') result += 10;
            else if(c=='V') result += 5;
            else if(c=='L') result += 50;
            else if(c=='C') result += 100;
            else if(c=='D') result += 500;
            else if(c=='M') result += 1000;

            lastChar = c;

        }

        return result;

    }

}
