package com.example.challengeandroidstudio.data.datasource

import com.example.challengeandroidstudio.R
import com.example.challengeandroidstudio.data.model.Catalog

interface FoodStarDataSource {
    fun getCatalogMembers(): List<Catalog>
}

class CatalogDataSourceImpl() : FoodStarDataSource {
    override fun getCatalogMembers(): List<Catalog> {
        return mutableListOf(
            Catalog(
                name = "Nasi Goreng Spesial",
                price = 40000.0,
                image = R.drawable.img_fried_rice,
                desc = "Dalam sepiring nasi goreng spesial ini, terdapat harmoni cita rasa yang memukau, mempersembahkan pengalaman kuliner yang tak terlupakan bagi setiap penikmatnya. Dimulai dari aroma menggoda yang menguar begitu piringnya dihidangkan, menciptakan daya tarik tak tertahankan sebelum sebatang pun garpu menjelajahinya.\n" +
                        "\n" +
                        "Nasi goreng spesial ini merupakan perpaduan sempurna antara nasi yang digoreng dengan sempurna hingga kekuningan yang memikat, berpadu dengan bumbu-bumbu pilihan yang telah meresap dengan sempurna ke dalam butiran-butiran nasi tersebut.\n" +
                        "\n" +
                        "Sepotong demi sepotong daging ayam yang lembut dan juicy menjadi primadona dalam hidangan ini. Daging ayam yang telah dipotong kecil-kecil menyerap seluruh bumbu dengan maksimal, sehingga tiap gigitan membawa ledakan rasa yang memanjakan lidah.\n" +
                        "\n" +
                        "Tidak hanya itu, kehadiran udang yang segar dengan tekstur yang kenyal menjadi pelengkap sempurna. Udang-udang ini dipadukan dengan cengkeh bawang putih yang diolah dengan cermat, memberikan sentuhan rasa yang khas dan menggugah selera.\n" +
                        "\n" +
                        "Lengkapi dengan irisan tipis telur dadar yang lembut, menambah kelezatan dan kekayaan protein dalam hidangan ini. Tak lupa pula, sayuran-sayuran segar seperti wortel, kacang polong, dan buncis yang renyah menjadi penyegar dalam setiap suapan.\n" +
                        "\n" +
                        "Untuk menyempurnakan rasa, tambahan kecap manis dan saus sambal yang pedas merasuk ke dalam setiap pori-pori nasi goreng ini, menciptakan perpaduan rasa yang kompleks namun harmonis.\n" +
                        "\n" +
                        "Dihadirkan dengan taburan bawang goreng yang crispy di atasnya, menambah tekstur yang menyenangkan serta aroma yang menggoda. Sehingga, setiap sendokannya membawa perasaan bahagia dan kenangan akan cita rasa yang tak terlupakan.\n" +
                        "\n" +
                        "Inilah nasi goreng spesial yang tak hanya sekadar hidangan, tapi sebuah karya seni kuliner yang menggoda selera dan memenuhi seluruh panca indera dengan kelezatan yang tak tergantikan."
            ),
            Catalog(
                name = "Nasi Goreng Lada Hitam",
                price = 30000.0,
                image = R.drawable.img_fried_rice_black_pepper,
                desc = "Dalam setiap sajian nasi goreng lada hitam ini, terdapat perpaduan sempurna antara cita rasa pedas, gurih, dan aromatik yang menggoda selera. Pertama-tama, hidangan ini memukau dengan aroma harum rempah lada hitam yang menjelma begitu dihidangkan di atas meja. Aroma ini segera membangkitkan nafsu makan sebelum satu suapan pun diambil.\n" +
                        "\n" +
                        "Nasi goreng lada hitam ini dibuat dari nasi yang telah direbus dan didinginkan semalaman, memastikan kematangan butiran nasi yang sempurna dan tekstur yang tidak lengket. Butiran nasi yang digoreng dengan minyak yang tepat memberikan kekuningan yang menggoda dan kelembutan yang tak tertandingi.\n" +
                        "\n" +
                        "Di dalamnya, potongan daging ayam yang telah diiris tipis dan direndam dalam campuran lada hitam, kecap, dan sedikit gula, menciptakan sensasi rasa yang kaya dan memuaskan. Daging ayam yang telah meresap bumbu tersebut kemudian digoreng hingga kecokelatan dan menjadi juicy serta penuh dengan cita rasa.\n" +
                        "\n" +
                        "Tidak ketinggalan, tambahan lada hitam yang dihancurkan halus memberikan sentuhan pedas yang khas dan membangunkan selera. Lada hitam ini tidak hanya menambahkan tingkat kepedasan, tetapi juga aroma yang kuat dan memikat.\n" +
                        "\n" +
                        "Sayuran-sayuran segar seperti wortel, buncis, dan kacang polong ikut menyemarakkan hidangan ini dengan rasa dan warna yang menyegarkan. Potongan sayuran yang renyah menambah dimensi tekstur dalam setiap suapan nasi goreng.\n" +
                        "\n" +
                        "Sebagai pelengkap, telur dadar yang lembut dan sedikit berminyak menambah kekayaan protein dalam hidangan ini, serta memberikan keseimbangan rasa yang sempurna. Taburan bawang merah goreng yang renyah di atasnya memberikan tambahan tekstur dan aroma yang menggugah selera.\n" +
                        "\n" +
                        "Untuk menyeimbangkan rasa pedas dan gurihnya, hidangan ini biasanya disajikan dengan irisan mentimun segar yang memberikan kesegaran dan kesejukan setiap kali disantap. Dipadukan dengan secangkir teh hangat, pengalaman menikmati nasi goreng lada hitam ini akan menjadi sebuah perjalanan rasa yang tak terlupakan, memenuhi setiap keinginan dan menantang batas-batas cita rasa yang dikenal."
            ),
            Catalog(
                name = "Mie Goreng Aceh",
                price = 20000.0,
                image = R.drawable.img_noodle_aceh,
                desc = "Dalam setiap gigitan mie goreng Aceh, terdapat petualangan rasa yang memukau, membawa pengalaman kuliner yang tak terlupakan bagi setiap penikmatnya. Ini bukan sembarang mie goreng; ini adalah perpaduan unik dari rempah-rempah khas Aceh yang memanjakan lidah dan membangkitkan selera.\n" +
                        "\n" +
                        "Mie goreng Aceh dimulai dengan mie kuning yang digunakan sebagai dasar, diberi sentuhan khusus dengan racikan bumbu rempah yang sangat khas. Bumbu ini terdiri dari campuran cabai merah, bawang merah, bawang putih, jahe, kunyit, dan ketumbar, yang telah dihaluskan dan direbus dengan minyak hingga mengeluarkan aroma yang begitu menggugah selera.\n" +
                        "\n" +
                        "Tidak hanya itu, daging sapi yang dipotong tipis-tipis atau kerang segar dapat menjadi tambahan yang mengesankan dalam hidangan ini. Daging tersebut kemudian dimasak dengan bumbu rempah tersebut hingga meresap ke dalam serat-seratnya, memberikan cita rasa yang kaya dan gurih pada setiap gigitannya.\n" +
                        "\n" +
                        "Kelezatan mie goreng Aceh juga didukung oleh kehadiran udang segar yang kenyal dan manis, yang ikut meramaikan hidangan dengan tekstur yang menyenangkan. Udang ini juga meresap dengan sempurna dalam rempah-rempah yang melimpah, menambah dimensi rasa yang memanjakan.\n" +
                        "\n" +
                        "Selain itu, sayuran-sayuran seperti kubis, wortel, dan tauge juga turut meramaikan hidangan ini, memberikan keseimbangan antara tekstur renyah dan kenyal. Sayuran-sayuran ini dimasak dengan sempurna, sehingga tetap segar namun telah meresap semua aroma dan rasa bumbu rempah Aceh.\n" +
                        "\n" +
                        "Tidak ketinggalan, telur mata sapi yang digoreng setengah matang menjadi pelengkap sempurna dalam hidangan ini, menambah kekayaan protein dan memberikan tambahan rasa yang lezat ketika dipadukan dengan mie dan bumbu-bumbunya.\n" +
                        "\n" +
                        "Hidangan mie goreng Aceh ini juga biasanya dilengkapi dengan irisan bawang merah segar dan sejumput daun bawang yang telah diiris halus sebagai hiasan, memberikan aroma segar yang menyegarkan dan sentuhan rasa yang menyelaraskan seluruh komponen hidangan.\n" +
                        "\n" +
                        "Bagi yang menyukai sensasi pedas yang ekstra, cabai rawit atau sambal Aceh dapat disajikan sebagai pelengkap, memberikan ledakan rasa pedas yang membangunkan selera.\n" +
                        "\n" +
                        "Disajikan hangat di atas piring, mie goreng Aceh adalah perpaduan harmonis antara cita rasa yang kompleks namun seimbang, menghadirkan kekayaan rempah khas Aceh dalam setiap suapan. Dengan tiap gigitannya, penikmatnya akan dibawa dalam sebuah petualangan kuliner yang tak terlupakan di negeri rempah-rempah."
            ),
            Catalog(
                name = "Mie Ayam",
                price = 15000.0,
                image = R.drawable.img_noodle_chicken,
                desc = "Dalam setiap suapan, mie ayam menghadirkan kesederhanaan yang memikat dan cita rasa yang menggugah selera. Hidangan ini mungkin terlihat sederhana, tetapi di dalam setiap gigitannya tersembunyi kekayaan rasa yang tak terlupakan.\n" +
                        "\n" +
                        "Mie ayam dimulai dengan pangsit yang digoreng garing, memberikan tambahan tekstur yang renyah dan kenyal. Pangsit-pangsit ini dipotong kecil dan dihidangkan di atas mie, memberikan dimensi rasa yang berbeda pada hidangan.\n" +
                        "\n" +
                        "Mie yang digunakan biasanya adalah mie kuning yang kenyal dan lembut. Mie ini dimasak dengan sempurna hingga terendam dalam kuah ayam yang gurih dan kaya rasa. Kuah ayam ini dibuat dari kaldu ayam yang kaya rempah, dicampur dengan bawang putih, jahe, dan daun bawang, sehingga memberikan aroma yang menggugah selera.\n" +
                        "\n" +
                        "Potongan daging ayam yang lembut dan juicy menjadi bintang utama dalam hidangan ini. Daging ayam yang telah dimasak dengan bumbu rempah yang khas, memberikan cita rasa yang meresap hingga ke setiap seratnya. Setiap suapan daging ayam dipadu dengan kuah ayam yang gurih dan aromatik, menciptakan harmoni rasa yang sempurna.\n" +
                        "\n" +
                        "Tidak lupa, tambahan irisan tipis daun bawang dan seledri memberikan kesegaran dan aroma segar yang menyelaraskan seluruh komponen hidangan. Sedikit taburan bawang goreng yang renyah di atasnya menambah tekstur dan aroma yang memikat.\n" +
                        "\n" +
                        "Mie ayam ini juga sering dilengkapi dengan potongan pangsit rebus yang kenyal dan isi pangsit yang lezat, memberikan variasi rasa yang menarik dalam satu piring. Sebagai pelengkap, irisan cabai rawit atau sambal bisa ditambahkan bagi yang menyukai sensasi pedas yang ekstra.\n" +
                        "\n" +
                        "Disajikan dalam mangkuk yang hangat, mie ayam adalah representasi dari kehangatan dan kelezatan dalam sebuah hidangan sederhana namun memuaskan. Setiap suapan membawa kenangan akan cita rasa yang akrab dan menghadirkan kebahagiaan dalam setiap momen santap."
            ),
            Catalog(
                name = "Ayam Bakar Madu",
                price = 16000.0,
                image = R.drawable.img_honey_grilled_chicken,
                desc = "Dalam setiap gigitan ayam bakar madu, terselip kelezatan yang tak terlupakan, menyuguhkan perpaduan harmonis antara manis lembut madu dan cita rasa gurih rempah yang menggoda. Ini bukan sekadar hidangan ayam bakar biasa; ini adalah karya seni kuliner yang memikat dan memanjakan lidah.\n" +
                        "\n" +
                        "Ayam bakar madu dimulai dengan pemilihan potongan ayam yang terbaik, biasanya bagian dada atau paha ayam yang telah dibersihkan dengan cermat. Potongan ayam ini kemudian direndam dalam campuran bumbu rempah yang kaya, seperti bawang putih, jahe, ketumbar, dan merica, yang telah dihaluskan dan meresap hingga ke dalam daging ayam selama beberapa jam.\n" +
                        "\n" +
                        "Selanjutnya, potongan ayam ini dipanggang dengan api sedang hingga kecokelatan dan meresap dengan rasa rempah yang khas. Ketika ayam hampir matang sempurna, lapisan madu murni dioleskan secara merata ke permukaannya, memberikan sentuhan manis yang karamelisasi dan aroma yang menggugah selera.\n" +
                        "\n" +
                        "Proses panggangan selanjutnya membuat lapisan madu mencair dan menyatu dengan daging ayam, menciptakan glazur yang mengkilat dan menggoda. Lapisan madu yang karamelisasi memberikan warna keemasan yang menggiurkan, sementara aroma rempah yang terbakar menyatu dengan aroma manis madu, menciptakan keharmonisan cita rasa yang luar biasa.\n" +
                        "\n" +
                        "Setelah matang, ayam bakar madu ini disajikan dengan taburan biji wijen yang garing dan sejumput irisan daun bawang yang segar, memberikan sentuhan visual yang menarik dan aroma tambahan yang menyegarkan. Potongan ayam yang juicy dan beraroma manis madu ini siap memikat lidah dan menjadikan setiap gigitan sebuah pengalaman kuliner yang tak terlupakan.\n" +
                        "\n" +
                        "Disajikan dengan nasi hangat dan sayuran segar sebagai pelengkap, ayam bakar madu adalah hidangan yang cocok untuk dinikmati di setiap kesempatan istimewa atau bahkan dalam santap sehari-hari. Dengan setiap suapan, pengalaman cita rasa yang memikat ini akan membawa penikmatnya terbang ke surga kenikmatan kuliner yang tiada tara."
            ),
            Catalog(
                name = "Ayam Goreng",
                price = 14000.0,
                image = R.drawable.img_fried_chicken,
                desc = "Dalam setiap gigitan, ayam goreng menghadirkan kesederhanaan yang memikat dan kenikmatan yang mendalam. Hidangan ini mungkin terlihat sederhana, namun dalam setiap suapan terdapat kelezatan yang tak terlupakan.\n" +
                        "\n" +
                        "Ayam goreng dimulai dengan pemilihan potongan ayam yang terbaik, biasanya bagian paha atau dada ayam yang telah dibersihkan dengan cermat. Potongan ayam ini kemudian direndam dalam campuran bumbu rempah yang kaya, seperti bawang putih, jahe, merica, dan garam, yang telah dihaluskan dan meresap hingga ke dalam daging ayam selama beberapa jam.\n" +
                        "\n" +
                        "Selanjutnya, potongan ayam ini digoreng dengan minyak panas hingga kecokelatan dan renyah di luar, sementara tetap juicy dan lembut di dalamnya. Proses penggorengan yang tepat memberikan lapisan kulit yang garing dan berwarna keemasan yang menggoda.\n" +
                        "\n" +
                        "Ayam goreng yang telah matang sempurna kemudian disajikan dengan taburan rempah-rempah tambahan seperti bubuk cabai atau bubuk ketumbar untuk menambah aroma dan rasa yang lebih mendalam. Potongan ayam yang beraroma harum dan gurih ini siap memikat selera dan membuat lidah bergoyang kegirangan.\n" +
                        "\n" +
                        "Untuk pelengkap, ayam goreng biasanya disajikan dengan irisan lemon atau lalapan segar seperti mentimun dan tomat, memberikan kesegaran dan keseimbangan dalam setiap sajian. Ditambah dengan sambal atau saus favorit, hidangan ini menjadi lebih lengkap dan memuaskan.\n" +
                        "\n" +
                        "Ayam goreng adalah hidangan yang cocok untuk dinikmati dalam berbagai kesempatan, mulai dari santap keluarga hingga acara pesta. Kombinasi sempurna antara gurih, renyah, dan juicy menjadikan ayam goreng sebagai favorit banyak orang di seluruh dunia.\n" +
                        "\n" +
                        "Dengan setiap suapan, ayam goreng membawa kenangan akan cita rasa yang akrab dan menghadirkan kebahagiaan dalam setiap momen santap."
            ),
            Catalog(
                name = "Sup Asparagus Kepiting",
                price = 50000.0,
                image = R.drawable.img_crab_asparagus_soup,
                desc = "Dalam setiap sendok sup asparagus kepiting, tercipta sebuah simfoni rasa yang memikat, menggabungkan kelembutan asparagus dengan kenikmatan daging kepiting yang segar. Hidangan ini adalah perpaduan sempurna antara kelezatan laut dan kemewahan sayuran.\n" +
                        "\n" +
                        "Sup asparagus kepiting dimulai dengan pembuatan kaldu yang kaya dan gurih. Kaldu ini biasanya terbuat dari campuran tulang sapi, bawang bombay, wortel, dan rempah-rempah pilihan yang direbus dengan lembut hingga meresap semua rasa dan aroma. Kemudian, ditambahkan asparagus yang telah dipotong-potong dan direbus hingga empuk namun tetap segar.\n" +
                        "\n" +
                        "Selanjutnya, potongan daging kepiting yang lembut dan manis ditambahkan ke dalam sup. Daging kepiting ini memberikan sentuhan kemewahan dan cita rasa laut yang khas, menyatu dengan kaldu dan asparagus untuk menciptakan harmoni rasa yang sempurna.\n" +
                        "\n" +
                        "Untuk menambah dimensi rasa yang lebih kompleks, biasanya bawang putih, daun bawang, dan sejumput peterseli segar juga ditambahkan ke dalam sup. Aroma harum dan cita rasa segar dari rempah-rempah ini memberikan sentuhan akhir yang memikat pada hidangan.\n" +
                        "\n" +
                        "Sup asparagus kepiting seringkali disajikan dengan taburan parutan keju Parmesan di atasnya, menambahkan kekayaan rasa dan aroma yang menyenangkan. Taburan keju yang gurih dan sedikit asin memberikan kontras yang sempurna dengan kelembutan asparagus dan daging kepiting.\n" +
                        "\n" +
                        "Hidangan ini juga biasanya disajikan dengan sepotong roti segar atau kerupuk renyah sebagai pelengkap. Roti atau kerupuk ini dapat digunakan untuk meresap kuah sup yang kaya dan menambah kenikmatan saat disantap.\n" +
                        "\n" +
                        "Dengan setiap suapan, sup asparagus kepiting membawa penikmatnya dalam petualangan rasa yang tak terlupakan. Kombinasi antara kelembutan asparagus, kelezatan daging kepiting, dan aroma harum rempah-rempah menciptakan pengalaman kuliner yang memikat dan memuaskan."
            ),
            Catalog(
                name = "Sayur Asem",
                price = 12000.0,
                image = R.drawable.img_tamarind_vegetable_soup,
                desc = "Sayur asem adalah sebuah hidangan tradisional Indonesia yang memukau dengan kelezatan dan kekayaan rasa yang menggoda. Ini adalah perpaduan sempurna antara segaranya sayuran dan keasaman yang menyegarkan, di dalam kuah yang kaya rempah.\n" +
                        "\n" +
                        "Sayur asem dimulai dengan persiapan bahan-bahan utamanya, yang meliputi beragam sayuran segar seperti kacang panjang, jagung manis, labu siam, terong, buncis, dan daun melinjo. Semua sayuran ini kemudian dipotong menjadi potongan kecil sesuai selera, memastikan bahwa setiap suapan menyajikan kombinasi yang seimbang dari rasa dan tekstur.\n" +
                        "\n" +
                        "Selanjutnya, bumbu-bumbu khas Indonesia seperti bawang merah, bawang putih, jahe, lengkuas, dan daun salam dihaluskan dan ditumis dengan minyak hingga harum. Kemudian, tambahkan air secukupnya dan biarkan mendidih sebelum menambahkan potongan-potongan sayuran.\n" +
                        "\n" +
                        "Kunci utama dari rasa sayur asem terletak pada asamnya kuah, yang berasal dari penggunaan buah asam jawa atau asam kandis. Buah asam ini memberikan keasaman yang menyegarkan dan menyelaraskan seluruh rasa dalam hidangan. Di samping itu, tambahan gula merah memberikan sentuhan manis yang menyelaraskan rasa asam dan rempah.\n" +
                        "\n" +
                        "Tidak ketinggalan, tambahan bahan seperti tahu dan tempe juga sering ditambahkan ke dalam sayur asem, memberikan tambahan tekstur dan protein yang kaya. Potongan-potongan tahu dan tempe ini meresap semua kelezatan kuah, menciptakan dimensi rasa yang lebih beragam.\n" +
                        "\n" +
                        "Supaya semakin nikmat, seringkali ditambahkan irisan cabe rawit dan daun kemangi segar di atasnya sebelum disajikan. Ini memberikan sentuhan pedas dan aroma harum yang menggugah selera, meningkatkan kenikmatan saat menyantap sayur asem.\n" +
                        "\n" +
                        "Sayur asem bukan hanya hidangan yang lezat, tetapi juga menyehatkan karena kandungan nutrisi yang tinggi dari berbagai macam sayuran yang digunakannya. Dengan setiap suapan, sayur asem membawa kita pada perjalanan rasa yang tak terlupakan, merayakan kekayaan kuliner Indonesia yang klasik dan autentik."
            ),
            Catalog(
                name = "Tempe Mendoan",
                price = 8000.0,
                image = R.drawable.img_batter_coated_fried_tempeh,
                desc = "Tempe mendoan adalah salah satu camilan yang sangat populer di Indonesia, dikenal dengan kelezatan dan kecrispiannya yang memikat. Hidangan ini menghadirkan sensasi gurih dan renyah yang memanjakan lidah, serta aroma rempah yang khas.\n" +
                        "\n" +
                        "Pertama-tama, tempe mendoan dimulai dengan pemilihan tempe yang segar dan berkualitas tinggi. Tempe tersebut kemudian dipotong menjadi irisan tipis dan direndam dalam campuran bumbu yang kaya, yang terdiri dari tepung terigu, bawang putih, ketumbar, kunyit, dan garam, sehingga meresap hingga ke setiap serat tempe.\n" +
                        "\n" +
                        "Selanjutnya, irisan tempe tersebut digoreng dalam minyak panas hingga keemasan dan renyah di luar, sementara tetap lembut dan gurih di dalamnya. Proses penggorengan ini memberikan lapisan kulit yang crispy yang menutupi tempe, menciptakan dimensi rasa yang beragam dalam setiap gigitannya.\n" +
                        "\n" +
                        "Tempe mendoan seringkali disajikan dengan tambahan bumbu pelengkap seperti kecap manis, saus sambal, atau sambal terasi, yang memberikan sentuhan tambahan rasa dan aroma yang memikat. Beberapa penikmat juga menyukai taburan bawang goreng atau irisan daun bawang sebagai hiasan dan tambahan rasa yang menyegarkan.\n" +
                        "\n" +
                        "Dengan setiap gigitan, tempe mendoan menghadirkan kombinasi sempurna antara kelezatan tempe yang gurih dan kaya protein dengan tekstur crispy yang memikat. Rasanya yang gurih dan renyah membuatnya cocok sebagai camilan di setiap kesempatan, baik sebagai teman minum teh di sore hari atau sebagai hidangan pembuka sebelum makan malam.\n" +
                        "\n" +
                        "Tempe mendoan bukan hanya sekadar camilan, tetapi juga merupakan bagian penting dari warisan kuliner Indonesia yang kaya akan rempah dan cita rasa autentik. Dengan keunikan rasanya yang sulit ditolak, tempe mendoan akan selalu menjadi favorit di hati banyak orang, membawa kenangan akan kelezatan dan kehangatan rumah."
            ),
            Catalog(
                name = "Tahu Gejrot",
                price = 7000.0,
                image = R.drawable.img_fried_tofu_in_sweet_spicy_sauce,
                desc = "Tahu gejrot adalah hidangan tradisional Indonesia yang memikat dengan kombinasi manis, asam, dan pedas yang menggugah selera. Hidangan ini menghadirkan sensasi unik dalam setiap gigitannya, membawa pengalaman kuliner yang tak terlupakan.\n" +
                        "\n" +
                        "Pertama-tama, tahu gejrot dimulai dengan persiapan tahu yang segar dan berkualitas. Tahu dipotong menjadi potongan-potongan kecil dan kemudian digoreng hingga kecokelatan dan crispy di luar, sementara tetap lembut dan kenyal di dalamnya.\n" +
                        "\n" +
                        "Selanjutnya, tahu yang telah digoreng tersebut diberi saus gejrot yang khas. Saus gejrot terbuat dari campuran gula merah, cuka, bawang putih, cabai rawit, garam, dan sedikit air, yang direbus hingga mengental dan meresap ke dalam tahu. Saus ini memberikan kombinasi manis dan asam yang menyegarkan, serta sentuhan pedas yang menggigit.\n" +
                        "\n" +
                        "Tahu gejrot sering disajikan dengan tambahan bawang merah yang diiris tipis dan daun bawang yang diiris halus sebagai hiasan. Tambahan bawang merah segar memberikan aroma yang khas dan tambahan rasa yang menyenangkan, sementara daun bawang menyegarkan dan menambah tampilan hidangan.\n" +
                        "\n" +
                        "Beberapa variasi tahu gejrot juga bisa disajikan dengan taburan kacang tanah goreng atau bawang goreng di atasnya, memberikan tambahan tekstur dan cita rasa yang lebih beragam. Ini memberikan pengalaman makan yang lebih lengkap dan memuaskan.\n" +
                        "\n" +
                        "Dengan setiap suapan, tahu gejrot membawa kita dalam petualangan rasa yang menggugah selera, dari kelezatan tahu yang crispy hingga kombinasi manis, asam, dan pedas dari saus gejrot yang menggoda. Hidangan ini tidak hanya memanjakan lidah, tetapi juga merayakan kekayaan kuliner Indonesia yang khas dan autentik."
            ),
            Catalog(
                name = "Es Teh Manis",
                price = 4000.0,
                image = R.drawable.img_ice_tea,
                desc = "Es teh manis adalah minuman yang merakyat namun memikat, menyuguhkan kesegaran dan kelezatan yang tak terlupakan. Di setiap tegukan, es teh manis menghadirkan kombinasi yang sempurna antara keharuman teh yang menyegarkan dan manisnya gula yang memanjakan lidah.\n" +
                        "\n" +
                        "Pertama-tama, es teh manis dimulai dengan penyeduhan teh yang tepat. Daun teh yang berkualitas dipilih dan direbus dengan air mendidih hingga aroma dan rasa teh yang khas meresap sempurna. Kemudian, teh disaring untuk memastikan hanya air teh yang murni yang digunakan dalam minuman ini.\n" +
                        "\n" +
                        "Selanjutnya, gula pasir ditambahkan ke dalam teh panas, dicampur hingga larut sempurna untuk menciptakan es teh dengan tingkat ke manisan yang diinginkan. Kemudian, teh yang telah diberi gula tersebut didinginkan dengan es batu, menciptakan minuman yang segar dan menyegarkan.\n" +
                        "\n" +
                        "Es teh manis seringkali disajikan dengan irisan lemon atau jeruk nipis segar, memberikan sentuhan asam yang menyegarkan dan aroma yang menggugah selera. Beberapa penikmat juga menyukai tambahan daun mint segar sebagai hiasan dan tambahan aroma yang menyegarkan.\n" +
                        "\n" +
                        "Es teh manis merupakan minuman yang populer di Indonesia, sering dinikmati sebagai teman setia dalam berbagai kesempatan, dari santai di warung kopi hingga acara keluarga besar. Kombinasi antara kesegaran teh yang menyegarkan dan kelezatan manisnya gula menciptakan minuman yang tak terlupakan.\n" +
                        "\n" +
                        "Dengan setiap tegukan, es teh manis membawa kesegaran dan kenikmatan yang membawa penikmatnya pada perjalanan rasa yang menyenangkan. Rasanya yang seimbang antara manis dan segar menjadikannya minuman yang sempurna untuk dinikmati di setiap waktu dan tempat."
            ),
            Catalog(
                name = "Es Jeruk Peras",
                price = 6000.0,
                image = R.drawable.img_squeezed_orange_ice,
                desc = "Es jeruk peras adalah minuman yang menyegarkan dan memikat, menggabungkan manisnya jus jeruk segar dengan kesegaran es yang menyejukkan. Di setiap tegukan, es jeruk peras menyajikan kelezatan alami buah jeruk yang khas dan kesegaran yang menyegarkan.\n" +
                        "\n" +
                        "Pertama-tama, es jeruk peras dimulai dengan pemilihan jeruk peras yang segar dan matang. Jeruk tersebut kemudian diperas dengan hati-hati untuk mendapatkan jus yang murni dan kaya rasa. Proses ini memastikan bahwa setiap tegukan es jeruk peras menghadirkan cita rasa alami buah jeruk yang autentik.\n" +
                        "\n" +
                        "Jus jeruk peras yang telah diperas kemudian disaring untuk memastikan kebersihannya sebelum dicampur dengan es batu. Es batu memberikan kesegaran yang menyegarkan pada minuman ini, menciptakan sensasi menyegarkan yang membangkitkan selera.\n" +
                        "\n" +
                        "Tidak jarang, es jeruk peras disajikan dengan tambahan irisan jeruk segar di atasnya, memberikan aroma yang segar dan tampilan yang menarik. Beberapa penikmat juga menyukai tambahan daun mint segar sebagai hiasan dan tambahan aroma yang menyegarkan.\n" +
                        "\n" +
                        "Es jeruk peras merupakan minuman yang populer di musim panas, disukai oleh banyak orang karena kesegaran alami dan kelezatan buah jeruk yang khas. Minuman ini cocok dinikmati sebagai penyejuk saat cuaca panas atau sebagai teman setia dalam piknik di bawah sinar matahari.\n" +
                        "\n" +
                        "Dengan setiap tegukan, es jeruk peras membawa kesegaran dan kenikmatan yang membawa penikmatnya pada perjalanan rasa yang menyenangkan. Rasanya yang segar dan manis menjadikannya minuman yang sempurna untuk dinikmati di setiap waktu dan kesempatan."
            )

        )
    }
}
