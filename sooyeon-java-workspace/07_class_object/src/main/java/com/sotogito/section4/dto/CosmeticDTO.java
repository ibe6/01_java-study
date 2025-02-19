package com.sotogito.section4.dto;

public class CosmeticDTO {

    private String name;
    private int price;
    private String brand;
    private String category;
    private boolean isPromotion;

    public CosmeticDTO() {
    }

    public CosmeticDTO(String name, int price, String brand, String category, boolean isPromotion) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.isPromotion = isPromotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean promotion) {
        isPromotion = promotion;
    }


    public String getInfo(){
        return "- 화장품명 : "+name+"\n"+
                "- 가격 : "+price+"\n"+
                "- 브랜드 : "+brand+"\n"+
                "- 카테고리 : "+category+"\n"+
                "- 할인여부 : "+(isPromotion?"할인함":"할인안함")+"\n";
    }

}
