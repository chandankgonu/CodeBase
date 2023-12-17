package com.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS {
    class Edge{
        int src;
        int des;

        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }

//create graph

public void createGraph(ArrayList<Edge> graph[]){
    for(int i=0; i< graph.length;i++)
       graph[i] = new ArrayList<>();
}

//add edge in graph

public void addEdge(ArrayList<Edge> graph[], int src, int des){
    graph[src].add(new Edge(src, des));
}



//BFS on graphc

public void bfs(ArrayList<Edge> graph[], int curr){
    boolean visited[] = new boolean[graph.length];

    
    Queue<Integer> queue = new LinkedList<>();

    queue.add(curr);

    while(!queue.isEmpty()){
        int data = queue.remove();
        System.out.println(data);
        if(!visited[curr]){
            visited[curr] = true;
            for(Edge edge : graph[data]){
               
                queue.add(edge.des);
            }
        }
    }

}




    public static void main(String args[]){

        ArrayList<Edge> graph[] = new ArrayList[5];
        BFS bfs = new BFS();
        bfs.createGraph(graph);

       
        bfs.addEdge(graph, 0, 2);
        bfs.addEdge(graph, 1, 2);
        bfs.addEdge(graph, 1, 3);


        bfs.addEdge(graph, 2, 0);
        bfs.addEdge(graph, 2, 1);
        bfs.addEdge(graph, 2, 3);

        bfs.addEdge(graph, 3, 1);
        bfs.addEdge(graph, 3, 2);

        bfs.bfs(graph, 0);
    }
}