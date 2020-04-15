package com.company.dao;

import com.company.models.Person;

public class PersonDAO implements IPersonDAO{

    public Person getPersonFromDB(){
        //Simple example. Would use a database / file storage
        return (new Person("Bruno Guerra", 20, "123456789"));
    }

}
