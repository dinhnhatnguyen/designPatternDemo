package com.NhatNguyen.Builder;

public class Banh {
    // thuộc tính bắt buộc có
    private double duong;
    private double bot;

    // thuộc tính tuỳ chọn
    private double vani;
    private double nuocDua;
    private double cacao;
    private double ot;
    private double tieu;

    public static class Builder {
        // thuộc tính bắt buộc có
        private double duong;
        private double bot;

        // thuộc tính tuỳ chọn
        private double vani;
        private double nuocDua;
        private double cacao;
        private double ot;
        private double tieu;

       public Builder(double duong, double bot) {
           this.duong = duong;
           this.bot = bot;
       }
       public Builder vani(double vani) {
           this.vani = vani;
           return this;
       }
       public Builder nuocDua(double nuocDua) {
           this.nuocDua = nuocDua;
           return this;
       }
       public Builder cacao(double cacao) {
           this.cacao = cacao;
           return this;
       }

       public Builder ot(double ot) {
           this.ot = ot;
           return this;
       }
       public Builder tieu(double tieu) {
           this.tieu = tieu;
           return this;
       }
       public Banh build() {
           return new Banh(this);
       }
    }

    private Banh(Builder builder) {
        duong = builder.duong;
        bot = builder.bot;
        vani = builder.vani;
        nuocDua = builder.nuocDua;
        cacao = builder.cacao;
        ot = builder.ot;
        tieu = builder.tieu;
    }
}
