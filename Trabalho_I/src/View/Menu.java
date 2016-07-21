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
                + "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
                + ">  Trabalho - Estrutura de Dados I  <\n"
                + "¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n"
                + "-------------------------------------\n"
                 + "Digite a opção Desejada\n"
                + "1 - Criar novo vetor\n"
                + "2 - Imprimir meu vetor\n"
                + "3 - Buscar um número em meu vetor\n"
                + "4 - Ordenar meu vetor\n"
                + "5 - Imprimir Media de Permutas\n"
                + "6 - Imprimir LOG\n"
                + "7 - Créditos\n"
                + "0 - Sair\n");
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
                + "2 - Busca Sequencial em vetor ordenado\n"
                + "2 - Busca Sequencial em vetor desordenado\n"
                + "0 - Cancelar");

    }

    public void numeroProcurado() {
        System.out.println("Entre com o numero buscado no vetor:");
    }

    public void avisoBusca() {
        System.out.println("\n"
                + "***************   Aviso   ***************\n"
                + " Lembre-se que: para a busca binária ser\n"
                + "   realizada corretamente é necessário \n"
                + "       estar com o vetor ordenado\n"
                + "***************   Aviso   ***************\n");

    }

    public void numeroProcuradoNEncontrado() {
        System.out.println("*******************************************\n"
                + "O número procurado não se encontra no vetor\n"
                + "*******************************************");
    }

    public void ResultadoBuscaBinaria(int resulBB, int procurado, int numComp) {
        System.out.println("\n"
                + "---------------------------------------\n"
                + "Utilizando a Busca Binária:"
                + "  > O número " + procurado + " está na posição: " + resulBB + "\n"
                + "  > Foram feitas " + numComp + " comparações\n");

    }

    public void ResultadoBuscaSequencialO(int resulBSO, int procurado, int comp) {
        System.out.println("\n"
                + "---------------------------------------\n"
                + "Utilizando a Busca Binária:"
                + "  > O número " + procurado + " está na posição: " + resulBSO + "\n"
                + "  > Foram feitas " + comp + " comparações\n");

    }

    public void ResultadoBuscaSequencialD(int resulBSD, int procurado, int comp) {
        System.out.println("\n"
                + "---------------------------------------\n"
                + "Utilizando a Busca Binária:"
                + "  > O número " + procurado + " está na posição: " + resulBSD + "\n"
                + "  > Foram feitas " + comp + " comparações\n");

    }

    public void MenuOrdena() {
        System.out.println("Qual tipo de ordenação deseja realizar?\n"
                + "1 - Bubble Sort\n2 - Merge Sort\n3 - Quick Sort\n4 - Heap Sort");

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

    public static void impresaoMedia(int bubblepermuta, int bubblecompara, int mergepermuta, int mergecompara, int heappermuta, int heapcompara, int quickpermuta, int quickcompara) {
        System.out.println(gravarMedia(bubblepermuta, bubblecompara, mergepermuta, mergecompara, heappermuta, heapcompara, quickpermuta, quickcompara));
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

    public static String gravarMedia(int bubblepermuta, int bubblecompara, int mergepermuta, int mergecompara, int heappermuta, int heapcompara, int quickpermuta, int quickcompara) {
        return "---------------------Resultado Media de 30 Comparações e Permutações-----------------------------"
                + "\nMedia Utilizando BuubleSort"
                + "A média de permutação : " + (bubblepermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (bubblecompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Merge"
                + "A média de permutação : " + (mergepermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (mergecompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Quick"
                + "A média de permutação : " + (quickpermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (quickcompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Heap"
                + "A média de permutação : " + (heappermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (heapcompara / 30) + " vezes!\n"
                + "\"--------------------------------------------->FIM<------------------------------------------\"";
    }

    public static String gravarBubble(double temp, int comp, int perm) {
        return "Ordenação utlizando Bubble Sort\n" + "Seu vetor foi ordenado em: " + String.valueOf(temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarMerge(double temp, int comp, int perm) {
        return "Ordenação utlizando Merge Sort\n" + "Seu vetor foi ordenado em: " + String.valueOf(temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarQuick(double temp, int comp, int perm) {
        return "Ordenação utlizando Quick Sort\n" + "Seu vetor foi ordenado em: " + String.valueOf(temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public static String gravarHeap(double temp, int comp, int perm) {
        return "Ordenação utlizando Heap Sort\n" + "Seu vetor foi ordenado em: " + String.valueOf(temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    public void opcaoMenuPrincipalInvalida() {
        System.out.println("\n"
                + "*******************************\n"
                + "Opção Inválida, Tente Novamente\n"
                + "*******************************\n");

    }

    public void vetorCriado() {
        System.out.println("\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Vetor criado com sucesso\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }
    public void logSalvoInforma(String dir){
    System.out.println("Log salvo em " +dir);
    }
    public void logErro(){
    System.out.println("Log nao iniciado");
    }

}
