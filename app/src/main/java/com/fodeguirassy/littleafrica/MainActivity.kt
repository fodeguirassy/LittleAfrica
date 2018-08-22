package com.fodeguirassy.littleafrica

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation
import com.fodeguirassy.littleafrica.ui.SignInFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.nav_host_fragment, SignInFragment(), SignInFragment.FRAGMENT_TAG)
                .addToBackStack(SignInFragment.FRAGMENT_TAG)
                .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(findViewById(R.id.nav_host_fragment)).navigateUp()
    }

}
