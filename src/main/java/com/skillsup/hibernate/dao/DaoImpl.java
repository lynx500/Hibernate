package com.skillsup.hibernate.dao;

import com.skillsup.hibernate.dao.entity.Composition;
import com.skillsup.hibernate.dao.entity.Instrument;
import com.skillsup.hibernate.dao.entity.Performance;
import com.skillsup.hibernate.dao.entity.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Instrument> getAllInstruments() {
        return sessionFactory.getCurrentSession().createQuery("from Instrument").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Composition> getAllCompositions() {
        return sessionFactory.getCurrentSession().createQuery("from Composition").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Performance> getAllPerformances() {
        return sessionFactory.getCurrentSession().createQuery("from Performance").list();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findStudentByInstrumentType(String type) {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("SELECT s FROM Student as s inner join s.instrument as i WHERE i.type = :type")
                .setString("type", type);
        return query.list();
    }

    @Override
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        sessionFactory.getCurrentSession().delete(student);
    }

    @Override
    public void addInstrument(Instrument instrument) {
        sessionFactory.getCurrentSession().save(instrument);
    }

    @Override
    public void deleteInstrument(Instrument instrument) {
        sessionFactory.getCurrentSession().delete(instrument);
    }

    @Override
    public void addComposition(Composition composition) {
        sessionFactory.getCurrentSession().save(composition);
    }

    @Override
    public void deleteComposition(Composition composition) {
        sessionFactory.getCurrentSession().delete(composition);
    }

    @Override
    public void addPerformance(Performance performance) { sessionFactory.getCurrentSession().save(performance); }

    @Override
    public void deletePerformance(Performance performance) { sessionFactory.getCurrentSession().delete(performance); }
}
