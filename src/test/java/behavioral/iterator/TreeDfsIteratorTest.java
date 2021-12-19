package behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeDfsIteratorTest {

    @Test
    void shouldTraverseTree() {
        Tree tree = createTree();
        TreeIterator iterator = tree.createDfsIterator();

        assertEquals(iterator.getNext().getId(), "a");
        assertEquals(iterator.getNext().getId(), "b");
        assertEquals(iterator.getNext().getId(), "c");
        assertEquals(iterator.getNext().getId(), "ba");
        assertEquals(iterator.getNext().getId(), "bb");
        assertEquals(iterator.getNext().getId(), "ca");
        assertEquals(iterator.getNext().getId(), "bba");
        assertEquals(iterator.getNext().getId(), "bbb");
        assertEquals(iterator.getNext().getId(), "caa");

    }

    private Tree createTree() {
        Node root = new Node("a");

        Node b = new Node("b");
        Node ba = new Node("ba");
        Node bb = new Node("bb");

        b.addChild(ba);
        b.addChild(bb);

        Node bba = new Node("bba");
        Node bbb = new Node("bbb");

        bb.addChild(bba);
        bb.addChild(bbb);

        Node c = new Node("c");

        Node ca = new Node("ca");

        c.addChild(ca);

        Node caa = new Node("caa");

        ca.addChild(caa);

        root.addChild(b);
        root.addChild(c);

        return new Tree(root);
    }
}
