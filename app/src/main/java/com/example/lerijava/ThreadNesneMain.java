package com.example.lerijava;

public class ThreadNesneMain {
    public static void main(String[] args) {
        //METODLARIN THREADLERLE ÇALIŞTIRILMASI ÖRNEĞİ

        Ogrenci o1=new Ogrenci(12,"kemal");

        BenimThread is1=new BenimThread("ilk iş",o1);
        is1.start();

        BenimThread is2=new BenimThread("ikinci iş",o1);
        is2.start();


    }
    static class BenimThread extends Thread{
        private String isinAdi;
        private Ogrenci o;

        public BenimThread(String isinAdi, Ogrenci o) {
            this.isinAdi = isinAdi;
            this.o = o;
        }

        @Override
        public void run() {
            o.bilgiAl(isinAdi);
        }
    }

}
