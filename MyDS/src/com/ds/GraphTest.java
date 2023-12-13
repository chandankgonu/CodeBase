package com.ds;

import java.util.ArrayList;

public class GraphTest {
    
    class Edge{
        int source;
        int dest;

        Edge(int source, int dest){
            this.source = source;
            this.dest = dest;
        }
    }
    //create graph

    private static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length;i++)
           graph[i] = new ArrayList<>();  

    }

    //add edge in graph
    private void addEdge(ArrayList<Edge> graph[], int sour, int dist){
        graph[sour].add(new Edge(sour, dist));
    }
    //print graph

    private static void printGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
          for(int j=0; j< graph[i].size();j++){
            Edge edge = graph[i].get(j);

            System.out.println("Source : "+ edge.source + "  Distination : "+ edge.dest);
          }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);

        GraphTest gt = new GraphTest();
        gt.addEdge(graph, 0, 2);
        gt.addEdge(graph, 1, 2);
        gt.addEdge(graph, 1, 3);


        gt.addEdge(graph, 2, 0);
        gt.addEdge(graph, 2, 1);
        gt.addEdge(graph, 2, 3);

        gt.addEdge(graph, 3, 1);
        gt.addEdge(graph, 3, 2);

        printGraph(graph);
        

    }
    
}
