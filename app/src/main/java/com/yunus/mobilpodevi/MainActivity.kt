package com.yunus.mobilpodevi

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ınternetKontrol(context)){
            Toast.makeText(this,"İnternet Bağlantısı Var...", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"İnternet Bağlantısı Yok...", Toast.LENGTH_SHORT).show()

        }


        setSupportActionBar(yunstoolbar)
       btnhakk.setOnClickListener {
          val  intent = Intent (this, HakkimdaActivity::class.java)
           startActivity(intent)
        }
    }


    //İnternet Kontrolü
    fun ınternetKontrol(context: Context):Boolean{
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkBilgi : NetworkInfo? = connectivityManager.activeNetworkInfo
        return networkBilgi != null && networkBilgi.isConnected

    }

}