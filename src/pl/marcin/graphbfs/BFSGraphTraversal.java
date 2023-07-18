package pl.marcin.graphbfs;

import java.util.*;

public class BFSGraphTraversal {
    public static void main(String[] args) {
        List<List<Integer>>dataList = new ArrayList<>();
        createDataList(dataList);

        List<Integer>BFSans = new ArrayList<>();
        int visited[] = new int[dataList.size()];
        Queue<Integer>queue = new LinkedList<>();
        Arrays.fill(visited,0);
        visited[1]=1;
        queue.add(1);

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
        System.out.println(BFSans);

    }
    public static void createDataList(List<List<Integer>>dataList){
        for(int i =0; i <=9;i++)
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
