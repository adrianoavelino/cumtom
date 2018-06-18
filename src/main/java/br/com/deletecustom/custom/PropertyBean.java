/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deletecustom.custom;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author 3134301
 */

@ManagedBean(name = "bean")
@ViewScoped
public class PropertyBean {

//    @EJB
//    private PropertyEJB propertyEJB;
    
    @Inject
    private PropertyEJB properties;
    
    public void jndi() {
        System.out.println(properties.getProp1());
    }

}
