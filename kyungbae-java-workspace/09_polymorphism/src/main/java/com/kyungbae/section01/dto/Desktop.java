package com.kyungbae.section01.dto;

public class Desktop extends Electronic{

    public static final String CPU = "intel";
    private String graphic;

    public Desktop(){}

    public Desktop(String brand, String name, int price, String graphic) {
        super(brand, name, price);
        this.graphic = graphic;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "graphic='" + graphic + '\'' +
                "} " + super.toString();
    }
}
