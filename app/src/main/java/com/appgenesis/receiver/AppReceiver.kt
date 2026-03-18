package com.appgenesis.receiver
import android.content.*
import com.appgenesis.data.AppDatabase
import kotlinx.coroutines.*

class AppReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val packageName = intent.data?.encodedSchemeSpecificPart ?: return
        // In a real build, use Hilt or a Singleton for the DB instance
    }
}
