/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author rafael
 */
public class Menu {

    public void menuPrincipal() {
        System.out.println("-------------------------------------\n"
                + "-  Trabalho - Estrutura de Dados I  -\n"
                + "-------------------------------------\n"
                + "Digite a opção Desejada\n"
                + "1 - Criar novo vetor\n"
                + "2 - Imprimir meu vetor\n"
                + "3 - Buscar um número em meu vetor\n"
                + "4 - Ordenar meu vetor\n"
                + "5 - Créditos\n"
                + "6 - Imprimir Media de Permutas\n"
                + "0 - Sair");

    }

    public void VetorExistent() {
        System.out.println("Você já possui um vetor, tem certeza que deseja substituí-lo?\n"
                + "1 - Sim\n"
                + "2 - Não");
    }

    public void tamanhoVetor() {
        System.out.println("Escolha o tamanho do vetor desejado:\n"
                + "1 - 512 Posições\n"
                + "2 - 1024 Posições\n"
                + "3 - 4096 Posições\n"
                + "4 - Informar Tamanho do Vetor\n"
                + "0 - Sair");

    }

    public void vetorNExistente() {
        System.out.println("***************************************\n"
                + "Você não possui um vetor para imprimir!\n"
                + "***************************************");

    }

    public void menuEscolhaBusca() {
        System.out.println("Escolha o tipo de busca:\n"
                + "1 - Busca Binaria\n"
                + "2 - Secuencia\n"
                + "0 - Cancelar");

    }

    public void numeroProcurado() {
        System.out.println("Entre com o numero buscado no vetor:");
    }

    public void numeroProcuradoNEncontrado() {
        System.out.println("*******************************************\n"
                + "O número procurado não se encontra no vetor\n"
                + "*******************************************");
    }

    public void ResultadoBuscaBinaria(int resulBB, int procurado) {
        System.out.println("O número " + procurado + " está...\n"
                + "Na posição " + resulBB + " usando a Busca Binária");

    }

    public void ResultadoBuscaSequencial(int resulBS, int procurado) {
       
        System.out.println("O número " + procurado + " está...\n"
                + "Na posição " + resulBS + " usando a Busca Sequencial");
    }

    public void MenuOrdena() {
        System.out.println("Qual tipo de ordenação deseja realizar?\n"
                + "1 - Bubble Sort\n2 - Merge Sort\n2 - Quick Sort\n2 - Heap Sort");

    }

    public void creditos() {
        System.out.println("#####################################################\n"
                + "Trabalho I, realizado na matéria Estrutura de Dados\n"
                + "Implementado por Higor Chaves e Rafael Viana\n"
                + "Com o auxilio do professor Marcel Kay\n"
                + "Durante o 3º Semestre do curso Sistemas de Informações\n"
                + "Julho/2016 - UFMS\n"
                + "######################################################");
    }

    public static void impresaoBubble(double temp, int comp, int perm) {
        System.out.print(gravarBubble(temp, comp, perm));

    }

    public static void impresaoMerge(double temp, int comp, int perm) {
        System.out.print(gravarMerge(temp, comp, perm));
    }

    public static void impresaoQuick(double temp, int comp, int perm) {
        System.out.print(gravarQuick(temp, comp, perm));
    }

    public static void impresaoHeap(double temp, int comp, int perm) {
        System.out.print(gravarHeap(temp, comp, perm));
    }

    public static String gravarBubble(double temp, int comp, int perm) {
        return "Ordenação utlizando Bubble Sort\n" + "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando BubbleSort!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarMerge(double temp, int comp, int perm) {
        return "Ordenação utlizando Merge Sort\n" + "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando BubbleSort!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarQuick(double temp, int comp, int perm) {
        return "Ordenação utlizando Quick Sort\n" + "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando BubbleSort!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarHeap(double temp, int comp, int perm) {
        return "Ordenação utlizando Heap Sort\n" + "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando BubbleSort!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public void opcaoMenuPrincipalInvalida() {
        System.out.println("*******************************\n"
                + "Opção Inválida, Tente Novamente"
                + "*******************************");
    }
}
