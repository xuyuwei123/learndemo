public class Students {
    // 属性：学号、姓名、年龄
    private String id;
    private String name;
    private int age;

    // 构造方法
    public Students(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getter方法
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 打印学生信息
    public void showInfo() {
        System.out.println("学号：" + id + "，姓名：" + name + "，年龄：" + age);
    }
}
