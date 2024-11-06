/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project1;

public class Project1 {

    public static void main(String[] args) {

       FigureArrayCreator figureCreator = FigureArrayCreator.createInstance();
       Figure[] figures = figureCreator.createFigureArray();

        for (Figure figure : figures) {
            System.out.println("*****");
            figure.moveLeft();//движение влево
            figure.moveRight();//движение вправо
            figure.movementAroundItsAxis();//поворот
            figure.moveDown();//движение вниз
        }

    }
}
