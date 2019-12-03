package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class TelaView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaView frame = new TelaView();
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
	public TelaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(10, 228, 69, 23);
		contentPane.add(btnEnviar);
		
		textField = new JTextField();
		textField.setBounds(128, 46, 296, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setBounds(10, 46, 92, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 96, 35, 14);
		contentPane.add(lblEmail);
		
		JLabel lblFax = new JLabel("Telefone/Fax:");
		lblFax.setBounds(10, 121, 76, 14);
		contentPane.add(lblFax);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setBounds(10, 71, 46, 14);
		contentPane.add(lblApelido);
		
		JLabel lblGrupo = new JLabel("Grupo de interesse:");
		lblGrupo.setBounds(10, 171, 127, 14);
		contentPane.add(lblGrupo);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(10, 146, 57, 14);
		contentPane.add(lblEndereco);
		
		JLabel lblCadastroDeContato = new JLabel("CADASTRO DE CONTATO");
		lblCadastroDeContato.setBounds(10, 11, 183, 24);
		contentPane.add(lblCadastroDeContato);
		
		textField_1 = new JTextField();
		textField_1.setBounds(96, 71, 206, 14);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 96, 206, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(96, 121, 158, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(77, 143, 347, 17);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
