package com.otcengineering.dreamer.serial

open class LoginRequest(
    language: String,
    strIdentifier: String,
    strCode: String
) {
    private var lang: String? = null
    private var Ident: String? = null
    private var code: String? = null

    init {
        lang = language
        Ident = strIdentifier
        code = strCode
    }
}