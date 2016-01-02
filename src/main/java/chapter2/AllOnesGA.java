package chapter2;

/**
 * Created by b3j90 on 02/01/16.
 */
public class AllOnesGA {

    public static void main(String[] args) {

        int populationSize = 100;
        double mutationRate = 0.01;
        double crossoverRate = 0.95;
        int elitismCount = 0;

        // Create GA object
        GeneticAlgorithm ga = new GeneticAlgorithm(populationSize, mutationRate, crossoverRate, elitismCount);

        // Initialize population
        Population population = ga.initPopulation(50);
        ga.evalPopulation(population);
        int generation = 1;

        while (ga.isTerminationConditionMet(population) == false){
            System.out.println("Best Solution: " +
                    population.getFittest(0).toString());

            // Apply crossover
            population = ga.crossoverPopulation(population);


            // Apply mutation
            population = ga.mutatePopulation(population);

            // Evaluate population
            ga.evalPopulation(population);

            // Increment the current iteration
            generation ++;
        }

        System.out.println("Found solution in " + generation + " generations");
        System.out.println("Best solution: " + population.getFittest(0).toString());
    }
}
