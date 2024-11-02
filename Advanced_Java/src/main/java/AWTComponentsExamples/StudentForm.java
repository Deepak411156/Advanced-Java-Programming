/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTComponentsExamples;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class StudentForm extends Frame {

    Label lblName, lblEmail, lblPassword, lblAddress, lblGender, lblSkills, lblImage, lblCourse, lblCountry;
    TextField txtName, txtEmail, txtPassword;
    TextArea txtAddress;
    Checkbox ckboxPHP, ckboxJava, ckboxPython;
    CheckboxGroup ckboxGender;
    Checkbox ckboxMale, ckboxFemale, ckboxOthers;
    Choice chCourse;
    List listCountry;
    Button btnSubmit, btnClear;
    Canvas canvas;

    public StudentForm() {
        setLayout(new FlowLayout());

        lblName = new Label("Name: ");
        add(lblName);

        txtName = new TextField(20);
        add(txtName);

        lblEmail = new Label("Email: ");
        add(lblEmail);

        txtEmail = new TextField(20);
        add(txtEmail);

        lblPassword = new Label("Password: ");
        add(lblPassword);

        txtPassword = new TextField(20);
        add(txtPassword);
        txtPassword.setEchoChar('*');

        lblAddress = new Label("Address: ");
        add(lblAddress);

        txtAddress = new TextArea(3, 20);
        add(txtAddress);

        lblGender = new Label("Gender: ");
        add(lblGender);

        ckboxGender = new CheckboxGroup();
        ckboxMale = new Checkbox("Male", ckboxGender, true);
        ckboxFemale = new Checkbox("Female", ckboxGender, false);
        ckboxOthers = new Checkbox("Others", ckboxGender, false);
        add(ckboxMale);
        add(ckboxFemale);
        add(ckboxOthers);

        lblSkills = new Label("Skills: ");
        add(lblSkills);

        ckboxPHP = new Checkbox("PHP");
        ckboxJava = new Checkbox("Java", true);
        ckboxPython = new Checkbox("Python");
        add(ckboxPHP);
        add(ckboxJava);
        add(ckboxPython);

        lblCourse = new Label("Course: ");
        add(lblCourse);

        chCourse = new Choice();
        chCourse.setSize(10, 50);
        chCourse.add("--- Select Course ---");
        chCourse.add("B.SC. CSIT");
        chCourse.add("B.Ed. CSIT");
        chCourse.select(2);
        chCourse.add("BE Computer");
        chCourse.add("BCA");
        chCourse.add("BIT");
        chCourse.add("BIM");
        chCourse.add("MCA");
        add(chCourse);

        lblCountry = new Label("Country: ");
        add(lblCountry);

        listCountry = new List(3, true);
        listCountry.add("USA");
        listCountry.add("Russia");
        listCountry.add("China");
        listCountry.add("India");
        listCountry.add("Nepal");
        listCountry.select(4);
        listCountry.add("Australia");
        listCountry.add("Japan");
        listCountry.add("Korea");
        add(listCountry);

        lblImage = new Label("Profile Picture: ");
        add(lblImage);

        Image image = Toolkit.getDefaultToolkit().getImage("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Final DBK and Knightech Nepal Logor.png");

        canvas = new Canvas() {
            public void paint(Graphics g) {
                g.drawRect(0, 0, 100, 100);
                g.drawImage(image, 0, 0, 100, 100, this);
            }
        };
        canvas.setSize(100, 100);
        add(canvas);

        setTitle("Student Form - AWT JAVA");
        setSize(280, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new StudentForm();
    }

}
