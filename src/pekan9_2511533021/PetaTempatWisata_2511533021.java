package Pekan9_2511533021;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

public class PetaTempatWisata_2511533021 extends JFrame {

    private static final long serialVersionUID = 1L;

    static class GraphTraversal_3021 {

        private Map<String, List<String>> graph_3021 = new LinkedHashMap<>();

        public void addEdge_3021(String node1_3021, String node2_3021) {
            graph_3021.putIfAbsent(node1_3021, new ArrayList<>());
            graph_3021.putIfAbsent(node2_3021, new ArrayList<>());
            graph_3021.get(node1_3021).add(node2_3021);
            graph_3021.get(node2_3021).add(node1_3021);
        }

        public List<String[]> getAllEdges_3021() {
            List<String[]> edges_3021 = new ArrayList<>();
            Set<String> added_3021 = new HashSet<>();
            for (String node_3021 : graph_3021.keySet()) {
                for (String neighbor_3021 : graph_3021.get(node_3021)) {
                    String key1_3021 = node_3021 + "-" + neighbor_3021;
                    String key2_3021 = neighbor_3021 + "-" + node_3021;
                    if (!added_3021.contains(key1_3021) && !added_3021.contains(key2_3021)) {
                        edges_3021.add(new String[]{node_3021, neighbor_3021});
                        added_3021.add(key1_3021);
                    }
                }
            }
            return edges_3021;
        }

        // BFS iteratif
        public TraversalResult_3021 bfs_3021(String start_3021, String goal_3021) {
            List<String> visited_3021 = new ArrayList<>();
            Map<String, String> parent_3021 = new LinkedHashMap<>();
            Queue<String> queue_3021 = new LinkedList<>();
            queue_3021.add(start_3021);
            visited_3021.add(start_3021);
            parent_3021.put(start_3021, null);
            while (!queue_3021.isEmpty()) {
                String current_3021 = queue_3021.poll();
                if (current_3021.equals(goal_3021)) break;
                for (String neighbor_3021 : graph_3021.getOrDefault(current_3021, new ArrayList<>())) {
                    if (!visited_3021.contains(neighbor_3021)) {
                        queue_3021.add(neighbor_3021);
                        visited_3021.add(neighbor_3021);
                        parent_3021.put(neighbor_3021, current_3021);
                    }
                }
            }
            return new TraversalResult_3021(visited_3021, buildPath_3021(parent_3021, start_3021, goal_3021));
        }

        // DFS rekursif
        public TraversalResult_3021 dfs_3021(String start_3021, String goal_3021) {
            List<String> visited_3021 = new ArrayList<>();
            Map<String, String> parent_3021 = new LinkedHashMap<>();
            parent_3021.put(start_3021, null);
            dfsHelper_3021(start_3021, goal_3021, visited_3021, parent_3021);
            return new TraversalResult_3021(visited_3021, buildPath_3021(parent_3021, start_3021, goal_3021));
        }

        private boolean dfsHelper_3021(String current_3021, String goal_3021,
                List<String> visited_3021, Map<String, String> parent_3021) {
            if (visited_3021.contains(current_3021)) return false;
            visited_3021.add(current_3021);
            if (current_3021.equals(goal_3021)) return true;
            for (String neighbor_3021 : graph_3021.getOrDefault(current_3021, new ArrayList<>())) {
                if (!visited_3021.contains(neighbor_3021)) {
                    parent_3021.put(neighbor_3021, current_3021);
                    if (dfsHelper_3021(neighbor_3021, goal_3021, visited_3021, parent_3021)) return true;
                }
            }
            return false;
        }

        private List<String> buildPath_3021(Map<String, String> parent_3021,
                String start_3021, String goal_3021) {
            List<String> path_3021 = new ArrayList<>();
            if (!parent_3021.containsKey(goal_3021)) return path_3021;
            String cur_3021 = goal_3021;
            while (cur_3021 != null) {
                path_3021.add(0, cur_3021);
                cur_3021 = parent_3021.get(cur_3021);
            }
            return path_3021;
        }

        static class TraversalResult_3021 {
            public final List<String> visited_3021;
            public final List<String> path_3021;
            TraversalResult_3021(List<String> v, List<String> p) {
                visited_3021 = v;
                path_3021 = p;
            }
        }
    }


    class GraphPanel_3021 extends JPanel {

        private static final long serialVersionUID = 2L;
        private static final int R_3021 = 30;

        @Override
        protected void paintComponent(Graphics g_3021) {
            super.paintComponent(g_3021);
            Graphics2D g2_3021 = (Graphics2D) g_3021;
            g2_3021.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                     RenderingHints.VALUE_ANTIALIAS_ON);
            drawEdges_3021(g2_3021);
            drawNodes_3021(g2_3021);
            drawLegend_3021(g2_3021);
        }

        private void drawEdges_3021(Graphics2D g2_3021) {
            for (String[] edge_3021 : traversal_3021.getAllEdges_3021()) {
                int[] p1_3021 = nodePos_3021.get(edge_3021[0]);
                int[] p2_3021 = nodePos_3021.get(edge_3021[1]);
                if (p1_3021 == null || p2_3021 == null) continue;
                if (isEdgeOnPath_3021(edge_3021[0], edge_3021[1])) {
                    g2_3021.setColor(Color.ORANGE);
                    g2_3021.setStroke(new BasicStroke(3f));
                } else {
                    g2_3021.setColor(Color.DARK_GRAY);
                    g2_3021.setStroke(new BasicStroke(1.5f));
                }
                g2_3021.drawLine(p1_3021[0], p1_3021[1], p2_3021[0], p2_3021[1]);
            }
            g2_3021.setStroke(new BasicStroke(1f));
        }

        private boolean isEdgeOnPath_3021(String a_3021, String b_3021) {
            if (pathNodes_3021.size() < 2) return false;
            for (int i_3021 = 0; i_3021 < pathNodes_3021.size() - 1; i_3021++) {
                String u_3021 = pathNodes_3021.get(i_3021);
                String v_3021 = pathNodes_3021.get(i_3021 + 1);
                if ((u_3021.equals(a_3021) && v_3021.equals(b_3021)) ||
                    (u_3021.equals(b_3021) && v_3021.equals(a_3021))) return true;
            }
            return false;
        }

        private void drawNodes_3021(Graphics2D g2_3021) {
            for (String node_3021 : nodePos_3021.keySet()) {
                int[] pos_3021 = nodePos_3021.get(node_3021);
                int x_3021 = pos_3021[0];
                int y_3021 = pos_3021[1];

                Color fill_3021;
                if (!pathNodes_3021.isEmpty() && node_3021.equals(pathNodes_3021.get(0))) {
                    fill_3021 = Color.GREEN;
                } else if (!pathNodes_3021.isEmpty() &&
                           node_3021.equals(pathNodes_3021.get(pathNodes_3021.size() - 1))) {
                    fill_3021 = Color.RED;
                } else if (pathNodes_3021.contains(node_3021)) {
                    fill_3021 = Color.YELLOW;
                } else if (visitedNodes_3021.contains(node_3021)) {
                    fill_3021 = Color.CYAN;
                } else {
                    fill_3021 = Color.LIGHT_GRAY;
                }

                g2_3021.setColor(fill_3021);
                g2_3021.fillOval(x_3021 - R_3021, y_3021 - R_3021, R_3021 * 2, R_3021 * 2);
                g2_3021.setColor(Color.BLACK);
                g2_3021.setStroke(new BasicStroke(1.5f));
                g2_3021.drawOval(x_3021 - R_3021, y_3021 - R_3021, R_3021 * 2, R_3021 * 2);
                g2_3021.setStroke(new BasicStroke(1f));

                g2_3021.setFont(new Font("SansSerif", Font.BOLD, 10));
                g2_3021.setColor(Color.BLACK);
                FontMetrics fm_3021 = g2_3021.getFontMetrics();
                String[] parts_3021 = node_3021.split(" ", 2);
                if (parts_3021.length == 2) {
                    g2_3021.drawString(parts_3021[0],
                        x_3021 - fm_3021.stringWidth(parts_3021[0]) / 2, y_3021 - 3);
                    g2_3021.drawString(parts_3021[1],
                        x_3021 - fm_3021.stringWidth(parts_3021[1]) / 2, y_3021 + 11);
                } else {
                    g2_3021.drawString(node_3021,
                        x_3021 - fm_3021.stringWidth(node_3021) / 2, y_3021 + 4);
                }
            }
        }

        private void drawLegend_3021(Graphics2D g2_3021) {
            int lx_3021 = 16;
            int ly_3021 = getHeight() - 105;
            g2_3021.setFont(new Font("SansSerif", Font.PLAIN, 11));
            String[][] items_3021 = {
                {"Start Node",       "GREEN"},
                {"Goal Node",        "RED"},
                {"Node pada Jalur",  "YELLOW"},
                {"Dikunjungi",       "CYAN"},
                {"Belum Dikunjungi", "LIGHT_GRAY"}
            };
            Color[] colors_3021 = {Color.GREEN, Color.RED, Color.YELLOW, Color.CYAN, Color.LIGHT_GRAY};
            for (int i_3021 = 0; i_3021 < items_3021.length; i_3021++) {
                g2_3021.setColor(colors_3021[i_3021]);
                g2_3021.fillRect(lx_3021, ly_3021, 14, 14);
                g2_3021.setColor(Color.BLACK);
                g2_3021.drawRect(lx_3021, ly_3021, 14, 14);
                g2_3021.drawString(items_3021[i_3021][0], lx_3021 + 20, ly_3021 + 12);
                ly_3021 += 20;
            }
        }
    }


    private JComboBox<String> cbStart_3021;
    private JComboBox<String> cbGoal_3021;
    private JTextArea          taResult_3021;
    private GraphPanel_3021    graphPanel_3021;

    private final GraphTraversal_3021    traversal_3021    = new GraphTraversal_3021();
    private List<String>                 visitedNodes_3021 = new ArrayList<>();
    private List<String>                 pathNodes_3021    = new ArrayList<>();
    private final Map<String, int[]>     nodePos_3021      = new LinkedHashMap<>();

    private static final String[] NODES_3021 = {
        "Istana Maimun", "Masjid Raya", "Tjong A Fie", "Kesawan", "Merdeka Walk",
        "Centre Point", "Sun Plaza", "Ucok Durian", "Rahmat Gallery", "Maha Vihara"
    };


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new PetaTempatWisata_2511533021().setVisible(true);
            } catch (Exception e) { e.printStackTrace(); }
        });
    }


    public PetaTempatWisata_2511533021() {
        setTitle("Pencarian Jalur Wisata Medan - BFS & DFS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 680);
        buildGraph_3021();
        setupUI_3021();
    }

    private void buildGraph_3021() {
        // Koordinat posisi x, y disesuaikan secara dinamis agar 15 Edge terdistribusi sempurna
        nodePos_3021.put("Istana Maimun",  new int[]{  90, 130});
        nodePos_3021.put("Masjid Raya",   new int[]{  90, 310});
        nodePos_3021.put("Tjong A Fie",   new int[]{ 260, 110});
        nodePos_3021.put("Kesawan",       new int[]{ 260, 330});
        nodePos_3021.put("Merdeka Walk",  new int[]{ 430, 110});
        nodePos_3021.put("Centre Point",  new int[]{ 430, 330});
        nodePos_3021.put("Sun Plaza",     new int[]{ 600, 110});
        nodePos_3021.put("Ucok Durian",   new int[]{ 600, 330});
        nodePos_3021.put("Rahmat Gallery", new int[]{ 770, 130});
        nodePos_3021.put("Maha Vihara",    new int[]{ 770, 310});

        // Membangun TEPAT 15 EDGE (Jalur Penghubung Unik)
        traversal_3021.addEdge_3021("Istana Maimun",  "Masjid Raya");    // Edge 1
        traversal_3021.addEdge_3021("Istana Maimun",  "Tjong A Fie");    // Edge 2
        traversal_3021.addEdge_3021("Masjid Raya",    "Kesawan");        // Edge 3
        traversal_3021.addEdge_3021("Masjid Raya",    "Tjong A Fie");    // Edge 4 (Jalur Silang)
        traversal_3021.addEdge_3021("Tjong A Fie",    "Kesawan");        // Edge 5
        traversal_3021.addEdge_3021("Tjong A Fie",    "Merdeka Walk");   // Edge 6
        traversal_3021.addEdge_3021("Kesawan",        "Centre Point");   // Edge 7
        traversal_3021.addEdge_3021("Merdeka Walk",   "Centre Point");   // Edge 8
        traversal_3021.addEdge_3021("Merdeka Walk",   "Sun Plaza");      // Edge 9
        traversal_3021.addEdge_3021("Centre Point",   "Sun Plaza");      // Edge 10 (Jalur Silang)
        traversal_3021.addEdge_3021("Centre Point",   "Ucok Durian");    // Edge 11
        traversal_3021.addEdge_3021("Sun Plaza",      "Ucok Durian");    // Edge 12
        traversal_3021.addEdge_3021("Sun Plaza",      "Rahmat Gallery"); // Edge 13
        traversal_3021.addEdge_3021("Ucok Durian",    "Maha Vihara");    // Edge 14
        traversal_3021.addEdge_3021("Rahmat Gallery", "Maha Vihara");    // Edge 15
    }

    private void setupUI_3021() {
        JPanel contentPane_3021 = new JPanel(new BorderLayout(5, 5));
        contentPane_3021.setBorder(new EmptyBorder(8, 8, 8, 8));
        setContentPane(contentPane_3021);

        // Panel atas
        JPanel topPanel_3021 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        topPanel_3021.setBorder(new TitledBorder("Pencarian Jalur Menggunakan BFS dan DFS"));

        topPanel_3021.add(new JLabel("Lokasi Awal :"));
        cbStart_3021 = new JComboBox<>(NODES_3021);
        topPanel_3021.add(cbStart_3021);

        topPanel_3021.add(new JLabel("Lokasi Tujuan :"));
        cbGoal_3021 = new JComboBox<>(NODES_3021);
        cbGoal_3021.setSelectedIndex(5);
        topPanel_3021.add(cbGoal_3021);

        JButton btnBFS_3021   = new JButton("BFS");
        JButton btnDFS_3021   = new JButton("DFS");
        JButton btnReset_3021 = new JButton("Reset");

        btnBFS_3021.addActionListener(e -> runBFS_3021());
        btnDFS_3021.addActionListener(e -> runDFS_3021());
        btnReset_3021.addActionListener(e -> resetGraph_3021());

        topPanel_3021.add(btnBFS_3021);
        topPanel_3021.add(btnDFS_3021);
        topPanel_3021.add(btnReset_3021);
        contentPane_3021.add(topPanel_3021, BorderLayout.NORTH);

        // Panel tengah 
        graphPanel_3021 = new GraphPanel_3021();
        graphPanel_3021.setBorder(new TitledBorder("Visualisasi Graph - Peta Medan (15 Edges)"));
        contentPane_3021.add(graphPanel_3021, BorderLayout.CENTER);

        // Panel bawah 
        JPanel bottomPanel_3021 = new JPanel(new BorderLayout());
        bottomPanel_3021.setBorder(new TitledBorder("Hasil Pencarian"));
        bottomPanel_3021.setPreferredSize(new Dimension(0, 160));

        taResult_3021 = new JTextArea();
        taResult_3021.setEditable(false);
        taResult_3021.setFont(new Font("Monospaced", Font.PLAIN, 12));
        bottomPanel_3021.add(new JScrollPane(taResult_3021), BorderLayout.CENTER);
        contentPane_3021.add(bottomPanel_3021, BorderLayout.SOUTH);
    }

    
    private void runBFS_3021() {
        String start_3021 = (String) cbStart_3021.getSelectedItem();
        String goal_3021  = (String) cbGoal_3021.getSelectedItem();
        if (start_3021.equals(goal_3021)) { showSameNodeWarning_3021(); return; }
        GraphTraversal_3021.TraversalResult_3021 res_3021 =
            traversal_3021.bfs_3021(start_3021, goal_3021);
        visitedNodes_3021 = res_3021.visited_3021;
        pathNodes_3021    = res_3021.path_3021;
        displayResult_3021("BFS", start_3021, goal_3021, res_3021.visited_3021, res_3021.path_3021);
        graphPanel_3021.repaint();
    }

    
    private void runDFS_3021() {
        String start_3021 = (String) cbStart_3021.getSelectedItem();
        String goal_3021  = (String) cbGoal_3021.getSelectedItem();
        if (start_3021.equals(goal_3021)) { showSameNodeWarning_3021(); return; }
        GraphTraversal_3021.TraversalResult_3021 res_3021 =
            traversal_3021.dfs_3021(start_3021, goal_3021);
        visitedNodes_3021 = res_3021.visited_3021;
        pathNodes_3021    = res_3021.path_3021;
        displayResult_3021("DFS", start_3021, goal_3021, res_3021.visited_3021, res_3021.path_3021);
        graphPanel_3021.repaint();
    }


    private void resetGraph_3021() {
        visitedNodes_3021.clear();
        pathNodes_3021.clear();
        taResult_3021.setText("");
        cbStart_3021.setSelectedIndex(0);
        cbGoal_3021.setSelectedIndex(5);
        graphPanel_3021.repaint();
    }

    
    private void displayResult_3021(String algo_3021, String start_3021, String goal_3021,
            List<String> visited_3021, List<String> path_3021) {
        StringBuilder sb_3021 = new StringBuilder();
        sb_3021.append("Algoritma           : ").append(algo_3021).append("\n");
        sb_3021.append("Lokasi Awal         : ").append(start_3021).append("\n");
        sb_3021.append("Lokasi Tujuan       : ").append(goal_3021).append("\n");
        sb_3021.append("--------------------------------------------------\n");
        sb_3021.append("Node Dikunjungi     : ").append(String.join(" -> ", visited_3021)).append("\n");
        sb_3021.append("Jumlah Dieksplorasi : ").append(visited_3021.size()).append(" node\n");
        sb_3021.append("--------------------------------------------------\n");
        if (path_3021.isEmpty()) {
            sb_3021.append("Jalur               : Tidak ditemukan!\n");
        } else {
            sb_3021.append("Jalur               : ").append(String.join(" -> ", path_3021)).append("\n");
            sb_3021.append("Panjang Jalur       : ").append(path_3021.size() - 1).append(" langkah\n");
        }
        taResult_3021.setText(sb_3021.toString());
    }

    private void showSameNodeWarning_3021() {
        JOptionPane.showMessageDialog(this,
            "Lokasi awal dan tujuan tidak boleh sama!",
            "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
}