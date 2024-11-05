/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author LOQ
 */
public class FigureArray implements FigureArrayCreator {

    @Override
    public Figure[] createFigureArray() {
        return new Figure[]{
            new StraightLine(),
            new Square(),
            new Lightning()

        };
    }
}
