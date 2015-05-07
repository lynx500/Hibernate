package com.skillsup.hibernate.service;

import com.skillsup.hibernate.dao.entity.Composition;
import com.skillsup.hibernate.dao.entity.Instrument;
import com.skillsup.hibernate.dao.entity.Performance;
import com.skillsup.hibernate.dao.entity.Student;

import java.util.List;

public interface SchoolService {
    List<Student> getAllStudents();
    List<Instrument> getAllInstruments();
    List<Composition> getAllCompositions();
    List<Performance> getAllPerformances();

    void addStudent(Student student);
    void deleteStudent(Student student);
    void addInstrument(Instrument instrument);
    void deleteInstrument(Instrument instrument);
    void addComposition(Composition composition);
    void deleteComposition(Composition composition);
    void addPerformance(Performance performance);
    void deletePerformance(Performance performance);

    List<Student> findStudentByInstrumentType(String type);
    void changeInstrumentBetweenStudents(Student stud1, Student stud2);
    void addCompositionIntoPerformance(Performance performance, Composition composition);
    void showDetailedInfoAboutPerformance(Performance performance);
    void showDetailedInfoAboutAllPerformances(List<Performance> performances);
}
