import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {

    private BorderLayout bl = new BorderLayout();

    public Vista(){
        super("Trivias");
        setLayout(bl);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel(), p4 = new JPanel();
        add(colocarPanelPregunta(), BorderLayout.CENTER);
    }

    private JPanel colocarPanelPregunta(){
        GridLayout gl = new GridLayout(2,1);
        JPanel principal = new JPanel(); // Creas el panel a retornar
        JPanel panelPregunta = new JPanel();
        JPanel panelRespuesta = new JPanel();
        principal.setBackground(Color.BLUE);
        principal.setSize(100,100);
        panelPregunta.setBackground(Color.RED);
        panelRespuesta.setBackground(Color.GREEN);
        principal.setLayout(gl);
        principal.add(panelPregunta);
        principal.add(panelRespuesta);
        return principal;
    }



}
