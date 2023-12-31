package com.example.connectus.activities.testimonilist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.connectus.R
import com.example.connectus.activities.testimonilist.adapter.RecyclerViewTestimoniAdapter
import com.example.connectus.activities.testimonilist.model.TestimoniData
import com.example.connectus.databinding.ActivityChatListBinding
import com.example.connectus.databinding.ActivityTestimoniListBinding

class TestimoniListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestimoniListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestimoniListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        val recyclerView: RecyclerView = binding.rvTestimoniList

        val data: List<TestimoniData> = listOf(
            TestimoniData(
                "https://plus.unsplash.com/premium_photo-1669324357471-e33e71e3f3d8?auto=format&fit=crop&q=80&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&w=2070",
                "2023-10-15T12:30:00",
                5,
                "Salam",
                "Mereka mewujudkan acara product launching kami menjadi pengalaman yang tak terlupakan. Perhatian mereka terhadap detail, ide-ide kreatif, dan dedikasi mereka terhadap visi kami sangat luar biasa."
            ),
            TestimoniData(
                "https://plus.unsplash.com/premium_photo-1669324357471-e33e71e3f3d8?auto=format&fit=crop&q=80&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&w=2070",
                "2023-10-15T12:30:00",
                5,
                "Salam",
                "Mereka mewujudkan acara product launching kami menjadi pengalaman yang tak terlupakan. Perhatian mereka terhadap detail, ide-ide kreatif, dan dedikasi mereka terhadap visi kami sangat luar biasa."
            ),
        )


        val adapter = RecyclerViewTestimoniAdapter(this, data)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}