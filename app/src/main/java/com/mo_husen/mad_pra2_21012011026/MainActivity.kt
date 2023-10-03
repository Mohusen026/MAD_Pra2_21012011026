package com.mo_husen.mad_pra2_21012011026
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        override fun onStart() {
            super.onStart()
            displayToast("onStart Called")
            displaySnackbar()
        }
        override fun onResume() {
            super.onResume()
            displayToast("onResume Called")
            displaySnackbar()
        }
        override fun onPause() {
            super.onPause()
            displayToast("onPause Called")
            displaySnackbar()
        }
        override fun onStop() {
            super.onStop()
            displayToast("onStop Called")
            displaySnackbar()
        }
        override fun onDestroy() {
            super.onDestroy()
            displayToast("onDestroy Called")
            displaySnackbar()
        }

        fun displayToast(msg:String)
        {
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        }
        fun displaySnackbar()
        {
            Snackbar.make(findViewById(R.id.husen),"Good Morning!!",Snackbar.LENGTH_LONG).show()
        }
    }