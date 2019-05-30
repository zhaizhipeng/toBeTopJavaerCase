package base.c04;

/**
 * @author zhipeng zhai
 * @date 2019/5/30 0030
 */
public class Dog extends Animal {

    public void eat(){
        System.out.println("Dog eat");
    }

    public void sleep(){
        System.out.println("Dog sleep");
    }

    public static void main(String args[]){
        Animal a = new Animal();
        Animal d = new Dog();
        a.eat();
        d.eat();
        if (d instanceof Dog)
        ((Dog) d).sleep();
    }
}
