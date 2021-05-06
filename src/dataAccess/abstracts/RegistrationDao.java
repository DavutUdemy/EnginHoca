package dataAccess.abstracts;

import entities.concretes.Registration;

import java.util.List;

public  interface RegistrationDao {
    void addUser(Registration registration);
    void checkIfValid(Registration registration);
    void sendVerification(Registration registration);
    Boolean ActivateUser();

}
