package CodingPractise;

/**
 * Created by muthuselvan on 3/11/17.
 * http://www.sanfoundry.com/java-program-boyer-moore-algorithm/
 * http://www.geeksforgeeks.org/pattern-searching-set-7-boyer-moore-algorithm-bad-character-heuristic/
 * https://dzone.com/articles/algorithm-week-boyer-moore
 *
 *
 *  The Boyer Moore algorithm does preprocessing the pattern
 *  It preporcesses the pattern and creates different arrays
 *  Boyer Moore algorithm starts matching from the last character of the pattern.
 *
 *
 * Maximum of Good-suffix and Bad-Character shifts
 Boyer-Moore needs both good-suffix and bad-character shifts in order to speed up searching performance.
 After a mismatch, the maximum of both is considered in order to move the pattern to the right.

 Complexity
 It’s clear that Boyer-Moore is faster than Morris-Pratt, but actually
 its worst-case complexity is O(n+m).
 The thing is that in natural language search, Boyer-Moore does pretty well.

 */
public class SearchString_BoyerMoore {

}
