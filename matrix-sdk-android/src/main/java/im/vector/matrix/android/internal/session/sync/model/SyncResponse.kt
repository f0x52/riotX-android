package im.vector.matrix.android.internal.session.sync.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

// SyncResponse represents the request response for server sync v2.
@JsonClass(generateAdapter = true)
internal data class SyncResponse(
        /**
         * The user private data.
         */
        @Json(name = "account_data") val accountData: UserAccountDataSync? = null,

        /**
         * The opaque token for the end.
         */
        @Json(name = "next_batch") val nextBatch: String? = null,

        /**
         * The updates to the presence status of other users.
         */
        @Json(name = "presence") val presence: PresenceSyncResponse? = null,

        /*
         * Data directly sent to one of user's devices.
         */
        @Json(name = "to_device") val toDevice: ToDeviceSyncResponse? = null,

        /**
         * List of rooms.
         */
        @Json(name = "rooms") val rooms: RoomsSyncResponse? = null,

        /**
         * Devices list update
         */
        @Json(name = "device_lists") val deviceLists: DeviceListResponse? = null,

        /**
         * One time keys management
         */
        @Json(name = "device_one_time_keys_count")
        val deviceOneTimeKeysCount: DeviceOneTimeKeysCountSyncResponse? = null,


        /**
         * List of groups.
         */
        @Json(name = "groups") val groups: GroupsSyncResponse? = null


)