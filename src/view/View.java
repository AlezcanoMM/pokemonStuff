package view;

import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{
    String[] Types = {"", "Normal", "Fire", "Water", "Electric", "Grass", "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel", "Fairy"};
    private final JTextField Name = new JTextField(10);
    private final JComboBox Type1 = new JComboBox(Types);
    private final JComboBox Type2 = new JComboBox(Types);
    private final JButton find = new JButton("Find!");
    
    public View() {
        JPanel pokePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pokePanel.setSize(600, 200);
        
        pokePanel.add(Name);
        pokePanel.add(Type1);
        pokePanel.add(Type2);
        pokePanel.add(find);
        
        this.add(pokePanel);
    }

    public String getPName() {
        return standardize(Name.getText());
    }

    public String getType1() {
        return (String) Type1.getSelectedItem();
    }

    public String getType2() {
        return (String) Type2.getSelectedItem();
    }
    
    public void addFindListener(ActionListener listenForFind){
        find.addActionListener(listenForFind);
    }
    
    public void displayErrorMessage(String error){
        JOptionPane.showMessageDialog(this, error);
    }

    private String standardize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
    
    public void displayExecInfo(){
        System.out.println("Pokemon with this type/s:" + getType1() + " " + getType2());
    }
}
