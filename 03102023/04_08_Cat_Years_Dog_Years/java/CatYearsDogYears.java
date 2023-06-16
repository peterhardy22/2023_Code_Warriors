// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
// Level 8 kyu

// Directions:
// I have a cat and a dog.
// I got them at the same time as kitten/puppy. That was humanYears years ago.
// Return their respective ages now as [humanYears,catYears,dogYears]

// NOTES:
// humanYears >= 1
// humanYears are whole numbers only

// Cat Years
// 15 cat years for first year
// +9 cat years for second year
// +4 cat years for each year after that

// Dog Years
// 15 dog years for first year
// +9 dog years for second year
// +5 dog years for each year after that

// Function

import java.util.Arrays;

public class CatYearsDogYears {
    
    public static void main(String[] args) {
        int[] answer = catAndDogYears(3);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] catAndDogYears(int humanYears) {
        if (humanYears == 1) {
            return new int[] {1, 15, 15};
        } else if (humanYears == 2) {
            return new int[] {2, 24, 24};
        } else {
            return new int[] {humanYears, 24 + (4 * (humanYears - 2)), 24 + (5 * (humanYears - 2))};
        }
    }

}
