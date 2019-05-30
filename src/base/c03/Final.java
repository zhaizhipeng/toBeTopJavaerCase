package base.c03;

/**
 * @author zhipeng zhai
 * @date 2019/5/29 0029
 */
public class Final {

    final static String NAME = "haha";

    public static void print(){
        //NAME = "";
        System.out.println(NAME);
        final String NAME = "hehe";
        System.out.println(NAME);
    }

    public static void main(String args[]){
        print();
    }
}
