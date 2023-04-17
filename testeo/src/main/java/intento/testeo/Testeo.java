package intento.testeo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Testeo extends JFrame implements ActionListener {

    // Componentes de la interfaz
    private JLabel emailLabel, passwordLabel;
    private JTextField emailTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Testeo() {
        // Configurar la ventana
        setTitle("Inicio de sesión");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        // Crear los componentes
        emailLabel = new JLabel("Correo:");
        passwordLabel = new JLabel("Contraseña:");
        emailTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Iniciar sesión");

        // Agregar los componentes a la ventana
        add(emailLabel);
        add(emailTextField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel(""));
        add(loginButton);

        // Agregar el ActionListener al botón de inicio de sesión
        loginButton.addActionListener(this);

        // Hacer visible la ventana
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Obtener el correo y la contraseña ingresados
        String email = emailTextField.getText();
        String password = new String(passwordField.getPassword());

        // Verificar si el correo y la contraseña son correctos
        if (email.equals("usuario@example.com") && password.equals("contraseña")) {
            // Si son correctos, mostrar un mensaje de bienvenida
            JOptionPane.showMessageDialog(this, "Bienvenido " + email + "!");
            dispose();
        } else {
            // Si son incorrectos, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
            // Limpiar los campos de correo y contraseña
            emailTextField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la interfaz de inicio de sesión
        new Testeo();
    }

}





