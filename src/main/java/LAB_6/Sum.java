package LAB_6;

public class Sum {
    public static void main(String[] args) {

    }
    public double sum(double[] percentages) {
        double sum=1;
        for (double percentage:percentages){
            sum+= percentage;
        }
        return sum;
    }
}
