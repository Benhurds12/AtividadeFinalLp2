package provafinal.br.ufrn.imd.visao;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import provafinal.br.ufrn.imd.modelecontrole.ContaPalavras;
import provafinal.br.ufrn.imd.excecao.FraseVaziaException;

public class TelaContador extends JFrame{
    private static final long serialVersionUID = 1L;
	private JTextField txtEntrada;
    private JTextArea txtResultado;
    private JButton btnSubmeter, btnLimpar;

    public TelaContador() {
        super("Contador de Palavras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1024,600);

        JLabel lblEntrada = new JLabel("Digite um texto aqui:");
        txtEntrada = new JTextField();
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        btnSubmeter = new JButton("Submeter");
        btnLimpar = new JButton("Limpar");

        JPanel pnlEntrada = new JPanel(new BorderLayout());
        pnlEntrada.add(lblEntrada, BorderLayout.NORTH);
        pnlEntrada.add(txtEntrada, BorderLayout.CENTER);

        JPanel pnlBotoes = new JPanel();
        pnlBotoes.setLayout(new FlowLayout());
        pnlBotoes.add(btnSubmeter);
        pnlBotoes.add(btnLimpar);

        setLayout(new BorderLayout());
        add(pnlEntrada, BorderLayout.NORTH);
        add(txtResultado, BorderLayout.CENTER);
        add(pnlBotoes, BorderLayout.SOUTH);

        btnSubmeter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtEntrada.getText();
                ContaPalavras contador = new ContaPalavras();
                try {
                    Map<String, Integer> contagem = contador.contarPalavrasTexto(texto);
                    StringBuilder resultado = new StringBuilder();
                    resultado.append("{");
                    for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
                        resultado.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
                    }
                    resultado.delete(resultado.length() - 2, resultado.length());
                    resultado.append("}");
                    txtResultado.setText(resultado.toString());
                } catch (FraseVaziaException ex) {
                    JOptionPane.showMessageDialog(TelaContador.this, "Nao ha palavras para contar!!!!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                txtEntrada.setText("");
                txtResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {
        TelaContador tela = new TelaContador();
        tela.setVisible(true);
    }
}
