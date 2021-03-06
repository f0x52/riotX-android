package im.vector.matrix.android.api.session

import android.support.annotation.MainThread
import im.vector.matrix.android.api.auth.data.SessionParams
import im.vector.matrix.android.api.session.group.GroupService
import im.vector.matrix.android.api.session.room.RoomService

interface Session : RoomService, GroupService {

    val sessionParams: SessionParams

    @MainThread
    fun open()

    @MainThread
    fun close()

}