package com.example.demoapp


import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class p7CustomToasts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_p7_custom_toasts)

        val toastbtn = findViewById<Button>(R.id.btnToast)
        toastbtn.setOnClickListener(){

            val vg = findViewById<ViewGroup>(R.id.custom_toast)
            val inflate1 = layoutInflater
            val layout = inflate1.inflate(R.layout.custom_toast , vg)

            val tv = layout.findViewById<TextView>(R.id.showText)
            tv.text ="Custom Toast Notification"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL, 0 ,100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }

}