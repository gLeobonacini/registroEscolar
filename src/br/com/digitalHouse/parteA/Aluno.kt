package br.com.digitalHouse.parteA

class Aluno(val nome: String,
            val sobrenome: String,
            val codigoDeAluno: Int) {
    // Alterando função equals para comparar apenas codigoDeAluno
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Aluno)
            return false
        else
            return this.codigoDeAluno == other.codigoDeAluno
    }
}