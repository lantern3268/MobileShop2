package com.huatec.edu.mobileshop.http.entity;

public class GoodsEntity {
    private int goods_id;
    private String name;
    private double price;
    private String mktprice;
    private String small;
    private int mkt_enable;
    private String briefGoodsCat;
    private String briefBrand;

    public void setBriefBrand(String briefBrand) {
        this.briefBrand = briefBrand;
    }

    public void setBriefGoodsCat(String briefGoodsCat) {
        this.briefGoodsCat = briefGoodsCat;
    }

    public void setMkt_enable(int mkt_enable) {
        this.mkt_enable = mkt_enable;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public void setMktprice(String mktprice) {
        this.mktprice = mktprice;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getBriefBrand() {
        return briefBrand;
    }

    public String getBriefGoodsCat() {
        return briefGoodsCat;
    }

    public int getMkt_enable() {
        return mkt_enable;
    }

    public String getSmall() {
        return small;
    }

    public String getMktprice() {
        return mktprice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getGoods_id() {
        return goods_id;
    }

    @Override
    public String toString() {
        return "GoodsEntity{" +
                "goods_id=" + goods_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mktprice='" + mktprice + '\'' +
                ", small='" + small + '\'' +
                ", mkt_enable=" + mkt_enable +
                ", briefGoodsCat='" + briefGoodsCat + '\'' +
                ", briefBrand='" + briefBrand + '\'' +
                '}';
    }
}
