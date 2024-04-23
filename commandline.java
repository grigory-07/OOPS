public class CommandLineSum {
    public static void main(String[] args){
        int totalSum = 0;
        int invalidCount = 0;

        for(String arg : args) {
            try {
                int sum = Integer.parseInt(arg);
                totalSum += sum;
            }catch (NumberFormatException e){
                invalidCount++;
            }

        }
        System.out.println("Sum of valid integers: "+totalSum);
        System.out.println("Number of invalid integers entered: "+invalidCount);
    }
}
