package it.polimi.ingsw.model.game_objects.dashboard_objects;

import it.polimi.ingsw.model.game_objects.Place;
import it.polimi.ingsw.model.game_objects.Student;

import java.util.ArrayList;

public class Entrance implements Place {
    private final ArrayList<Student> students;

    public Entrance() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public void giveStudent(Place destination, Student student) {
        students.remove(student);
        destination.receiveStudent(student);
    }

    @Override
    public void receiveStudent(Student student) {
        students.add(student);
    }
}