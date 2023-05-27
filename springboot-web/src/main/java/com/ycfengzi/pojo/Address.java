package com.ycfengzi.pojo;

/**
 * @Author：YCFengZi
 * @Date：2023/5/26 17:23
 */
public class Address {
    private String City;
    private String province;
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address [" +
                "City='" + City + '\'' +
                ", province='" + province + '\'' +
                ']';
    }
}
