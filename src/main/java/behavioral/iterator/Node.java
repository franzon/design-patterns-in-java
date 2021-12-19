package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final List<Node> children = new ArrayList<>();
    private final String id;

    public Node(String id) {
        this.id = id;
    }

    public void addChild(Node node) {
        children.add(node);
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public List<Node> getChildren() {
        return children;
    }

    public String getId() {
        return id;
    }
}
