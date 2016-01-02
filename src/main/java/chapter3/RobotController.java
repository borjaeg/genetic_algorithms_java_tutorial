package chapter3;

/**
 * Created by b3j90 on 02/01/16.
 */
public class RobotController {

    public static int maxGenerations = 1000;

    public static void main(String[] args){

        Maze maze = new Maze(new int[][]{
                { 0, 0, 0, 0, 1, 0, 1, 3, 2 },
                { 1, 0, 1, 1, 1, 0, 1, 3, 1 },
                { 1, 0, 0, 1, 3, 3, 3, 3, 1 },
                { 3, 3, 3, 1, 3, 1, 1, 0, 1 },
                { 3, 1, 3, 3, 3, 1, 1, 0, 0 },
                { 3, 3, 1, 1, 1, 1, 0, 1, 1 },
                { 1, 3, 0, 1, 3, 3, 3, 3, 3 },
                { 0, 3, 1, 1, 3, 1, 0, 1, 3 },
                { 1, 3, 3, 3, 3, 1, 1, 1, 4 }
        });

        int populationSize = 200;
        double crossoverRate = 0.75;
        double mutationRate = 0.1;
        int elitismCount = 0;


        GeneticAlgorithm ga = new GeneticAlgorithm(populationSize, crossoverRate, mutationRate, elitismCount);
        Population population = ga.initPopulation(128);

        int generation = 1;

        // Start evolution loop
        while (true){

            // Print fittest individual from population

            // Apply crossover

            // Apply mutation

            // Evaluate population
            generation++;
        }


    }

}
