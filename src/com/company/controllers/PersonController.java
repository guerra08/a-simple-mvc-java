package com.company.controllers;

import com.company.models.Person;
import com.company.views.PersonView;

public class PersonController {

    private PersonView personview;
    private Person person;

    public PersonController() {
        this.personview = new PersonView();
        this.person = new Person();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson(){
        return this.person;
    }

    public String getPersonName(){
        return person.getName();
    }

    public int getPersonAge(){
        return person.getAge();
    }

    public String getPersonSsn() {
        return person.getSsn();
    }

    public void setPersonName(String n){
        this.person.setName(n);
    }

    public void setPersonAge(int a){
        this.person.setAge(a);
    }

    public void setPersonSsn(String ssn) {
        this.person.setSsn(ssn);
    }

    public void updateView(){
        this.personview.displayPersonData(this.person);
    }

}
