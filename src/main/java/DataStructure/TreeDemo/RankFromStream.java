package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 6/13/17.
 * TODO : Book : 412 : http://wdxtub.com/interview/14520604447071.html
 * https://github.com/careercup/CtCI-6th-Edition/blob/6d4b829ad8197ad1efcf4c43e4b5428b4892aa4e/Java/Ch%2010.%20Sorting%20and%20Searching/Q10_10_Rank_from_Stream/RankNode.java
 *
 * DS : BinarySearchTree
 *
 */
public class RankFromStream {

    public int left_size = 0;
    public RankFromStream left, right;
    public int data = 0;
    public RankFromStream(int d){
        data = d;
    }

    public void insert(int d){
        if (d < data){
            if (left != null) left.insert(d);
            else left = new RankFromStream(d);
            left_size++;
        }
        else {
            if (right != null) right.insert(d);
            else right = new RankFromStream(d);
        }
    }

    public int getRank(int d){
        if (d == data){
            return left_size;
        }
        else if (d < data){
            if (left == null) return -1;
            else return left.getRank(d);
        }
        else {
            int right_rank = right == null ? -1 : right.getRank(d);
            if (right_rank == -1) return -1;
            else return left_size + 1 + right_rank;
        }
    }
}
