package br.com.digitalHouse.parteI

data class ProfessorAdjunto(override val nome: String,
                       override val sobrenome: String,
                       override val tempoDeCasa: Int,
                       override val codigoDeProfessor: Int,
                       val quantidadeHorasDeMonitoria: Int): IProfessor{
}