/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tf_idf;

/**
 *
 * @author edelweiss
 */
public class sentences {
    private String date;
    private String isi_tweet;
    public void setDate(String date){
        this.date= date;
    }
    public void setIsi_tweet(String isi_tweet){
        this.isi_tweet =isi_tweet;
    }
    public String getDate(){
        return this.date;
    }
    public String getIsi_tweet(){
        return this.isi_tweet;
    }
}
