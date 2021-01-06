package com.pmob.pencarianrs.utils


object RsData {
    private var data = arrayOf(
        arrayOf(
            "Parkiran Universtas Ahmad Dahlan",
            "Yogyakarta \n06.00 - 20.00",
            "https://pmb.uad.ac.id/wp-content/uploads/kampus-UAD-untuk-KR-3-Copy-1030x580.jpg",
            "Fasilitasnya mantap lengkaps"
        ),
        arrayOf(
            "Parkiran Universitas Negeri Yogyakarta",
            "Yogyakarta \n08.00 - 19.00",
            "https://unycommunity.com/wp-content/uploads/2016/03/parkiran.jpg",
            "Fasilitasnya mantap lengkaps"


        ),
        arrayOf(
            "Parkiran Universitas Indonesia",
            "Depok \n06.00 - 17.00",
            "https://vokasi.ui.ac.id/r3/wp-content/uploads/2016/05/4VA.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Universitas Brawijaya",
            "Malang \n06.00 - 20.00",
            "https://kavling10.com/wp-content/uploads/2016/05/DSC_1687.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Universitas Pendidikan Indonesia",
            "Bandung \n07.00 - 21.00",
            "https://fpbs.upi.edu/wp-content/uploads/2018/02/Tempat-Parkir.png",
            "Fasilitasnya mantap lengkaps"


        ),
        arrayOf(
            "Parkiran Universitas Diponegoro",
            "Semarang \n06.00 - 21.00",
            "https://fisip.undip.ac.id/wp-content/uploads/2018/01/pleburan.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Universitas Airlangga",
            "Indonesia Rank 7\nWorld Rank 595",
            "https://3.bp.blogspot.com/-4AZcMILmkp4/W4R243RhFmI/AAAAAAAAAHw/7SvcVrL7EV0EJgXosLzqmr5z9yh9t56GwCLcBGAs/s1600/IMG-20180827-WA0004.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Institut Pertanian Bogor",
            "Bogor\n24 JAM",
            "https://i1.wp.com/greencampus.ipb.ac.id/wp-content/uploads/2016/03/b.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Universitas Sebelas Maret",
            "Surakarta\n24 Jam",
            "https://fib.uns.ac.id/storage/posts/July2020/206UhtjuMUV7RlLkaIaM.JPG",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Institut Teknologi Bandung",
            "Bandung \n 23 Jam",
            "https://geoful.files.wordpress.com/2011/03/2011-03-14-11-52-30.jpg",
            "Fasilitasnya mantap lengkaps"

        ),
        arrayOf(
            "Parkiran Universitas Muhammadiyah Surakarta",
            "Surakarta \n05.00 - 22.00",
            "https://i0.wp.com/pabelan-online.com/wp-content/uploads/2012/11/parkiran1.jpg",
            "Fasilitasnya mantap lengkaps"

        )

    )

    val listData: ArrayList<RsModel>
        get() {
            val list = ArrayList<RsModel>()
            for (aData in data) {
                val univ = RsModel()
                univ.name = aData[0]
                univ.rank = aData[1]
                univ.photo = aData[2]
                univ.overview = aData[3]

                list.add(univ)
            }
            return list
        }
}