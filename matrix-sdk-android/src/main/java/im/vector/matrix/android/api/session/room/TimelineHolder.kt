package im.vector.matrix.android.api.session.room

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import im.vector.matrix.android.api.session.events.model.EnrichedEvent

interface TimelineHolder {

    fun timeline(eventId: String? = null): LiveData<PagedList<EnrichedEvent>>

}