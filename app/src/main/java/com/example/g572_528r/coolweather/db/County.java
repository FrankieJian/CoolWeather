package com.example.g572_528r.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by g572-528r on 2017/6/6.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int cityId;
}
