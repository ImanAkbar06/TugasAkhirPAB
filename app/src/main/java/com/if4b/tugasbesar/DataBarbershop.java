package com.if4b.tugasbesar;
import java.util.ArrayList;
import java.util.Collection;

public class DataBarbershop {
    public static String[][] data = new String[][]{
            {"Scissors&Co Gentlemens Barber", "Alamat: Jl.KH. Ahmad Dahlan No.59, Talang Semut, Kec.Bukit Kecil, Kota Palembang, Sumatera Selatan 30121." +
                    "Jam: \n" +
                    "Selasa\t10.00–20.00\n" +
                    "Rabu\t10.00–20.00\n" +
                    "Kamis\t10.00–20.00\n" +
                    "Jumat\t10.00–20.00\n" +
                    "Sabtu\t10.00–20.00\n" +
                    "Minggu\t10.00–20.00\n" +
                    "Senin\t10.00–20.00\n", ""},
            {"Binggo! Barbershop Plaju", "Alamat: Jl. Jenderal Ahmad Yani No.58, 16 Ulu, Kec. Seberang Ulu II, Kota Palembang, Sumatera Selatan 30111." +
                    "Jam: \n" +
                    "Selasa\t09.00–21.00\n" +
                    "Rabu\t09.00–21.00\n" +
                    "Kamis\t09.00–21.00\n" +
                    "Jumat\t09.00–21.00\n" +
                    "Sabtu\t09.00–21.00\n" +
                    "Minggu\t09.00–21.00\n" +
                    "Senin\t09.00–21.00\n", ""},
            {"Bravos Barbershop", "Alamat: Samping Kampus MDP, Jl. Rajawali No.22, 9 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30114." +
                    "Jam: \n" +
                    "Selasa\t09.00–20.00\n" +
                    "Rabu\t09.00–20.00\n" +
                    "Kamis\t09.00–20.00\n" +
                    "Jumat\t09.00–20.00\n" +
                    "Sabtu\t09.00–20.00\n" +
                    "Minggu\t09.00–20.00\n" +
                    "Senin\t09.00–20.00\n", ""},
            {"Muchacho Barber & Co", "Alamat: Jl. Kapten A. Rivai No.106, 26 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30135." +
                    "Jam: \n" +
                    "Selasa\t10.00–20.00\n" +
                    "Rabu\t10.00–20.00\n" +
                    "Kamis\t10.00–20.00\n" +
                    "Jumat\t10.00–20.00\n" +
                    "Sabtu\t10.00–20.00\n" +
                    "Minggu\t10.00–20.00\n" +
                    "Senin\t10.00–20.00\n", ""},
            {"MR. Cuts Barbershop", "Alamat: Jl. Jenderal Ahmad Yani, 14 Ulu, Kec. Seberang Ulu II, Kota Palembang, Sumatera Selatan 30265." +
                    "Jam: \n" +
                    "Selasa\t09.00–20.30\n" +
                    "Rabu\t09.00–20.30\n" +
                    "Kamis\t09.00–20.30\n" +
                    "Jumat\t09.00–20.30\n" +
                    "Sabtu\t09.00–20.30\n" +
                    "Minggu\t09.00–20.30\n" +
                    "Senin\t09.00–20.30\n", ""},
            {"Hugos Barber Shop", "Alamat: Jalan Residen Abdul Rozak, Simpang 4 Patal, 8 Ilir, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30163." +
                    "Jam: \n" +
                    "Selasa\t10.00–21.00\n" +
                    "Rabu\t10.00–21.00\n" +
                    "Kamis\t10.00–21.00\n" +
                    "Jumat\t13.00–21.00\n" +
                    "Sabtu\t10.00–21.00\n" +
                    "Minggu\t10.00–21.00\n" +
                    "Senin\tTutup\n", ""},
            {"FI Barbershop Radial", "Alamat: Jl. Radial No.14, 24 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30134." +
                    "Jam: \n" +
                    "Selasa\t10.00–09.00\n" +
                    "Rabu\t10.00–09.00\n" +
                    "Kamis\t10.00–09.00\n" +
                    "Jumat\t10.00–09.00\n" +
                    "Sabtu\t10.00–09.00\n" +
                    "Minggu\t10.00–09.00\n" +
                    "Senin\t10.00–09.00\n", ""},
            {"Pluto's BIGBRO barbershop", "Alamat: Jalan Mayor Ruslan No.962 20 Ilir, D. I, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30114." +
                    "Jam: \n" +
                    "Selasa\t10.00–21.00\n" +
                    "Rabu\t10.00–21.00\n" +
                    "Kamis\t10.00–21.00\n" +
                    "Jumat\t10.00–21.00\n" +
                    "Sabtu\t10.00–21.00\n" +
                    "Minggu\t10.00–21.00\n" +
                    "Senin\t10.00–21.00\n", ""},
            {"MR. Weed Barbershop", "Alamat: Jl. Jend. Basuki Rachmat No.78E, Pipa Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30164." +
                    "Jam: \n" +
                    "Selasa\t09.00–20.30\n" +
                    "Rabu\t09.00–20.30\n" +
                    "Kamis\t09.00–20.30\n" +
                    "Jumat\t09.00–20.30\n" +
                    "Sabtu\t09.00–20.30\n" +
                    "Minggu\t08.00–20.30\n" +
                    "Senin\t09.00–20.30\n", ""},
            {"D'MAXX Barbershop Palembang (Ex Maxx barbershop)", "Alamat: Demang Lebar Daun, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151." +
                    "Jam: \n" +
                    "Selasa\t11.00–20.00\n" +
                    "Rabu\t11.00–20.00\n" +
                    "Kamis\t11.00–20.00\n" +
                    "Jumat\t11.00–20.00\n" +
                    "Sabtu\t10.00–20.00\n" +
                    "Minggu\t10.00–20.00\n" +
                    "Senin\tTutup\n", ""},
    };


    public static ArrayList<ModelBarbershop> ambilDataBarbershop() {
        ArrayList<ModelBarbershop> dataBarbershop = new ArrayList<>();
        for (String[] varData : data) {
            ModelBarbershop model = new ModelBarbershop();
            model.setNama(varData[0]);
            model.setDetail(varData[1]);
            model.setHari(varData[2]);
            model.setJam(varData[3]);

           dataBarbershop.add(model);
        }

        return dataBarbershop;
    }
}
