package org.sreekanth.Hospital.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sreekanth.Hospital.entity.Person;
import org.sreekanth.Hospital.util.SessionFactoryUtil;

public class HospitalRepository {
	
		public void savePersonData(Person person) {
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.merge(person);
			transaction.commit();
		}
	}
