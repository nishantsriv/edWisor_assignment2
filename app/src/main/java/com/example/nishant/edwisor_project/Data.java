package com.example.nishant.edwisor_project;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by nishant on 2/12/2017.
 */

public class Data {
    public  static  ArrayList<Citylist> getdata() {

        System.out.println("TAGTAG");
        ArrayList<Citylist> data = new ArrayList<>();

        String[] name = {"Delhi", " Mumbai", "Ahmedabad", "Lucknow",
                "Hyderabad", "Bangalore", "Chennai", "Kolkata", "Plus"};


        int[] images = {R.drawable.delhi,
                R.drawable.mumbai, R.drawable.ahmedabad,
                R.drawable.lucknow, R.drawable.hyderabad
                , R.drawable.bangalore, R.drawable.chennai,
                R.drawable.kolkata, R.drawable.plus};


        for (int i = 0; i < name.length; i++) {
            Citylist citylist = new Citylist();
            citylist.setTitle(name[i]);
            citylist.setImageid(images[i]);
            data.add(citylist);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_mumbai() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.mumbai_colaba_market, R.string.mumbai_elephanta_caves, R.string.mumbai_gateway_of_india, R.string.mumbai_juhu_beach};

        int[] images = {R.drawable.mumbai_colaba_market,
                R.drawable.mumbai_elephanta_caves, R.drawable.mumbai_gateway_of_india,
                R.drawable.mumbai_juhu_beach};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_bangalore() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.bangalore_lalbagh, R.string.bangalore_mgroad, R.string.bangalore_nationalpark, R.string.bangalore_palace};

        int[] images = {R.drawable.bangalore_lalbagh,
                R.drawable.bangalore_mgroad, R.drawable.bangalore_nationalpark,
                R.drawable.bangalore_palace};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_hyderabad() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.hyderabad_charminar, R.string.hyderabad_chowmahallapalace, R.string.hyderabad_golcondafort, R.string.hyderabad_husainlake};

        int[] images = {R.drawable.hyderabad_charminar,
                R.drawable.hyderabad_chowmahallapalace, R.drawable.hyderabad_golcondafort,
                R.drawable.hyderabad_husainlake};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_chennai() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.chennai_akariabeach, R.string.chennai_marinabeach, R.string.chennai_marundeshwartemple, R.string.delhi_akshardham};

        int[] images = {R.drawable.chennai_akkariabeach,
                R.drawable.chennai_marinabeach, R.drawable.chennai_marundeshwartemple,
                R.drawable.chennai_breezybeach};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_lucknow() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.lucknow_chowk, R.string.lucknow_hazratganj, R.string.lucknow_imambara, R.string.lucknow_zoo};

        int[] images = {R.drawable.lucknow_chowk,
                R.drawable.lucknow_hazratganj, R.drawable.lucknow_imamabara,
                R.drawable.lucknow_zoo};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_kolkata() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.kolkata_howrah_bridge, R.string.kolkata_indian_museum, R.string.kolkata_jorasanko_thakurbari, R.string.kolkata_park_street};

        int[] images = {R.drawable.kolkata_howrah_bridge,
                R.drawable.kolkata_indian_museum, R.drawable.kolkata_jorasanko_thakurbari,
                R.drawable.kolkata_park_street};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_ahmedabad() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.ahmedabad_jumma_masjid, R.string.ahmedabad_sabarmati_ashram, R.string.ahmedabad_siddsayed_mosque, R.string.ahmedabad_the_pols};

        int[] images = {R.drawable.ahmedabad_jumma_masjid,
                R.drawable.ahmedabad_sabarmati_ashram, R.drawable.ahmedabad_siddsayed_mosque,
                R.drawable.ahmedabad_the_pols};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }

    public static ArrayList<data_famous> famous_delhi() {


        ArrayList<data_famous> data = new ArrayList<>();
        int[] name = {R.string.delhi_lotustemple, R.string.delhi_hauzkhas, R.string.delhi_gardenfivesenses, R.string.delhi_akshardham};

        int[] images = {R.drawable.delhi_lotustemple,
                R.drawable.delhi_hauzkhas, R.drawable.delhi_gardenfivesenses,
                R.drawable.delhi_akshardham};


        for (int i = 0; i < name.length; i++) {
            data_famous dataFamous = new data_famous();
            dataFamous.stringid = name[i];
            dataFamous.imageid = images[i];
            data.add(dataFamous);
        }
        return data;
    }


}
