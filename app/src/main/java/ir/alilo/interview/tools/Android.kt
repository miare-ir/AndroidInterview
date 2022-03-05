package ir.alilo.interview.tools

import android.app.Notification
import android.app.Service
import android.content.Intent
import android.os.IBinder

class Android {
    // Q13: Can we have two versions of this method, one running on main thread and other running
    // asynchronously with 15 seconds delay?
    fun drawFlowers() {
        print("Flower")
    }
}

class PrettyService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val (id, notification) = buildNotification()

        // Q15: What does this do?
        startForeground(id, notification)
        return START_STICKY
    }

    private fun buildNotification(): Pair<Int, Notification> {
        return 1 to Notification()
    }
}
