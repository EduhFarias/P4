/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author PC
 */
public class DateB {

    private int day;
    private int month;
    private int year;

    public DateB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(int day, int month, int year){
        return String.format("%d/%d/%d", day, month, year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
