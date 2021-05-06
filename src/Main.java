import business.abstracts.RegistrationService;
import business.concretes.RegistrationManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbcRegistrationDao;
import entities.concretes.Registration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO: Spring IoC ile çözülecek
        RegistrationService registrationService = new RegistrationManager(new AbcRegistrationDao(), new JLoggerManagerAdapter());
        Registration user1 = new Registration("zeli", "mamedovi", "zeb@gmail.com", "514010191");

            registrationService.addUser(user1);


        }
    }
