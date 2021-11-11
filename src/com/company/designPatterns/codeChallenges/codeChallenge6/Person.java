package com.company.designPatterns.codeChallenges.codeChallenge6;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean drivingLicence;
    private boolean isMarried;

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.job = personBuilder.job;
        this.university = personBuilder.university;
        this.drivingLicence = personBuilder.drivingLicence;
        this.isMarried = personBuilder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicence=" + drivingLicence +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicence;
        private boolean isMarried;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder setJob(String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicence(boolean drivingLicence) {
            this.drivingLicence = drivingLicence;
            return this;
        }

        public PersonBuilder setMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
