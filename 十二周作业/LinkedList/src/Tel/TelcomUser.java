package Tel;
import java.text.*;
import java.util.*;
import xml.ReadXMLUitilcar;
import company.*;
import name.*;
public class TelcomUser {
     private String PhoneNumber;
     private String callTo;
     private LinkedList  list;
     public TelcomUser(String phoneNumber) {
    	 this.PhoneNumber =phoneNumber;
    	 this.list=new LinkedList();
     }
//模拟通话记录的生成
public void generateCommunicateRcords() {
    	 int recordNum=new Random().nextInt(10);
    	 for(int i=0;i<=recordNum;i++) {
    		 //随机生成第i条通话记录
    		 //开始时间，当前时间之前的某个随机时间
    		 long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
    		 //结束时间开始后的十分钟内随机的一个时间，至少一分钟
    		 long timeEnd=timeStart + 60000+new Random().nextInt(600000);
    		 //被叫号码
    		 this.callTo=getCallToPhoneNumber(); 
    		 //插入通话记录
    		 this.list.add(this.PhoneNumber+
    				 ","+timeStart+
    				 ","+timeEnd+
    				 ","+this.callTo);
    	 }	 
     }
     //随机生成被叫号码（后四位随机）并返回
     private String getCallToPhoneNumber(){
    	 return "1834844"+String.valueOf( new Random().nextInt(10))+
    			 String.valueOf( new Random().nextInt(10))+
    			 String.valueOf(new Random().nextInt(10))+
    			 String.valueOf(new Random().nextInt(10));
    			 
     }
//模拟计费办法，以字符串的形式返回保留4位小数的计费结果
private String accountFee(long timeStart, long timeEnd) { 	
	Dianxin  ch = null;
	Company company;
	ch=(Dianxin)ReadXMLUitilcar.getBean();
	company=ch.productCompany();
    		 //每分钟收费*元
    		 double feePerMinute=company.fei();
    		 //通话分钟去尾
    		 int minutes=Math.round((timeEnd-timeStart)/60000);
    		 double feeTotal=feePerMinute * minutes;
    		 return String.format("%.4f", feeTotal);
    	 }
//打印通话记录
public void printDetails() { 
	    int a=this.list.size();
    	 //循环分割记录内的每一项并输出
    	 for(int i=0;i<a-1;i++) {    
    		 System.out.println("--------通话记录分数线---------------");
    		 String [] recordField = ((String)this.list.get(i)).split(",");
    		 System.out.println("主叫"+recordField[0]);
    		 System.out.println("被叫"+recordField[3]);
    		 Date timeStart = new Date(Long.parseLong(recordField[1]));
    		 Date timeEnd = new Date(Long.parseLong(recordField[2]));
    		 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日");
    		 
    		 System.out.println("通话开始时间"+simpleDateFormat.format(timeStart));
    		 System.out.println("通话结束时间"+simpleDateFormat.format(timeEnd));
    		 System.out.println("计费："
    				 +accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    						 +"   元。");
    	 }
     }
}
