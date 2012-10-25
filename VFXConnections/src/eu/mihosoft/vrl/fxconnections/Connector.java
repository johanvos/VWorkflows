/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.mihosoft.vrl.fxconnections;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Control;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class Connector extends Control {

    public static final String DEFAULT_STYLE_CLASS = "connector";
    
    
    public Connector() {
        getStyleClass().setAll(DEFAULT_STYLE_CLASS);
    }
    
    
    @Override
    protected String getUserAgentStylesheet() {
        return Constants.DEFAULT_STYLE;
    }
    
}
