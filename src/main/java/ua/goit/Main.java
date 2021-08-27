package ua.goit;

import com.google.gson.Gson;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import ua.goit.model.Company;
import ua.goit.model.Developer;
import ua.goit.model.Project;
import ua.goit.repository.CrudRepository;
import ua.goit.repository.RepositoryFactory;
import ua.goit.utils.HibernateSessionFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        

    }
}
