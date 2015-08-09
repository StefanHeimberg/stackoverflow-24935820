package com.mycompany.mavenproject1;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class Info {

    public String getVersion() {
        return FacesContext.class.getPackage().getImplementationVersion();
    }
    
}
