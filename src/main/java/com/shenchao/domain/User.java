package com.shenchao.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by shenchao on 2017/1/3.
 */
@XmlRootElement
public class User {
    private Integer id;
    private String name;
    private char sex;

    public User() {
    }

    public User(Integer id, String name, char sex) {

        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
