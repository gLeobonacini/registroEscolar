package br.com.digitalHouse.parteH

class ProfessorTitular(
    override val nome: String,
    override val sobrenome: String,
    override val tempoDeCasa: Int,
    override val codigoDeProfessor: Int,
    val especialidade: String): IProfessor{
}