package exception;

/**
 * java异常处理机制
 * <p></p>java.lang.Throwable是java中所有异常的超类，下面有两个派生类
 * <p>Exception和Error
 * <p>Exception:异常，是指我们程序运行中由于逻辑错误等导致的问题，是可以在程序中恢复的
 * <p>Error:错误，通常是因为系统等原因导致的问题，是不可恢复的异常，会导致程序终止
 *
 * @author Beeeee
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
//            String line = null;
//            String line = "";
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
            System.out.println("!!!!!!!!!!!!!!!!");//不执行
//        } catch (NullPointerException e) {
//            //当try中出现空指针异常后的处理代码(B计划)
//            System.out.println("出现了空指针并处理完毕");
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("出现字符串下标越界并已解决");
//        }
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
//            当针对多个异常有相同解决办法时，可以合并在一起写
            /*
                如果上面的捕获可以处理异常，则不执行下面的捕获
             */
            System.out.println("异常");
        }catch (Exception e){
            //某个超类型异常，则try中出现他的一类型宜异常时都可以被其处理
            System.out.println("emm...");
        }

        System.out.println("程序结束了");
    }
}
