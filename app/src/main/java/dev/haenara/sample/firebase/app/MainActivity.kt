package dev.haenara.sample.firebase.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    private val lottieView: LottieAnimationView by lazy {
        findViewById<LottieAnimationView>(R.id.lottie_view)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(lottieView) {
            setAnimation("rocket.json")
            playAnimation()
        }
    }
}
