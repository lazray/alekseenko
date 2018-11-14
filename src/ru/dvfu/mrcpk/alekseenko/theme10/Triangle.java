package ru.dvfu.mrcpk.alekseenko.theme10;

public class Triangle extends Shape{

    float a, b, c;  // Стороны треугольника

   Triangle() {}


    // Конструктор с заданием параметров
   Triangle(float a1, float b1, float c1){
       this.a = a1;
       this.b = b1;
       this.c = c1;
          }

    // Метод задания сторон треугольника
    void setAB(float a1, float b1, float c1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
                }




    @Override
    void draw() {

    }

    // Конструктор с заданием параметров


    @Override
    void setParams(float[] params) {
        this.a = params[0];
        this.b = params[1];
        this.c = params[2];
    }
}
