/**
 * 树类
 *
 * @author Mean
 */
public class Tree implements Comparable<Tree> {
    /**
     * 根节点
     */
    protected Node root;
    /**
     * 所有叶节点的权值之和
     */
    protected int weight;

    public Tree() {
    }

    /**
     * 字符及其频次构建一颗无子节点的树
     *
     * @param character 字符（字节）
     * @param weight    权值
     */
    public Tree(byte character, int weight) {
        root = new Node(character, weight);
        this.weight = weight;
    }

    /**
     * 以两个节点作为子节点构造新节点
     *
     * @param left  左子节点
     * @param right 右子节点
     */
    public Tree(Tree left, Tree right) {
        root = new Node(left.getRoot(), right.getRoot());
        weight = root.getWeight();
    }

    public Node getRoot() {
        return root;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Tree o) {
        return weight - o.getWeight();
    }
}
