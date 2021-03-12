package cu.esudev.cubavinci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var btn:Button? = findViewById(R.id.Start)
        setContentView(R.layout.activity_main)
    }

    fun toAsignatures(view: View){
            val intent = Intent(this, AsignatureActivity::class.java)
            startActivity(intent)
    }
}