package com.godohdev.try_dynamic_feature

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.godohdev.navigation.NavigationCommand
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var splitInstallManager: SplitInstallManager
    lateinit var request: SplitInstallRequest
    val DYNAMIC_FEATURE = "tvshow"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainApplication.coreComponent(this)
        initDynamicModules()
        setClickListeners()
        initUi()
    }

    private fun initUi() {
//        bnvMain.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val navController = findNavController(R.id.nav_host_fragment)
        bnvMain.setupWithNavController(navController)
    }

    private fun initDynamicModules() {
        splitInstallManager = SplitInstallManagerFactory.create(this)
        request = SplitInstallRequest
            .newBuilder()
            .addModule(DYNAMIC_FEATURE)
            .build()
    }

    private fun setClickListeners() {
//        buttonDeleteNewsModule.setOnClickListener {
//            val list = ArrayList<String>()
//            list.add(DYNAMIC_FEATURE)
//            uninstallDynamicFeature(list)
//        }
    }

    private fun uninstallDynamicFeature(list: List<String>) {
//        splitInstallManager.deferredUninstall(list)
//            .addOnSuccessListener {
//                buttonDeleteNewsModule.visibility = View.GONE
//                buttonOpenNewsModule.visibility = View.GONE
//            }
    }

    private fun isDynamicFeatureDownloaded(feature: String): Boolean {
        return splitInstallManager.installedModules.contains(feature)
    }

    @SuppressLint("SwitchIntDef")
    private fun downloadFeature() {
        splitInstallManager.startInstall(request)
            .addOnFailureListener {
                Log.d("DATA_GUE"," "+it.localizedMessage)
            }
            .addOnSuccessListener {

            }
            .addOnCompleteListener {
                Log.d("DATA_GUE", it.result.toString())
            }

        var mySessionId = 0
        val listener = SplitInstallStateUpdatedListener {
            mySessionId = it.sessionId()
            when (it.status()) {
                SplitInstallSessionStatus.DOWNLOADING -> {
                    val totalBytes = it.totalBytesToDownload()
                    val progress = it.bytesDownloaded()
                    // Update progress bar.
                }
                SplitInstallSessionStatus.INSTALLING -> Log.d("Status", "INSTALLING")
                SplitInstallSessionStatus.INSTALLED -> Log.d("Status", "INSTALLED")
                SplitInstallSessionStatus.FAILED -> Log.d("Status", "FAILED")
                SplitInstallSessionStatus.REQUIRES_USER_CONFIRMATION -> startIntentSender(
                    it.resolutionIntent().intentSender,
                    null,
                    0,
                    0,
                    0
                )

            }

        }
    }
}
