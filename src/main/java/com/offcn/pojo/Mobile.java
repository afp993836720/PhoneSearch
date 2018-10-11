package com.offcn.pojo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @Author afp
 * @date 2018/10/11--20:44
 */
@XmlRootElement(name = "MObile")
public class Mobile implements Serializable {
    private int id;
    private String number;
    private String area;
    private String type;
    private String areacode;
    private String postcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", area='" + area + '\'' +
                ", type='" + type + '\'' +
                ", areacode='" + areacode + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
