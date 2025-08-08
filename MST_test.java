/*

Question 2 :

A railway authority is planning to lay railway tracks to connect N cities. Each possible track between two cities has a
certain cost of construction. The goal is to connect all the cities with the minimum total cost, without forming any 
circular routes (cycles).

You are hired as a software engineer to help simulate the minimum cost to connect all cities using railway tracks.
Use Prim's Algorithm to determine the Minimum Spanning Tree (MST) and print the total cost along with the selected
 connections.

Input:

Cities: A, B, C, D, E

Available Tracks and Costs:

A-B: 2
A-C: 3
B-C: 1
B-D: 4
C-D: 5
C-E: 6
D-E: 7

Output :

Selected Edges in MST:

B - C with cost 1
A - B with cost 2
B - D with cost 4
C - E with cost 6

Total Minimum Cost: 13
*/


import java.util.*;

class graph{
    int U,V,W;
    ArrayList<ArrayList<Integer>> g;

    graph(int U, int V, int W){
        this.V = V;
        this.U = U;
        this.W = W;
        // g = new ArrayList<>();
}
public class MST_test {
    // Scanner scan = new Scanner (System.in);
    static char [] city = {'A','B','C','D','E'};
    static void prim (List<List<int []>> adj, int V){
        boolean [] visited = new boolean[V];
        PriorityQueue <graph> pq = new PriorityQueue<>(Comparator.comparing(a -> a.W));
        pq.offer(new graph(0, -1, 0));
        int cost = 0;
        System.out.println("Selected Edges of MST");
        while (!pq.isEmpty()){
            graph current = pq.poll();
            if (visited[current.V]){
                
            }
        }

    }

}
