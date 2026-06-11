package Pekan9_2511533021;

import java.util.*;

public class Graph_2511533021 {

    private Map<String, List<String>> graph_3021 = new HashMap<>();

    public void addEdge_3021(String source_3021, String destination_3021) {

        graph_3021.putIfAbsent(source_3021, new ArrayList<>());
        graph_3021.putIfAbsent(destination_3021, new ArrayList<>());

        graph_3021.get(source_3021).add(destination_3021);
        graph_3021.get(destination_3021).add(source_3021);
    }

    public Map<String, List<String>> getGraph_3021() {
        return graph_3021;
    }

    public List<String> BFS_3021(String start_3021, String goal_3021) {

        Queue<String> queue_3021 = new LinkedList<>();
        Set<String> visited_3021 = new HashSet<>();
        Map<String, String> parent_3021 = new HashMap<>();

        queue_3021.add(start_3021);
        visited_3021.add(start_3021);

        while (!queue_3021.isEmpty()) {

            String current_3021 = queue_3021.poll();

            if (current_3021.equals(goal_3021)) {
                break;
            }

            for (String neighbor_3021 : graph_3021.get(current_3021)) {

                if (!visited_3021.contains(neighbor_3021)) {

                    visited_3021.add(neighbor_3021);
                    parent_3021.put(neighbor_3021, current_3021);
                    queue_3021.add(neighbor_3021);
                }
            }
        }

        return buildPath_3021(parent_3021, start_3021, goal_3021);
    }

    public List<String> DFS_3021(String start_3021, String goal_3021) {

        Stack<String> stack_3021 = new Stack<>();
        Set<String> visited_3021 = new HashSet<>();
        Map<String, String> parent_3021 = new HashMap<>();

        stack_3021.push(start_3021);

        while (!stack_3021.isEmpty()) {

            String current_3021 = stack_3021.pop();

            if (!visited_3021.contains(current_3021)) {

                visited_3021.add(current_3021);

                if (current_3021.equals(goal_3021)) {
                    break;
                }

                for (String neighbor_3021 : graph_3021.get(current_3021)) {

                    if (!visited_3021.contains(neighbor_3021)) {

                        parent_3021.put(neighbor_3021, current_3021);
                        stack_3021.push(neighbor_3021);
                    }
                }
            }
        }

        return buildPath_3021(parent_3021, start_3021, goal_3021);
    }

    private List<String> buildPath_3021(
            Map<String, String> parent_3021,
            String start_3021,
            String goal_3021) {

        List<String> path_3021 = new ArrayList<>();

        String current_3021 = goal_3021;

        while (current_3021 != null) {

            path_3021.add(current_3021);
            current_3021 = parent_3021.get(current_3021);
        }

        Collections.reverse(path_3021);

        if (!path_3021.get(0).equals(start_3021)) {
            return new ArrayList<>();
        }

        return path_3021;
    }
}