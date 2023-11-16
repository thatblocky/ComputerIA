package csia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditya
 */
import csia.Exercise;
import java.util.ArrayList;
import java.util.List;
public class ex_database {
    
}
class FileNode {
    private String name;
    private List<FileNode> children;
    private Exercise exercise;

    public FileNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        this.exercise = null;
    }

    public void addExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void addChild(FileNode child) {
        children.add(child);
    }

    public List<FileNode> getChildren() {
        return children;
    }

    public Exercise getExercise() {
        return exercise;
    }

    @Override
    public String toString() {
        return name;
    }
}
