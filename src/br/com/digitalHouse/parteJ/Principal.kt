package br.com.digitalHouse.parteJ

class Principal {
    fun main(){
        val digitalHouse = DigitalHouseManager()

        // Registrando Professor Titular
        digitalHouse.registrarProfessorTitular("Minerva", "McGonagall",1001,"Bruxaria e Magia")
        digitalHouse.registrarProfessorTitular("Severus", "Snape",1002,"Defesa Contra as Artes das Trevas")

        // Registrando Professor Adjunto
        digitalHouse.registrarProfessorAdjunto("Dolores", "Umbridge",1003,2)
        digitalHouse.registrarProfessorAdjunto("Gilderoy", "Lockhart",1004,2)

        //Registrando Curso
        digitalHouse.registrarCurso("Full Stack",20001,3)
        digitalHouse.registrarCurso("Android",20002,2)

        //Alocando professores para Full Stack
        digitalHouse.alocarProfessor(20001,1001,1003)

        // Alocando professores para Android
        digitalHouse.alocarProfessor(20002,1002,1004)

        // Registrando alunos
        digitalHouse.registrarAluno("Cho", "Chang",5001)
        digitalHouse.registrarAluno("Ginevra", "Weasley",5002)
        digitalHouse.registrarAluno("Luna", "Lovegood",5003)
        digitalHouse.registrarAluno("Simas", "Finnigan",5004)
        digitalHouse.registrarAluno("Terence", "Higgs",5005)

        // Matriculando dois alunos no curso de Full Stack
        digitalHouse.matricularAluno(5001,20001)
        digitalHouse.matricularAluno(5002,20001)

        // Matriculando três alunos no curso de Android
        digitalHouse.matricularAluno(5003,20002)
        digitalHouse.matricularAluno(5004,20002)
        digitalHouse.matricularAluno(5005,20002)
    }
}