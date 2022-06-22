// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    
    public static ArrayList<String> findPath(int[][] m, int n) {
          ArrayList<String> ans = new ArrayList<>();
       
       if(m[0][0] == 0 || m[n-1][n-1]==0){
           return ans;
       }
       else {
       
       int scrx = 0;
       int scry = 0;
       
       int[][] visited = new int[n][n];
       String path = "";
       
       for(int i =0; i<n;i++){
           for(int j =0; j<n ;j++){
               visited[i][j] = 0;
           }
       }
       
       
       solve(visited, n , m, scrx, scry, path, ans);
       Collections.sort(ans);
       return ans;
       
       }}
    
    public static boolean isSafe(int[][]m , int[][]visited , int i , int j , int n){
        return (i>=0 && i<n && j>=0 && j<n && visited[i][j]==0 && m[i][j]==1);
    }
    public static void solve(int[][] visited , int n , int[][] m , int i , int j, String path ,  ArrayList<String> ans){
        if(i==n-1 && j==n-1){
            ans.add(path);
            return ;
        }
        if(isSafe(m,visited,i,j,n)){
            visited[i][j] = 1;
            // go down
           solve(visited , n , m , i+1 , j , path+'D', ans);
           
           // go left
          solve(visited , n , m , i, j-1 , path+'L', ans);
           // go right
            solve(visited , n , m , i , j+1 , path+'R', ans);
           // go up
           solve(visited , n , m , i-1 , j , path+'U', ans);
           visited[i][j] = 0;
        }
    }
}