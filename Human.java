package com.roc.factory;
public interface Human {
    public void say();
}

package com.roc.factory;
public class Man implements Human {
    @Override
    public void say() {
        System.out.println("����");
    }

}
package com.roc.factory;
public class Woman implements Human {
    @Override
    public void say() {
        System.out.println("Ů��");
    }
}

package com.roc.factory;
public class SampleFactory {
    public static Human makeHuman(String type){
        if(type.equals("man")){
            Human man = new Man();
            return man;
        }else if(type.equals("womman")){
            Human woman = new Woman();
            return woman;
        }else{
            System.out.println("����������");
            return null;
        }            
    }
}
