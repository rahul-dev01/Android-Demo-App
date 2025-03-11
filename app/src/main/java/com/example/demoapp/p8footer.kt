package com.example.demoapp

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class p8footer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_p8footer)


        val list1=findViewById<ListView>(R.id.list1)
        val arr= arrayOf(
            "MP","SP","Tusharika","Subhita","Surbhi","Reena","Ram","Sham","Sita","Anuj"
        )

        val mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)

        val mFooter = layoutInflater.inflate(R.layout.footerlayout, list1, false) as ViewGroup

        list1.addFooterView(mFooter)

        list1.adapter = mAdapter


    }
}
