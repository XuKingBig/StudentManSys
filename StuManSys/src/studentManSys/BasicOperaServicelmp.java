package studentManSys;

import POJO.Student;
import dao.StudentDao;
import daoImp.StudentDaoImp;
import hash.Hash;

import java.util.ArrayList;


public class BasicOperaServicelmp implements BasicOperaService {

    //新建哈希表对象
    private Hash studentHash = new Hash();
    //新建数据库对象
    private StudentDao stu = new StudentDaoImp();
    //二维数组供UI显示使用
    Object[][]objects;// = new Object[studentHash.getSumStudentNum()+1][11];
    //构造函数
    public BasicOperaServicelmp(){
        int size = stu.selectAllStudent().size();
        ArrayList<Student> object = stu.selectAllStudent();
        for (int i = 0; i < size; i++) {
            //构造函数时将数据库数据存入哈希表中
            studentHash.addHash(studentHash.getHash(object.get(i).getSname()), object.get(i));
            //System.out.println(studentHash.getSumStudentNum());
        }

        //更新二维数组
        objects = new Object[studentHash.getSumStudentNum()][11];
        setUpObjects();
    }
    /*public Object dataInHash() {
        setUpObjects();
        for (int i = 0; i < stu.selectAllStudent().size(); i++) {

            studentHash.addHash(studentHash.getHash(stu.selectAllStudent().get(i).getSname()), stu.selectAllStudent().get(i));
        }
        return objects;


    }*/

    //返回二维数组
    public Object[][] getData(){
        return objects;
    }

    /*public void yun(){
        for(int i = 0; i < 1000; i++)
            stu.selectAllStudent();
    }*/

    //更新二维数组的方法
    public void setUpObjects(){
        ArrayList<Student> object = stu.selectAllStudent();
        for (int i = 0; i < stu.selectAllStudent().size(); i++) {
            objects[i][0] = i + 1;
            objects[i][1] = object.get(i).getSname();
            objects[i][2] = object.get(i).getSid();
            objects[i][3] = object.get(i).getTotalMark();
            objects[i][4] = object.get(i).getEnglish();
            objects[i][5] = object.get(i).getHistory();
            objects[i][6] = object.get(i).getMath();
            objects[i][7] = object.get(i).getPe();
            objects[i][8] = object.get(i).getEconomy();
            objects[i][9] = object.get(i).getTax();
            objects[i][10] = object.get(i).getWeb();
            System.out.println(objects[i][1]);
        }


    }
    //添加功能
    public boolean addStudent(
            String name,
            String sid,
            double English,
            double history,
            double math,
            double pe,
            double economy,
            double tax,
            double web){
        //判断输入的分数是否符合实际
        if((English < 0 || English > 100) ||
                (history < 0 || history > 100) ||
                (math < 0 || math > 100) ||
                (pe < 0 || pe > 100) ||
                (economy < 0 || economy > 100) ||
                (tax < 0 || tax > 100) ||
                (web < 0 || web > 100)){
            return false;
        }
        //计算加权分
        Double totalMark = (English * 4 + history * 3 + math * 5 + pe * 2 + economy * 3 + tax * 3 + web * 3)/23;
        //新建student对象
        Student student = new Student(name, sid, totalMark, English, history, math, pe, economy, tax, web);
        //添加
        if(studentHash.addHash(studentHash.getHash(student.getSname()), student))
            stu.addStudent(name, sid, totalMark, English, history, math, pe, economy, tax, web);

        //更新二维数组
        objects = new Object[studentHash.getSumStudentNum()][11];
        setUpObjects();
        return true;
    }

    //删除功能
    public boolean deleteStudent(String name){
        //获得删除同学的学号，同时删除
        String uid = studentHash.deleteHash(name);
        if(uid != null) {
            System.out.println("删除成功");
            //删除数据库中的数据
            stu.deleteStudent(uid);
            //更新二维数组
            objects = new Object[studentHash.getSumStudentNum()][11];
            setUpObjects();
            return true;
        }
        else
            System.out.println("删除失败");
        return false;
//        stu.deleteStudent("11");
    }

    //修改
    public int setStudent(String name,String property,double newMark){
        Student student = studentHash.findHash(name);
        final String English = "英语";
        final String history = "历史";
        final String math = "数学";
        final String pe = "体育";
        final String economy = "经济学";
        final String tax = "税收学";
        final String web = "web";

        //匹配要修改的科目，修改成功后更新二维数组
        if(student != null) {
            //英语
            if (property.equals(English)) {
                student.setEnglish(newMark);
                //修改数据库中的数据
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //历史
            else if (property.equals(history)) {
                student.setHistory(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //数学
            else if (property.equals(math)) {
                student.setMath(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //体育
            else if (property.equals(pe)) {
                student.setPe(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //经济学
            else if (property.equals(economy)) {
                student.setEconomy(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //税收学
            else if (property.equals(tax)) {
                student.setTax(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }
            //web
            else if (property.equals(web)) {
                student.setWeb(newMark);
                stu.updateStudent(name, property, newMark);
                setUpObjects();
                return 1;
            }

            //找不到科目
            else {
                System.out.println("无此科目");
                return 0;
            }
            //找不到人
        }else{
            System.out.println("无此人");
            return 2;
        }
    }


    //查找
    public Student findStudent(String name){
        Student student = studentHash.findHash(name);
        //查找成功返回要查找的student
        if(student != null) {

            //测试用输出
            System.out.println(student.getSname() +"    "+ student.getSid() +"    "+ String.valueOf(student.getTotalMark()) +"    "+
                    String.valueOf(student.getEnglish()) +"    "+ String.valueOf(student.getHistory()) +"    "+
                    String.valueOf(student.getMath()) +"    "+ String.valueOf(student.getPe()) +"    "+
                    String.valueOf(student.getEconomy() +"    "+ String.valueOf(student.getTax())
                            +"    "+ String.valueOf(student.getWeb())));
        return student;
        }
        else
            System.out.println("查无此人信息");
        return null;
    }

    //获得降序信息
    public void scoreDep(){
        /*ArrayList <Student> students = stu.selectAllStudent();
        for(Student student: students)
            System.out.println(student.getSname() +"    "+ student.getSid() +"    "+ String.valueOf(student.getTotalMark()) +"    "+
                    String.valueOf(student.getEnglish()) +"    "+ String.valueOf(student.getHistory()) +"    "+
                    String.valueOf(student.getMath()) +"    "+ String.valueOf(student.getPe()) +"    "+
                    String.valueOf(student.getEconomy() +"    "+ String.valueOf(student.getTax())
                            +"    "+ String.valueOf(student.getWeb())));*/
        setUpObjects();
        //return objects;
    }
    //获得哈希表
    public Hash getStudentHash(){
        return studentHash;
    }
}
