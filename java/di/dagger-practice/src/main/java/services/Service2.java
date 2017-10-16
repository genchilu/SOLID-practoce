package services;

import javax.inject.Inject;

public class Service2 {
    @Inject
    public Service2() {
        System.out.println("inject service2");
    }
}
