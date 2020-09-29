package br.com.digitalHouse.parteH

data class ProfessorAdjunto(override val nome: String,
                       override val sobrenome: String,
                       override val tempoDeCasa: Int,
                       override val codigoDeProfessor: Int,
                       val quantidadeHorasDeMonitoria: Int): IProfessor{
}