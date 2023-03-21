package com.hkz.hkz_demo.domain;

public class Ani_info implements Comparable<Ani_info>{
    private int id;
    private String name;
    private String img;
    private int last_num;
    private String area;
    private String time;
    private String type;
    private String content;
    private int priority;
    private String week;
    private String url;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getLast_num() {
        return last_num;
    }

    public void setLast_num(int last_num) {
        this.last_num = last_num;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Ani_info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", last_num=" + last_num +
                ", area='" + area + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", priority=" + priority +
                ", week='" + week + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ani_info o) {
        return this.getPriority() - o.getPriority();
    }
}
