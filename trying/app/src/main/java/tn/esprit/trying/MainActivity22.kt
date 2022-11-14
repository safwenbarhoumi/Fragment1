package tn.esprit.trying

import android.app.ActionBar
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.internal.NavigationMenu
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationBarMenu
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView



class MainActivity22 : AppCompatActivity() {
    private lateinit var btnskill: Button
    private lateinit var btnhob: Button
    private lateinit var btnlang: Button
    private lateinit var btnicon: BottomNavigationView
    private lateinit var im:ImageView
    private lateinit var btncareer : Button

    //private lateinit var btnh : Button
    /*
    companion object {
     IMAGE_REQUEST_CODE = 100
    }

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main22)
        btncareer = findViewById(R.id.btn_car)


        im = findViewById(R.id.img_save)

        val getimg = registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                im.setImageURI(it)
            }
        )

        im.setOnClickListener(){

            getimg.launch("image/*")





            //val intent = Intent(Intent.ACTION_PICK)
         //   intent.type = "image/*"
          //  val REQUEST_CODE = 100
         //   startActivityForResult(intent, REQUEST_CODE)
          //  fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         //       super.onActivityResult(requestCode, resultCode, data)
          //      val REQUEST_CODE = 100
           //     if (resultCode == Activity.RESULT_OK && requestCode == REQUEST_CODE){
            //        im.setImageURI(data?.data) // handle chosen image
                }



        //var action = supportActionBar
        //action!!.title = "ssssssss"

        //  ImagePicker.with(this).galleryOnly().galleryMimeTypes(arrayOf("image/*")).crop()
        //    .maxResultSize(400, 400).start()

        //}


        btnskill = findViewById(R.id.s1)
        btnhob = findViewById(R.id.s2)
        btnlang = findViewById(R.id.s3)
        btnicon = findViewById(R.id.nav)
        //btnh=findViewById(R.id.s4)


        val f1 = fragskills()
        val f2 = Fraghob()
        val f3 = franglang()
        val f4 = Fragtot()


        //btnh.setOnClickListener(){
        //pickImageGallery()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfrag , f1)
            addToBackStack(null)
            commit()
        }


      //  btnh.setOnClickListener {
       //     supportFragmentManager.beginTransaction().apply {
        //        replace(R.id.flfrag , f4)
        //        addToBackStack(null)
         //       commit()
          //  }
        //}



        btnskill.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f1)
                addToBackStack(null)
                commit()
            }
        }

        btnhob.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f2)
                addToBackStack(null)
                commit()
            }
        }

        btnlang.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfrag , f3)
                addToBackStack(null)
                commit()
            }
        }

        replaceFragment(f4)
/*
        btnicon.setOnClickListener() {
            val p = PopupMenu(this , it)
            p.setOnMenuItemClickListener{ item ->
            when (item.itemId) {
                R.id.nav -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.flfrag , f4)
                        addToBackStack(null)
                        commit()
                        true
                }
                    else  ->  false
            }
        }

    }
            p.inflate(R.menu.menu)
            p.show()
        }
*/
    }
/*
    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"

        startActivityForResult(intent,IMAGE_REQUEST_CODE)
    }

*/*/


    fun replaceFragment(fragment : Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.flfrag , fragment)
            transaction.commit()
        }
    }






}


