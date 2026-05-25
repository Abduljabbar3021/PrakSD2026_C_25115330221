package pekan8_2511533021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BubleSortGUI_2511533021 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_3021;
	private JLabel[] labelArray_3021;
	private JButton stepButton_3021, resetButton_3021, setButton_3021;
	private JTextField inputField_3021;
	private JPanel panelArray_3021;
	private JTextArea stepArea_3021;
	private JPanel contentPane_3021;
	
	
	private int i_3021 = 1, j_3021;
	private boolean sorting_3021 = false;
	private int stepCount_3021 = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubleSortGUI_2511533021 frame_3021 = new BubleSortGUI_2511533021();
					frame_3021.setVisible(true);
				} catch (Exception e_3021) {
					e_3021.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BubleSortGUI_2511533021() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_3021 = new JPanel();
		contentPane_3021.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_3021);
		setTitle("Insertion Sort langkah per langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_3021 = new JPanel(new FlowLayout());
		inputField_3021 = new JTextField(30);
		setButton_3021 = new JButton("Set Array");
		inputPanel_3021.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_3021.add(inputField_3021);
		inputPanel_3021.add(setButton_3021);

		// panel array visual
		panelArray_3021 = new JPanel();
		panelArray_3021.setLayout(new FlowLayout());

		// panel kontrol
		JPanel controlPanel_3021 = new JPanel();
		stepButton_3021 = new JButton("Langkah Selanjutnya");
		resetButton_3021 = new JButton("Reset");
		stepButton_3021.setEnabled(false);
		controlPanel_3021.add(stepButton_3021);
		controlPanel_3021.add(resetButton_3021);

		// Area teks untuk log langkah langkah
		stepArea_3021 = new JTextArea(8, 60);
		stepArea_3021.setEditable(false);
		stepArea_3021.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_3021 = new JScrollPane(stepArea_3021);

		// tambahkan panel ke frame
		add(inputPanel_3021, BorderLayout.NORTH);
		add(panelArray_3021, BorderLayout.CENTER);
		add(controlPanel_3021, BorderLayout.SOUTH);
		add(scrollPane_3021, BorderLayout.EAST);

		// Event set array
		setButton_3021.addActionListener(e_3021 -> setArrayFromInput_3021());

		// Event langkah selanjutnya
		stepButton_3021.addActionListener(e_3021 -> performStep_3021());

		// Event Reset
		resetButton_3021.addActionListener(e_3021 -> reset_3021());
	}

	private void setArrayFromInput_3021() {
		String text_3021 = inputField_3021.getText().trim();
		if (text_3021.isEmpty())
			return;
		String[] parts_3021 = text_3021.split(",");
		array_3021 = new int[parts_3021.length];
		try {
			for (int k_3021 = 0; k_3021 < parts_3021.length; k_3021++) {
				array_3021[k_3021] =
						Integer.parseInt(parts_3021[k_3021].trim());
			}

		} catch (NumberFormatException e_3021) {
			JOptionPane.showMessageDialog(
					this,
					"Masukkan hanya angka yang dipisahkan koma!",
					"Error",
					JOptionPane.ERROR_MESSAGE);

			return;
		}

		i_3021 = 0;
		j_3021 = 0;

		stepCount_3021 = 1;
		sorting_3021 = true;
		stepButton_3021.setEnabled(true);
		stepArea_3021.setText("");
		panelArray_3021.removeAll();
		labelArray_3021 = new JLabel[array_3021.length];
		for (int k_3021 = 0; k_3021 < array_3021.length; k_3021++) {
			labelArray_3021[k_3021] =
					new JLabel(String.valueOf(array_3021[k_3021]));
			labelArray_3021[k_3021].setFont(
					new Font("Arial", Font.BOLD, 24));
			labelArray_3021[k_3021].setOpaque(true);
			labelArray_3021[k_3021].setBackground(Color.WHITE);
			labelArray_3021[k_3021].setBorder(
					BorderFactory.createLineBorder(Color.BLACK));
			labelArray_3021[k_3021].setPreferredSize(
					new Dimension(50, 50));
			labelArray_3021[k_3021].setHorizontalAlignment(
					SwingConstants.CENTER);
			panelArray_3021.add(labelArray_3021[k_3021]);
		}

		panelArray_3021.revalidate();
		panelArray_3021.repaint();
	}
	private void performStep_3021() {

	    if (!sorting_3021 || j_3021 >= array_3021.length - 1) {
	        sorting_3021 = false;
	        stepButton_3021.setEnabled(false);
	        JOptionPane.showMessageDialog(
	                this,
	                "Sorting selesai!");

	        return;
	    }

	    resetHighlights_3021();

	    StringBuilder stepLog_3021 =
	            new StringBuilder();

	    labelArray_3021[j_3021]
	            .setBackground(Color.CYAN);

	    labelArray_3021[j_3021 + 1]
	            .setBackground(Color.CYAN);

	    if (array_3021[j_3021]
	            > array_3021[j_3021 + 1]) {

	        // Swap

	        int temp_3021 =
	                array_3021[j_3021];

	        array_3021[j_3021] =
	                array_3021[j_3021 + 1];

	        array_3021[j_3021 + 1] =
	                temp_3021;

	        labelArray_3021[j_3021]
	                .setBackground(Color.RED);

	        labelArray_3021[j_3021 + 1]
	                .setBackground(Color.RED);

	        stepLog_3021.append("Langkah ")
	                .append(stepCount_3021)
	                .append(": Menukar elemen ke-")
	                .append(j_3021)
	                .append(" (")
	                .append(array_3021[j_3021 + 1])
	                .append(") dengan ke-")
	                .append(j_3021 + 1)
	                .append(" (")
	                .append(array_3021[j_3021])
	                .append(")\n");

	    } else {

	        stepLog_3021.append("Langkah ")
	                .append(stepCount_3021)
	                .append(": Tidak ada pertukaran antara ke-")
	                .append(j_3021)
	                .append(" dan ke-")
	                .append(j_3021 + 1)
	                .append("\n");
	    }

	    stepLog_3021.append("Hasil: ")
	            .append(arrayToString_3021(array_3021))
	            .append("\n\n");

	    stepArea_3021.append(
	            stepLog_3021.toString());

	    updateLabels_3021();

	    j_3021++;

	    if (j_3021 >= array_3021.length - i_3021 - 1) {

	        j_3021 = 0;

	        i_3021++;
	    }

	    stepCount_3021++;

	    if (i_3021 >= array_3021.length - 1) {

	        sorting_3021 = false;

	        stepButton_3021.setEnabled(false);

	        JOptionPane.showMessageDialog(
	                this,
	                "Sorting selesai!");
	    }
	}
		
	

	private void updateLabels_3021() {
	    for (int k_3021 = 0; k_3021 < array_3021.length; k_3021++) {
	        labelArray_3021[k_3021].setText(String.valueOf(array_3021[k_3021]));
	    }
	}

	private void resetHighlights_3021() {
	    for (JLabel label_3021 : labelArray_3021) {
	        label_3021.setBackground(Color.WHITE);
	    }
	}

	private void reset_3021() {
	    inputField_3021.setText("");
	    panelArray_3021.removeAll();
	    panelArray_3021.revalidate();
	    panelArray_3021.repaint();
	    stepArea_3021.setText("");
	    stepButton_3021.setEnabled(false);
	    sorting_3021 = false;
	    i_3021 = 0;
	    j_3021 = 0;
	    stepCount_3021 = 1;
	}

	private String arrayToString_3021(int[] arr_3021) {
	    StringBuilder sb_3021 = new StringBuilder();
	    for (int k_3021 = 0; k_3021 < arr_3021.length; k_3021++) {
	        sb_3021.append(arr_3021[k_3021]);
	        if (k_3021 < arr_3021.length - 1)
	            sb_3021.append(", ");
	    }
	    return sb_3021.toString();
	}}