package com.program.sonia_jayadi;

import android.content.Context;

import com.program.sonia_jayadi.model.Burung;
import com.program.sonia_jayadi.model.Monyet;
import com.program.sonia_jayadi.model.Hewan;
import com.program.sonia_jayadi.model.Singa;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Singa> initDataSinga(Context ctx) {
        List<Singa> singas = new ArrayList<>();
        singas.add(new Singa("singa ketangga", "Inggris",
                "Subspesies singa besar ini mampu mencapai berat hingga 280 kilogram.", R.drawable.singa_katanga));
        singas.add(new Singa("Singa Kongo", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "subspesies singa yang tersebar di sepanjang dataran benua Afrika, terutama di Uganda dan Republik Kongo.", R.drawable.singa_kongo));
        singas.add(new Singa("Singa Transvaal", "Indonesia",
                "varietas dari bagian selatan Afrika dan dianggap sebagai saudara singa Katanga.", R.drawable.snga_transvaal));
        return singas;
    }

    private static List<Monyet> initDataMonyet(Context ctx) {
        List<Monyet> monyets = new ArrayList<>();
        monyets.add(new Monyet("Spider Monkey", "Inggris",
                "Hewan ini suka banget akrobatik. Dia dijuluki Spider Monkey karena kakinya yang panjang mirip laba-laba. ", R.drawable.spider_monkey));
        monyets.add(new Monyet("mona monkey", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Mona monkey ini hidup di Afrika barat. Mereka suka banget makan buah-buahan. ", R.drawable.monyet_mona_monkey));
        monyets.add(new Monyet("monyet probosis", "Indonesia",
                "Ini monyet paling ganteng sedunia. Iya, dia suka mandi, guys. ", R.drawable.monyet_proboscis));

        return monyets;
    }

    private static List<Burung> iniDataBurung(Context ctx) {
        List<Burung> Burungs = new ArrayList<>();
        Burungs.add(new Burung("Anis Merah", "Turki",
                "Anis merah dapat dikatakan sebagai jenis burung yang berstatus sebagai kuda hitam.", R.drawable.anis_merah));
        Burungs.add(new Burung("Kenari", "Inggris",
                " kenari mempunyai kicau yang khas Bahkan, suara burung kenari mempunyai istilah sendiri, yaitu ngeriwik", R.drawable.kenari));
        Burungs.add(new Burung("Murai", "Birma/Myanmar",
                "murai batu bak primadona dan artis papan atas.", R.drawable.murai_batu)
        );;
        return Burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSinga(ctx));
        hewans.addAll(initDataMonyet(ctx));
        hewans.addAll(iniDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}