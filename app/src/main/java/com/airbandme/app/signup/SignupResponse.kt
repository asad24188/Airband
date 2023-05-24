package com.fizall.app.responseModels.signup

import com.airbandme.app.responseModels.signup.User

data class SignupResponse(
    val data: User,
    val message: String,
    val status: Boolean
)