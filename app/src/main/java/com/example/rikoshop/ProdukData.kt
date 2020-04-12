package com.example.rikoshop

object ProdukData {


    //inisiasi sebuah  nama produk buku
    private val produk_nama = arrayOf(
        "Harry Potter and The Philosopher Stone",
        "Harry Potter and The Chamber of Secret",
        "Harry Potter and The Prisoner of Azkaban",
        "Harry Potter and The Goblet of Fire",
        "Harry Potter and The Orde Phoenix",
        "Harry Potter and The Half Blood Prince",
        "Harry Potter and The Deathly Hallows",
        "Eliana",
        "Pukat",
        "Burlian",
        "Amelia",
        "Laskar Pelangi",
        "Sang Pemimpi",
        "Edensor",
        "Maryamah Karpov"

    )


    //inisiasi dari sebuah detail buku
    private val produk_detail = arrayOf(
        "Buku seri pertama Harry Potter yang menceritakan bahwa Harry yang selama ini dirawat oleh Muggle (orang non sihir) ternyata adalah keturunan" +
                "dari penyihir terkenal. Ayah dan Ibunya meninggal karena sebuah insiden sihir hebat dimasa lampau. Namun karena ketidaktahuannya, Harry" +
                "harus memikirkan bagaimana ia bisa tinggal dan belajar disana. Bagaimana nasib Harry ke depan?",

        "Buku seri kedua Harry Potter. Hogwarts sedang dalam keadaan bahaya karena monster yang tinggal di Hogwarts muncul kembali dan membuat" +
                "seluruh warga Hogwarts geger. Pasalnya, pada masa lalu monster ini membuah salah seorang murid Hogwarts dan mengakibatkan " +
                "Hogwarts harus ditutup. Akankah Harry dan teman-temannya mampu memecahkan misteri ini?",

        "Buku seri ketiga Harry Potter mengisahkan tentang seseorang di masa lalu yang datang kembali yang dimungkinkan hendak membunuh Harry Potter. Dia adalah sang" +
                "tahanan dari Azkaban yang entah bagaimana caranya bisa kabur. Dementor dikerahkan untuk menangkapnya tapi tidak ada yang mampu mengembalikan tahanan" +
                "tersebut ke Azkaban. Akankah Harry selamat atau terluka parah?",

        "Buku keempat Harry Potter. Nama Harry Potter tiba-tiba dimasukkan dalam Piala Api dan sesuai kontrak sihir, maka ia tidak diperkenankan untuk mundur. Namun halangan dan rintangan" +
                "menyertai perjuangannya ketika harus berlaga. Lantas bagaimana akhir ceritanya?",

        "Buku kelima Harry potter",
        "Buku keenam Harry potter",
        "Buku terakhir dari sekual Harry Potter. Harry potter dan kawan-kawannya harus berjuang menemukan ke tujug Horcrux agar Voldemort dapat disingkirkan dari dunia shir" +
                "untuk selama-lamanya. Namun, pertumpahan terjadi dimana-mana karena pelahap maut juga turut andil dan Voldemort mampu mengumpulkan pasukanya kembali." +
                "Akahkan Hogwart akhirnya selamat? Bagaimana dengan Harry dan kawan-kawannya?",

        "Buku pertama Tere Liye dari serial anak-anak mamak",
        "Buku kedua Tere Liye dari serial anak-anak mamak",
        "Buku ketiga Tere Liye dari serial anak-anak mamak",
        "Buku keempat Tere Liye dari serial anak-anak mamak",
        "Buku pertama dari Andrea Hirata tentang sebuah perjuangan di kampung Belitong",
        "Buku kedua dari Andrea Hirata tentang sebuah mimpi untuk hidup yang lebih baik",
        "Buku ketiga dari Andrea Hirata yang mengisahkan tentang sebuah perjalanan yang jauh",
        "BUku terakhir dari tetralogi Laskar Pelangi tentang arti cinta dan pengorbanan"
    )

    private val produk_harga = arrayOf(
        "Rp. 179.000,00",
        "Rp. 156.000,00",
        "Rp. 179.900,00",
        "Rp. 200.100,00",
        "Rp. 250.654,00",
        "Rp. 298.777,00",
        "Rp. 342.590,00",
        "Rp. 98.000,00",
        "Rp. 98.000,00",
        "Rp. 98.000,00",
        "Rp. 98.000,00",
        "Rp. 76.500,00",
        "Rp. 87.200,00",
        "Rp. 81.000,00",
        "Rp. 79.900,00"
    )

    private val produk_gambar = intArrayOf(
        R.drawable.harry_1,
        R.drawable.harry_2,
        R.drawable.harry_3,
        R.drawable.harry_4,
        R.drawable.harry_5,
        R.drawable.harry_6,
        R.drawable.harry_7,
        R.drawable.tere_1,
        R.drawable.tere_2,
        R.drawable.tere_3,
        R.drawable.tere_4,
        R.drawable.andre_1,
        R.drawable.andre_2,
        R.drawable.andre_3,
        R.drawable.andre_4
        )


    //mengirimkan dari data source ke bridge
    val listData : ArrayList<Produk>

        get() {
            val list = arrayListOf<Produk>()
            for (position in produk_nama.indices) {
                val hero = Produk()
                hero.nama = produk_nama[position] //mengambil nama produk
                hero.detail = produk_detail[position] //mengambil detail produk
                hero.harga = produk_harga[position] //mengambil harga produk
                hero.gambar = produk_gambar[position] //mengambil gambar produk
                list.add(hero) //masukkan ke list
            }

            return list //dikembalikan per list berisi 4 elemen tersebut
        }
}