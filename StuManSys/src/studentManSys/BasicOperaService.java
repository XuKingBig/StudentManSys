package studentManSys;
import POJO.Student;

public interface BasicOperaService {
    //增加学生信息  姓名 学号 加权成绩 英语 历史 数学 体育 经济学 税收学 web
    //返回false则输入的分数有误  返回ture说明添加成功
    public boolean addStudent(String name,
                           String sid,

                           double English,
                           double history,
                           double math,
                           double pe,
                           double economy,
                           double tax,
                           double web);


    //删除学生信息 输入学生姓名删除 成功返回ture 失败返回false
    public boolean deleteStudent(String name);


    //更改学生信息 输入学生姓名和要改的科目 和新分数
    //name姓名  property科目  newMark新分数
    //返回1成功   返回0查不到科目   返回2查不到人
    public int setStudent(String name,String property,double newMark);

    //查找学生信息  成功返回查询到的Student  失败返回null
    public Student findStudent(String name);

    


    //输出成绩降序  返回二维数组
    public void scoreDep();



    //导入数据  返回二维数组
//    public Object dataInHash();

    //返回数据object二维数组
    public Object getData();
}
