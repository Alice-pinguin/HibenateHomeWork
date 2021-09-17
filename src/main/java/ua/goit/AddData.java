package ua.goit;

import org.hibernate.Session;

import ua.goit.model.Company;
import ua.goit.model.Customer;
import ua.goit.model.Developer;
import ua.goit.model.Project;
import ua.goit.model.Skill;
import ua.goit.utils.HibernateSessionFactory;
import java.util.HashSet;
import java.util.Set;

public class AddData {

   static Set<Project>  projectStark = new HashSet<>();
   static Set<Project> projectsUbisoft = new HashSet<> ();
   static Set<Project>projectsCd = new HashSet<> ();
   static Set<Developer>developersStarks = new HashSet<> ();
   static Set<Developer>developersUbisoft = new HashSet<> ();
   static Set<Developer> developersCd = new HashSet<> ();

    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Company stark = Company.builder()
                .name("Stark Industries")
                .city("New York")
                .projects (projectStark)
                .build();
        session.save (stark);
        Company ubisoft = Company.builder ()
                .name ("Ubisoft")
                .city ("Montreuil")
                .projects (projectsUbisoft)
                .build ();
        session.save (ubisoft);
        Company cd = Company.builder ()
                .name ("CD Projekt")
                .city ("Warshaw")
                .projects (projectsCd)
                .build ();
        session.save (cd);

        Developer dev1 = Developer.builder ()
                .name ("Tony Stark")
                .age (30)
                .gender ("men")
                .salary (1_0000L)
                .company (stark)
                .build ();
        developersStarks.add (dev1);
        session.save (dev1);

        Developer dev2 = Developer.builder ()
                .name ("Patrice Desilets")
                .age (26)
                .gender ("men")
                .salary (6_000L)
                .company (ubisoft)
                .build ();
        developersUbisoft.add (dev2);
        session.save (dev2);
        Developer dev3 = Developer.builder ()
                .name ("Ivan Nechay")
                .age (32)
                .gender ("men")
                .salary (4_000L)
                .company (ubisoft)
                .build ();
        developersStarks.add (dev3);
        session.save (dev3);
        Developer dev4 = Developer.builder ()
                .name ("Iryna Zagora")
                .age (25)
                .gender ("women")
                .salary (5_500L)
                .company (ubisoft)
                .build ();
        developersStarks.add (dev4);
        session.save (dev4);

        Developer dev5 = Developer.builder ()
                .name ("Pepper Potts")
                .age (30)
                .gender ("women")
                .salary (6_500L)
                .company (stark)
                .build ();
        developersStarks.add (dev5);
        session.save (dev5);
        Developer dev6 = Developer.builder ()
                .name ("Robert Pits")
                .age (36)
                .gender ("men")
                .salary (6_500L)
                .company (cd)
                .build ();
        developersCd.add (dev6);
        session.save (dev6);
        Developer dev7 = Developer.builder ()
                .name ("George Pet")
                .age (21)
                .gender ("men")
                .salary (3_500L)
                .company (cd)
                .build ();
        developersCd.add (dev7);
        session.save (dev7);

        Project ironMan = Project.builder()
                .name ("Iron Man")
                .cost (1_000_000L)
                .company (stark)
                .developer (dev1)
                .developer (dev5)
                .build();
        projectStark.add (ironMan);
        session.save (ironMan);

        Project assassins  = Project.builder()
                .name ("Assassin's Creed 2")
                .cost (24_000_000L)
                .company (ubisoft)
                .developer (dev2)
                .developer (dev3)
                .build();
        session.save (assassins);
        Project heroes = Project.builder()
                .name ("Heroes")
                .cost (1_000_000L)
                .company (ubisoft)
                .developer (dev4)
                .build();
        session.save (heroes);
        projectsUbisoft.add(assassins);
        projectStark.add (heroes);

        Project witcher = Project.builder ()
                .name ("Witcher")
                .cost (12_000_000L)
                .company (cd)
                .developer (dev5)
                .developer (dev6)
                .build();
        session.save (witcher);
        projectsCd.add (witcher);

        Customer avengers = Customer.builder ()
                .name ("Avengers")
                .industry ("super heroes")
                .company (stark)
                .build ();
        session.save (avengers);

        Customer playStation = Customer.builder()
                .name ("Sony playstation")
                .industry ("Gaming")
                .company (ubisoft)
                .build();
        session.save (playStation);

        Customer xBox = Customer.builder()
                .name ("Xbox")
                .industry ("Gaming")
                .company (cd)
                .build();
        session.save (xBox);


        Skill dev1Skill = Skill.builder()
                .language ("C")
                .level ("senior")
                .developer (dev1)
                .build();
        session.save (dev1Skill);
        Skill dev2Skill = Skill.builder()
                .language ("C#")
                .level ("senior")
                .developer (dev2)
                .build();
        session.save (dev2Skill);
        Skill dev3Skill = Skill.builder()
                .language ("C++")
                .level ("middle")
                .developer (dev3)
                .build();
        session.save (dev3Skill);
        Skill dev4Skill = Skill.builder()
                .language ("Java")
                .level ("middle")
                .developer (dev4)
                .build();
        session.save (dev4Skill);
        Skill dev5Skill = Skill.builder()
                .language ("C")
                .level ("junior")
                .developer (dev5)
                .build();
        session.save (dev5Skill);
        Skill dev6Skill = Skill.builder()
                .language ("C++")
                .level ("junior")
                .developer (dev6)
                .build();
        session.save (dev6Skill);
        Skill dev7Skill = Skill.builder()
                .language ("C#")
                .level ("senior")
                .developer (dev7)
                .build();
        session.save (dev7Skill);
        session.close();

    }
}
