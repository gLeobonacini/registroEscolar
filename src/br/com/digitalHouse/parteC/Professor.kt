package br.com.digitalHouse.parteC

class Professor(val nome: String,
                val sobrenome: String,
                val tempoDeCasa: Int,
                val codigoDeProfessor: Int) {
    // Alterando função equals para comparar apenas codigoDeProfessor
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Professor)
            return false
        else
            return this.codigoDeProfessor == other.codigoDeProfessor
    }
}