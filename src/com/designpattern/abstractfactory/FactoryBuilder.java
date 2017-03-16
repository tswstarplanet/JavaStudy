package com.designpattern.abstractfactory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class FactoryBuilder {

    public AbstractFactory getFactory(String type) {
        if ("COLOR".equals(type)) {
            return new ColorFactory();
        }
        if ("SHAPE".equals(type)) {
            return new ShapeFactory();
        }
        return null;
    }

}
