package week3;

public class ExampleClass {
    // uncomment and set to your package name, if you have one. IntelliJ should suggest the correct name
// package ;


        public void main(String[] args) {

            String username1 = "Jay-Z";
            printWelcome(username1);

            int letters = userNameLetters(username1);
            System.out.println(username1 + ", your name has this many letters: " + letters);  // "Jay-Z" 4

            letters = userNameLettersCharacters(username1);
            System.out.println(username1 + ", Your name has this many letters: " + letters);  // "Jay-Z" 3, does not count the -

            System.out.println();  // empty line
            // Another example name

            String username2 = "Georgia O'Keefe";
            printWelcome(username2);

            letters = userNameLetters(username2);
            System.out.println(username2 + ", your name has this many letters: " + letters);   // "Georgia O'Keefe"  14

            letters = userNameLettersCharacters(username2);
            System.out.println(username2 + ", Your name has this many letters: " + letters);  // "Georgia O'Keefe"  13, does not count the '

        }


        public static void printWelcome(String userName) {
            String message = "Hello, " + userName + "!!!";
            System.out.println(message);
        }


        public static int userNameLetters(String userName) {
            // Remove non-alphabetic characters - we could improve on this,
            // names have ' and - and other non-alphabetic characters.
            String nameWithoutSpaces = userName.replace(" ", "");
            int letterCount = nameWithoutSpaces.length();
            return letterCount;
        }


        public static int userNameLettersCharacters(String userName) {
            // Count the letter characters
            // char is another type in Java that represents one single character
            // it's actually a number type, and stores a unicode value
            char[] characters = userName.toCharArray();  // convert to array of char
            int letterCount = 0;
            for (char c: characters) {
                if (Character.isLetter(c)) {
                    letterCount++;
                }
            }
            return letterCount;
        }


}
