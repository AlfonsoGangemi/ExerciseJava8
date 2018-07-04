package io.javabrains;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    private Person(String lastName, String firstName, int age) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.age = age;
    }

    static Person buildPerson(String lastName, String firstName, int age) {
	return new Person(lastName, firstName, age);
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    @Override
    public String toString() {
	return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "]";
    }

}
