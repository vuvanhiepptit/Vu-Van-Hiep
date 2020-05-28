package com.luvina.restfulapi.entities;

public class Prefecture {
    private String code;
    private String city;
    private String city_kana;
    private String prefecture;
    private String prefecture_kana;
    private String prefecture_code;

    public Prefecture(String code, String city, String city_kana, String prefecture, String prefecture_kana, String prefecture_code) {
        this.code = code;
        this.city = city;
        this.city_kana = city_kana;
        this.prefecture = prefecture;
        this.prefecture_kana = prefecture_kana;
        this.prefecture_code = prefecture_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_kana() {
        return city_kana;
    }

    public void setCity_kana(String city_kana) {
        this.city_kana = city_kana;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getPrefecture_kana() {
        return prefecture_kana;
    }

    public void setPrefecture_kana(String prefecture_kana) {
        this.prefecture_kana = prefecture_kana;
    }

    public String getPrefecture_code() {
        return prefecture_code;
    }

    public void setPrefecture_code(String prefecture_code) {
        this.prefecture_code = prefecture_code;
    }
}
