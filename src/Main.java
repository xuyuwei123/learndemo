import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 存储所有学生
    private static ArrayList<Students> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== 学生信息管理系统 V1.0 =====");
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // 吸收换行符

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    findStudentById();
                    break;
                case 0:
                    System.out.println("程序退出，再见！");
                    scanner.close();
                    return;
                default:
                    System.out.println("输入错误，请重新选择！");
            }
        }
    }

    // 打印菜单
    private static void printMenu() {
        System.out.println("\n【功能菜单】");
        System.out.println("1. 添加学生");
        System.out.println("2. 查看全部学生");
        System.out.println("3. 根据学号查询学生");
        System.out.println("0. 退出程序");
        System.out.print("请输入功能编号：");
    }

    // 添加学生
    private static void addStudent() {
        System.out.print("请输入学号：");
        String id = scanner.nextLine();
        System.out.print("请输入姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入年龄：");
        int age = scanner.nextInt();
        scanner.nextLine();

        Students stu = new Students(id, name, age);
        studentList.add(stu);
        System.out.println("✅ 学生添加成功！");
    }

    // 展示所有学生
    private static void showAllStudents() {
        if (studentList.size() == 0) {
            System.out.println("📭 当前暂无学生数据！");
            return;
        }
        System.out.println("\n==== 学生列表 ====");
        for (Students s : studentList) {
            s.showInfo();
        }
    }

    // 根据学号查找
    private static void findStudentById() {
        System.out.print("请输入要查询的学号：");
        String searchId = scanner.nextLine();
        for (Students s : studentList) {
            if (s.getId().equals(searchId)) {
                System.out.println("🔍 查询结果：");
                s.showInfo();
                return;
            }
        }
        System.out.println("❌ 未找到该学号学生！");
    }
}
