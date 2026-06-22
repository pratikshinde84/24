import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class trial{
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                boolean left=i==0||f[i-1]==0;
                boolean right=i==f.length-1||f[i+1]==0;
                if(left&&right){
                    f[i]=1;
                    count++;
                }
            }
        }
        return count>=n; 
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        ans.add(root.data);
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    void leftBoundary(Node root, ArrayList<Integer> ans){
        if(root==null||root.left==null&&root.right==null){
            return;
        }
        ans.add(root.data);
        if(root.left!=null){
            leftBoundary(root.left,ans);
        }else{
            leftBoundary(root.right,ans);
        }
    }
    void rightBoundary(Node root, ArrayList<Integer> ans){
        if(root==null||root.left==null&&root.right==null){
            return;
        }
        if(root.right!=null){
            rightBoundary(root.right,ans);
        }else{
            rightBoundary(root.left,ans);
        }
        ans.add(root.data);
    }
    void leafNodes(Node root, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            ans.add(root.data);
        }
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    
    public static void main(String[] args) {
        System.out.println(new trial().canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    } 
} 