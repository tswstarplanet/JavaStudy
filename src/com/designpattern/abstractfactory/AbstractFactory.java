package com.designpattern.abstractfactory;

/**
 * Created by weitaosheng on 2017/3/9.
 */
public interface AbstractFactory {

    Shape getShape(String type);

    Color getColor(String type);

}
