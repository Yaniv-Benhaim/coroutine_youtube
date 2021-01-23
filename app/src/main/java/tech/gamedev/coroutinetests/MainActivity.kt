package tech.gamedev.coroutinetests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import tech.gamedev.coroutinetests.databinding.ActivityMainBinding


const val TAG = "TAG"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launch(Dispatchers.IO) {
            ///BACKGROUND THREAD

            withContext(Dispatchers.Main) {
                //MAIN THREAD
            }
        }

    }
    

    private suspend fun getData() {
        delay(3000)

    }


    override fun onStop() {
        super.onStop()

    }

}