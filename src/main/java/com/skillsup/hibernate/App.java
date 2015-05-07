package com.skillsup.hibernate;

import com.skillsup.hibernate.dao.entity.Instrument;
import com.skillsup.hibernate.dao.entity.Student;
import com.skillsup.hibernate.service.SchoolService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.context");

        SchoolService service = context.getBean(SchoolService.class);
        System.out.println(service.getAllStudents());

        System.out.println(service.findStudentByInstrumentType("Grand piano"));

        service.showDetailedInfoAboutAllPerformances(service.getAllPerformances());

    }
}
