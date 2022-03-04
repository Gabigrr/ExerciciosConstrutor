
fun main(args: Array<String>) {

    /*Crie uma classe funcionário e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto funcionário, defina as instancias deste objeto
    e apresente as informações deste objeto no console.
     */

    val estela = Funcionario()

    estela.nome = "Estela"
    estela.id = 25452
    estela.setor = "RH"
    estela.dataAdmissao = "24/08/2020"
    estela.dataDemissao = "01/03/2022"

    println("Nome: ${estela.nome}")
    println("ID: ${estela.id}")
    println("Setor: ${estela.setor}")
    println("Data de admissão:${estela.dataAdmissao}")
    println("Data de demissão:${estela.dataDemissao}")

}
