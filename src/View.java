import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JLabel FirstName;
    private JLabel LastName;
    private JTextField FirstNameTextField;
    private JTextField LastNameTextField;
    private JButton FirstNameSaveButton;
    private JButton LastNameSaveButton;
    private JButton hello;
    private JButton Bye;

    public View(String SwingApp) {
        frame = new JFrame(SwingApp);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //Creating UserInterface Elements
        FirstName = new JLabel("FirstName: ");
        LastName = new JLabel("LastName: ");
        FirstNameTextField = new JTextField();
        LastNameTextField = new JTextField();
        FirstNameSaveButton = new JButton("Save Firstname");
        LastNameSaveButton = new JButton("Save Lastname");
        hello = new JButton("Hello");
        Bye = new JButton("Bye Bye!");

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(FirstName)
                        .addComponent(LastName).
                        addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(FirstNameSaveButton)
                                .addComponent(LastNameSaveButton)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(FirstNameTextField)
                                        .addComponent(LastNameTextField))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(hello)
                                        .addComponent(Bye))
                        )));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstName)
                        .addComponent(FirstNameTextField)
                        .addComponent(FirstNameSaveButton)
                        .addComponent(hello))

                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(LastName)
                        .addComponent(LastNameTextField)
                        .addComponent(LastNameSaveButton)
                        .addComponent(Bye)));
        layout.linkSize(SwingConstants.HORIZONTAL, FirstNameSaveButton, LastNameSaveButton);
        layout.linkSize(SwingConstants.HORIZONTAL, hello, Bye);
        frame.getContentPane().setLayout(layout);
    }

    public JTextField getFirstNameTextField() {
        return FirstNameTextField;
    }

    public void setFirstNameTextField(JTextField firstNameTextField) {
        FirstNameTextField = firstNameTextField;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getFirstName() {
        return FirstName;
    }

    public void setFirstName(JLabel firstName) {
        FirstName = firstName;
    }

    public JLabel getLastName() {
        return LastName;
    }

    public void setLastName(JLabel lastName) {
        LastName = lastName;
    }

    public JTextField getLastNameTextField() {
        return LastNameTextField;
    }

    public void setLastNameTextField(JTextField lastNameTextField) {
        LastNameTextField = lastNameTextField;
    }

    public JButton getFirstNameSaveButton() {
        return FirstNameSaveButton;
    }

    public void setFirstNameSaveButton(JButton firstNameSaveButton) {
        FirstNameSaveButton = firstNameSaveButton;
    }

    public JButton getLastNameSaveButton() {
        return LastNameSaveButton;
    }

    public void setLastNameSaveButton(JButton lastNameSaveButton) {
        LastNameSaveButton = lastNameSaveButton;
    }

    public JButton getHello() {
        return hello;
    }

    public void setHello(JButton hello) {
        this.hello = hello;
    }

    public JButton getBye() {
        return Bye;
    }

    public void setBye(JButton bye) {
        this.Bye = bye;
    }

}


