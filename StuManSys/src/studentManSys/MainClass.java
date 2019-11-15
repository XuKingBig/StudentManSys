package studentManSys;



public class MainClass {
    public static void main(String[] args){
        BasicOperaServicelmp basicOperaService = new BasicOperaServicelmp();


        /*basicOperaService.addStudent("徐金1", "90", 11,
             11,11,11,11,11,11);*/
        basicOperaService.findStudent("徐金1");
       /*basicOperaService.addStudent("asd", "32",11,
             11,11,11,11,11,11);
        basicOperaService.addStudent("asd1", "32",11,
                11,11,11,11,11,11);
        basicOperaService.addStudent("adfd", "32",11,
                11,11,11,11,11,11);
        basicOperaService.addStudent("aaa", "32",11,
                11,11,11,11,11,11);*/
      /*basicOperaService.deleteStudent("asd");
        basicOperaService.deleteStudent("徐金1");
        basicOperaService.deleteStudent("asd1");*/
        //basicOperaService.deleteStudent("徐金1");
        //basicOperaService.setStudent("asd","英语", 99);
     //basicOperaService.getStudentHash().showAHash();
    }
}
