package com.example.hello

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

// Instance name : Class Type
// Variable name : Data Type

class MainActivity : AppCompatActivity() {
    //onCreate = main() function
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView= = loading UI to memory
                     //R = resources (in the res Folder)
        setContentView(R.layout.activity_main)
        // UI related code start here
        // Link UI to Program using the findViewById() method
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val buttonShowHide: Button = findViewById(R.id.buttonShowHide)

        //Assign event handler to button
        buttonShowHide.setOnClickListener{


            if(imageViewQR.isVisible){
                buttonShowHide.text = getString(R.string.show)
                imageViewQR.visibility = View.GONE
            }else{
                buttonShowHide.text = getString(R.string.hide)
                imageViewQR.visibility = View.VISIBLE
            }

        }


    }
}
