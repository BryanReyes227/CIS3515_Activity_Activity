package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val textSizeExtra = intent.getIntExtra(sizeKey, 14)
            // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            textSize = textSizeExtra.toFloat()

        }


    }
}