package pekan9_2511533021;

import java.util.*;

public class GraphTraversal_2511533021 {
    private Map<String, List<String>> graph_3021 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1, String node2) {
        graph_3021.putIfAbsent(node1, new ArrayList<>());
        graph_3021.putIfAbsent(node2, new ArrayList<>());
        graph_3021.get(node1).add(node2);
        graph_3021.get(node2).add(node1);
    }

    // Menampilkan graf awal
    public void printGraph_3021() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3021 : graph_3021.keySet()) {
            System.out.print(node_3021 + " -> ");
            List<String> neighbors_3021 = graph_3021.get(node_3021);
            System.out.println(String.join(", ", neighbors_3021));
        }
        System.out.println();
    }

    // DFS Rekursif
    public void dfs_3021(String start_3021) {
        Set<String> visited_3021 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_3021(start_3021, visited_3021);
        System.out.println();
    }

    private void dfsHelper_3021(String current_3021, Set<String> visited_3021) {
        if (visited_3021.contains(current_3021))
            return;

        visited_3021.add(current_3021);
        System.out.print(current_3021 + " ");

        for (String neighbor_3021 : graph_3021.getOrDefault(current_3021, new ArrayList<>())) {
            dfsHelper_3021(neighbor_3021, visited_3021);
        }
    }

    // BFS Iteratif
    public void bfs_3021(String start_3021) {
        Set<String> visited_3021 = new HashSet<>();
        Queue<String> queue_3021 = new LinkedList<>();

        queue_3021.add(start_3021);
        visited_3021.add(start_3021);

        System.out.println("Penelusuran BFS:");

        while (!queue_3021.isEmpty()) {
            String current_3021 = queue_3021.poll();
            System.out.print(current_3021 + " ");

            for (String neighbor_3021 : graph_3021.getOrDefault(current_3021, new ArrayList<>())) {
                if (!visited_3021.contains(neighbor_3021)) {
                    queue_3021.add(neighbor_3021);
                    visited_3021.add(neighbor_3021);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511533021 graph_3021 = new GraphTraversal_2511533021();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_3021.addEdge("A", "B");
        graph_3021.addEdge("A", "C");
        graph_3021.addEdge("B", "D");
        graph_3021.addEdge("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah:");
        graph_3021.printGraph_3021();

        // Lakukan penelusuran
        graph_3021.dfs_3021("A");
        graph_3021.bfs_3021("A");
    }
}