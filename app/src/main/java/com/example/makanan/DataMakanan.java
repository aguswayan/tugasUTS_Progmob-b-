package com.example.makanan;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataMakanan {
    private static String [] namamakanan = {
            "Nasi Goreng Original",
            "Nasi Goreng Seafood",
            "Nasi Goreng Mawut",
            "Nasi Goreng Gila",
            "Nasi Goreng Krengsengan",

    };

    private static String [] detailmakanan = {
            "Nasi Goreng Original adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
            "Nasi Goreng Seafood adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, udang, cumi, dan kerupuk.",
            "Nasi Goreng Mawut adalah sebuah makanan berupa nasi yang dipadukan dengan mie goreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
            "Nasi Goreng Gila ini hampir sama dengan Nasi Goreng Original tetapi Nasi Goreng Gila ini ciri khasnya dengan porsi besar dan pedas",
            "Nasi Goreng Krengsengan adalah adalah sebuah makanan berupa nasi yang dipadukan dengan sate kambing, tongseng, rawon dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.",
    };

    private static int[] gambarmakanan = {
            R.drawable.original,
            R.drawable.seafood,
            R.drawable.mawut,
            R.drawable.gilaa,
            R.drawable.krengsengan,
    };

    static ArrayList<Makanan> getListdata(){
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position <namamakanan.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setNama(namamakanan[position]);
            makanan.setDetail(detailmakanan[position]);
            makanan.setPhoto(gambarmakanan[position]);
            list.add(makanan);
        }
        return list;
    }


}
