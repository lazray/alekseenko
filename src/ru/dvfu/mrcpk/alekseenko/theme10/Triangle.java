package ru.dvfu.mrcpk.alekseenko.theme10;

public class Triangle extends Shape{

    float a, b, c;

    @Override
    void draw() {

    }

    @Override
    void setParams(float[] params) {
        this.a = params[0];
        this.b = params[1];
        this.c = params[2];
    }
}
