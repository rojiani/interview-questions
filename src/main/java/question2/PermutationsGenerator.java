package question2;


import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class PermutationsGenerator {

    /**
     * Given a List, generate all permutations of that list.
     * The elements in the list will be distinct.
     * The permutations in the returned list can be in any order:
     *
     * e.g., both of these are ok:
     * permutations([1, 2, 3]) -> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
     * permutations([1, 2, 3]) -> [[1, 2, 3], [2, 1, 3], [1, 3, 2], [3, 2, 1], [2, 3, 1], [3, 1, 2]]
     *
     * -------------------------------------------------------------------------------------------------
     * TODO: Add the Big-O time & space complexity of your solution
     * Time complexity:
     * Space complexity:
     *
     *
     * NOTE: I don't care about the runtime or space used here, just that it works (passes test cases).
     * I just want to know that the candidate understands the time/space complexity.
     * -------------------------------------------------------------------------------------------------
     *
     * @param items the list to generate permutations for
     * @return A list containing all permutations of the list.
     */
    public <T> List<List<T>> permutations(List<T> items) {
        // TODO - Write your code here.
        throw new NotImplementedException("TODO");
    }

    /**
     * You can use this to try out your solution (see also test cases in PermutationsGeneratorTest)
     */
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<List<Integer>> permutations = new PermutationsGenerator().permutations(input);
        System.out.println("Permutations of " + input + ":");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }

        System.out.println("Number of permutations: " + permutations.size());
    }
}
