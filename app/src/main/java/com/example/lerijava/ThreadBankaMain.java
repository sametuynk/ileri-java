package com.example.lerijava;

public class ThreadBankaMain {
    public static void main(String[] args) {

        Banka b1=new Banka(5000);


        BenimIslemThread is1=new BenimIslemThread("SAMET",700,b1);
        is1.start();

        BenimIslemThread is2=new BenimIslemThread("BERAT",1100,b1);
        is2.start();

        BenimIslemThread is3=new BenimIslemThread("ALİ",1600,b1);
        is3.start();

        BenimIslemThread is4=new BenimIslemThread("AHMET",1900,b1);
        is4.start();
    }


    static class BenimIslemThread extends Thread{

        private String isim;
        private int tutar;
        private Banka b;

        public BenimIslemThread() {
        }

        public BenimIslemThread(String isim, int tutar, Banka b) {
            this.isim = isim;
            this.tutar = tutar;
            this.b = b;
        }

        @Override
        public void run() {
            try {

                Thread.sleep(200);
                b.paraCek(isim,tutar);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
