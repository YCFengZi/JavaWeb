package net.zjitc.domain;

/**
 * @Author：YCFengZi
 * @Date：2023/5/30 9:20
 */
public class Goods {
    private int id;
    private String name;
    private String image;
    private float price;
    private String information;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }

    public Goods() {}
    public Goods(int id, String name, String image, float price, String information) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.information = information;
    }

    @Override
    public String toString() {
        return "Goods [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", information='" + information + '\'' +
                ']';
    }
}
