package com.designpattern.abstractfactory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        switch (type) {
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
        }
        return null;
    }
}
