package com.example.matuleapp

import android.Manifest
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import java.io.File

class CreateProjectActivity : AppCompatActivity() {
    private var selectedImageUri: Uri? = null

    private val galleryLauncher = registerForActivityResult(ActivityResultContracts.GetContent()){
        uri -> uri?.let{
            selectedImageUri = it
        findViewById<ImageView>(R.id.imageView).setImageURI(it)
    }
    }

    private val cameraLauncher = registerForActivityResult(ActivityResultContracts.TakePicture()){
        success -> if(success) {
        findViewById<ImageView>(R.id.imageView).setImageURI(selectedImageUri)
    }
    }
    private val permissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){granted ->
        if (granted) openCamera()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.project_creation)
        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            AlertDialog.Builder(this)
                .setItems(arrayOf("Из галереи","Сделать фото")){_, which ->
                    if(which==0) galleryLauncher.launch("image/*") else permissionLauncher.launch(
                        Manifest.permission.CAMERA)
                }
                .show()
        }
        findViewById<ImageButton>(R.id.imageButton).setOnClickListener {
            val name = findViewById<EditText>(R.id.nameP).text.toString()
            val type = findViewById<EditText>(R.id.editTextType).text.toString()
            val startDate = findViewById<EditText>(R.id.stdateedit).text.toString()
            val endDate = findViewById<EditText>(R.id.enddate).text.toString()
            if (name.isNotEmpty()&&type.isNotEmpty()&&startDate.isNotEmpty()&&endDate.isNotEmpty()){
                Toast.makeText(this, "Проект создан", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
    private fun openCamera(){
        val file = File(cacheDir, "photo_${System.currentTimeMillis()}.jpg")
        selectedImageUri = FileProvider.getUriForFile(this, "$packageName.fileprovider", file)
        cameraLauncher.launch(selectedImageUri!!)
    }
}