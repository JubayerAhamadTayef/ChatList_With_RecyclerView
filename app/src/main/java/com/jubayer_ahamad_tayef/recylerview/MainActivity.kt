package com.jubayer_ahamad_tayef.recylerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.Coil
import com.jubayer_ahamad_tayef.recylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val itemList: List<ItemData> = listOf(
        ItemData(
            "https://media.licdn.com/dms/image/v2/D5603AQHS0TTHVz36vg/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1725544473563?e=1733356800&v=beta&t=M6aiG2uqLh2jvq-Fav0pQ8HOWm5qy5gZ5Ay8TxG6an8",
            "Jubayer Ahamad Tayef",
            "Assalamualaikum",
            "10:10 PM"
        ), // 0
        ItemData(
            "https://images.pexels.com/photos/1234567/pexels-photo-1234567.jpeg",
            "Abeer",
            "Hello!",
            "10:30 AM"
        ), // 1
        ItemData(
            "https://img.freepik.com/free-photo/young-attractive-man-classic-suit-straightens-his-tie_171337-9532.jpg?ga=GA1.1.213332389.1727404245&semt=ais_hybrid",
            "Zayd",
            "How are you?",
            "11:00 AM"
        ), // 2
        ItemData(
            "https://img.freepik.com/free-photo/medium-shot-man-working-as-real-estate-agent_23-2151064978.jpg?ga=GA1.1.213332389.1727404245",
            "Idris",
            "Good morning!",
            "9:15 AM"
        ), // 3
        ItemData(
            "https://images.pexels.com/photos/4567890/pexels-photo-4567890.jpeg",
            "Rayyan",
            "See you soon.",
            "8:45 AM"
        ), // 4
        ItemData(
            "https://img.freepik.com/free-photo/business-concept-portrait-handsome-business-man-holding-hands-with-confident-face-white-background_1258-103959.jpg?ga=GA1.1.213332389.1727404245",
            "Faris",
            "Take care.",
            "7:30 AM"
        ), // 5
        ItemData(
            "https://images.pexels.com/photos/6789012/pexels-photo-6789012.jpeg",
            "Hassan",
            "Let's meet up.",
            "6:00 PM"
        ), // 6
        ItemData(
            "https://img.freepik.com/free-photo/happy-businessman-isolated-successful-handsome-man-standing-with-crossed-arms-isolated-white-background_1258-80754.jpg?ga=GA1.1.213332389.1727404245",
            "Omar",
            "Call me.",
            "5:45 PM"
        ), // 7
        ItemData(
            "https://images.pexels.com/photos/8901234/pexels-photo-8901234.jpeg",
            "Yusuf",
            "Thank you!",
            "4:30 PM"
        ), // 8
        ItemData(
            "https://images.pexels.com/photos/9012345/pexels-photo-9012345.jpeg",
            "Bilal",
            "Good night.",
            "10:00 PM"
        ), // 9
        ItemData(
            "https://img.freepik.com/free-photo/young-successful-businessman-correcting-tie_176420-1144.jpg?ga=GA1.1.213332389.1727404245",
            "Khalid",
            "See you tomorrow.",
            "9:00 PM"
        ), // 10
        ItemData(
            "https://images.pexels.com/photos/1123456/pexels-photo-1123456.jpeg",
            "Ahmed",
            "What's up?",
            "8:00 PM"
        ), // 11
        ItemData(
            "https://images.pexels.com/photos/2123456/pexels-photo-2123456.jpeg",
            "Mustafa",
            "Good luck!",
            "7:00 PM"
        ), // 12
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-smiling-stylish-businessman-model-dressed-elegant-black-classic-suit-posing-metrosexual_158538-9172.jpg?ga=GA1.1.213332389.1727404245",
            "Naveed",
            "See you later.",
            "6:30 PM"
        ), // 13
        ItemData(
            "https://images.pexels.com/photos/4123456/pexels-photo-4123456.jpeg",
            "Sami",
            "Take it easy.",
            "5:15 PM"
        ), // 14
        ItemData(
            "https://images.pexels.com/photos/5123456/pexels-photo-5123456.jpeg",
            "Tariq",
            "Catch you later.",
            "4:45 PM"
        ), // 15
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-fashion-stylish-hipster-businessman-model-dressed-elegant-blue-suit-posing-gray-background-studio-glasses_158538-2116.jpg?ga=GA1.1.213332389.1727404245",
            "Ali",
            "Have a great day!",
            "3:30 PM"
        ), // 16
        ItemData(
            "https://images.pexels.com/photos/7123456/pexels-photo-7123456.jpeg",
            "Hamza",
            "Goodbye!",
            "2:15 PM"
        ), // 17
        ItemData(
            "https://images.pexels.com/photos/8123456/pexels-photo-8123456.jpeg",
            "Ibrahim",
            "See you soon.",
            "1:00 PM"
        ), // 18
        ItemData(
            "https://images.pexels.com/photos/9123456/pexels-photo-9123456.jpeg",
            "Ismail",
            "Take care.",
            "12:45 PM"
        ), // 19
        ItemData(
            "https://img.freepik.com/free-photo/picture-elegant-young-fashion-man_158595-546.jpg?ga=GA1.1.213332389.1727404245",
            "Jamal",
            "Let's catch up.",
            "11:30 AM"
        ), // 20
        ItemData(
            "https://images.pexels.com/photos/11123456/pexels-photo-11123456.jpeg",
            "Karim",
            "Talk to you later.",
            "10:15 AM"
        ), // 21
        ItemData(
            "https://img.freepik.com/free-photo/young-attractive-man-checkered-suit-looks-into-camera-orange-background-handsome-bearded-guy-poses-isolated_197531-29370.jpg?ga=GA1.1.213332389.1727404245",
            "Latif",
            "Good night.",
            "9:00 AM"
        ), // 22
        ItemData(
            "https://img.freepik.com/free-photo/man-fashion-fall-winter-collection-jacket_144627-54676.jpg?ga=GA1.1.213332389.1727404245",
            "Mahmoud",
            "See you tomorrow.",
            "8:45 AM"
        ), // 23
        ItemData(
            "https://images.pexels.com/photos/14123456/pexels-photo-14123456.jpeg",
            "Nadir",
            "Good morning!",
            "7:30 AM"
        ), // 24
        ItemData(
            "https://images.pexels.com/photos/15123456/pexels-photo-15123456.jpeg",
            "Othman",
            "How are you?",
            "6:15 AM"
        ), // 25
        ItemData(
            "https://img.freepik.com/free-photo/young-successful-businessman-suit-asking-money-black_176420-42521.jpg?ga=GA1.1.213332389.1727404245",
            "Qasim",
            "Hello!",
            "5:00 AM"
        ), // 26
        ItemData(
            "https://img.freepik.com/free-photo/young-elegant-handsome-businessman-male-model-blue-suit-fashionable-glasses-posing-studio_158538-2129.jpg?ga=GA1.1.213332389.1727404245",
            "Rashid",
            "Goodbye!",
            "4:45 AM"
        ), // 27
        ItemData(
            "https://img.freepik.com/free-photo/picture-elegant-young-fashion-man_158595-520.jpg?ga=GA1.1.213332389.1727404245",
            "Sadiq",
            "Take care.",
            "3:30 AM"
        ), // 28
        ItemData(
            "https://images.pexels.com/photos/19123456/pexels-photo-19123456.jpeg",
            "Talib",
            "See you soon.",
            "2:15 AM"
        ), // 29
        ItemData(
            "https://images.pexels.com/photos/20123456/pexels-photo-20123456.jpeg",
            "Usman",
            "Good night.",
            "1:00 AM"
        ), // 30
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-confident-stylish-hipster-lambersexual-model-sexy-modern-man-dressed-elegant-black-suit-fashion-male-posing-studio-near-white-wall-isolated-grey_158538-24645.jpg?ga=GA1.1.213332389.1727404245",
            "Waleed",
            "Good morning!",
            "12:45 AM"
        ), // 31
        ItemData(
            "https://img.freepik.com/free-photo/portrait-happy-smiling-young-businessman-blue-suit-isolated-white-wall_231208-9208.jpg?ga=GA1.1.213332389.1727404245",
            "Yahya",
            "How are you?",
            "11:30 PM"
        ), // 32
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-serious-hipster-businessman-model-wearing-casual-black-suit_158538-979.jpg?ga=GA1.1.213332389.1727404245",
            "Zain",
            "Hello!",
            "10:15 PM"
        ), // 33
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-smiling-hipster-businessman-model-wearing-casual-black-suit_158538-969.jpg?ga=GA1.1.213332389.1727404245",
            "Adil",
            "Goodbye!",
            "9:00 PM"
        ), // 34
        ItemData(
            "https://img.freepik.com/free-photo/confident-handsome-businessman-suit-pointing-finger_171337-18603.jpg?ga=GA1.1.213332389.1727404245",
            "Bashir",
            "Take care.",
            "8:45 PM"
        ), // 35
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-fashion-businessman-model-dressed-elegant-blue-suit-with-glasses_158538-4402.jpg?ga=GA1.1.213332389.1727404245",
            "Dawood",
            "See you soon.",
            "7:30 PM"
        ), // 36
        ItemData(
            "https://img.freepik.com/free-photo/thinking-man-dark-suit-studio-shot_613910-10754.jpg?ga=GA1.1.213332389.1727404245",
            "Ehsan",
            "Good night.",
            "6:15 PM"
        ), // 37
        ItemData(
            "https://images.pexels.com/photos/28123456/pexels-photo-28123456.jpeg",
            "Fahad",
            "Good morning!",
            "5:00 PM"
        ), // 38
        ItemData(
            "https://img.freepik.com/free-photo/pensive-businessman-with-crossed-arms-looking-away_23-2148112966.jpg?ga=GA1.1.213332389.1727404245",
            "Ghaffar",
            "How are you?",
            "4:45 PM"
        ), // 39
        ItemData(
            "https://img.freepik.com/free-photo/elegant-man-suit-isolated-grey-background_613910-2351.jpg?ga=GA1.1.213332389.1727404245",
            "Harun",
            "Hello!",
            "3:30 PM"
        ), // 40
        ItemData(
            "https://img.freepik.com/free-photo/male-beauty-concept-portrait-fashionable-young-man-with-stylish-haircut-wearing-trendy-suit-posing_155003-17022.jpg?ga=GA1.1.213332389.1727404245",
            "Ilyas",
            "Goodbye!",
            "2:15 PM"
        ), // 41
        ItemData(
            "https://img.freepik.com/free-photo/portrait-handsome-confident-stylish-hipster-lambersexual-model-sexy-modern-man-dressed-elegant-black-suit-fashion-male-posing-studio-dark-background-spectacles_158538-21661.jpg?ga=GA1.1.213332389.1727404245",
            "Jibril",
            "Take care.",
            "1:00 PM"
        ), // 42
        ItemData(
            "https://img.freepik.com/free-photo/man-button-up-his-jacket-smiles_23-2148401389.jpg?ga=GA1.1.213332389.1727404245",
            "Kamil",
            "See you soon.",
            "12:45 PM"
        ), // 43
        ItemData(
            "https://img.freepik.com/free-photo/close-up-portrait-scared-man-black-suit-bites-his-fist_171337-9548.jpg?ga=GA1.1.213332389.1727404245",
            "Luqman",
            "Good night.",
            "11:30 AM"
        ), // 44
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = ItemAdapter()
        adapter.submitList(itemList)

        binding.recyclerView.adapter = adapter

        Coil.imageLoader(this@MainActivity).memoryCache?.clear()

    }
}