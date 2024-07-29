// Simple recursion se tle aayega
// Use trie

package Trie;
import java.util.*;
public class WordSearch_II {
	public static class Node {
		char data;
		HashMap<Character, Node> child = new HashMap<>();
		String IsTerminal = null;
	}
	private Node root;
	public static void insert(Node root, String word) {
		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (temp.child.containsKey(ch)) {
				temp = temp.child.get(ch);
			} else {
				Node nn = new Node();
				nn.data = ch;
				temp.child.put(ch, nn);
				temp = nn;
			}
		}
		temp.IsTerminal = word;
	}
	public static void main(String[] args) {
		char[][] board = { { 'o', 'a', 'a', 'n' },
		           { 'e', 't', 'a', 'e' }, 
		           { 'i', 'h', 'k', 'r' },
		           { 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain" };
		Node root = new Node();
		for (String s : words) {
			insert(root, s);
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (root.child.containsKey(board[i][j])) {
					wordSearch(board, i, j, root);
				}
			}
		}
		System.out.println(ll);
		
	}
	
	static List<String> ll = new ArrayList<>();
	public static void wordSearch(char[][] board, int r, int c, Node root) {
		if(r < 0 || c < 0 || r >= board.length || c >= board[0].length || !root.child.containsKey(board[r][c])) {
			return;
		}
		char ch = board[r][c];
		Node current = root.child.get(ch);
		if(current.IsTerminal != null) {
			ll.add(current.IsTerminal);
			current.IsTerminal = null;
		}
		board[r][c] = '*';
		wordSearch(board, r + 1, c, current);
		wordSearch(board, r - 1, c, current);
		wordSearch(board, r, c + 1, current);
		wordSearch(board, r, c - 1, current);
		board[r][c] = ch;
	}
}
