package pl.marcin.graphimp;

import java.util.ArrayList;
import java.util.List;

public class GraphAsListImpl {
    public static void main(String[] args) {
        List<List<Integer>>graphList = new ArrayList<>();
        for(int i =0; i < graphList.size();i++){
            graphList.add(i,new ArrayList<>());
        }
    }

}
