import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmoticonKeyboard extends JFrame {

    // Array de emoticonos
    private static final String[] emoticons = {":)", ":(", ";)", ";(", ":D", ":/", "xD", "<3"};

    // Botones para mostrar los emoticonos
    private JButton[] buttons = new JButton[emoticons.length];

    public EmoticonKeyboard() {
        super("Emoticon Keyboard");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear los botones deseados y los añade al teclado al teclado
        for (int i = 0; i < emoticons.length; i++) {
            buttons[i] = new JButton(emoticons[i]);
            add(buttons[i]);
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    System.out.println(button.getText());
                }
            });
        }
    }

    public static void main(String[] args) {
        EmoticonKeyboard keyboard = new EmoticonKeyboard();
        keyboard.setVisible(true);
    }
}
