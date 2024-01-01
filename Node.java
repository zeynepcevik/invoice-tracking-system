/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musteritakip;

/**
 * @file MusteriTakip
 * @description Bu programda, müşteri fatura bilgilerini içeren bir dosyadan
 * veri okunur ve öncelikli bir kuyruğa müşteri eklenir. Ardından, kullanıcı
 * tarafından belirtilen öncelik değerine göre kuyruktan müşteri çıkarılır ve
 * müşteriler listelenir. Ayrıca, fatura türüne göre müşterileri filtrelenerek
 * çıkış sıraları ve toplam süre hesaplanır.Burada da node sınıfı oluşturulmuş
 * ve kuyrukta tutulacak bilgiler tanımlanmıştır.
 * @assignment 1. Ödev
 * @date 24.12.2023
 * @author Zeynep Çevik zeynep.cevik@stu.fsm.edu.tr
 */
public class Node {

    String AdSoyad;
    String FaturaTipi;
    Double FaturaMiktari;
    int oncelik;
    int zaman;
    Node next;

    Node(String AdSoyad, String FaturaTipi, Double FaturaMiktari, int oncelik, int zaman, Node next) {
        this.AdSoyad = AdSoyad;
        this.FaturaTipi = FaturaTipi;
        this.FaturaMiktari = FaturaMiktari;
        this.oncelik = oncelik;
        this.zaman = zaman;
        this.next = null;
    }
}
