package com.example.coolweather.db;

/**
 * Created by SanSi on 2017/6/15.
 */

public class County {
    private int id;
    private  String provinceName;
    private int provinceCode;
    private int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
