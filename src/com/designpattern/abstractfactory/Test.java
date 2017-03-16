package com.designpattern.abstractfactory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class Test {
    public static void main(String[] args) {
        FactoryBuilder factoryBuilder = new FactoryBuilder();
        AbstractFactory shapeFactory = factoryBuilder.getFactory("SHAPE");
        AbstractFactory colorFactory = factoryBuilder.getFactory("COLOR");
        Shape retangle = shapeFactory.getShape("RETANGLE");
        Color red = colorFactory.getColor("RED");
        retangle.draw();
        red.paint();
    }
}
