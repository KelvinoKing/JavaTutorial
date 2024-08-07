package model;

import java.util.Date;

public class Products extends BaseModel {
    private String id;
    private String coilNumber;
    private double meters;
    private double weight;
    private int gauge;
    private double width;
    private String color;
    private String texture;
    private Date createdAt;

    public Products(
        double meters, double weight, int gauge, double width, String color, String texture, String coilNumber
        ) {
        super();
        this.id = super.getId();
        this.createdAt = super.getCreatedAt();
        this.meters = meters;
        this.weight = weight;
        this.gauge = gauge;
        this.width = width;
        this.color = color;
        this.texture = texture;
        this.coilNumber = coilNumber;
    }

    public double getMeters() {
        return meters;
    }
    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getGauge() {
        return gauge;
    }
    public void setGauge(int gauge) {
        this.gauge = gauge;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCoilNumber() {
        return coilNumber;
    }
    public void setCoilNumber(String coilNumber) {
        this.coilNumber = coilNumber;
    }

    @Override
    public String toString() {
       return "{"
       + "\"class\": \"" + this.getClass().getSimpleName() + "\"," 
       + "\"id\": \"" + this.id + "\"," 
       + "\"meters\": " + this.meters + "\","
       + "\"weight\": " + this.weight + "\","
       + "\"gauge\": " + this.gauge + "\","
       + "\"width\": " + this.width + "\","
       + "\"color\": \"" + this.color + "\","
       + "\"texture\": \"" + this.texture + "\""
       + "\"coilNumber\": \"" + this.coilNumber + "\""
       + "\"createdAt\": \"" + this.createdAt + "\""
       + "}";
    }

    public static Products fromString(String data) {
        data = data.replace("{", "").replace("}", "");
        System.out.println(data);
        String[] parts = data.split(",");
        Products product = new Products(
            Double.parseDouble(parts[1].split(":")[1].replace("\"", "")),
            Double.parseDouble(parts[2].split(":")[1].replace("\"", "")),
            Integer.parseInt(parts[3].split(":")[1].replace("\"", "")),
            Double.parseDouble(parts[4].split(":")[1].replace("\"", "")),
            parts[5].split(":")[1].replace("\"", ""),
            parts[6].split(":")[1].replace("\"", ""),
            parts[7].split(":")[1].replace("\"", "")
        );
        product.setId(parts[0].split(":")[1].replace("\"", ""));
        return product;
    }
}
