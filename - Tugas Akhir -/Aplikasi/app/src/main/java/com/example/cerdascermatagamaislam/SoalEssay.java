package com.example.cerdascermatagamaislam;

public class SoalEssay {

    public  String pertanyaan[] = {
            " Potongan ayat diatas merupakan bagian dari surat ...",
            " Mampu menghidupkan orang yang mati atas seizin Allah adalah mukjizat Nabi ....",
            " Di antara golongan yang berhak menerima zakat ialah orang yang masih lemah imannya atau sering disebut?",
            " Rukun Iman berjumlah... ",
            " Hari kiamat juga sering disebut sebagai hari perhitungan atau ....",
            " Apakah burung yang diutus Allah untuk menghancurkan tentara gajah?",
            " Ka’bah yang menjadi kiblat umat muslim terletak di Negara ...",
            " Siapakah nama malaikat yang bertugas mencabut nyawa?",
            " Ibadah mengelilingi Ka’bah dalam rangakaian ibadah haji disebut?",
    };

    public String image[] = {
            "surat_al_maun",
            "nabi_isa",
            "muallaf",
            "rukun_iman",
            "timbangan",
            "ababil",
            "kabah",
            "izrail",
            "thawaf",
    };
    private String jawabanBenar[] = {
            "Al-Ma'un",
            "Isa AS",
            "Mualaf",
            "Enam",
            "Yaumul Hisab",
            "Ababil",
            "Arab Saudi",
            "Izrail",
            "Thawaf",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
