package com.guo.javalearncode.codepak.patterdesign.observerpattern;

public interface Subject {


    void addAttach(Observe observe);

    void removeOb(Observe observe);

    void notify(String message);


}
