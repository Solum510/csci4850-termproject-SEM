/**
 */
package util;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import datamodels.GameReview;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @since JavaSE-1.8
 */
public class UtilDBGamereview {
   static SessionFactory sessionFactory = null;

   public static SessionFactory getSessionFactory() {
      if (sessionFactory != null) {
         return sessionFactory;
      }
      Configuration configuration = new Configuration().configure();
      StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      sessionFactory = configuration.buildSessionFactory(builder.build());
      return sessionFactory;
   }

   public static List<GameReview> listEntries() {
      List<GameReview> resultList = new ArrayList<GameReview>();

      Session session = getSessionFactory().openSession();
      Transaction tx = null;  // each process needs transaction and commit the changes in DB.

      try {
         tx = session.beginTransaction();
         List<?> employees = session.createQuery("FROM GameReview").list();
         for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {
            GameReview entry = (GameReview) iterator.next();
            resultList.add(entry);
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
      return resultList;
   }

   public static List<GameReview> listEntries(String title, String author, String genres, int score) {
      List<GameReview> resultList = new ArrayList<GameReview>();

      Session session = getSessionFactory().openSession();
      Transaction tx = null;

      try {
         tx = session.beginTransaction();
         System.out.println((GameReview)session.get(GameReview.class, 1)); // use "get" to fetch data
        // Query q = session.createQuery("FROM Employee");
         List<?> reviews = session.createQuery("FROM GameReview").list();
         for (Iterator<?> iterator = reviews.iterator(); iterator.hasNext();) {
            GameReview review = (GameReview) iterator.next();
           if(review.getTitle().equalsIgnoreCase(title) || review.getAuthor().equalsIgnoreCase(author) || review.getGenres().equalsIgnoreCase(genres) || review.getScore().intValue() == score) {
        	   resultList.add(review);
           }
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
      return resultList;
   }

   public static void createEntries(String title, String author, List<String> genres, int score, String review) {
      Session session = getSessionFactory().openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         session.save(new GameReview(title, author, genres, score, review));
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
   }
}
