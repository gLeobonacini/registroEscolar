package br.com.digitalHouse.parteD

class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val tempoDeCasa: Int,
    override val codigoDeProfessor: Int,
    val especialidade: String): IProfessor{

    // Alterando função equals para comparar apenas codigoDeProfessor
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is IProfessor)
            return false
        else
            return this.codigoDeProfessor == other.codigoDeProfessor
    }
}