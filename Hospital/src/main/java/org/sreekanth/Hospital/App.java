package org.sreekanth.Hospital;

import java.util.ArrayList;

import org.sreekanth.Hospital.entity.Doctor;
import org.sreekanth.Hospital.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Doctor d = new Doctor();
        d.setName("d1");
        d.setEmail("d1.gmail.com");
        d.setSpecilization("genaral");
        d.setAvail(true);
        
        ArrayList<Person> list = new ArrayList<Person>();
        d.setPerson(list);
        
        
        Person p = new Person();
        p.setAddress("a");
        p.setEmail("a@gmail.com");
        p.setAge(20);
        p.setAddress("BNG");
//        p.setDoctors(null);
        
    }
}
