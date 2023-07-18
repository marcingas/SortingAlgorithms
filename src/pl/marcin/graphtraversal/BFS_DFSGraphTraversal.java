package pl.marcin.graphtraversal;

import java.util.*;

public class BFS_DFSGraphTraversal {
    public static void main(String[] args) {
        List<List<Integer>>dataList = new ArrayList<>();

        int startingNode = 1;
        int numOfNodes = 9;

        createDataList(dataList,numOfNodes);

       System.out.println(BFSTraverse(dataList,startingNode));

        dfsTraverse(dataList, startingNode, numOfNodes);


    }

    private static void dfsTraverse(List<List<Integer>> dataList, int startingNode, int numOfNodes) {
        int [] visited = new int[numOfNodes +1];
        List<Integer>ans = new ArrayList<>();
        Arrays.fill(visited,0);
        dfsRecurence(dataList, startingNode,ans,visited);
        System.out.println(ans);
    }

    private static void dfsRecurence(List<List<Integer>>dataList, int node, List<Integer>ans, int[] visited){
        ans.add(node);
        visited[node]=1;
        for(var el : dataList.get(node)){
            if(visited[el]==0)
            dfsRecurence(dataList,el,ans,visited);
        }



    }

    private static List<Integer> BFSTraverse(List<List<Integer>> dataList, int startingNode) {
        List<Integer>BFSans = new ArrayList<>();
        int visited[] = new int[dataList.size()];
        Queue<Integer>queue = new LinkedList<>();
        Arrays.fill(visited,0);
        visited[startingNode]=1;
        queue.add(startingNode);

        while (!queue.isEmpty()){
            int node = queue.poll();
            BFSans.add(node);
            for(var el: dataList.get(node)){
                if(visited[el]==0){
                    visited[el]=1;
                    queue.add(el);
                }
            }
        }
        return BFSans;
    }

    public static void createDataList(List<List<Integer>>dataList, int numOfNodes){
        for(int i =0; i <=numOfNodes;i++)
            dataList.add(new ArrayList<>());

        dataList.get(1).add(2);
        dataList.get(1).add(6);
        dataList.get(2).add(1);
        dataList.get(2).add(3);
        dataList.get(2).add(4);
        dataList.get(3).add(2);
        dataList.get(4).add(2);
        dataList.get(4).add(5);
        dataList.get(5).add(4);
        dataList.get(5).add(8);
        dataList.get(6).add(1);
        dataList.get(6).add(7);
        dataList.get(6).add(9);
        dataList.get(7).add(8);
        dataList.get(7).add(6);
        dataList.get(8).add(7);
        dataList.get(8).add(5);
        dataList.get(9).add(6);
    }
}
