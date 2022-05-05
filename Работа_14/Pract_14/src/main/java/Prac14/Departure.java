package Prac14;


import java.sql.Date;

public class Departure {
    private String type;
    private Date date;

    public Departure(String type, Date date) {
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
