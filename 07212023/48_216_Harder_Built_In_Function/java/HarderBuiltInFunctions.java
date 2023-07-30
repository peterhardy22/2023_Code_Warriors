import java.util.HashSet;

public class HarderBuiltInFunctions {
    public static void main(String[] args) {
        System.out.println(containsKeyword("hello", "goodbye")); //False
        System.out.println(containsKeyword("default", "haha", "lol", "chicken", "alaska")); //True
        System.out.println(containsKeyword("four", "for", "if")); //True
        System.out.println(containsKeyword("blah", "doggo", "crab", "anchor")); //False
        System.out.println(containsKeyword("grizzly", "ignore", "return", "False"));  //True
    }

    public static boolean containsKeyword(String... args) {
        for (String word : args) {
            if (isKeyword(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKeyword(String word) {
        HashSet<String> javaKeywords = new HashSet<>();

        javaKeywords.add("abstract");
        javaKeywords.add("assert");
        javaKeywords.add("boolean");
        javaKeywords.add("break");
        javaKeywords.add("byte");
        javaKeywords.add("case");
        javaKeywords.add("catch");
        javaKeywords.add("char");
        javaKeywords.add("class");
        javaKeywords.add("const"); // Reserved, but not used
        javaKeywords.add("continue");
        javaKeywords.add("default");
        javaKeywords.add("do");
        javaKeywords.add("double");
        javaKeywords.add("else");
        javaKeywords.add("enum");
        javaKeywords.add("exports"); // Java 9 onwards
        javaKeywords.add("extends");
        javaKeywords.add("final");
        javaKeywords.add("finally");
        javaKeywords.add("float");
        javaKeywords.add("for");
        javaKeywords.add("if");
        javaKeywords.add("implements");
        javaKeywords.add("import");
        javaKeywords.add("instanceof");
        javaKeywords.add("int");
        javaKeywords.add("interface");
        javaKeywords.add("long");
        javaKeywords.add("module"); // Java 9 onwards
        javaKeywords.add("native");
        javaKeywords.add("new");
        javaKeywords.add("package");
        javaKeywords.add("private");
        javaKeywords.add("protected");
        javaKeywords.add("public");
        javaKeywords.add("requires"); // Java 9 onwards
        javaKeywords.add("return");
        javaKeywords.add("short");
        javaKeywords.add("static");
        javaKeywords.add("strictfp");
        javaKeywords.add("super");
        javaKeywords.add("switch");
        javaKeywords.add("synchronized");
        javaKeywords.add("this");
        javaKeywords.add("throw");
        javaKeywords.add("throws");
        javaKeywords.add("transient");
        javaKeywords.add("try");
        javaKeywords.add("var"); // Java 10 onwards
        javaKeywords.add("void");
        javaKeywords.add("volatile");
        javaKeywords.add("while");

        return javaKeywords.contains(word);
    }
}
