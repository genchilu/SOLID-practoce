package services;

import javax.inject.Inject;

public class Service3 {
    @Inject
    public Service3() {
        System.out.println("inject service3");
    }
}
