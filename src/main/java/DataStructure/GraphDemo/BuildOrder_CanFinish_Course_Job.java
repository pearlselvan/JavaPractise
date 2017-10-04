package DataStructure.GraphDemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muthuselvan on 9/5/17.
 *
 * Question :
 * =========
 * There are a total of n courses you have to take, labeled from 0 to n - 1.

   Some courses may have prerequisites, for example to take course 0 you have
 to first take course 1, which is expressed as a pair: [0,1]

 Given the total number of courses and a list of prerequisite pairs,
 is it possible for you to finish all courses?

 For example:
 ============

 2, [[1,0]]
 There are a total of 2 courses to take.
 To take course 1 you should have finished course 0. So it is possible.

 2, [[1,0],[0,1]]
 There are a total of 2 courses to take.
 To take course 1 you should have finished course 0,
 and to take course 0 you should also have finished course 1.
 So it is impossible.

 Note :
 ======
 The input prerequisites is a graph represented by a list of edges,
 not adjacency matrices. Read more about how a graph is represented.
 You may assume that there are no duplicate edges in the input prerequisites.

 Code :
 ======
 * https://leetcode.com/problems/course-schedule/description/
 *
 *
 * Solution : (Basically we need detect any cycles in the graph )
 * ----------
 * To solve this problem,
 * I first construct a graph of the dependency relationships.
 * I follow the ordering of the projects in each pair,
 * so that an edge points to the project being depended on.
 *
 * Then my approach was to do a depth-first search on this graph,
 * starting at each of the nodes without ancestors. During this,
 *
 * I maintain an array of the maximum depth for each node,
 * which is the maximum path length to any of the starting nodes for the searches.
 *
 * This accounts for the fact that there may be two paths
 * from the same terminal node
 * that have different lengths.
 *
 * Then once I have a depth assignment for each node in the graph,
 * I have a tiered ordering where all nodes at the same depth can be built
 * in any order. Note that during the search,
 *
 * I also maintain an array of booleans determining whether or not each node
 * is an ancestor of the current node being visited.
 *
 * This is used to detect any cycles in the graph.
 *
 * Big-O :
 * -------
 * Constructing the state arrays is O(N + D),
 * where N is the number of projects and D is the number of dependencies.
 * Then the depth first search visits all N nodes in the graph.
 * Overall, this algorithm is O(N + D) in time and space.
 *
 *
 *
 Hints :
 -------
 This problem is equivalent to finding if a cycle exists in a directed graph.
 If a cycle exists, no topological ordering exists and therefore
 it will be impossible to take all courses.

 Topological Sort via DFS - A great video tutorial (21 minutes) on Coursera explaining the basic concepts of Topological Sort.
 Topological sort could also be done via BFS.
 *
 */
public class BuildOrder_CanFinish_Course_Job {

    public static void main(String[] args) {
//        System.out.println(canFinish(4,new int[][]{{0,1},{1,0},{2,0},{1,2}}));
        System.out.println(canFinish(4,new int[][]{{0,1},{2,3},{3,4},{3}}));

    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] matrix = new int[numCourses][numCourses]; // i -> j
        int[] indegree = new int[numCourses];

        for (int i=0; i<prerequisites.length; i++) {
            int ready = prerequisites[i][0];
            int pre = prerequisites[i][1];
            if (matrix[pre][ready] == 0)
                indegree[ready]++; //duplicate case
            matrix[pre][ready] = 1;
        }

        int count = 0;
        Queue<Integer> queue = new LinkedList();
        for (int i=0; i<indegree.length; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i=0; i<numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0)
                        queue.offer(i);
                }
            }
        }
        return count == numCourses;
    }

}
