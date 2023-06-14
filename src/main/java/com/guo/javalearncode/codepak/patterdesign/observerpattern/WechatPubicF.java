package com.guo.javalearncode.codepak.patterdesign.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WechatPubicF implements Subject{


    public static void main(String[] args) {
        WechatPubicF wechatPubicF = new WechatPubicF();
        wechatPubicF.addAttach(new WechatUser("aaa"));

        wechatPubicF.addAttach(new WechatUser("ccc"));
        wechatPubicF.addAttach(new WechatUser("ddd"));
        wechatPubicF.notify("aaa");

    }

    private List<Observe> list =new ArrayList<>();
    @Override
    public void addAttach(Observe observe) {
       list.add(observe);

    }

    @Override
    public void removeOb(Observe observe) {
        list.remove(observe);
    }

    @Override
    public void notify(String message) {
        for (Observe observe : list) {
            observe.changeInfo(message);
        }
    }
}
