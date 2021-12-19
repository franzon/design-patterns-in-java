package behavioral.iterator;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeDfsIterator implements TreeIterator {

    private final Queue<Node> nodes = new ArrayDeque<>();

    public TreeDfsIterator(Tree tree) {
        this.nodes.add(tree.getRoot());
    }

    @Override
    public Node getNext() {
        Node current = nodes.remove();

        nodes.addAll(current.getChildren());

        return current;
    }

    @Override
    public boolean hasMore() {
        return !nodes.isEmpty();
    }

}
