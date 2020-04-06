package cubex.mahesh.intent_8am20

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dial_btn.setOnClickListener {
            val i = Intent()
                // DIAL Screen
            // i.action = Intent.ACTION_DIAL
           // i.data = Uri.parse("tel:"+et1.text.toString())
                // Browser
           // i.action = Intent.ACTION_VIEW
           // i.data = Uri.parse("https://www.google.com")
                // Gallery
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "image/*"
            startActivity(i)
        }
        next_btn.setOnClickListener {
                var i = Intent(this@MainActivity,
                    WelcomeActivity::class.java)
                startActivity(i)
        }
        whatsapp_btn.setOnClickListener {
                var i = packageManager.
       getLaunchIntentForPackage("com.whatsapp")
                startActivity(i)
        }

    }
}
