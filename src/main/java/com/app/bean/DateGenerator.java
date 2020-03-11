package com.app.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGenerator implements FactoryBean<Date> {

    private String input;
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public Date getObject() throws Exception {
        String d[] = input.split("\\|");
        return new SimpleDateFormat(d[1].trim()).parse(d[0].trim());
    }
    @Override
    public Class<?> getObjectType() {
        return java.util.Date.class;
    }



}
