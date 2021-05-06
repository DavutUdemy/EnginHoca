package business.concretes;

import business.abstracts.RegistrationService;
import core.LoggerService;
import dataAccess.abstracts.RegistrationDao;
import entities.concretes.Registration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationManager implements RegistrationService {
    private final RegistrationDao registrationDao;
    private final LoggerService loggerService;
    List<Registration> registrationsList = new ArrayList<>();

    public RegistrationManager(RegistrationDao registrationDao, LoggerService loggerService) {
        this.registrationDao = registrationDao;
        this.loggerService = loggerService;
    }
    @Override
    public void addUser(Registration registration) {
        checkIfValid(registration);
       
        this.registrationDao.addUser(registration);
        this.loggerService.logToSystem("Kullanici Eklendi ->" + registration.getName());


    }

    @Override
    public void checkIfValid(Registration registration) {

        String email = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPath = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
        Matcher matcher =emailPath.matcher(registration.getEmail());
        if(matcher.find()==false){
            throw new IllegalStateException("incorrect email");

        }

        if(registration.getPassword().length()<6){
            throw new IllegalStateException("Password must be minimum 6");
        }
        if(registration.getName().length()<2){
            throw new IllegalStateException("Name must be minimum 2");
        }
        if(registration.getPassword().length()<2){
            throw new IllegalStateException("Password must be minimum 2");
        }
        sendVerification(registration);
        registrationsList.add(registration);


    }

    @Override
    public void sendVerification(Registration registration) {
        System.out.println("Verification Code send");
    }

    public boolean validateEmail(Registration registration){
        String email = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPath = Pattern.compile(email, Pattern.CASE_INSENSITIVE);
        Matcher matcher =emailPath.matcher(registration.getPassword());
        if(matcher.find()==false){
            throw new IllegalStateException("There is a user with this email");

        }
        return    matcher.find();

    }

    @Override
    public Boolean ActivateUser() {

       return true;

    }
}
