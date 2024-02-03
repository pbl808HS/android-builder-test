package com.example.myapplication

class Usuario(val id: Int, val nombre: String, val apellido: String?, val email: String?, val tipoDeUsuario: TipoDeUsuario)

enum class TipoDeUsuario {
    ORO,
    PLATA,
    BRONCE
}