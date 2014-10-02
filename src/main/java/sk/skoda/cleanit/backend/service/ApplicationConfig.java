/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.skoda.cleanit.backend.service;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author andrej
 */
@javax.ws.rs.ApplicationPath("rs")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(sk.skoda.cleanit.backend.NewCrossOriginResourceSharingFilter.class);
        resources.add(sk.skoda.cleanit.backend.service.ClientFacadeREST.class);
        resources.add(sk.skoda.cleanit.backend.service.CountriesFacadeREST.class);
        resources.add(sk.skoda.cleanit.backend.service.OfferFacadeREST.class);
    }
    
}
