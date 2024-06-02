package Arrays.Assignment;

public class MaximumPopulation {

    public static void main(String[] args) {
        int[][] arr = {{1993, 1999}, {2000, 2010}};

        int max = maximumPopulation(arr);
        System.out.println(max);
    }

    public static int maximumPopulation(int[][] arr) {

        int[] population = new int[2051]; // Population array from 1950 to 2050

        for (int[] log : arr) {
            population[log[0]]++;
            population[log[1]]--;
        }

        for (int i = 1; i < population.length; i++) {
            population[i] += population[i - 1];
        }

        int maxPopulation = population[1950];
        int maxYear = 1950;

        for (int i = 1951; i < population.length; i++) {
            if (population[i] > maxPopulation) {
                maxPopulation = population[i];
                maxYear = i;
            }
        }

        return maxYear;
    }
}
