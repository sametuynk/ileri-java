package com.example.lerijava;

public class ThreadMain {
    public static void main(String[] args) {

        BirinciThread bt1=new BirinciThread();

        bt1.start(); //THREAD MANTIĞIYLA ÇALIŞMAK İSTERSENİZ START() METODUNU ÇAĞIRACAZ.


        Thread bt2=new Thread(new IkinciThread());

        bt2.start();



        for (int i = 0; i < 100; i++) {
            System.out.println("Main : "+i);
        }
    }


    static class BirinciThread extends Thread{
        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                System.out.println("Birinci Thread : "+i);
            }

        }
    }
}
