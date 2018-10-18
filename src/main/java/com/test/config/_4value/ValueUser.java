package com.test.config._4value;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by majianghua on 2018/10/10.
 */
public class ValueUser {

    /**
     * 使用@Value赋值
     *
     * 1.基本数值
     * 2.可以写spell  #{14+2}  计算出结果
     *
     * 3.可以写${}  取出配置文件中的值
     */

    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private int age;
    @Value("${user.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ValueUser() {
    }

    public ValueUser(int age, String name) {

        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ValueUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
