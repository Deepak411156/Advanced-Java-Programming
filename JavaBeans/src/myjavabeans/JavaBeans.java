/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package myjavabeans;

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
}
