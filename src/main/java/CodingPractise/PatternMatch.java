package CodingPractise;

/**
 * Created by muthuselvan on 6/4/17.
 *
 * Question
 * ========
 * Java program for pattern matching where a
    single special character can match one more
    characters
 *
 * Examples:
 * =========
    Input  : str = "ABABABA"
    pat = "A#B#A"
    Output : yes

    Input  : str = "ABCCB"
    pat = "A#B"
    Output : yes

    Input  : str = "ABCABCCE"
    pat = "A#C#"
    Output : yes

    Input  : str = "ABCABCCE"
    pat = "A#C"
    Output : no

    Logic :
    ======
    Given two string, in which one is pattern (Pattern) and other is searching expression.
    Searching expression contains ‘#’.

    The # works in following way:

    A # matches with one or more characters.
    A # matches all characters before a pattern match is found.
   For example if pat = “A#B”, and text is “ACCBB”, then # would match only with “CC” and pattern is considered as not found.

   Impl :
   ======
    We can observe that whenever we encounter ‘#’,
    we have to consider as many characters till the next character of pattern will not be equal to the
    current character of given string.
    Firstly, we check if the current character of pattern is equal to ‘#’-
    a) If not then we check whether the current character of string and pattern are same or not,
        if same, then increment both counters else return false from here only. No need for further checking.
    b) If yes, then we have to find the position of a character in text that matches with next character of pattern.
 *
 */
public class PatternMatch {
    public static void main(String[] args) {
        String str = "ABABABA";
        String pat = "A#B#A";
        if (regexMatch(str, pat))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    // Returns true if pat matches with text.
    public static boolean regexMatch(String text, String pat)
    {
        int lenText = text.length();
        int lenPat = pat.length();

        char[] Text = text.toCharArray();
        char[] Pat = pat.toCharArray();

        // pattern_index is used as an index in pattern
        // and text_index as an index in text.
        int pattern_index=0, text_index=0;

        // Traverse through pattern
        while (pattern_index < lenPat)
        {
            // If current character of pattern is not '#'
            if (Pat[pattern_index] != '#')
            {
                // If does not match with text.
                if (Pat[pattern_index] != Text[text_index])
                    return false;
                // If matches, increment pattern_index and text_index
                pattern_index++;
                text_index++;
            }
            else  // Current character is '#'
            {
                // At least one character
                // must match with #
                text_index++;
                // Match characters with # until
                // a matching character is found.
                while  (Text[text_index] != Pat[pattern_index+1])
                    text_index++;
                // Matching with # is over, move
                // ahead in pattern
                pattern_index++;
            }
        }
        return (text_index == lenText);
    }
}
