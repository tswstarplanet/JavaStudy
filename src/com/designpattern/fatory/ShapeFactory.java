package com.designpattern.fatory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        switch (type) {
            case "RETANGLE":
                return new Retangle();
            case "TRIANGLE":
                return new Triangle();
        }
        return null;
    }

}
