public class App {

    public static void main(String[] args) {
        ListArrayOfInteger lista = new ListArrayOfInteger();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(12);
        System.out.println(lista);

        System.out.println("Elemento armazenado na " + "primeira posicao da lista: " + lista.get(0));

    }
}


// 1) O que são TADs? Dê 3 exemplos e descreva-os. 
// listas que representam coleçoes de elementos linearmente. Listas, pilhas, filas. As pilhas e felias estão dentro de listas

// 2) Qual a definição de Listas lineares ?
//agrupa infos referentes em ordem linear

// 3) Qual a diferença de contiguidade física e dinâmica? Cite 2 vantagens e duas desvantagens de cada uma delas. 
//Contiguidade fisica: fica tudo junto em ordem sem espaço
//Contiguidade dinamica: pode ser armazenada em qualquer bloco livre

// 4) Qual a definição de Lista com Arranjo? 
// É uma lista com tamanho fixo, ex: array

// 5) Qual a desvantagem da implementação de lista com arranjo apresentada em aula? 
//Se quiser adicionar algo no começo ou no meio da lista, tera que mover todos os dados para lado

// 1) Descreva como ocorre a inserção de um elemento de acordo com a implementação do método add(elemento). 
// se o count e o tamanho do vetor forem iguais, ele entra dentro do if e dobra o tamanho do array criando um novo array 
// e em seguida adiciona o valor na posição count do vetor e da um count++.

// 2) Explique brevemente porque o método add(elemento) apresenta complexidade O(n. 
// pois ele sempre cresce linearmente

// 3) Apresente o pseucódigo para o método remove(elemento)


// 4) Qual a complexidade do método remove(elemento)? (utilize Big O). 

// 5) Considerando os itens 3 (pseudocódigo) e 4 (análise de complexidade), implemente o método remove no código disponibilizado. 

// 6) Incorpode no código base também o método - void add (int index, Integer element) 