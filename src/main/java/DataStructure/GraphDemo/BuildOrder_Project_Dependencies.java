package DataStructure.GraphDemo;

/**
 * Created by muthuselvan on 9/1/17.
 *
 * Video :
 * --------
 * http://www.byte-by-byte.com/buildorder/
 *
 * Question :
 * ----------
 * 1. Ask the interview , what is the format of input ?
 * let me confirm , is this ok if i maintain the 2D
 * array where index is project and depencies is on their
 * corresponding value
 *
 * 2. What if depenciest contains project which is not
 * available ?
 *
 * 3. cyclic depencies allowed ?
 *
 * Example for ----------
 0:      -------> No dependencies for project 0
 1: 0    -----> project 1 depend on 0
 2: 0    -----> project 2 depend on 0
 3: 1, 2 ------> project 3 depend on 1 and 2
 4: 3    -------> project 4 depend on 3

 Note : Project will be mapped index of the array and value will dependecies

 Declaration for above Example :
 ------------------------------
 * int[][] processes = {
 *     {} , {0} ,{0} ,{1,2} ,{3}
 * } ;
 *
 * String[][] project = {
 *
 * }
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
 * Code :
 * https://github.com/samgh/Byte-by-Byte-Solutions/blob/master/java/BuildOrder.java
 *
 *  Set<Integer> temporaryMarks = new HashSet<Integer>();
    Set<Integer> permanentMarks = new HashSet<Integer>();

    perm :persist throughout for enter process of searchng ..for visited graph..its going to
    already visited or not
    temp : particular recursion you already visited ..if temp then we have cycle ,


 visit : will make temporaryMarks to permanentMarks for visiting the nodes

 Topological sorting :
 for directed acyclic graph(DAG) is a linear ordering of vertices such that
 for every directed edge (u,v ) , vertex u comes before v in the ordering .

 *
 */
public class BuildOrder_Project_Dependencies {

    public static void main(String[] args) {

    }


}
