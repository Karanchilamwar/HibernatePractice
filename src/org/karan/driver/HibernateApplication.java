package org.karan.driver;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.karan.dto.Address;
import org.karan.dto.FoutWheeler;
import org.karan.dto.TwoWheeler;
import org.karan.dto.Vehical;
import org.karan.dto.userDetails;

public class HibernateApplication {
public static void main(String[] args) {
	Vehical vehical=new Vehical();
	vehical.setChesisNumber("1234");
	vehical.setLicenceNumber("KARN12");
	
	TwoWheeler twoWheeler=new TwoWheeler();
	twoWheeler.setSterringType("Two wheeler");
	twoWheeler.setLicenceNumber("123456");
	
	FoutWheeler foutWheeler=new FoutWheeler();
	foutWheeler.setSterringType("Four wheeler sterring type");
	
	
	try {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	session.beginTransaction();
	session.save(vehical);
	session.save(twoWheeler);
	session.save(foutWheeler);
	session.getTransaction().commit();
      	
	session.close();
	

	}catch(Exception exception) {
		exception.printStackTrace();
	}
	
}
}
