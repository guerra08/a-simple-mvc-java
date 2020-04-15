package com.company;

import com.company.controllers.PersonController;
import com.company.dao.PersonDAO;

public class Main {

    public static void main(String[] args) {
        PersonController pc = new PersonController();
        pc.setPerson((new PersonDAO().getPersonFromDB()));
        pc.updateView();
        pc.setPersonName("Fulano de Tal");
        pc.setPersonAge(22);
        pc.setPersonSsn("231244556");
        pc.updateView();
    }
}
