package br.com.digitalHouse.parteF

data class Curso(val nome: String,
            val codigoDeCurso: Int,
            val professorTitular: ProfessorTitular,
            val professorAdjunto: ProfessorAdjunto,
            val quantidadeMaximaDeAlunos: Int,
            val listaDeAlunos: MutableList<Aluno>) {
    // Alterando função equals para comparar apenas codigoDeCurso
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Curso)
            return false
        else
            return this.codigoDeCurso == other.codigoDeCurso
    }
}