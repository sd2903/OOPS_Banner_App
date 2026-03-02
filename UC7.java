public class UC7 {

    public static class CharacterPatternMap {

        // Instance variables
        private final char character;
        private final String[] pattern;


         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap patternObj : patterns) {
            if (patternObj.getCharacter() == ch) {
                return patternObj.getPattern();
            }
        }
        return null;
    }

    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] charPattern = getCharacterPattern(ch, patterns);
                if (charPattern != null) {
                    sb.append(charPattern[row]).append("  ");
                }
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        String[] patternO = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] patternP = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] patternS = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Creating objects of CharacterPatternMap
        CharacterPatternMap objO = new CharacterPatternMap('O', patternO);
        CharacterPatternMap objP = new CharacterPatternMap('P', patternP);
        CharacterPatternMap objS = new CharacterPatternMap('S', patternS);

        // Array of objects
        CharacterPatternMap[] patterns = { objO, objP, objS };

        // Print Banner
        printBanner("OOPS", patterns);
    }
}