package database;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MenuSiswa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtNilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSiswa frame = new MenuSiswa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuSiswa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNama.setBounds(10, -8, 110, 74);
		contentPane.add(lblNama);
		
		JLabel lblNilai = new JLabel("NILAI");
		lblNilai.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNilai.setBounds(10, 69, 110, 55);
		contentPane.add(lblNilai);
		
		txtNama = new JTextField();
		txtNama.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNama.setBounds(130, 11, 294, 52);
		contentPane.add(txtNama);
		txtNama.setColumns(10);
		
		txtNilai = new JTextField();
		txtNilai.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtNilai.setBounds(130, 77, 294, 55);
		contentPane.add(txtNilai);
		txtNilai.setColumns(10);
		
		JButton submit = new JButton("OK");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//memasukkan data dari text field ke variabel
				String nama = txtNama.getText();
				String nilai = txtNilai.getText();
				
				//merubah variabel string(nilai) ke variabel double
				Double Score =  Double.parseDouble(nilai);
				
				//inisialisasi variabel
				String P="Default";
				String status = "Default";
				
				//fungsi if dengan variabel score(double) 
				if(Score >= 90 ){
					P="A";
					status="lulus";
				}else if(Score >= 80 ){
					P="B";
					status="lulus";
				}else if(Score >= 70 ){
					P="C";
					status="lulus";
				}else if(Score >= 60 ){
					P="D";
					status="Gagal";
				}else{
					P="E";
					status="Gagal";
				}
				
				//menampilkan message dialog
				JOptionPane.showMessageDialog(null,"  nilai  " + P +"  kelulusan  "+status);
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 30));
		submit.setBounds(130, 143, 294, 55);
		contentPane.add(submit);
	}
}
