public class SingleLetterCount {
    public static void main(String[] args) {
        System.out.println(singleLetterCount("Hello World", 'h'));
        System.out.println(singleLetterCount("Hello World", 'z'));
        System.out.println(singleLetterCount("Hello World", 'l'));
    }

    public static int singleLetterCount(String inputString, char letter) {
        String lowerStringInput = inputString.toLowerCase(); 
        int counter = 0;   

        for (int i = 0; i < inputString.length(); i++) {
            if (lowerStringInput.charAt(i) == letter) {
                counter += 1;
            }
        }

        return counter;
    }
}
