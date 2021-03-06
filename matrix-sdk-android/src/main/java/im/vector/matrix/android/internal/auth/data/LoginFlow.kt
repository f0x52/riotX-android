package im.vector.matrix.android.internal.auth.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class LoginFlow(val type: String,
                     val stages: List<String>)