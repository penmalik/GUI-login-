import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame jframe = new JFrame();


    JPanel jpAnel = new JPanel();

    static JLabel jLabel;
    static JTextField user_text;
    static JLabel jLabel2;
    static JPasswordField user_pass;
    static JButton jbutton;
    static JLabel success;

        public static void main(String[] args) {
            // GUI -> GRAPHICAL USER INTERFACE

            JPanel jpanel = new JPanel();
            JFrame jframe = new JFrame();

            // SETTING THE HEIGHT AND WIDTH OF THE MAIN WINDOW
            jframe.setSize(450, 250);
            // SETTING THE EXIT FUNCTION
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //ADDING THE PANEL CLASS TO THE FRAME
            jframe.add(jpanel);

            // CHANGING THE SETTING OF AUTOMATIC ALIGNMENT TO NULL
            jpanel.setLayout(null);

            // creating instance of class JLABEL
            jLabel = new JLabel("User : ");

            jLabel.setBounds(10, 20, 80, 25);
            jpanel.add(jLabel);

            user_text = new JTextField(20);

            user_text.setBounds(100, 20, 165, 25);
            jpanel.add(user_text);


            jLabel2 = new JLabel("Password : ");

            jLabel2.setBounds(10, 50, 80, 25);
            jpanel.add(jLabel2);

            user_pass = new JPasswordField(20);

            user_pass.setBounds(100, 50, 165, 25);
            jpanel.add(user_pass);

            jbutton = new JButton("Login");
            jbutton.setBounds(80, 80, 80, 25);
            jbutton.addActionListener(new GUI());
            jpanel.add(jbutton);

            success = new JLabel("");
            success.setBounds(10, 110, 300, 25);
            jpanel.add(success);


            // FRAME VISIBILITY
            jframe.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = user_text.getText();
        String pass = user_pass.getText();
        System.out.println("Username: "+ user + " \nPassword: " + pass);

        if (user.equals("admin") && pass.equals("12345")){
            success.setText("Login successful!");
        } else if (user.isBlank() && pass.isBlank()) {
            success.setText("No username/password entered!");
        }else{
            success.setText("Wrong details entered, please try again!");

        }

    }
}
