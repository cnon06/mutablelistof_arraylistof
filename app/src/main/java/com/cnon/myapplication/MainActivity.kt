package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle




class MainActivity : AppCompatActivity() {

  //  var arrls = arrayListOf<Any?>(3,4.5,6.7f,67L,'d',"sinem",true,null)
  var arrls = mutableListOf<Any?>(3,4.5,6.7f,67L,'d',"sinem",true,null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrl = ArrayList<Any>()


        mrr()
        arrls.add("suzan")
        arrls.add("sinan")
        mrr()
        arrls.remove('d')
        mrr()
        arrls.removeAt(1)
        mrr()
        arrls.set(2,false)
        mrr()
        arrls.remove("sinan")
        mrr()
        arrls.removeAt(0)
        mrr()



    }

    fun mrr()
    {
        println(".......................................")
        for (i in arrls) println(i)
    }

}