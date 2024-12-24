
import java.io.*;
import java.io.Serializable;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class JavaBeans implements Serializable {

    private String userName;
    private int age;

    public JavaBeans() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        JavaBeans jb = new JavaBeans();

        jb.setUserName("Deepak Bhatta");
        System.out.println("User Name : " + jb.getUserName());

        jb.setAge(30);
        System.out.println("Age : " + jb.getAge());

        }
}
