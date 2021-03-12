package cu.esudev.cubavinci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TestsActivity : AppCompatActivity(){
    protected var mode = MODE.Tests
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests)
    }
}