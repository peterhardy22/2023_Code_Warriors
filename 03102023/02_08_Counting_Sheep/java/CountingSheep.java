// https://www.codewars.com/kata/54edbc7200b811e956000556
// Level 8 kyu

// Directions:
// Consider an array/list of sheep where some sheep may be missing from their place. 
// We need a function that counts the number of sheep present in the array (true means present).

// For example:
// {True,  True,  True,  False,
//   True,  True,  True,  True ,
//   True,  False, True,  False,
//   True,  False, False, True ,
//   True,  True,  True,  True ,
//   False, False, True,  True}
// The correct answer would be 17.

// Hint: Don't forget to check for bad values like null/undefined

// Function
public class CountingSheep {
    
    public static void main(String[] args) {
        String[] sheeps = {"True", "True", "True", "False", 
                            "True", "True", "True", "True", 
                            "True", "False", "True", "False", 
                            "True", "False", "False", "True", 
                            "True", "True", "True", "True", 
                            "False", "False", "True", "True"};
        System.out.println(sheepCounter(sheeps));
    }

    public static int sheepCounter(String[] sheeps) {
        int answer = 0;
        for (int i = 0; i < sheeps.length; i++) {
            if (sheeps[i].equals("True")) {
                answer += 1;
            }
        }
        return answer;
    }

}
