import javax.swing.JFrame;

public class TrianguloSierpinsk extends JFrame {

    public TrianguloSierpinsk() {
        initGui();
    }

    private void initGui(){
        setTitle("Triângulo de Sierpinsk");
        setSize(750,750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Desenho desenho = new Desenho();
        add(desenho);

        setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        // TrianguloSierpinsk ts= new TrianguloSierpinsk();
        new TrianguloSierpinsk();
    }
}
