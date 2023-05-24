package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class claseaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPasswordField JpassClave;
	private JTextField textUsario;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					claseaPrincipal frame = new claseaPrincipal();
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
	public claseaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 24, 201, 14);
		contentPane.add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("Usario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(26, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		 JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(26, 136, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] clave = JpassClave.getPassword();
				
				String claveFinal = new String (clave);
				
				if (lblNewLabel_1.getText().equals("Alvaro") && claveFinal.equals("123")) {
					
					dispose();
					JOptionPane.showInputDialog(null, "Bienvenido al Sistema ", "INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE);
					
					
				}else {
					JOptionPane.showInputDialog(null,"USARIO O CONTRASEÑA INCORRECTA","ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
						
			}
		});
		btnIngresar.setBounds(254, 102, 89, 32);
		contentPane.add(btnIngresar);
		
		JpassClave = new JPasswordField();
		JpassClave.setBounds(109, 133, 105, 20);
		contentPane.add(JpassClave);
		
		textUsario = new JTextField();
		textUsario.setBounds(109, 89, 105, 20);
		contentPane.add(textUsario);
		textUsario.setColumns(10);

	}

}
