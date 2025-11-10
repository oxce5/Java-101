import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class GUI_JOptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello"); //Message Dialog

        JOptionPane.showMessageDialog(null, "This is a warning",
                "Warning",
                JOptionPane.WARNING_MESSAGE); //You can change it: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE

        String name = JOptionPane.showInputDialog("Enter your name"); //Accept user input using .showInputDialog method

        String pay = JOptionPane.showInputDialog("Enter Payment");  //Integer input - Separate Parsing
        int payment2 = Integer.parseInt(pay);
        
        int payment = Integer.parseInt(JOptionPane.showInputDialog("Enter Payment")); //Integer input - Inline Parsing
    
        //Confirmation Dialog
        int response = JOptionPane.showConfirmDialog(null,
                "Do your want to save changes?",
                "Save Changes",
                JOptionPane.YES_NO_CANCEL_OPTION); //You can change it: YES_NO_OPTION, OK_CANCEL_OPTION

        //Decision using confirmation dialog
        if (response == JOptionPane.YES_OPTION) { //You can use == sign because response is in integer datatype
            JOptionPane.showMessageDialog(null, "You clicked Yes!");
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You clicked No!");
        } else if (response == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You clicked Cancel!");
        }


        //Combobox
        //Array used for list of options
        String[] options = { "Java", "Python", "C++", "JavaScript" };

        //add icons to the combobox
        ImageIcon icon = new ImageIcon("C:\\Users\\Jude\\IdeaProjects\\Playground\\src\\waw.png");
        String language = (String) JOptionPane.showInputDialog(
                null, "Choose your favorite language:",
                "Language Selection",
                JOptionPane.QUESTION_MESSAGE,
                icon, options, options[0]);
    }
}
