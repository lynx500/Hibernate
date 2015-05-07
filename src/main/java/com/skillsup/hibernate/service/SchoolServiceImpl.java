package com.skillsup.hibernate.service;

import com.skillsup.hibernate.dao.Dao;
import com.skillsup.hibernate.dao.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private Dao dao;

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> findStudentByInstrumentType(String type) {
        return dao.findStudentByInstrumentType(type);
    }

    @Override
    public void changeInstrumentBetweenStudents(Student stud1, Student stud2) {
        Instrument instrument1 = stud1.getInstrument();
        Instrument instrument2 = stud2.getInstrument();
        stud1.setInstrument(instrument2);
        dao.addStudent(stud1);
        stud2.setInstrument(instrument1);
        dao.addStudent(stud2);
    }

    @Override
    public void addCompositionIntoPerformance(Performance performance, Composition composition) {
        performance.setComposition(composition);
        dao.addPerformance(performance);

    }

    @Override
    public void showDetailedInfoAboutPerformance(Performance performance){
        System.out.println(performance.toString());
    }

    @Override
    public void showDetailedInfoAboutAllPerformances(List<Performance> performances){
        for (Performance perf : performances) {
            System.out.println(perf.toString());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return dao.getAllInstruments();
    }

    @Override
    public List<Composition> getAllCompositions(){
        return dao.getAllCompositions();
    }

    @Override
    public List<Performance> getAllPerformances(){
        return dao.getAllPerformances();
    }

    @Override
    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    @Override
    public void deleteStudent(Student student) {
        dao.deleteStudent(student);
    }

    @Override
    public void addInstrument(Instrument instrument) {
        dao.addInstrument(instrument);
    }

    @Override
    public void deleteInstrument(Instrument instrument) {
        dao.deleteInstrument(instrument);
    }

    @Override
    public void addComposition(Composition composition) {
        dao.addComposition(composition);
    }

    @Override
    public void deleteComposition(Composition composition) {
        dao.deleteComposition(composition);
    }

    @Override
    public void addPerformance(Performance performance) {
        dao.addPerformance(performance);
    }

    @Override
    public void deletePerformance(Performance performance) {
        dao.deletePerformance(performance);
    }
}
