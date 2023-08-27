import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);
        String[] animal = {"Cat", "Bird", "Dog"};
        comboBox = new JComboBox(animal);
        comboBox.addItem("ME");
        comboBox.insertItemAt("Human",0);
        comboBox.setSelectedIndex(0);
        add(comboBox);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
