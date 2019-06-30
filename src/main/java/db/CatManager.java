package db;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CatManager {


    public void createCat(Session session, Cat cat){

        Transaction transaction =session.getTransaction();
        transaction.begin();
        session.save(cat);
        transaction.commit();
        session.close();



    }
}