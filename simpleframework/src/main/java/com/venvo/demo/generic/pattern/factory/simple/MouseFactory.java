package com.venvo.demo.generic.pattern.factory.simple;

import com.venvo.demo.generic.pattern.factory.entity.DellMouse;
import com.venvo.demo.generic.pattern.factory.entity.HpMouse;
import com.venvo.demo.generic.pattern.factory.entity.Mouse;

public class MouseFactory {
    public static Mouse createMouse(int type){
        switch (type){
            case 0:return new DellMouse();
            case 1:return new HpMouse();
            default:return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(1);
        mouse.sayHi();
    }
}
