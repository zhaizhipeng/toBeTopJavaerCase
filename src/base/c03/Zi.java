package base.c03;

/**
 * @author zhipeng zhai
 * @date 2019/5/30 0030
 */
public class Zi extends Fu {

   private int age;

   private String name;

   public Zi(String name, int age){
       super(name);
       this.name = "hehe";
       this.age = age;
       System.out.println("子类构造方法初始化");
   }

   public void print(){
        System.out.println("父类的name属性： " + super.name);
        System.out.println("子类的name属性： " + this.name);
        System.out.println("子类的age属性： " + this.age);
    }

   public static void main(String args[]){
       Zi zi = new Zi("haha", 20);
       zi.print();
   }
}
