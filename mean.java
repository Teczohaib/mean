import java.util.Scanner;
public class StandaredDevition{
    public static double caclculateMean(double[] numbers){
        double sum =0.0;
        for(double num:numbers){
            sum+=num;
        }
        return sum/numbers.length;
    }
    public static double caclculateStandardDeviation(double[] numbers){
    double mean=caclculateMean(numbers);
    double sumsquaredDifference=0.0;
    for (double num:numbers){
        sumsquaredDifference+=Math.pow(num-mean,2);
    }
    return Math.sqrt(sumsquaredDifference/numbers.length);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        double[] numbers =new double[n];
        System.out.println("enter the elements");
        for (int i=0;i<n;i++){
            numbers[i]=sc.nextDouble();
        }
        double stdDev= caclculateStandardDeviation(numbers);
        System.out.printf("The Standard Deviation is %.4f%n",stdDev);
        sc.close();
    }
}