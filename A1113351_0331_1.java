import java.util.Scanner;

class Animal {
    protected String name;
    protected double height;
    protected int weight, speed;

    public Animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("項目姓名：" + name + "\t身高：" + height + "\t體重：" + weight + "\t速度：" + speed);
    }

    public int distance(int x, double y) {
        int z = x * (int) y * speed;
        return z;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends Animal {
    protected String sex;

    public human(String name, double height, int weight, int speed, String sex) {
        super(name, height, weight, speed);
        this.sex = sex;
    }

    public void show() {
        System.out.print("項目姓名：" + name + "\t身高：" + height + "\t體重：" + weight + "\t速度：" + speed);
        System.out.println("\t性別：" + sex);
    }
}

class snow extends human {
    protected String skill;

    public snow(String name, double height, int weight, int speed, String sex, String skill) {
        super(name, height, weight, speed, sex);
        this.skill = skill;
    }

    public void show() {
        System.out.print("項目姓名：" + name + "\t身高：" + height + "\t體重：" + weight + "\t速度：" + speed);
        System.out.println("\t性別：" + sex + "\t冰凍技能：" + skill);
    }

    public int distance(int x, double y) {
        int z = x * (int) y * speed * 2;
        return z;
    }
}

public class A1113351_0331_1 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        Animal.showinfo();

        Animal[] An = new Animal[2];
        An[0] = new Animal("雪寶", 1.1, 52, 100);
        An[1] = new Animal("驢子", 1.5, 99, 200);

        human[] Hu = new human[3];
        Hu[0] = new human("阿克", 1.9, 80, 150, "男");
        Hu[1] = new human("漢斯", 1.8, 78, 130, "男");
        Hu[2] = new human("安那", 1.7, 48, 120, "女");

        snow Sn = new snow("愛沙", 1.7, 50, 120, "女", "Yes");

        for (int i = 0; i < An.length; i++) {
            An[i].show();
        }

        for (int i = 0; i < Hu.length; i++) {
            Hu[i].show();
        }
        Sn.show();

        double[] D = new double[6];

        for (int i = 0; i < An.length; i++) {
            System.out.println("請輸入" + An[i].name + "的時間：");
            int time = sc.nextInt();
            System.out.println("請輸入" + An[i].name + "的加速度，輸入 0 則默認為不輸入：");
            double acc = sc.nextDouble();
            if (acc == 0) {
                acc = 1.0;
            }
            D[i] = An[i].distance(time, acc);
        }

        for (int i = 0; i < Hu.length; i++) {
            System.out.println("請輸入" + Hu[i].name + "的時間：");
            int time = sc.nextInt();
            System.out.println("請輸入" + Hu[i].name + "的加速度，輸入 0 則默認為不輸入：");
            double acc = sc.nextDouble();
            if (acc == 0) {
                acc = 1.0;
            }
            D[i + 2] = Hu[i].distance(time, acc);
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("請輸入" + Sn.name + "的時間：");
            int time = sc.nextInt();
            System.out.println("請輸入" + Sn.name + "的加速度，輸入 0 則默認為不輸入：");
            double acc = sc.nextDouble();
            if (acc == 0) {
                acc = 1.0;
            }
            D[5] = Sn.distance(time, acc);
        }

        System.out.println(An[0].name + "的奔跑距離：" + D[0]);
        System.out.println(An[1].name + "的奔跑距離：" + D[1]);
        System.out.println(Hu[0].name + "的奔跑距離：" + D[2]);
        System.out.println(Hu[1].name + "的奔跑距離：" + D[3]);
        System.out.println(Hu[2].name + "的奔跑距離：" + D[4]);
        System.out.println(Sn.name + "的奔跑距離：" + D[5]);

        sc.close();
    }
}
