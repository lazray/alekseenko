package ru.dvfu.mrcpk.alekseenko.theme10;

// Класс абстракция верхнего уровня

public abstract class Shape {

    // Координаты точки опоры
    protected float x,y;

    // Метод назначения параметров точки опоры
    void setXY(float x1, float y1){
        this.x = x1;
        this.y = y1;
    }
//метод задания параметров
    abstract void setParams(float[] params);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
// метод отрисовки объектов
    abstract void draw();
}