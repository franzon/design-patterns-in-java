package behavioral.iterator;

public class Tree implements IterableStructure {
    private final Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public TreeIterator createDfsIterator() {
        return new TreeDfsIterator(this);
    }

    @Override
    public TreeIterator createBfsIterator() {
        return new TreeBfsIterator(this);
    }
}
