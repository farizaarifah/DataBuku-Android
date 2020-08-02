package com.arifah.uas_proyek_buku.model;

public class Request {
    private String judul;
    private String penulis;
    private String penerbit;
    private String key;
    private String cover_url;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Request(){

    }



    public Request(String judul, String cover_url){
        if (judul.trim().equals("")){
            judul = "No Name";
        }
        this.judul = judul;
        this.cover_url = cover_url;
    }

    public Request(String judul, String penulis, String penerbit, String cover_url){
        if (judul.trim().equals("")){
            judul = "No Name";
        }
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.cover_url = cover_url;
    }






    public String toString(){
        return " "+judul+"\n" +
                " "+penulis+"\n"+
                " "+penerbit+"\n"+
                " "+cover_url;
    }


}
