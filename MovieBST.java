public class MovieBST {
    private class TreeNode {
        Movie movie;
        TreeNode left, right;
        
        TreeNode(Movie movie) {
            this.movie = movie;
            left = right = null;
        }
    }
    
    private TreeNode root;
    
    public MovieBST() {
        root = null;
    }
    
    public void insert(Movie movie) {
        root = insertRec(root, movie);
    }
    
    private TreeNode insertRec(TreeNode root, Movie movie) {
        if (root == null) {
            root = new TreeNode(movie);
            return root;
        }
        
        int comparison = movie.getTitle().compareToIgnoreCase(root.movie.getTitle());
        
        if (comparison < 0) {
            root.left = insertRec(root.left, movie);
        } else if (comparison > 0) {
            root.right = insertRec(root.right, movie);
        }
        
        return root;
    }
    
    public Movie search(String title) {
        TreeNode result = searchRec(root, title);
        return result != null ? result.movie : null;
    }
    
    private TreeNode searchRec(TreeNode root, String title) {
        if (root == null) return null;
        
        int comparison = title.compareToIgnoreCase(root.movie.getTitle());
        
        if (comparison == 0) {
            return root;
        } else if (comparison < 0) {
            return searchRec(root.left, title);
        } else {
            return searchRec(root.right, title);
        }
    }
    
    public void displayInOrder() {
        System.out.println("\n=== Movies in BST (Alphabetical Order) ===");
        inOrderRec(root);
    }
    
    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.printf("• %s (%.1f/10, %d)\n", 
                            root.movie.getTitle(), root.movie.getRating(), root.movie.getYear());
            inOrderRec(root.right);
        }
    }
}