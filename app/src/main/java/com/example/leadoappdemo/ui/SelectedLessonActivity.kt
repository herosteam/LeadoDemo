package com.example.leadoappdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leadoappdemo.R
import com.google.android.exoplayer2.ExoPlayerFactory.newSimpleInstance
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.ui.SimpleExoPlayerView
import kotlinx.android.synthetic.main.activity_selected_lesson.*

class SelectedLessonActivity : AppCompatActivity() {

    val video_url="http://techslides.com/demos/sample-videos/small.mp4"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected_lesson)


    }
}
