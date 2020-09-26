package br.com.digitalHouse.parteJ

class DigitalHouseManager() {

    private val listaDeAlunos = mutableListOf<Aluno>()
    private val listaDeProfessores = mutableListOf<IProfessor>()
    private val listaDeCursos = mutableListOf<Curso>()
    private val listaDeMatriculas = mutableListOf<Matricula>()

    // Função para registrar um curso
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAluno: Int){
        val curso = Curso(nome,codigoCurso,quantidadeMaximaDeAluno)
        val cursoExiste = listaDeCursos.find { it.codigoDeCurso == codigoCurso }
        when(cursoExiste != null){
            true -> println("Curso $nome já existe.")
            false -> {
                listaDeCursos.add(curso)
                println("Curso $nome adicionado.")
            }
        }
    }

    // Função para excluir um curso
    fun excluirCurso(codigoCurso: Int){
        val cursoExiste = listaDeCursos.find { it.codigoDeCurso == codigoCurso }
        when(cursoExiste != null){
            true -> {
                listaDeCursos.remove(cursoExiste)
                println("Curso ${cursoExiste.nome} foi excluido.")
            }
            false -> println("Curso código $codigoCurso não está registrado.")
        }
    }

    // Registra professor adjunto
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val prof = ProfessorAdjunto(nome,sobrenome,0,codigoProfessor,quantidadeDeHoras)
        val profExiste = listaDeProfessores.find { it.codigoDeProfessor == codigoProfessor }
        when(profExiste != null){
            true -> println("Professor $nome já foi registrado.")
            false -> {
                listaDeProfessores.add(prof)
                println("Professor $nome foi registrado.")
            }
        }
    }

    // Registra professor titular
    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val prof = ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade)
        val profExiste = listaDeProfessores.find { it.codigoDeProfessor == codigoProfessor }
        when(profExiste != null){
            true -> println("Professor $nome já foi registrado.")
            false -> {
                listaDeProfessores.add(prof)
                println("Professor $nome foi registrado.")
            }
        }
    }

    // Excluir professor
    fun excluirProfessor(codigoProfessor: Int){
        val profExiste = listaDeProfessores.find { it.codigoDeProfessor == codigoProfessor }
        when(profExiste != null){
            true -> {
                listaDeProfessores.remove(profExiste)
                println("Professor ${profExiste.nome} foi excluído.")
            }
            false -> println("Professor código $codigoProfessor não foi registrado.")
        }
    }

    // Função para matricular aluno
    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        val aluno = Aluno(nome,sobrenome,codigoAluno)
        val alunoExiste = listaDeAlunos.find { it.codigoDeAluno == codigoAluno }
        when(alunoExiste != null){
            true -> println("Aluno $nome já está registrado.")

            false -> {
                listaDeAlunos.add(aluno)
                println("Aluno $nome foi registrado.")
            }
        }
    }

    // Função para matricular aluno em um curso
    fun matricularAluno(codigoAluno: Int, codigoCurso:Int){
        val aluno = listaDeAlunos.find { it.codigoDeAluno == codigoAluno }
        val curso = listaDeCursos.find { it.codigoDeCurso == codigoCurso }
        when (aluno != null) {
            true -> {
                when(curso != null){
                    true -> {
                        when (curso.quantidadeMaximaDeAlunos > curso.listaDeAlunos.size){
                            true -> {
                                val matricula = Matricula(aluno,curso)
                                listaDeMatriculas.add(matricula)
                                curso.listaDeAlunos.add(aluno)
                                println("Matricula de ${aluno.nome} realizada com sucesso no curso ${curso.nome}.")
                            }
                            false -> println("Não foi possível realizar a matrícula de ${aluno.nome} porque não há vagas.")
                        }
                    }
                    false -> println("Curso não encontrado.")
                }

            }
            false -> println("Aluno não foi encontrado.")
        }
    }

    // Função que aloca professores a um curso
    fun alocarProfessor(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val profTitular = listaDeProfessores.find{it.codigoDeProfessor == codigoProfessorTitular}
        val profAdjunto = listaDeProfessores.find{it.codigoDeProfessor == codigoProfessorAdjunto}
        val curso = listaDeCursos.find { it.codigoDeCurso == codigoCurso }
        when(curso != null){
            true -> {
                when(profTitular != null){
                    true -> {
                        curso.professorTitular = profTitular as ProfessorTitular?
                        when(profAdjunto != null){
                            true ->{
                                curso.professorAdjunto = profAdjunto as ProfessorAdjunto?
                                println("Professores alocados no curso")
                            }
                            false -> println("Professor adjunto não encontrado")
                        }
                    }
                    false -> println("Professor titular não encontrado")
                }

            }
            false -> println("Curso não encontrado")
        }
    }
}