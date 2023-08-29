import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Screen extends JFrame implements ActionListener{
	
	JTextField chave;
	JTextArea result;
	
	public Screen () {
		//JFrame jFrame = new JFrame ();
		setSize(700, 500);
		//setVisible (true);
		setTitle ("Chave NF-e");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		
		setLayout(null);
		JButton jButton = new JButton ("Executar");
		jButton.setBounds(100, 120, 250, 70);
		add (jButton);
		
		jButton.addActionListener(this);
		
		chave = new JTextField ();
		chave.setBounds(100,50,400,50);
		//chave.setText ("Digite a chave aqui");
		
		add(chave);
		
		result = new JTextArea ();
		result.setBounds(100,200,500,250);
		//chave.setText ("Digite a chave aqui");
		
		add(result);
		
		
		
		
		setVisible(true);
		
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String chaveText = chave.getText();
		//Integer chaveValue = Integer.parseInt(chave.getText());
		
		if (chaveText.length() == 44  ) {
		result.setText("Segue abaixo os dados da chave informada:\n\n"
				+ "Código da UF do emitente do Documento Fiscal: "+ chaveText.substring(0, 2)
				+ "\nAno e Mês de emissão da NF-e: "+ chaveText.substring(2, 6)
				+ "\nCNPJ do emitente: "+ chaveText.substring(6, 20)
				+ "\nModelo do Documento Fiscal: "+chaveText.substring(20, 22)
				+ "\nSérie do Documento Fiscal: "+chaveText.substring(22, 25)
				+ "\nNúmero do Documento Fiscal: "+chaveText.substring(25, 34)
				+ "\nForma de emissão da NF-e: "+chaveText.substring(34, 35)
				+ "\nCódigo Numérico que compõe a Chave de Acesso1: "+chaveText.substring(35, 43)
				+ "\nDígito Verificador da Chave de Acesso: "+chaveText.substring(43, 44)
				);
		
				//+ chaveText.substring(0, 4));
		}
		else {
			result.setText("A chave informada é inválida. Não contém 44 digitos!!");
		}
		
		
		//result
		
		/*
		 * A Chave de Acesso de um Documento Fiscal: NF-e, CT-e, NFC-e e MDF-e é formada pelas seguintes informações:

cUF - Código da UF do emitente do Documento Fiscal;
AAMM - Ano e Mês de emissão da NF-e;
CNPJ - CNPJ do emitente;
mod - Modelo do Documento Fiscal;
serie - Série do Documento Fiscal;
nNF - Número do Documento Fiscal;
tpEmis – forma de emissão da NF-e;
cNF - Código Numérico que compõe a Chave de Acesso;
cDV - Dígito Verificador da Chave de Acesso.
		 * 
		 */
		
	}

	
}
