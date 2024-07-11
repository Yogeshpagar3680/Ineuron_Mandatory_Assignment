package question8;

/**
 * Write a Java program that creates two threads. The first thread should print even
 * numbers between 1 and 10, and the second thread should print odd numbers
 * between 1 and 10
 */
class EvenNumber implements Runnable {

   public void run(){
        System.out.println("Even no between 1 to 10");
        for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0)
                    System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
   }
}
class OddNumber implements Runnable {
    public void run(){
        System.out.println("Odd no between 1 to 10");
        for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException {

        EvenNumber evenNumber = new EvenNumber();
        OddNumber oddNumber = new OddNumber();

        Thread t1 = new Thread(evenNumber);
        Thread t2 = new Thread(oddNumber);

        t1.start();
        t1.join();
        t2.start();
    }
}