package br.com.digitalHouse.parteH

class Curso(val nome: String,
            val codigoDeCurso: Int,
            val professorTitular: ProfessorTitular,
            val professorAdjunto: ProfessorAdjunto,
            val quantidadeMaximaDeAlunos: Int,
            val listaDeAlunos: MutableList<Aluno>) {

    //Função para incluir um aluno ao curso, retorno 'true' se foi possível e 'false' se não foi possível
    fun adicionarAluno(aluno: Aluno): Boolean{
        when (listaDeAlunos.size < quantidadeMaximaDeAlunos) {
            true -> {
                val alunoExiste = listaDeAlunos.find{it.codigoDeAluno == aluno.codigoDeAluno}
                when(alunoExiste != null){
                    true -> {
                        listaDeAlunos.add(aluno)
                        println("Aluno adicionado no curso $nome.")
                        return true
                    }
                    false -> {
                        println("Aluno já cadastrado no curso $nome.")
                        return false
                    }
                }
            }
            false -> {
                println("O curso $nome já está com a quantidade máxima de aluno.")
                return false
            }
        }
    }

    //Função para excluir um aluno do curso
    fun excluirAluno(aluno: Aluno){
        val alunoExiste = listaDeAlunos.find{it.codigoDeAluno == aluno.codigoDeAluno}
         when(alunoExiste != null){
            true -> {
                println("O aluno não está cadastrado no curso $nome.")
            }
            false -> {
                listaDeAlunos.remove(aluno)
                println("Aluno foi retirado do curso $nome.")
            }
         }
    }
}