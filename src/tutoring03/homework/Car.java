package tutoring03.homework;

public abstract class Car {
    public void run() {
        start();
        drive();
        stop();
        turnoff();
    }

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " 시동을 켭니다.");
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " 달립니다.");
    }

    public void stop() {
        System.out.println(this.getClass().getSimpleName() + " 멈춥니다.");
    }

    public void turnoff() {
        System.out.println(this.getClass().getSimpleName() + " 시동을 끕니다.");
        System.out.println("=================");
    }
}
