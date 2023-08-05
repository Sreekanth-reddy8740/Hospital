package org.sreekanth.Hospital.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sreekanth.Hospital.entity.Person;

public class SessionFactoryUtil {

private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory==null) {
			
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(Person.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
