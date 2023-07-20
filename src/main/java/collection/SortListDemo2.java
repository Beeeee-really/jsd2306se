package collection;

import java.util.*;

/**
 * 演示排序自定义类型的元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));
        list.add(new Point(7, 8));
        list.add(new Point(9, 10));
        System.out.println(list);
        /*
            compare:比较

            Collections.sort(List list)
            要求集合元素必须实现Comparable接口，否则编译不通过

            如果是排序自定义元素时，并不推荐为了排序的目的实现该接口，因为这个sort此番操作对我们的代码已经产生了侵入性

            侵入性：当我们使用某个组件功能时，他要求我们为其修改我们的代码来满足其运行要求
            此时此操作就称为侵入性
            侵入性不利于程序的维护和扩展，实际开发中应当尽力避免
         */
//        MyComparator c = new MyComparator();

        Comparator<Point> c = new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                //o1点到原点的距离
                int olen1 = o1.getX() * o1.getY() * o1.getY();
                //o2点到原点的距离
                int olen2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
        /*
            返回值要求
            如果方法认为o1>o2此时应当返回一个>0的整数
            ...
         */
                return 0;
            }

        };

        Collections.sort(list, c);

//        Collections.sort(list, new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                //o1点到原点的距离
//                int olen1 = o1.getX() * o1.getY() * o1.getY();
//                //o2点到原点的距离
//                int olen2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//        /*
//            返回值要求
//            如果方法认为o1>o2此时应当返回一个>0的整数
//            ...
//         */
//                return 0;
//            }
//        });

        System.out.println(list);
    }
}

//class MyComparator implements Comparator<Point> {
//
//    @Override
//    public int compare(Point o1, Point o2) {
//        //o1点到原点的距离
//        int olen1 = o1.getX() * o1.getY() * o1.getY();
//        //o2点到原点的距离
//        int olen2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//        /*
//            返回值要求
//            如果方法认为o1>o2此时应当返回一个>0的整数
//            ...
//         */
//        return 0;
//    }
//}


