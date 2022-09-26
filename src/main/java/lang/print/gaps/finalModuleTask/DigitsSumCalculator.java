package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int answer = 0;
        while(number > 0) {
            answer +=  number % 10;
            number /= 10;
        }
        System.out.println(answer);
    }
}
