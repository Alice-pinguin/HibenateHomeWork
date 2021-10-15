package ua.goit;

import org.hibernate.Session;
import ua.goit.controller.ConsoleController;
import ua.goit.model.Company;
import ua.goit.model.Customer;
import ua.goit.model.Developer;
import ua.goit.model.Project;
import ua.goit.model.Skill;
import ua.goit.utils.HibernateSessionFactory;
import ua.goit.view.Console;
import java.util.HashSet;
import java.util.Set;

public class AddData {

    public static void main(String[] args) {

        Set<Project> projectStark = new HashSet<>();
        Set<Developer> developersStarks = new HashSet<> ();
        Set<Skill> seniorSkillC = new HashSet<> ();

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Company stark = Company.builder()
                .name("Stark Industries")
                .city("New York")
                .projects (projectStark)
                .build();
        session.save (stark);

        Project ironMan = Project.builder()
                .name ("Iron Man")
                .cost (1_000_000L)
                .company (stark)
                .developers (developersStarks)
                .build();
        projectStark.add (ironMan);
        session.save (ironMan);

        Customer avengers = Customer.builder ()
                .name ("Avengers")
                .industry ("super heroes")
                .projects (projectStark)
                .build ();
        session.save (avengers);

        Developer dev1 = Developer.builder ()
                .name ("Tony Stark")
                .age (30)
                .gender ("men")
                .salary (1_0000L)
                .projects (projectStark)
                .build ();
        developersStarks.add (dev1);
        session.save (dev1);

        Developer dev2 = Developer.builder ()
                .name ("Pepper Potts")
                .age (30)
                .gender ("women")
                .salary (6_500L)
                .projects (projectStark)
                .build ();
        developersStarks.add (dev2);
        session.save (dev2);

        Skill skill = Skill.builder()
                .language ("C")
                .level ("senior")
                .build();
        seniorSkillC.add (skill);
        session.save (skill);
        session.close();

        ConsoleController consoleController = new ConsoleController (new Console ());
        consoleController.process ();
    }
}
