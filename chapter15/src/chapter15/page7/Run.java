package chapter15.page7;

import java.awt.Toolkit;

public class Run {
    // 메인 스레드
    public static void main(String[] args) throws InterruptedException { // 1. throws Exception 추가
        // 두가지 일을 동시에 진행하려고 한다.
        // 사운드 기능을 작동(1초마다 사운드를 발생, 5번 발생)
        // 숫자를 출력한다 (1~5까지)
        // 사운드 클래스

        ToolKitTread tk = new ToolKitTread();
        tk.setDaemon(true);
        //부모가 Thread PrintNumber 스레드 동작
        //부모 : thread
        PrintNumber pn = new PrintNumber();

        pn.setDaemon(true);
        tk.start();
        pn.start();

        //메인스레드
        Thread.sleep(2000);

        System.out.println("The end");
    }
}
