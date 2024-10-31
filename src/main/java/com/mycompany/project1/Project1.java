/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project1;

public class Project1 {

    public static void main(String[] args) {

        StraightLine straightLine = new StraightLine();
        Square square = new Square();
        Lightning lightning = new Lightning();

        Figure arrFigures[] = {straightLine, square, lightning};

        for (Figure figure : arrFigures) {
            System.out.println("*****");
            figure.moveLeft();//движение влево
            figure.moveRight();//движение вправо
            figure.movementAroundItsAxis();//поворот
            figure.moveDown();//движение вниз
        }

    }
}
