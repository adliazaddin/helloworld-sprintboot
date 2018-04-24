/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.helloworld;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 *
 * @author Mohd Adli Azaddin
 */
@SpringUI
public class MainUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        Label title = new Label();
        title.setValue("hello world");
        setContent(title);
    }

    
    
}
