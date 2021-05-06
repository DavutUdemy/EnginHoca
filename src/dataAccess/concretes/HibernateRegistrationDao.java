package dataAccess.concretes;

import dataAccess.abstracts.RegistrationDao;
import entities.concretes.Registration;

public class HibernateRegistrationDao  implements RegistrationDao {


    @Override
    public void addUser(Registration registration) {
        System.out.println("Hibernate ile eklendi "+registration.getName());
    }

    @Override
    public void checkIfValid(Registration registration) {
        System.out.println("Hibernate ile 100% dogurlandi "+registration.getName());
    }

    @Override
    public void sendVerification(Registration registration) {
        System.out.println("Hibernate ile dogrulama kodu atildi "+registration.getName());

    }

    @Override
    public Boolean ActivateUser() {
return true;
    }
}
