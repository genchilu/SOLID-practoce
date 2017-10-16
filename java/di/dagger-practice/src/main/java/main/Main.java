package main;

import busines.Business1;
import busines.DaggerBusinessComponent;

public class Main {
    public static void main(String []args){
        Business1 business = new Business1();
        DaggerBusinessComponent.create().inject(business);
        System.out.println(business.service4.dao.printDaoName());
    }
}
