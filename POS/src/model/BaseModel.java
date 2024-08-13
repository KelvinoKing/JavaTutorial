package model;

import java.util.Date;


public class BaseModel {
    private String id;
    private Date createdAt;
    private String strCreatedAt;

    public BaseModel() {
        this.id = java.util.UUID.randomUUID().toString();
        this.createdAt = new Date();
    }
    
    public BaseModel(String id, String strCreatedAt) {
        this.id = id;
        this.strCreatedAt = strCreatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getStrCreatedAt() {
        return strCreatedAt;
    }
    public void setStrCreatedAt(String strCreatedAt) {
        this.strCreatedAt = strCreatedAt;
    }
}
