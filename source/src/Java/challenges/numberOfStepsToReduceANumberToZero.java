package Java.challenges;

public class numberOfStepsToReduceANumberToZero
{
    public static int numberOfSteps(int num){

        int steps = 0;
        while(num != 0) { num = num%2==0 ? num/2 : num- 1; steps++; }

        return steps;
    }

}
