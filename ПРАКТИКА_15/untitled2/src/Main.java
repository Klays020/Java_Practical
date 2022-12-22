import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("Просто консоль");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.pink);
        jFrame.setBounds(720,200, 400, 500);
        String[] items = {
                "Россия",
                "Украина",
                "Япония",
                "Америка",
                "Китай",
                "Англия"
        };

        JLabel jLabel = new JLabel(items[0], JLabel.CENTER);
        jPanel.add(jLabel);

        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                jLabel.setText((String) comboBox.getSelectedItem());
            }
        });
        jPanel.add(comboBox);
        jFrame.getContentPane().add(jPanel);
        jFrame.setVisible(true);
    }
}
