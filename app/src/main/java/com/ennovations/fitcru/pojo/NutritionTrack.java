package com.ennovations.fitcru.pojo;

public class NutritionTrack {

    public String time;
    public String percentage;
    public String kcal;
    public String meal_type;

    public NutritionTrack(String time, String percentage, String kcal, String meal_type){
        this.time = time;
        this.percentage = percentage;
        this.kcal = kcal;
        this.meal_type = meal_type;
    }

    public String getKcal() {
        return kcal;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getTime() {
        return time;
    }
}
