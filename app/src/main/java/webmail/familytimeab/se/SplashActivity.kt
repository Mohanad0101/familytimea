package webmail.familytimeab.se

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class SplashActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(255, 215, 0))
            setPadding(40, 40, 40, 40)
        }

        val logo = ImageView(this).apply {
            setImageResource(resources.getIdentifier("splash_logo", "drawable", packageName))
            adjustViewBounds = true
            maxWidth = 760
            maxHeight = 760
        }

        val title = TextView(this).apply {
            text = "Mail Family Time"
            textSize = 28f
            setTextColor(Color.rgb(0, 63, 140))
            gravity = Gravity.CENTER
            setPadding(0, 28, 0, 0)
        }

        root.addView(logo, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ))
        root.addView(title, LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ))
        setContentView(root)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1200)
    }
}
