package com.designpattern.fatory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public class FatoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape retangle = shapeFactory.getShape("RETANGLE");
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        retangle.draw();
        triangle.draw();
    }
}
