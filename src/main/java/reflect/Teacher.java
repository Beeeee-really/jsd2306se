package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Teacher {
    @AutoRunMethod(65)
    public void teach(){
        System.out.println("老师在上课");
    }

    public void chat(){
        System.out.println("老师在聊天");
    }
}
