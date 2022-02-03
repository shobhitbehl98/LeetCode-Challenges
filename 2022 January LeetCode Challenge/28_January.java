class WordDictionary {
    public class Node {
        boolean isEnd;
        Node[] child;

        Node() {
            this.isEnd = false;
            this.child = new Node[26];
        }
    }

    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.child[word.charAt(i) - 'a'] == null) {
                curr.child[word.charAt(i) - 'a'] = new Node();
            }
            curr = curr.child[word.charAt(i) - 'a'];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Node curr = root;
        if (curr == null)
            return false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                for (int j = 0; j < 26; j++) {
                    if (curr.child[j] != null) {
                        Node op = curr.child[j];
                        if (get(word.substring(i + 1), op))
                            return true;
                    }
                }
                return false;
            } else {
                if (curr.child[word.charAt(i) - 'a'] == null) {
                    return false;
                }
                curr = curr.child[word.charAt(i) - 'a'];
            }
        }

        return curr.isEnd;
    }

    public boolean get(String word, Node x) {
        Node curr = x;
        if (curr == null)
            return false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                for (int j = 0; j < 26; j++) {
                    Node op = curr.child[j];
                    if (get(word.substring(i + 1), op))
                        return true;
                }
                return false;
            } else {
                if (curr.child[word.charAt(i) - 'a'] == null) {
                    return false;
                }
                curr = curr.child[word.charAt(i) - 'a'];
            }
        }

        return curr.isEnd;
    }
}
