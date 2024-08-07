package model;

import java.util.Date;

public class BaseModel {
    private String id;
    private Date createdAt;

    public BaseModel() {
        this.id = java.util.UUID.randomUUID().toString();
        this.createdAt = new Date();
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
}
