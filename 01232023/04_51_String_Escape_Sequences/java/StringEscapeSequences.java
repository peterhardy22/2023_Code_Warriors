public class StringEscapeSequences {
    public static void main(String[] args) {
        // Set the message variable equal to any string containing a new-line escape sequence
        String message = "hello down there \nhello up there";

        // Add a string to the mountains variable that when printed results in: /\/\/\
        // You will need to use an escape sequence more than once!
        String mountains = "/\\/\\/\\";

        // Set the quotation variable to any string that contains an escaped double quotation mark
        String quotation = "\"Hey there!\" Said the dude.";

        System.out.println(message);
        System.out.println(mountains);
        System.out.println(quotation);
    }
}