public class Main {
    public static void main(String[] args) {
        int[] input1 = {7,1,5,3,6,4};
        int output1 = 5;

        int[] input2 = {7,6,4,3,1};
        int output2 = 0;

        System.out.println("\nTwoPointerSolution");
        System.out.println(TwoPointerSolution.maxProfit(input1) == output1);
        System.out.println(TwoPointerSolution.maxProfit(input2) == output2);

        System.out.println("\nOptimizedSolution");
        System.out.println(OptimizedSolution.maxProfit(input1) == output1);
        System.out.println(OptimizedSolution.maxProfit(input2) == output2);

    }
}