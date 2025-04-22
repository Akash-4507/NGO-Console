package model;

import java.time.LocalDate;

public class AdminInfo {
    private static int counter=0;
    private int info_id;
    private String info_name;
    private String info_email;
    private String info_content;
    private LocalDate info_date;

    public AdminInfo( String info_name, String info_email, String info_phone, String info_content, LocalDate info_date) {
        info_id = ++counter;
        this.info_name = info_name;
        this.info_email = info_email;
        this.info_content = info_content;
        this.info_date = info_date;
    }

    public int getInfo_id() {
        return info_id;
    }

    public String getInfo_name() {
        return info_name;
    }

    public void setInfo_name(String info_name) {
        this.info_name = info_name;
    }

    public String getInfo_email() {
        return info_email;
    }

    public void setInfo_email(String info_email) {
        this.info_email = info_email;
    }

    public String getInfo_content() {
        return info_content;
    }

    public void setInfo_content(String info_content) {
        this.info_content = info_content;
    }

    public LocalDate getInfo_date() {
        return info_date;
    }

    public void setInfo_date(LocalDate info_date) {
        this.info_date = info_date;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "info_id=" + info_id +
                ", info_name='" + info_name + '\'' +
                ", info_email='" + info_email + '\'' +
                ", info_content='" + info_content + '\'' +
                ", info_date=" + info_date +
                '}';
    }
}
