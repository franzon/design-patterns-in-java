package behavioral.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TreeBfsIterator implements TreeIterator {

    private final Stack<Node> nodes = new Stack<>();

    public TreeBfsIterator(Tree tree) {
        this.nodes.add(tree.getRoot());
    }

    @Override
    public Node getNext() {
        Node current = nodes.pop();

        List<Node> children = new ArrayList<>(current.getChildren());
        Collections.reverse(children);

        nodes.addAll(children);

        return current;
    }

    @Override
    public boolean hasMore() {
        return !nodes.isEmpty();
    }

}
