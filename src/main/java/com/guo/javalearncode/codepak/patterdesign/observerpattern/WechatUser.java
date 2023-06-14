package com.guo.javalearncode.codepak.patterdesign.observerpattern;


public class WechatUser implements Observe{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WechatUser(String name) {
        this.name = name;
    }


    @Override
    public void changeInfo(String message) {
        System.out.println(name + " here your message:" +message);
    }
}
