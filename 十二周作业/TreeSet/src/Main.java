import Tel.*;
public class Main {
       public static void main(String[] args) {
    	   //实例化一个电信用户
    	   TelcomUser telcomUser =new TelcomUser("15565901880");
    	   //生成通话记录
    	   telcomUser.generateCommunicateRcords();
    	   //打印通话记录
    	   telcomUser.printDetails();
       }
}
