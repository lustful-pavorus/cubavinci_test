package cu.esudev.cubavinci

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TOEActivity : AppCompatActivity() {
    protected var mode = MODE.TOE
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toe)
    }

    fun toTests(view:View){
        var intent:Intent = Intent(this, TestsActivity::class.java)
        startActivity(intent)
    }

    fun toExercises(view:View){
        var intent:Intent = Intent(this, ExercisesActivity::class.java)
        startActivity(intent)
    }
}