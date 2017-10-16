package services;

import javax.inject.Inject;

public class Service1 {
    @Inject
    public Service1() {
        System.out.println("inject service1");
    }
}
