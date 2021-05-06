package dataAccess.concretes;

import dataAccess.abstracts.RegistrationDao;
import entities.concretes.Registration;

public class AbcRegistrationDao implements RegistrationDao {


    @Override
    public void addUser(Registration registration) {
        System.out.println("Abc ile eklendi " + registration.getName());

    }

    @Override
    public void checkIfValid(Registration registration) {
        System.out.println("basarili bir sekilde dogrulandi");
    }

    @Override
    public void sendVerification(Registration registration) {
        System.out.println("Code atildi");
    }

    @Override
    public Boolean ActivateUser() {
return true;
    }
}
