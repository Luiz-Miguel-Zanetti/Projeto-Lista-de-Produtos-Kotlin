fun main() {


    /*
     Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
     trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
     programa deverá atender as seguintes funcionalidades:

    -Armazenar dados da List
    -Remover dados da list;
    -Atualizar dados da list.
    -Apresentar todos os dados da list.

   */
    val listaProdutos = mutableListOf<String>()


    while (true) {

        println("                         Seja Bem vindo ao estoque do Supermercado CompreSempreBarato               ")

        println()
        print("Digite um dos quatro numeros para: ")
        println()
        println()
        println("1 - Adicionar produto")
        println("2 - Remover produto")
        println("3 - Editar produto")
        println("4 - Mostrar produtos")
        println("5 - Finalizar cadastro")

        println()

        print("Qual das opções deseja escolher?: ")
        val opçaoEscolhida = readln()

        println()


        if (opçaoEscolhida == "1" && opçaoEscolhida != "") {

            print("Digite um produto para ser adicionado:  ")
            val produto = readln()

            listaProdutos.add(produto)

            println("Produto adicionado com sucesso!")
            println()


        } else if ( opçaoEscolhida == "2"){

            println("Produtos cadastrados: $listaProdutos")
            print( "Qual dos produtos cadastrados acima, deseja remover?:" )
            val produtoEscolhido = readln()

             if ( listaProdutos.contains(produtoEscolhido) ){
                listaProdutos.remove(produtoEscolhido)
                 println("Produto removido com sucesso")

             }else{

                 println("O produto $produtoEscolhido não existe na lista")

             }

            println()

        }else if(opçaoEscolhida == "3" && opçaoEscolhida != "" ){

            println("Produtos cadastrados: $listaProdutos")
            print( "Qual dos produtos cadastrados acima deseja editar?: " )
            val produtoEscolhido = readln()

            if ( listaProdutos.contains(produtoEscolhido) ){
                val index = listaProdutos.indexOf( produtoEscolhido )
                print("Digite um novo produto: ")
                val produtoEditado = readln()
                listaProdutos[index] = produtoEditado
                println("Produto atualizado com sucesso!")

            }else{

                println("O produto $produtoEscolhido não existe na lista")

            }

        } else if (opçaoEscolhida == "4" && opçaoEscolhida != "") {

            println("Os produtos cadastrados são: $listaProdutos ")

            println()


        }else if (  opçaoEscolhida == "5" && opçaoEscolhida != "" ){

            println("Cadastro de produtos finalizado")

            break


        }else{

            println("Opção digitada ínvalida!"
                    +"\nDigite apenas entre as opções 1, 2, 3, 4 e 5")

            println()

        }



    }

}