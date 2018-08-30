package _30_days_of_code._22_binary_search_tree;

public interface Tree<D extends Comparable> {
    boolean isEmpty();

    int cardinality();

    boolean member(D element);
}
