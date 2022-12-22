
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task3 extends JFrame {
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile = {{"Файл"     ,  "Ф",  "", ""}, {"Открыть"  ,  "О", "O", ""}, {"Сохранить",  "С", "S", ""}};
    private  final  String[][]  menuEdit = {{"Редактирование" , "Р",  "", ""}, {"Вырезать"  , "В", "X", "images/cut.png"}, {"Копировать", "К", "C", "images/copy.png"}};
    private JMenu createMenuItems(final String[][] items) {

        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {
            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0));
            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0), KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0) {
                item.setIcon(new ImageIcon(items[i][3]));
            }
            menu.add(item);
        }
        return menu;
    }
    private JMenu createSub() {
        JMenu text = new JMenu("Текст");
        JMenu style = new JMenu("Стиль");
        JMenuItem bold = new JMenuItem("Жирный");
        JMenuItem italic = new JMenuItem("Курсив");
        JMenu font = new JMenu("Шрифт");
        JMenuItem times = new JMenuItem("Times");
        JMenuItem arial = new JMenuItem("Arial");
        font.add(times);
        font.add(arial);
        style.add(bold);
        style.add(italic);
        style.addSeparator();
        style.add(font);
        text.add(style);
        return text;
    }
    public Task3() {
        super("Просто консоль 3");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuItems(menuFile));
        menuBar.add(createMenuItems(menuEdit));
        menuBar.add(createSub());
        menuBar.add(Box.createHorizontalGlue());
        setJMenuBar(menuBar);
        setBounds(760,400, 400, 300);
        menuBar.setBackground(Color.white);
        JPanel panel = new JPanel();
        JTextField textArea = new JTextField("",20);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        panel.setBackground(Color.pink);
        panel.add(button1);
        panel.add(button2);
        panel.add(textArea);
        this.getContentPane().add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task3();
    }
}