
fun main(){

    /*
  List - Listagem de valores, tendo um tamanho variável

  List - Lista Imutável - não pode mudar os valores internos e nem alterar o tamanho
  MutableList - Lista Mutável - podemos alterar os valores e o seu tamanho
   */

    //Lista imutável

    val nomes1 = listOf("Henrique", "Rodrigo")

    nomes1.forEach{
        println(it)
    }


    //Lista mutável

    val nomes2 = mutableListOf<String>()

    nomes2.add("Henrique")
    nomes2.add("Rodrigo")
    nomes2.add("Rogério")

    println(nomes2)


    //Exemplo prático utilizando o List


    val nomes3 = mutableListOf<String>()

    while (true){
        println("Digite alguns nomes para adicionar na lista: ")
        val valor = readln()

        if(valor != ""){
            nomes3.add(valor)
        }else{
            break
        }
    }

    println("O tamanho da lista é: ${nomes3.size}")
    println(nomes3)

    //remove - Exclui um item da lista
    while (true){
        println("Digite um nome para você deletar da lista: ")
        val valor = readln()

        //contains - Verifica se um valor existe na lista
        if(nomes3.contains(valor)){
            nomes3.remove(valor)
            break
        }else{
            println("O nome $valor não existe na lista")
        }
    }

    println("O tamanho da lista é: ${nomes3.size}")
    println(nomes3)

    //indexOf - Mostra a posição do item com base em seu valor
    println("Digite agora um valor que você queira editar: ")
    val edit = readln()

    if(nomes3.contains(edit)){
        val index = nomes3.indexOf(edit)
        println("Digite o novo nome: ")
        val valor = readln()
        nomes3[index] = valor
        println("O nome foi atualizado com sucesso!")
    }else{
        println("O nome $edit não existe na lista")
    }

    println("O tamanho da lista é: ${nomes3.size}")
    println(nomes3)



}

