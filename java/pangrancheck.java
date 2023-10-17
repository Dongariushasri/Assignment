public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input.toLowerCase());

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Assuming English alphabet (26 letters)
        int alphabetSize = 26;

        // Initialize an array to track the presence of each letter
        boolean[] lettersPresent = new boolean[alphabetSize];

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is an alphabet letter
            if (Character.isLetter(c)) {
                // Mark the corresponding letter as present
                lettersPresent[c - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean isPresent : lettersPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}