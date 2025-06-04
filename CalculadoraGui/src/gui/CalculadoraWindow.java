package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.OperacoesMatematicas;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVisor;
	private JButton btnMs;
	private JButton btnClear;
	private JButton btnDividir;
	private JButton btnMultiplicar;
	private JButton btnMenos;
	private JButton btnSoma;
	private JButton btnIgual;
	private JButton btnVirgula;
	private JButton btnZero;
	private JButton btnNum1;
	
	private Double var1;
	private Double var2;
	private Double result;
	private String operacao;
	private String armazenaMemoriaMs;
	
	public CalculadoraWindow() {
		setResizable(false);
		iniciarElementes();
		
	}
	
	private void limparVisor() {
		this.txtVisor.setText("");
	}
	
	private String atualVisor() {
		return this.txtVisor.getText();
	}
	
	private void adicionaAlgoVisor(String numero) {
		this.txtVisor.setText(atualVisor()+numero);
	}
	
	private void armazenarMemoria() {
		armazenaMemoriaMs = atualVisor();
	}
	
	private void recuperarMemoria() {
		limparVisor();
		adicionaAlgoVisor(armazenaMemoriaMs);
	}
	
	private void limparMemoria() {
		armazenaMemoriaMs = null;
	}
	
	
	
	
	private void adicionarZero() {		
		adicionaAlgoVisor("0");
	}
	
	private void adicionarNum1() {
		adicionaAlgoVisor("1");
	}
	
	private void adicionaNum2() {
		adicionaAlgoVisor("2");
	}
	private void adicionaNum3() {
		adicionaAlgoVisor("3");
	}
	private void adicionaNum4() {
		adicionaAlgoVisor("4");
	}
	private void adicionaNum5() {
		adicionaAlgoVisor("5");
	}
	private void adicionaNum6() {
		adicionaAlgoVisor("6");
	}
	private void adicionaNum7() {
		adicionaAlgoVisor("7");
	}
	private void adicionaNum8() {
		adicionaAlgoVisor("8");
	}
	private void adicionaNum9() {
		adicionaAlgoVisor("9");
	}
	
	private void virgula() {
		adicionaAlgoVisor(".");
	}
	
	private void somar() {
		var1 = Double.parseDouble(atualVisor());
		OperacoesMatematicas.retornaValorVisor(var1);
		this.txtVisor.setText("");
		operacao ="+";
	}
	
	private void subtrair() {
		var1 = Double.parseDouble(atualVisor());
		OperacoesMatematicas.retornaValorVisor(var1);
		this.txtVisor.setText("");
		operacao ="-";
	}
	private void multiplicar() {
		var1 = Double.parseDouble(atualVisor());
		OperacoesMatematicas.retornaValorVisor(var1);
		this.txtVisor.setText("");
		operacao ="*";
	}
	private void dividir() {
		var1 = Double.parseDouble(atualVisor());
		OperacoesMatematicas.retornaValorVisor(var1);
		this.txtVisor.setText("");
		operacao ="/";
	}
	
	private void igual() {
		var2 = Double.parseDouble(atualVisor());
		OperacoesMatematicas.retornaValorVisorIgual(var2);
		result = OperacoesMatematicas.igual(operacao);
		
		if(OperacoesMatematicas.verificaSeTemResto()) {
			this.txtVisor.setText(String.format("%.0f",result));
		}else {
			this.txtVisor.setText(String.format("%.2f",result));
		}
		
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraWindow frame = new CalculadoraWindow();
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
	private void iniciarElementes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtVisor = new JTextField();
		txtVisor.setEditable(false);
		txtVisor.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setBounds(0, 0, 248, 46);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		btnMs = new JButton("MS");
		btnMs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				armazenarMemoria();
			}
		});
		btnMs.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMs.setBounds(10, 57, 51, 52);
		contentPane.add(btnMs);
		
		JButton btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				recuperarMemoria();
			}
		});
		btnMr.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMr.setBounds(71, 57, 51, 52);
		contentPane.add(btnMr);
		
		JButton btnMc = new JButton("MC");
		btnMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparMemoria();
			}
		});
		btnMc.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMc.setBounds(132, 57, 51, 52);
		contentPane.add(btnMc);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparVisor();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(193, 57, 51, 52);
		contentPane.add(btnClear);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum7();
			}
		});
		btnNum7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum7.setBounds(10, 120, 51, 52);
		contentPane.add(btnNum7);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum4();
			}
		});
		btnNum4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum4.setBounds(10, 183, 51, 52);
		contentPane.add(btnNum4);
		
		btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarNum1();
			}
		});
		btnNum1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum1.setBounds(10, 246, 51, 52);
		contentPane.add(btnNum1);
		
		btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarZero();
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnZero.setBounds(10, 304, 51, 52);
		contentPane.add(btnZero);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum8();
			}
		});
		btnNum8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum8.setBounds(71, 120, 51, 52);
		contentPane.add(btnNum8);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum5();
			}
		});
		btnNum5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum5.setBounds(71, 183, 51, 52);
		contentPane.add(btnNum5);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum2();
			}
		});
		btnNum2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum2.setBounds(71, 246, 51, 52);
		contentPane.add(btnNum2);
		
		btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula();
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVirgula.setBounds(71, 304, 51, 52);
		contentPane.add(btnVirgula);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum9();
			}
		});
		btnNum9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum9.setBounds(132, 120, 51, 52);
		contentPane.add(btnNum9);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum6();
			}
		});
		btnNum6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum6.setBounds(132, 183, 51, 52);
		contentPane.add(btnNum6);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNum3();
			}
		});
		btnNum3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNum3.setBounds(132, 246, 51, 52);
		contentPane.add(btnNum3);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual();
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnIgual.setBounds(132, 304, 51, 52);
		contentPane.add(btnIgual);
		
		btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dividir();
			}
		});
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDividir.setBounds(193, 120, 51, 52);
		contentPane.add(btnDividir);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicar();
			}
		});
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMultiplicar.setBounds(193, 183, 51, 52);
		contentPane.add(btnMultiplicar);
		
		btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subtrair();
			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMenos.setBounds(193, 246, 51, 52);
		contentPane.add(btnMenos);
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				somar();
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSoma.setBounds(193, 304, 51, 52);
		contentPane.add(btnSoma);
	}
}
