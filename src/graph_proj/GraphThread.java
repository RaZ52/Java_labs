package graph_proj;
import graph_proj.GraphClient;

import java.util.ArrayList;

/**
 * Created by Admin on 12/13/2017 at 10:57 AM
 **/
public class GraphThread extends Thread {
    private int graphIndex;
    private ArrayList<Graph> G = new ArrayList<Graph>();

    public GraphThread(int graphIndex, ArrayList<Graph> G){
        this.graphIndex = graphIndex;
        this.G = G;
    }

    @Override
    public void run(){
        StdOut.println("vertex of maximum degree = " + GraphClient.maxDegree(G.get(graphIndex)) + " Client_ID = " + graphIndex);
        StdOut.println("average degree           = " + GraphClient.avgDegree(G.get(graphIndex)) + " Client_ID = " + graphIndex);
        StdOut.println("number of self loops     = " + GraphClient.numberOfSelfLoops(G.get(graphIndex)) + " Client_ID = " + graphIndex);
    }
}
