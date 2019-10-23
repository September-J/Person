public class Person {
    public int age;
    public String name;
    public String sex;
    public Person(){
        this.age = 18;
        this.name = "xiaohua";
        this.sex = "女";
    }
    public Person(int age,String name,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void eat(){
        System.out.println(age+name+sex+"吃饭！");
    }
    public void sleep(){
        System.out.println(age+name+sex+"睡觉！");
    }
}

