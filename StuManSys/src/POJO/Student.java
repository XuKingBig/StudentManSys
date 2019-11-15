package POJO;

//package POJO;

import java.util.Objects;

/**
 * 姓名	加权成绩	大学英语A2/必修/4	中国近现代史纲要/必修/2	高等数学B2/必修/5	大学体育2/必修/1	微观经济学/必修/4	税收学/专选/3	计算机应用(web)/必修/3
 */
public class Student {




    // 姓名
    private String sname;
    // 学号
    private String sid;
    // 加权成绩
    private double totalMark;
    // 英语
    private double English;
    // 近代史
    private double history;
    // 高等数学
    private double math;
    // 大学体育
    private double pe;
    // 微观经济学
    private double economy;
    // 税收学
    private double tax;
    // web
    private double web;

    // 有参构造函数
    public Student(String sname, String sid, double totalMark, double english, double history, double math, double pe, double economy, double tax, double web) {
        this.sname = sname;
        this.sid = sid;
        this.totalMark = totalMark;
        English = english;
        this.history = history;
        this.math = math;
        this.pe = pe;
        this.economy = economy;
        this.tax = tax;
        this.web = web;
    }


    // 复写toString
    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid='" + sid + '\'' +
                ", totalMark=" + totalMark +
                ", English=" + English +
                ", history=" + history +
                ", math=" + math +
                ", pe=" + pe +
                ", economy=" + economy +
                ", tax=" + tax +
                ", web=" + web +
                '}';
    }

    // 覆写toSring
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.totalMark, totalMark) == 0 &&
                Double.compare(student.English, English) == 0 &&
                Double.compare(student.history, history) == 0 &&
                Double.compare(student.math, math) == 0 &&
                Double.compare(student.pe, pe) == 0 &&
                Double.compare(student.economy, economy) == 0 &&
                Double.compare(student.tax, tax) == 0 &&
                Double.compare(student.web, web) == 0 &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(sid, student.sid);
    }



    // 获取姓名
    public String getSname() {

        return sname;
    }

    // 更改姓名
    public void setSname(String sname) {
        this.sname = sname;
    }

    // 获取学号
    public String getSid() {
        return sid;
    }

    // 设置学号
    public void setSid(String sid) {
        this.sid = sid;
    }

    // 获取甲醛的分数
    public double getTotalMark() {
        return totalMark;
    }

    //设置总分数
    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    // 获取英语分数
    public double getEnglish() {
        return English;
    }

    // 设置英语分数
    public void setEnglish(double english) {
        English = english;
    }

    // 获取历史分数
    public double getHistory() {
        return history;
    }

    // 设置历史分数
    public void setHistory(double history) {
        this.history = history;
    }

    // 获取高数成绩
    public double getMath() {
        return math;
    }

    // 设置高数成绩
    public void setMath(double math) {
        this.math = math;
    }

    // 获取体育成绩
    public double getPe() {
        return pe;
    }

    // 设置体育成绩
    public void setPe(double pe) {
        this.pe = pe;
    }

    // 获取微观经济学成绩
    public double getEconomy() {
        return economy;
    }

    // 设置微观经学成绩
    public void setEconomy(double economy) {
        this.economy = economy;
    }

    // 获取税收学成绩
    public double getTax() {
        return tax;
    }

    // 设置税收学成绩
    public void setTax(double tax) {
        this.tax = tax;
    }

    // 获取web成绩
    public double getWeb() {
        return web;
    }

    // 设置web成绩
    public void setWeb(double web) {
        this.web = web;
    }

    // 无参构造函数
    public Student() {
    }
}
