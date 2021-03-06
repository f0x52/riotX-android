package im.vector.riotredesign.features.home.room.detail

import android.support.v7.widget.LinearLayoutManager
import im.vector.riotredesign.core.platform.DefaultListUpdateCallback
import java.util.concurrent.atomic.AtomicBoolean

class ScrollOnNewMessageCallback(private val layoutManager: LinearLayoutManager) : DefaultListUpdateCallback {

    val hasBeenUpdated = AtomicBoolean(false)

    override fun onInserted(position: Int, count: Int) {
        if (hasBeenUpdated.compareAndSet(true, false) && position == 0 && layoutManager.findFirstVisibleItemPosition() == 0) {
            layoutManager.scrollToPosition(0)
        }
    }

}