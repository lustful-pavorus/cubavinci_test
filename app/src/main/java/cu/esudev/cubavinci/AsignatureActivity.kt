package cu.esudev.cubavinci

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AsignatureActivity : AppCompatActivity() {
    protected var mode = MODE.Asignature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asignature)
        val modeToSet = intent.getIntExtra(MODE.EXTRAS_KEY,
                MODE.Asignature.mode)
        mode = MODE.getByValue(modeToSet)
        Log.v("Asignature", mode.toString())
    }

    fun toTOE(view: View){
        var intent:Intent? = Intent(this,TOEActivity::class.java)
        startActivity(intent)
    }
}