package datastructure.tree;

import org.junit.Test;

public class _1_TopViewTest {
    @Test
    public void testTopView() {
        _1_TopView topView = new _1_TopView();
        Node root = topView.insert(null, 1);
        topView.insert(root, 14);
        topView.insert(root, 3);
        topView.insert(root, 7);
        topView.insert(root, 4);
        topView.insert(root, 5);
        topView.insert(root, 15);
        topView.insert(root, 6);
        topView.insert(root, 13);
        topView.insert(root, 10);
        topView.insert(root, 11);
        topView.insert(root, 2);
        topView.insert(root, 12);
        topView.insert(root, 8);
        topView.insert(root, 9);
        topView.topView(root);
    }
}