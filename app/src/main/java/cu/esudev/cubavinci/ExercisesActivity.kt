package cu.esudev.cubavinci

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ExercisesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise_list)
    }

    fun toExercise(view: View){
        var intent:Intent = Intent(this, ExerciseActivity::class.java)
    }
}