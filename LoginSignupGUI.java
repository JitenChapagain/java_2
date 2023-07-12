import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoginSignupGUI extends JFrame implements ActionListener
{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;

    public LoginSignupGUI()
    {
        // Create the GUI components
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        signupButton = new JButton("Signup");

        // Set layout for the frame
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(new JLabel("Username: "));
        add(usernameField);
        add(new JLabel("Password: "));
        add(passwordField);
        add(loginButton);
        add(signupButton);

        // Add action listeners
        loginButton.addActionListener(this);
        signupButton.addActionListener(this);

        // Set frame properties
        setTitle("Login and Signup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new LoginSignupGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == loginButton)
        {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (login(username, password))
            {
                JOptionPane.showMessageDialog(this, "Login successful!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
        else if (e.getSource() == signupButton)
        {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (signup(username, password))
            {
                JOptionPane.showMessageDialog(this, "Signup successful!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Username already exists.");
            }
        }
    }

    private boolean login(String username, String password)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password))
                {
                    return true;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return false;
    }

    private boolean signup(String username, String password)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(username))
                {
                    return false;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true)))
        {
            writer.write(username + ":" + password);
            writer.newLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return true;
    }
}