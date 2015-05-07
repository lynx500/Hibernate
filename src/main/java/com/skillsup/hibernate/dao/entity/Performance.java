package com.skillsup.hibernate.dao.entity;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "PERFORMANCE")
public class Performance {

    @Id
    @Column
    private long id;

    @OneToOne
    private Composition composition;

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    @OneToMany(targetEntity = Student.class)
    @JoinTable(name = "PERFORMANCE_PARTICIPANTS",
            joinColumns = {
                    @JoinColumn(name = "PERFORMANCE_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "STUDENT_ID")
            }
    )
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "id=" + id +
                ", composition=" + composition +
                '}';
    }
}