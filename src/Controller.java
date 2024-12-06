import javax.swing.*;
import java.awt.event.ActionEvent;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
        initView();
    }
    public void initView() {
    view.getFirstNameTextField().setText(model.getFirstname());
    view.getLastNameTextField().setText(model.getLastname());
    }
    public void initController(){
        view.getFirstNameSaveButton().addActionListener(e-> saveFirstName());
        view.getLastNameSaveButton().addActionListener(e-> saveLastName());
        view.getHello().addActionListener(e-> SayHello());
        view.getBye().addActionListener(e-> SayBye());
    }
    private void saveFirstName(){
        model.setFirstname(view.getFirstNameTextField().getText());
        JOptionPane.showMessageDialog(null,"First Name Saved","imfo",JOptionPane.INFORMATION_MESSAGE);
    }
    private void saveLastName(){
        model.setLastname(view.getLastName().getText());
        JOptionPane.showMessageDialog(null,"Last Name Saved","imfo",JOptionPane.INFORMATION_MESSAGE);
    }
    private void SayHello(){
        JOptionPane.showMessageDialog(null,"Hello"+" "+model.getFirstname()+" "+model.getLastname(),"imfo",JOptionPane.INFORMATION_MESSAGE);
    }
    private void SayBye(){
        System.exit(0);
    }
}
