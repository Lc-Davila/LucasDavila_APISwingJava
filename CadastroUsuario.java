import javax.swing.*; //importa as classes para criar a interface gráfica
import java.awt.*;    //importa os gerenciadores de layout
import java.awt.event.*; //importa os eventos e ActionListener

public class CadastroUsuario extends JFrame {

    //campos de texto
    private JTextField campoNome;
    private JTextField campoEmail;

    public CadastroUsuario() {
        super("Cadastro de Usuário"); //título da janela

        //define o layout da janela (2 linhas, 2 colunas)
        setLayout(new GridLayout(3, 2, 5, 5));

        //título
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelEmail = new JLabel("E-mail:");

        //campos de entrada
        campoNome = new JTextField();
        campoEmail = new JTextField();

        //botão de cadastro
        JButton botaoCadastrar = new JButton("Cadastrar");

        //adiciona ação ao botão
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //verifica se algum campo está vazio
                if (campoNome.getText().trim().isEmpty() || campoEmail.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", 
                                                  "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                }
            }
        });

        //adiciona os componentes à janela
        add(labelNome);
        add(campoNome);
        add(labelEmail);
        add(campoEmail);
        add(new JLabel()); //espaço vazio
        add(botaoCadastrar);

        //configurações da janela
        setSize(350, 150);
        setLocationRelativeTo(null); //centraliza na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroUsuario(); //cria e exibe a janela
    }
}


