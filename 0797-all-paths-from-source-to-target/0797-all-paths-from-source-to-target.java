class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>results= new ArrayList<>();
        List<Integer>path= new ArrayList<>();
       
       path.add(0);
       dfs(graph,0, graph.length-1,path,results);
       return results;
        
    }
    private void dfs(int[][] graph, int curr, int target, List<Integer>path , List<List<Integer>>results){
        if(curr ==target){
            results.add(new ArrayList<>(path));
            return ;
        }
        for(int nextNode :graph[curr]){
            path.add(nextNode);
            dfs(graph, nextNode, target, path,results);
            path.remove(path.size()-1);
        }
        
    }

}