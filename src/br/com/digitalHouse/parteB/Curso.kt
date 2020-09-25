package br.com.digitalHouse.parteB

class Curso(val nome: String,
            val codigoDeCurso: Int) {
    // Alterando função equals para comparar apenas codigoDeCurso
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Curso)
            return false
        else
            return this.codigoDeCurso == other.codigoDeCurso
    }
}