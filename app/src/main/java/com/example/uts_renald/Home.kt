package com.example.uts_renald

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MusicAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var musicList: List<Music>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment Home.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            Home().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_anime)
        recyclerView.setHasFixedSize(true)
        adapter = MusicAdapter(requireContext(), musicList) { music ->
            val intent = Intent(requireContext(), DetailMusicActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, music)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    private fun dataInitialize() {

        musicList = listOf<Music>(
            Music(
                R.drawable.album1,
                namemusic = "Mixtape",
                descmusic = "Album mixtape Stray Kids adalah kumpulan karya yang memperlihatkan sisi kreativitas dan eksperimen musik dari grup ini. Dirilis pada tanggal 8 Januari 2018, album ini terdiri dari total 7 lagu yang diproduksi dan ditulis oleh para anggota sendiri. Dalam album mixtape ini, Stray Kids mengeksplorasi berbagai genre musik, termasuk hip-hop, EDM, dan pop, menciptakan suara yang segar dan unik. \n" +
                        "\n Dari lagu-lagu yang energik dan penuh semangat hingga lagu-lagu yang penuh refleksi dan introspeksi, \"Mixtape\" menghadirkan keberagaman dalam gaya musik, menampilkan keunikan dan kemampuan komposisi yang luar biasa dari Stray Kids. Album ini menjadi wadah bagi para anggota untuk mengekspresikan diri mereka dengan bebas, menggabungkan elemen-elemen musik yang beragam dan menciptakan pengalaman mendalam bagi pendengar. \n" +
                        "\nJudul Lagu : \n" +
                        "1. Hellevator \n" +
                        "2. Grrr 총량의 법칙 (Grrr Law of Total Madness) \n" +
                        "3. Young Wings \n" +
                        "4. School Life \n" +
                        "5. 4419 \n" +
                        "6. YAYAYA \n" +
                        "7. Glow"
            ),
            Music(
                R.drawable.album2,
                namemusic = "I am NOT",
                descmusic = "Album I am NOT oleh Stray Kids adalah album studio pertama mereka yang dirilis pada tanggal 26 Maret 2018. Album ini terdiri dari total 8 lagu, termasuk lagu utama yang berjudul District 9 yang menampilkan energi yang kuat dan rap yang tajam. I am NOT menampilkan campuran genre musik yang beragam, seperti hip-hop, pop, dan rock, yang mencerminkan keberanian eksplorasi musikalitas grup ini. \n" +
                        "\n Produksi yang penuh energi dan puitis, serta harmoni vokal yang mengesankan, membuat \"I am NOT\" menjadi album yang mengguncang dan meninggalkan kesan mendalam pada pendengarnya. Album ini menampilkan perkembangan musikal dan artistik yang signifikan dari Stray Kids, menegaskan identitas mereka sebagai grup yang tak takut mengambil risiko dan mengungkapkan keunikan mereka melalui musik. \n" +
                        "\nJudul Lagu : \n" +
                        "1. Not! \n" +
                        "2. District 9 \n" +
                        "3. Mirror \n" +
                        "4. Awaken \n" +
                        "5. Rock \n" +
                        "6. Grow Up \n" +
                        "7. 3rd Eye \n" +
                        "8. Mixtape #1"
            ),
            Music(
                R.drawable.album3,
                namemusic = "I am WHO",
                descmusic = "Album I am WHO oleh Stray Kids adalah album studio kedua mereka yang dirilis pada tanggal 6 Agustus 2018. Album ini terdiri dari total 8 lagu, termasuk lagu utama yang berjudul My Pace yang menghadirkan ritme yang energetik dan lirik yang memotivasi. I am WHO menampilkan eksplorasi lebih lanjut dari suara dan gaya musik Stray Kids, dengan perpaduan yang kreatif antara elemen hip-hop, EDM, dan pop. \n" +
                        "\n Dengan produksi yang berkelas dan kualitas vokal yang luar biasa, album \"I am WHO\" menggabungkan elemen-elemen musik yang unik dan menghadirkan pesan-pesan yang relevan tentang menerima diri sendiri dan menemukan makna dalam kehidupan. Album ini menunjukkan pertumbuhan artistik dan kematangan Stray Kids sebagai grup, sambil tetap mempertahankan energi dan keberanian yang menjadi ciri khas mereka. \n" +
                        "\nJudul Lagu : \n" +
                        "1. WHO? \n" +
                        "2. My Pace \n" +
                        "3. Voices \n" +
                        "4. Question \n" +
                        "5. Insomnia \n" +
                        "6. M.I.A \n" +
                        "7. Awkward Silence \n" +
                        "8. Mixtape #2"
            ),
            Music(
                R.drawable.album4,
                namemusic = "I am YOU",
                descmusic = "Album I am YOU oleh Stray Kids adalah album studio kedua yang dirilis pada tanggal 22 Oktober 2018. Album ini terdiri dari total 8 lagu, termasuk lagu utama yang berjudul I am YOU yang memperlihatkan sisi emosional dan vokal yang kuat dari grup ini. I am YOU menampilkan variasi dalam genre musik, mencakup elemen-elemen dari hip-hop, pop, dan elektronik, yang menciptakan suara yang unik dan segar. \n" +
                        "\n Dengan aransemen musik yang dinamis dan harmoni vokal yang mengesankan, \"I am YOU\" menawarkan kekayaan musikalitas yang menarik. Album ini menciptakan suasana yang kuat dan intim, membangun ikatan emosional dengan pendengar melalui pengungkapan kejujuran dan kerentanan dari Stray Kids. Dengan kombinasi suara yang berdampak dan pesan yang mendalam, \"I am YOU\" menghadirkan karya yang penuh ketulusan dan menjadi bukti kesolidan dan kemampuan musik yang luar biasa dari grup ini.\n" +
                        "\nJudul Lagu : \n" +
                        "1. YOU. \n" +
                        "2. I am YOU \n" +
                        "3. My SIde \n" +
                        "4. Hero's Soup \n" +
                        "5. Get Cool \n" +
                        "6. N/S \n" +
                        "7. 0325 \n" +
                        "8. Mixtape #3"
            ),
            Music(
                R.drawable.album5,
                namemusic = "Cle 1 : Miroh",
                descmusic = "Album 'Cle 1 : Miroh' oleh Stray Kids adalah album mini keempat mereka yang dirilis pada tanggal 25 Maret 2019. Album ini terdiri dari total 7 lagu, termasuk lagu utama yang berjudul Miroh yang menampilkan energi yang meledak-ledak dan pesan yang memotivasi. Cle 1 : Miroh menampilkan perpaduan yang dinamis antara elemen hip-hop, elektronik, dan rock, menciptakan suara yang kuat dan menggemparkan. \n" +
                        "\n Dengan produksi yang mengagumkan dan harmoni vokal yang luar biasa, \"Clé 1: Miroh\" menghadirkan kesan visual dan sonik yang kuat, menciptakan atmosfer yang menarik dan penuh kejutan. Album ini menunjukkan pertumbuhan dan kematangan Stray Kids sebagai grup, serta kemampuan mereka untuk menggabungkan elemen-elemen musik yang beragam menjadi karya yang menginspirasi dan menggebrak. \n" +
                        "\nJudul Lagu : \n" +
                        "1. Entrance \n" +
                        "2. MIROH \n" +
                        "3. Victory Song \n" +
                        "4. Maze of Memories \n" +
                        "5. Boxer \n" +
                        "6. Chronosaurus \n" +
                        "7. 19 \n" +
                        "8. Mixtape #4"
            ),
            Music(
                R.drawable.album6,
                namemusic = "Cle 2 : Yellow Wood",
                descmusic = "Album 'Cle 2 : Yellow Wood' adalah album khusus yang dirilis oleh Stray Kids pada tanggal 19 Juni 2019. Album ini merupakan kelanjutan dari trilogi Cle yang menggambarkan perjalanan grup ini dalam menemukan dan memahami diri mereka sendiri. Yellow Wood terdiri dari total 7 lagu, termasuk lagu utama yang berjudul Side Effects yang menampilkan suara yang eksperimental dan intens. Dalam album ini, Stray Kids mengeksplorasi suara yang lebih matang dan kompleks, dengan kombinasi harmoni vokal yang kuat, rap yang menggigit, dan elemen elektronik yang mencolok \n" +
                        "\n Dengan kombinasi yang brilian antara rap yang tajam dan vokal yang kuat, \"Clé 2: Yellow Wood\" menghadirkan suara yang segar dan inovatif. Album ini menampilkan eksperimen musikal yang menarik dan penampilan yang berani, menjadikannya karya yang menggugah dan mengundang pendengar untuk mengambil risiko dalam kehidupan mereka sendiri. \"Clé 2: Yellow Wood\" adalah sebuah pernyataan kuat tentang kepribadian dan keberanian Stray Kids sebagai grup musik yang berani dan eksentrik. \n" +
                        "\nudul Lagu : \n" +
                        "1. Road Not Taken \n" +
                        "2. Side Effects \n" +
                        "3. TMT \n" +
                        "4. Mixtape#1 \n" +
                        "5. Mixtape#2 \n" +
                        "6. Mixtape#3 \n" +
                        "7. Mixtape#4"
            ),
            Music(
                R.drawable.album7,
                namemusic = "Cle : LEVANTER",
                descmusic = "Album 'Cle : LEVANTER' oleh Stray Kids adalah album studio keempat mereka yang dirilis pada tanggal 9 Desember 2019. Album ini merupakan bagian dari trilogi Cle yang melanjutkan cerita yang dimulai dari album sebelumnya. Cle : LEVANTER terdiri dari 8 lagu, termasuk lagu utama yang berjudul Levanter yang menampilkan suasana emosional dan vokal yang menghanyutkan. Album ini menampilkan eksplorasi musik yang lebih matang dan kompleks, dengan sentuhan pop, hip-hop, dan elemen elektronik yang menyatu secara harmonis. \n" +
                        "\n Dengan melodi yang kuat dan vokal yang penuh kehangatan, \"Clé : LEVANTER\" menciptakan atmosfer yang puitis dan menyentuh hati. Album ini menunjukkan kedewasaan musikal dan kecerdasan lirikal Stray Kids, menghadirkan kombinasi sempurna antara emosi yang dalam dan kekuatan yang mendalam. \"Clé : LEVANTER\" adalah sebuah karya yang menggugah dan memperlihatkan keteguhan serta keberanian Stray Kids dalam menghadapi perjalanan hidup yang sulit." +
                        "\nJudul Lagu : \n" +
                        "1. STOP \n" +
                        "2. Double Knot \n" +
                        "3. Levanter \n" +
                        "4. Booster \n" +
                        "5. Astronaut \n" +
                        "6. Sunshine \n" +
                        "7. You Can STAY"
            ),
            Music(
                R.drawable.album8,
                namemusic = "GO LIVE",
                descmusic = "Album 'GO生 (GO LIVE)' oleh Stray Kids adalah album studio pertama mereka yang dirilis pada tanggal 17 Juni 2020. Album ini terdiri dari total 14 lagu, termasuk lagu utama yang berjudul God's Menu yang menampilkan energi yang luar biasa dan rap yang menggelegar. GO生 (GO LIVE) menawarkan kombinasi yang dinamis antara hip-hop, pop, dan elektronik, menciptakan suara yang unik dan inovatif. Album ini memperlihatkan perkembangan musikalitas Stray Kids dengan lirik-lirik yang jujur ​​dan berani, menggambarkan perjuangan mereka sebagai generasi muda yang berjuang menghadapi tekanan dan ekspektasi masyarakat.\n" +
                        "\n Dengan kombinasi rap yang tajam, vokal yang kuat, dan produksi yang dinamis, \"GO生\" menghadirkan perpaduan sempurna antara musik yang energetik dan pesan yang positif. Album ini menggambarkan keberanian dan keteguhan Stray Kids sebagai grup yang siap mengejar impian mereka dengan semangat yang tak terbatas. Dengan pesona yang tak tertahankan dan komposisi yang brilian, \"GO生\" adalah sebuah karya yang menarik perhatian dan memberikan dorongan semangat kepada pendengarnya.\n" +
                        "\nJudul Lagu : \n" +
                        "1. GO LIVE \n" +
                        "2. God's Menu \n" +
                        "3. Easy \n" +
                        "4. Pacemaker \n" +
                        "5. Airplane \n" +
                        "6. Another Day \n" +
                        "7. Phobia \n" +
                        "8. Blueprint \n" +
                        "9. TA \n" +
                        "10. Haven \n" +
                        "11. TOP - Tower of God \n" +
                        "12. SLUMP - Tower of God \n" +
                        "13. Mixtape : Gone Days \n" +
                        "14. Mixtape : On Track"
            ),
            Music(
                R.drawable.album9,
                namemusic = "IN LIFE",
                descmusic = "Album 'IN生 (IN LIFE)' oleh Stray Kids adalah album repackage dari album studio mereka yang kedua, GO生 (GO LIVE), dirilis pada tanggal 14 September 2020. Album ini terdiri dari 17 lagu, termasuk lagu-lagu dari GO生 dan tambahan tiga lagu baru, yaitu lagu utama Back Door. IN LIFE menampilkan beragam genre musik seperti hip-hop, pop, dan elektronik, dengan sentuhan eksperimental yang menggabungkan elemen musik yang inovatif. Lirik-lirik dalam album ini menggambarkan perjuangan dan semangat yang ditemui dalam perjalanan hidup, serta pesan-pesan positif tentang keberanian, ketekunan, dan kebebasan untuk menjadi diri sendiri.\n" +
                        "\n Dengan aransemen musik yang dinamis dan penggunaan instrumen yang kreatif, \"IN生\" menciptakan atmosfer yang memikat dan membangkitkan rasa penasaran. Album ini menunjukkan kedewasaan artistik dan kecerdasan musikal Stray Kids, dengan setiap lagu memberikan perjalanan emosi yang mendalam dan autentik. \"IN生\" adalah sebuah karya yang menghadirkan keselarasan yang sempurna antara lirik yang bermakna dan suara yang kuat, menunjukkan perjalanan dan evolusi yang mengesankan dari grup ini.\n" +
                        "\nJudul Lagu : \n" +
                        "1. The Tortoise and the Hare \n" +
                        "2. Back Door \n" +
                        "3. B Me \n" +
                        "4. Any \n" +
                        "5. Ex \n" +
                        "6. We Go \n" +
                        "7. Wow \n" +
                        "8. My Universe \n" +
                        "9. God's Menu \n" +
                        "10. Easy \n" +
                        "11. Pacemaker \n" +
                        "12. Airplane \n" +
                        "13. Another Day \n" +
                        "14. Phobia \n" +
                        "15. Blueprint \n" +
                        "16. TA \n" +
                        "17. Haven"
            ),
            Music(
                R.drawable.album10,
                namemusic = "NOEASY",
                descmusic = "Album NOEASY oleh Stray Kids adalah album studio kedua mereka yang dirilis pada tanggal 23 Agustus 2021. Album ini terdiri dari total 14 lagu, termasuk lagu utama yang berjudul Thunderous yang menghadirkan energi yang kuat dan konsep yang memukau. NOEASY menampilkan kombinasi genre musik yang beragam, seperti hip-hop, pop, dan R&B, yang menunjukkan kedewasaan dan eksperimen musikalitas grup ini. Lirik-lirik dalam album ini mengeksplorasi tema-tema seperti perjuangan, keberanian, dan pertumbuhan pribadi, dengan memberikan pesan-pesan inspiratif kepada pendengar.\n" +
                        "\n Dengan produksi yang kreatif dan aransemen yang dinamis, \"NOEASY\" menghadirkan kombinasi sempurna antara kekuatan sonik dan pesan yang bermakna. Album ini mencerminkan pertumbuhan dan kedewasaan grup ini, sambil tetap mempertahankan esensi dan kegigihan mereka. \"NOEASY\" adalah sebuah karya yang menginspirasi, menggugah semangat, dan menggambarkan perjalanan yang penuh tantangan dan ketabahan dari Stray Kids.\n" +
                        "\nJudul Lagu : \n" +
                        "1. CHEESE \n" +
                        "2. Thunderous \n" +
                        "3. DOMINO \n" +
                        "4. SSICK \n" +
                        "5. The View \n" +
                        "6. Sorry, I Love You \n" +
                        "7. Silent Cry \n" +
                        "8. Secret Secret \n" +
                        "9. Star Lost \n" +
                        "10. Red Lights \n" +
                        "11. Surfin' \n" +
                        "12. Gone Away \n" +
                        "13. WOLFGANG \n" +
                        "14. Mixtape : OH"
            ),
            Music(
                R.drawable.album11,
                namemusic = "ODDINARY",
                descmusic = "Oddinary adalah album mini berbahasa Korea keenam oleh grup vokal pria Korea Selatan Stray Kids. Album ini dirilis pada tanggal 18 Maret 2022, melalui JYP Entertainment dan Republic Records, tujuh bulan setelah album studio sebelumnya Noeasy. \n" +
                        "\n Album ini berisi tujuh lagu, termasuk singel utama “MANIAC” yang menggabungkan trap dan techno dengan lirik yang mengekspresikan sisi aneh dari kehidupan sehari-hari23. Album ini juga menampilkan tiga sub-unit baru dari anggota Stray Kids2. Judul album ini adalah gabungan dari kata “odd” dan “ordinary”, yang merepresentasikan bahwa orang-orang yang hidup biasa-biasa saja juga memiliki sisi berbeda dari diri mereka2." +
                        "\nJudul Lagu : \n" +
                        "1. VENOM \n" +
                        "2. MANIAC \n" +
                        "3. Charmer \n" +
                        "4. FREEZE \n" +
                        "5. Lonely St. \n" +
                        "6. Waiting For Us \n" +
                        "7. Muddy Water"
            ),
            Music(
                R.drawable.album12,
                namemusic = "MAXIDENT",
                descmusic = "Maxident adalah album mini berbahasa Korea ketujuh dan sepuluh secara keseluruhan oleh grup vokal pria asal Korea Selatan Stray Kids. Album ini dirilis pada tanggal 7 Oktober 2022, melalui JYP Entertainment dan Republic Records, tujuh bulan setelah perilisan album mini mereka sebelumnya, Oddinary. Dengan total lagu sebanyak 8 lagu. \n" +
                        "\n Album ini menampilkan konsep urban dan grunge yang terinspirasi dari tur arena pertama mereka di Amerika Utara2. Album ini berisi delapan lagu baru, termasuk lagu utama “CASE 143” yang menggabungkan rock dan hip hop dengan lirik yang menceritakan tentang sebuah kasus misterius2. Album ini juga menampilkan tiga lagu unit yang ditulis dan dikomposisi oleh anggota Stray Kids sendiri2. Album ini berhasil menduduki peringkat pertama di Billboard 200 Amerika Serikat dengan penjualan 103.000 kopi, menjadikan Stray Kids sebagai grup Korea ketiga yang mencapai prestasi tersebut setelah BTS dan SuperM1.\n" +
                        "\nJudul Lagu : \n" +
                        "1. CASE 134 \n" +
                        "2. CHILL \n" +
                        "3. Give Me Your TMI \n" +
                        "4. SUPER BOARD \n" +
                        "5. 3RACHA \n" +
                        "6. TASTE \n" +
                        "7. Can't Stop \n" +
                        "8. CIRCUS"
            )
        )
    }
}