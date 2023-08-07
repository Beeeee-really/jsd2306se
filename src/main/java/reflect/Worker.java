package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Worker {
    @AutoRunMethod(9)
    public void work(){
        System.out.println("工人:板砖!");
    }
}
