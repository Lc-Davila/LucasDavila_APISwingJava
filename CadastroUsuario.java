import javax.swing.*; // Importa classes para criar a interface gráfica
import java.awt.*;    // Importa gerenciadores de layout
import java.awt.event.*; // Importa eventos e ActionListener

public class CadastroUsuario extends JFrame {

    // Campos de texto
    private JTextField campoNome;
    private JTextField campoEmail;

    public CadastroUsuario() {
        super("Cadastro de Usuário"); // Título da janela

        // Define o layout da janela (2 linhas, 2 colunas)
        setLayout(new GridLayout(3, 2, 5, 5));

        // Título
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelEmail = new JLabel("E-mail:");

        // Campos de entrada
        campoNome = new JTextField();
        campoEmail = new JTextField();

        // Botão de cadastro
        JButton botaoCadastrar = new JButton("Cadastrar");

        // Adiciona ação ao botão
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Verifica se algum campo está vazio
                if (campoNome.getText().trim().isEmpty() || campoEmail.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", 
                                                  "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                }
            }
        });

        // Adiciona os componentes à janela
        add(labelNome);
        add(campoNome);
        add(labelEmail);
        add(campoEmail);
        add(new JLabel()); // Espaço vazio
        add(botaoCadastrar);

        // Configurações da janela
        setSize(350, 150);
        setLocationRelativeTo(null); // Centraliza na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroUsuario(); // Cria e exibe a janela
    }
}
