package chapter15.page7;

public class PrintNumber extends Thread{
	@Override
    public void run() {
        for (int i = 0; i < 5; i++) { 
            System.out.println("띵");
            try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {

        }
            System.out.println("PrintNumber 끝났어요");

    }

}
}

