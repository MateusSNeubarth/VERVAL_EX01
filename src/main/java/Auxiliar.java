public class Auxiliar {

    public static int calcular(int a, int b) {
        return a + b;
    }

    public static int calculateDifficulty(String problem) {
        String[] symbols = problem.split(" ");

        int totalLength = 0;
        int wordCount = 0;

        for (String symbol : symbols) {
            if (symbol.isEmpty()) {
                continue;
            }

            int end = symbol.length();

            // A word can have a single '.' at the end
            if (symbol.endsWith(".")) {
                end--;
            }

            // Check if all characters (except optional '.') are letters
            boolean isWord = end > 0;

            for (int i = 0; i < end && isWord; i++) {
                char c = symbol.charAt(i);

                if (!((c >= 'A' && c <= 'Z') ||
                        (c >= 'a' && c <= 'z'))) {
                    isWord = false;
                    break;
                }
            }

            if (isWord) {
                totalLength += end;
                wordCount++;
            }
        }

        int average = wordCount == 0 ? 0 : totalLength / wordCount;

        if (average <= 3) {
            return 250;
        } else if (average <= 5) {
            return 500;
        } else {
            return 1000;
        }
    }
}
