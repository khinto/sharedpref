package ge.msda.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences("MyApplication", Context.MODE_PRIVATE)
        val savedText = sharedPreferences.getString("NOTE", "")
        tvtext.text = savedText

        var  recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        var user = ArrayList<data>()

        user.add(data(inputText.text.toString()))

        var adapter = recyclerViewAdapter(user)

        recyclerView.setAdapter(adapter)


        addBtn.setOnClickListener {

            val input = inputText.text.toString()

            if (!TextUtils.isEmpty(input)) {

                val text = tvtext.text.toString()

                val resultText = input + "\n" + text

                tvtext.text = resultText

                inputText.setText("")

                sharedPreferences.edit().putString("NOTE", resultText).apply()

            }

        }

    }

}