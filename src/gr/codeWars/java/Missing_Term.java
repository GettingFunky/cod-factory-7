package gr.codeWars.java;

/**
 * An Arithmetic Progression is defined as one in which there is a constant difference
 * between the consecutive terms of a given series of numbers. You are provided with
 * consecutive elements of an Arithmetic Progression. There is however one hitch:
 * exactly one term from the original series is missing from the set of numbers
 * which have been given to you. The rest of the given series is the same as the original AP.
 * Find the missing term.
 *
 * You have to write a function that receives a list, list size will always
 * be at least 3 numbers. The missing term will never be the first or last one.
 *
 * Example
 * findMissing([1, 3, 5, 9, 11]) == 7
 * PS: This is a sample question of the facebook engineer challenge on interviewstreet.
 * I found it quite fun to solve on paper using math, derive the algo that way.
 * Have fun!
 */

public class Missing_Term {
    public static void main(String[] args) {

      int[] findMissing = {1, 3, 5, 7, 9, 11, 13, 15, 19, 21};
      int sumRule = findMissing[0] + findMissing[findMissing.length - 1];
      int currentSum = 0;
      int sumDif = 0;
      int missingTerm = 0;

      for (int i = 1; i < findMissing.length; i++) {
          currentSum = findMissing[i] + findMissing[findMissing.length - i - 1];
          if (currentSum != sumRule) {
              sumDif = sumRule - currentSum;
              if (sumDif != findMissing[i] - findMissing[i - 1]) {
                  missingTerm = findMissing[i] - sumDif;
              } else missingTerm = findMissing[findMissing.length - i - 1] + sumDif;
              break;
          }
      }
        System.out.println(missingTerm);

    }
}
