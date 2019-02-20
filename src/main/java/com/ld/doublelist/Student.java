package com.ld.doublelist;

/**
 * @author luisdany pernillo
 */

public class Student {

    private String id;
    private String name;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }



    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Student(id=" + this.getId() + ", name=" + this.getName() + ")";
    }

    public static class StudentBuilder {

        private String id;
        private String name;

        StudentBuilder() {
        }

        public Student.StudentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Student.StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Student build() {
            return new Student(id, name);
        }



        public String toString() {
            return "Student.StudentBuilder(id=" + this.id + ", name=" + this.name + ")";
        }
    }
}
