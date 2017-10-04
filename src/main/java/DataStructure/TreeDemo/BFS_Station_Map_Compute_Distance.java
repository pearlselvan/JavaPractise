package DataStructure.TreeDemo;


/**
 * Created by muthuselvan on 7/10/17.
 *
 * https://tutorialedge.net/post/general/artificial-intelligence/breadth-first-search-java/
 *
 *How it Works ?
 =============
 Say we had a map of the London Underground, each station would represent a node which would itself
 have a smaller list of stations that are directly connected to it.

 The entire map of the London Underground represents our Graph and each of the stations on that graph represent a node.

 For example:
 ------------
 take Westminster station for example. This station could be represented as a node which would have: STATION 1, STATION 2 and STATION 3
 in its list of child nodes.


 Summary :
 ~~~~~~~~~

 Whilst Breadth First Search can be useful in graph traversal algorithms,


 Ref :
 =====
 Breadth First graph traversal algorithms also happen to be very computationally demanding
 in the way that they calculate the shortest path. Take for instance if we have a binary tree of depth 10.
 The binary tree contains nodes which contain a maximum of 2 child nodes each,
 this is otherwise known as having a branching factor equal to 2.
 if we wanted to compute the optimal path for this graph then we would have to traverse,
 in a worst case scenario, 512 distinct nodes. Given that on modern machines this isn’t exactly what we would consider demanding,
 imagine if we had a new graph that had 3 child nodes for every node and the same depth of 10.
 With this new graph we would have to traverse, in a worst case scenario, 19,683 different nodes.
 And given that this is only at depth 10 with 3 child nodes, you can easily extrapolate the numbers for yourself.
 With a branching factor of 10 and a depth of 16, it would take 350 years to compute the solution on an ordinary personal computer,
 give or take.

 https://tutorialedge.net/post/general/artificial-intelligence/breadth-first-search-java/

 *
 *
 *
 *
 *
 */
public class BFS_Station_Map_Compute_Distance {
}
