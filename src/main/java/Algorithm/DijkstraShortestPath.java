package Algorithm;

/**
 * Created by muthuselvan on 3/13/17.
 * http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
 * http://www.geeksforgeeks.org/greedy-algorithms-set-6-dijkstras-shortest-path-algorithm/
 *
 * Question ?
 * -----------
 * Given a graph and a source vertex in graph,
 * find shortest paths from source to all vertices in the given graph.
 *
 *
 */
public class DijkstraShortestPath {

    public static void main(String[] args) {
         /* Let us create the example graph discussed above */
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };



    }
}
