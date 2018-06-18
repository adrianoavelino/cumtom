/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deletecustom.custom;

import java.util.Properties;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author 3134301
 */
@LocalBean
@Stateless
public class PropertyEJB {
    
    @Resource(name="properties/example")
    private Properties properties;
    
    public String getProp1() {
        return properties.getProperty("prop1");
    }

}
