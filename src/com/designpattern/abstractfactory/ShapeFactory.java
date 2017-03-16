package com.designpattern.abstractfactory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        switch (type) {
            case "RETANGLE":
                return new Retangle();
            case "TRIANGLE":
                return new Triangle();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
