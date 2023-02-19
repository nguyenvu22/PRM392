package com.example.mymobileapplication;

public class Car {

    public static final int TYPE_CAR = 1;
    public static final int TYPE_BUS = 2;
    public static final int TYPE_TAXI = 3;

    private int img;
    private String name;
    private int type;
    private int price;
    private String desc;

    public Car(int img, String name, int type, int price, String desc) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.price = price;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
