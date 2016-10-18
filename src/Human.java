/**
 * Created by lenovo on 2016/10/17.
 */
public class Human {
    private String name,sex;
    private int age;

    public Human(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        String str = "姓名是"+ this.getName() + "，年龄是"+ this.getAge() + "，性别是"+this.sex;
        return str;
    }
}
