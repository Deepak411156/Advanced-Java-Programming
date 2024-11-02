/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavabeans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class TemperatureBean implements Serializable {

    private int temp;
    private PropertyChangeSupport support;
    
    public TemperatureBean() {
        support = new PropertyChangeSupport(this);
    }
    
    public int getTemp() {
        return temp;
    }
    
    private int newTemp;
    
    public static final String PROP_NEWTEMP = "newTemp";

    /**
     * Get the value of newTemp
     *
     * @return the value of newTemp
     */
    public int getNewTemp() {
        return newTemp;
    }

    /**
     * Set the value of newTemp
     *
     * @param newTemp new value of newTemp
     */
    public void setNewTemp(int newTemp) {
        int oldNewTemp = this.newTemp;
        this.newTemp = newTemp;
        support.firePropertyChange(PROP_NEWTEMP, oldNewTemp, newTemp);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
    
    public static void main(String[] args) {
        TemperatureBean bean = new TemperatureBean();
        
        bean.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                
                System.out.println("Temperature Changed: Old-> " + evt.getOldValue() + ", New-> " + evt.getNewValue());
            }
            
        });
        
        bean.setNewTemp(25);
        bean.setNewTemp(30);
    }
}
