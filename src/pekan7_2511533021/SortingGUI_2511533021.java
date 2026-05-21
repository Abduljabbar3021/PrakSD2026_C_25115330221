package pekan7_2511533021;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SortingGUI_2511533021 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane_3021;

	// Komponen GUI
	private JTextField txtNama_3021;
	private JTextField txtNim_3021;
	private JTextField txtProdi_3021;

	private JButton btnTambah_3021;
	private JButton btnHapus_3021;
	private JButton btnSorting_3021;

	private JComboBox<String> comboSorting_3021;

	private JTextArea areaData_3021;
	private JTextArea areaProses_3021;

	// ArrayList mahasiswa
	private ArrayList<Mahasiswa_2511533021> listMahasiswa_3021;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					SortingGUI_2511533021 frame_3021 =
							new SortingGUI_2511533021();

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
	public SortingGUI_2511533021() {

		listMahasiswa_3021 = new ArrayList<>();

		setTitle("Sorting Mahasiswa 2511533021");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 600);

		contentPane_3021 = new JPanel();

		contentPane_3021.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane_3021.setLayout(new BorderLayout());

		setContentPane(contentPane_3021);

		// PANEL INPUT

		JPanel inputPanel_3021 = new JPanel(new FlowLayout());

		inputPanel_3021.add(new JLabel("Nama"));

		txtNama_3021 = new JTextField(10);

		inputPanel_3021.add(txtNama_3021);

		inputPanel_3021.add(new JLabel("NIM"));

		txtNim_3021 = new JTextField(10);

		inputPanel_3021.add(txtNim_3021);

		inputPanel_3021.add(new JLabel("Prodi"));

		txtProdi_3021 = new JTextField(10);

		inputPanel_3021.add(txtProdi_3021);

		btnTambah_3021 = new JButton("Tambah Data");

		btnHapus_3021 = new JButton("Hapus Data");

		inputPanel_3021.add(btnTambah_3021);

		inputPanel_3021.add(btnHapus_3021);

		contentPane_3021.add(inputPanel_3021, BorderLayout.NORTH);

		// AREA DATA

		areaData_3021 = new JTextArea();

		areaData_3021.setEditable(false);

		JScrollPane scrollData_3021 =
				new JScrollPane(areaData_3021);

		contentPane_3021.add(scrollData_3021, BorderLayout.WEST);

		// AREA PROSES

		areaProses_3021 = new JTextArea();

		areaProses_3021.setEditable(false);

		JScrollPane scrollProses_3021 =
				new JScrollPane(areaProses_3021);

		contentPane_3021.add(scrollProses_3021, BorderLayout.CENTER);

		// PANEL BAWAH

		JPanel bawahPanel_3021 = new JPanel();

		comboSorting_3021 = new JComboBox<>();

		comboSorting_3021.addItem("Insertion Sort");

		comboSorting_3021.addItem("Selection Sort");

		comboSorting_3021.addItem("Bubble Sort");

		btnSorting_3021 = new JButton("Mulai Sorting");

		bawahPanel_3021.add(comboSorting_3021);

		bawahPanel_3021.add(btnSorting_3021);

		contentPane_3021.add(bawahPanel_3021, BorderLayout.SOUTH);

		// EVENT TAMBAH DATA

		btnTambah_3021.addActionListener(e_3021 -> tambahData_3021());

		// EVENT HAPUS

		btnHapus_3021.addActionListener(e_3021 -> hapusData_3021());

		// EVENT SORTING

		btnSorting_3021.addActionListener(e_3021 -> mulaiSorting_3021());
	}

	// METHOD TAMBAH DATA

	private void tambahData_3021() {

		String nama_3021 = txtNama_3021.getText().trim();

		String nim_3021 = txtNim_3021.getText().trim();

		String prodi_3021 = txtProdi_3021.getText().trim();

		if (nama_3021.isEmpty()
				|| nim_3021.isEmpty()
				|| prodi_3021.isEmpty()) {

			JOptionPane.showMessageDialog(
					this,
					"Data harus diisi semua");

			return;
		}

		Mahasiswa_2511533021 mhs_3021 =
				new Mahasiswa_2511533021(
						nama_3021,
						nim_3021,
						prodi_3021);

		listMahasiswa_3021.add(mhs_3021);

		tampilData_3021();

		txtNama_3021.setText("");

		txtNim_3021.setText("");

		txtProdi_3021.setText("");
	}

	// METHOD TAMPIL DATA

	private void tampilData_3021() {

		areaData_3021.setText("");

		for (Mahasiswa_2511533021 mhs_3021
				: listMahasiswa_3021) {

			areaData_3021.append(
					mhs_3021.toString() + "\n");
		}
	}

	// METHOD HAPUS DATA

	private void hapusData_3021() {

		listMahasiswa_3021.clear();

		areaData_3021.setText("");

		areaProses_3021.setText("");
	}

	// METHOD SORTING

	private void mulaiSorting_3021() {

		areaProses_3021.setText("");

		String pilihan_3021 =
				comboSorting_3021.getSelectedItem().toString();

		ArrayList<Mahasiswa_2511533021> tempList_3021 =
				new ArrayList<>(listMahasiswa_3021);

		if (pilihan_3021.equals("Insertion Sort")) {

			areaProses_3021.append(
					"=== INSERTION SORT ===\n\n");

			for (int i_3021 = 1;
					i_3021 < tempList_3021.size();
					i_3021++) {

				Mahasiswa_2511533021 key_3021 =
						tempList_3021.get(i_3021);

				int j_3021 = i_3021 - 1;

				while (j_3021 >= 0 &&
						tempList_3021.get(j_3021)
						.getNama_3021()
						.compareToIgnoreCase(
								key_3021.getNama_3021()) > 0) {

					tempList_3021.set(
							j_3021 + 1,
							tempList_3021.get(j_3021));

					j_3021--;
				}

				tempList_3021.set(j_3021 + 1, key_3021);

				areaProses_3021.append(
						"Langkah " + i_3021 + " :\n");

				tampilProses_3021(tempList_3021);
			}

		} else if (pilihan_3021.equals("Selection Sort")) {

			areaProses_3021.append(
					"=== SELECTION SORT ===\n\n");

			for (int i_3021 = 0;
					i_3021 < tempList_3021.size() - 1;
					i_3021++) {

				int min_3021 = i_3021;

				for (int j_3021 = i_3021 + 1;
						j_3021 < tempList_3021.size();
						j_3021++) {

					if (tempList_3021.get(j_3021)
							.getNama_3021()
							.compareToIgnoreCase(
									tempList_3021.get(min_3021)
									.getNama_3021()) < 0) {

						min_3021 = j_3021;
					}
				}

				Mahasiswa_2511533021 temp_3021 =
						tempList_3021.get(min_3021);

				tempList_3021.set(
						min_3021,
						tempList_3021.get(i_3021));

				tempList_3021.set(i_3021, temp_3021);

				areaProses_3021.append(
						"Pass " + (i_3021 + 1) + " :\n");

				tampilProses_3021(tempList_3021);
			}

		} else {

			areaProses_3021.append(
					"=== BUBBLE SORT ===\n\n");

			for (int i_3021 = 0;
					i_3021 < tempList_3021.size() - 1;
					i_3021++) {

				for (int j_3021 = 0;
						j_3021 < tempList_3021.size() - i_3021 - 1;
						j_3021++) {

					if (tempList_3021.get(j_3021)
							.getNama_3021()
							.compareToIgnoreCase(
									tempList_3021.get(j_3021 + 1)
									.getNama_3021()) > 0) {

						Mahasiswa_2511533021 temp_3021 =
								tempList_3021.get(j_3021);

						tempList_3021.set(
								j_3021,
								tempList_3021.get(j_3021 + 1));

						tempList_3021.set(
								j_3021 + 1,
								temp_3021);
					}
				}

				areaProses_3021.append(
						"Pass " + (i_3021 + 1) + " :\n");

				tampilProses_3021(tempList_3021);
			}
		}
	}

	// METHOD TAMPIL PROSES

	private void tampilProses_3021(
			ArrayList<Mahasiswa_2511533021> list_3021) {

		for (Mahasiswa_2511533021 mhs_3021 : list_3021) {

			areaProses_3021.append(
					mhs_3021.getNama_3021() + " ");
		}

		areaProses_3021.append("\n\n");
	}
}