package com.example.application.views.place;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("hello-world")
public class Hello extends VerticalLayout {

    public Hello() {
        H1 title = new H1("Привет мир");

        add(title);
        setJustifyContentMode(JustifyContentMode.CENTER);
    }
}
