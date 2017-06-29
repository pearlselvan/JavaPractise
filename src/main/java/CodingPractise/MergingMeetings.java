package CodingPractise;

/**
 * Created by muthuselvan on 6/1/17.
 * https://www.interviewcake.com/question/java/merging-ranges
 *
 * First, we sort our input list of meetings by start time so any meetings that might need to be merged are now next to each other.

 Then we walk through our sorted meetings from left to right. At each step, either:

 We can merge the current meeting with the previous one, so we do.
 We can't merge the current meeting with the previous one, so we know the previous meeting can't be merged with any
 future meetings and we throw the current meeting into mergedMeetings.
 *
 */
public class MergingMeetings {
}
