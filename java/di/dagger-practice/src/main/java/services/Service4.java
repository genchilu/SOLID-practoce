package services;

import dao.Dao;

import javax.inject.Inject;
import javax.inject.Named;

public class Service4 {
    @Inject
    @Named("1")
    public Dao dao;
    @Inject
    public Service4() {
        System.out.println("inject service4");
    }
}
