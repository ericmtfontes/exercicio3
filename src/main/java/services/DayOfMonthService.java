package services;

import entities.DayOfMonth;

import java.util.List;

public class DayOfMonthService {
    public static DayOfMonth minValue(List<DayOfMonth> days){
        DayOfMonth min = days.get(0);
        for(DayOfMonth day : days){
            if(day.getValor() < min.getValor()){
                min = day;
            }
        }
        return min;
    }

    public static DayOfMonth maxValue(List<DayOfMonth> days){
        DayOfMonth max = days.get(0);
        for(DayOfMonth day : days){
            if(day.getValor() > max.getValor()){
                max = day;
            }
        }
        return max;
    }

}
