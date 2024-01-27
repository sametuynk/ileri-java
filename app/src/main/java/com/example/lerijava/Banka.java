package com.example.lerijava;

public class Banka {

    private int bakiye;

    public Banka(){
    }
    public Banka(int bakiye){
        this.bakiye=bakiye;
    }
    public synchronized void paraCek(String isim,int tutar){

        if (tutar>bakiye){
            System.out.println(isim + ": Bankada para kalmadı");
        }else {
            bakiye=bakiye-tutar;
            System.out.println(isim + " Bankadan çekilen para tutarı: "+tutar+" - Güncel banka bakiye: "+bakiye+" TL");

        }
    }
}
