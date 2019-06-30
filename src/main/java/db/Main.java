package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
/*        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate?createDatabaseIfNotExist=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "2206");*/
        /* DbManager dbManager = new DbManager();
        dbManager.createDb(connection);

        dbManager.clearTable(connection);
        CatManager catManager = new CatManager();
        catManager.createCat(connection);

        List<Cat> cats = catManager.findAllCats(connection);
        System.out.println(cats);                         to jest jdbc                     */

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory session = configuration.buildSessionFactory();

        Cat c =  new Cat("Rys",2000,"Brown");
        Cat c2 =  new Cat("Syr",0002,"Black");

        CatManager catManager = new CatManager();
        catManager.createCat(session.openSession(),c);
        catManager.createCat(session.openSession(),c2);
    }













}
