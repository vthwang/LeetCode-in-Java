class MapSum {
    private class Node {
        Node[] childs = new Node[26];
        int value;
    }

    private Node root = new Node();

    private int indexForChar(char c) {
        return c - 'a';
    }

    public MapSum() {

    }

    private void insert(String key, Node node, int val) {
        if (node == null) return;
        if (key.length() == 0) {
            node.value = val;
            return;
        }
        int index = indexForChar(key.charAt(0));
        if (node.childs[index] == null) {
            node.childs[index] = new Node();
        }
        insert(key.substring(1), node.childs[index], val);
    }
    
    public void insert(String key, int val) {
        insert(key, root, val);
    }

    private int sum(String prefix, Node node) {
        if (node == null) return 0;
        if (prefix.length() != 0) {
            int index = indexForChar(prefix.charAt(0));
            return sum(prefix.substring(1), node.childs[index]);
        }
        int sum = node.value;
        for (Node child : node.childs) {
            sum += sum(prefix, child);
        }
        return sum;
    }
    
    public int sum(String prefix) {
        return sum(prefix, root);
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */