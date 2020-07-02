package com.example.cca;

public class SoalPilihanGanda {

    public String pertanyaan[] = {
            "Mempercayai dan meyakini dengan sepenuh hati bahwa Allah swt menurunkan wahyukepada para rasul untuk dijadikan pedoman hidup manusia adalah pengertian dari?",
            "Nabi Daud AS menerima kitab suci?",
            "Nabi Musa menerima wahyu di...",
            "Malaikat yang bertugas meniup terompet adalah?",
            "Dapat membelah bulan atas seizin Alloh adalah mu’jizat Nabi?",
            "Pada yanggal berapa Nabi Muhammad SAW lahir?",
            "Wahyu yang pertama turun adalah surat...",
            "Burung Ababil di dalam Al-Quran disebutkan dalam surat...",
            "Nabi Muhammad  SAW memiliki gelar al amin yang artinya?",
    };

    private String pilihanJawaban[][] = {
            {"Mengenal kitab-kitab Allah SWT ", "Iman kepada kitab-kitab Allah SWT ", "Tawakal kepada kitab-kitab Allah SWT"},
            {"Taurat", "Zabur", "Injil"},
            {"Bukit Marwa", "Bukit Safa", "Bukit Thursina"},
            {"Jibril", "Mikail", "Isrofil"},
            {"Daud AS", "Muhammad SAW", "Musa AS"},
            {"12 Robi'ul awwal", "10 Muharrom", "27 Rojab"},
            {"Yasin", "Al-'Alaq", "Al-Fatihah"},
            {"An-Nas", "Al-Ikhlas", "Al-Fill"},
            {"Cerdas", "Dapat Dipercaya", "Menyampaikan"},
    };

    private String jawabanBenar[] = {
            "Iman kepada kitab-kitab Allah SWT ",
            "Zabur",
            "Bukit Thursina",
            "Isrofil",
            "Muhammad SAW",
            "12 Robi'ul awwal",
            "Al-'Alaq",
            "Al-Fill",
            "Dapat dipercaya",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
