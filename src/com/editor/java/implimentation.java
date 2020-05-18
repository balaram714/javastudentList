package com.editor.java;

import pack.student.student;

import java.util.*;

public class implimentation implements Iterable {

    List<student> Student = new LinkedList<>();
    ListIterator<student> myStudent = Student.listIterator();

    public void addition(student a) {
        myStudent.add(a);

    }

    public void removal() {
        myStudent.remove();
    }

    public void display() {

        while (myStudent.hasNext()) {

            System.out.print(myStudent.next().getStudent_name());

        }

    }

    @Override
    public Iterator iterator() {
        return Student.iterator();
    }
}


