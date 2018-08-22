package com.fodeguirassy.littleafrica.ui


import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firebase.ui.auth.AuthUI
import com.fodeguirassy.littleafrica.R

class SignInFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val signInIntent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setIsSmartLockEnabled(false) //TODO remove on Prod
                .setAvailableProviders(listOf(AuthUI.IdpConfig.GoogleBuilder().build(),
                        AuthUI.IdpConfig.FacebookBuilder().build(),
                        AuthUI.IdpConfig.TwitterBuilder().build()))
                .setLogo(R.mipmap.little_africa_logo)
                .setTheme(R.style.AppTheme)
                .build()

        startActivityForResult(signInIntent, SignInFragment.SIGN_IN_RESULT_CODE)
    }

    /*
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }
    */

    companion object {
        const val SIGN_IN_RESULT_CODE = 4444
        const val FRAGMENT_TAG = "sign_in_fragment"
    }

}
