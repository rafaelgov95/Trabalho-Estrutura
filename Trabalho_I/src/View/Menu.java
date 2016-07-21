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

    /**
     * Método de impressão: Menu principal do programa
     *
     */
    public void menuPrincipal() {
        System.out.println("-------------------------------------");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println(">  Trabalho - Estrutura de Dados I  <");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("-------------------------------------");
        System.out.println("Digite a opção Desejada");
        System.out.println("1 - Criar novo vetor");
        System.out.println("2 - Imprimir meu vetor");
        System.out.println("3 - Buscar um número em meu vetor");
        System.out.println("4 - Ordenar meu vetor");
        System.out.println("5 - Imprimir Média de Permutação");
        System.out.println("10 - Imprimir Media de Permutas");
        System.out.println("0 - Sair");
    }

    /**
     * Método de impressão: Aviso de que já existe um vetor criado
     *
     */
    public void VetorExistent() {
        System.out.println("Você já possui um vetor, tem certeza que deseja substituí-lo?\n"
                + "1 - Sim\n"
                + "2 - Não");
    }

    /**
     * Método de impressão: Pergunta o tamanho do vetor a ser criado
     *
     */
    public void tamanhoVetor() {
        System.out.println("Escolha o tamanho do vetor desejado:\n"
                + "1 - 512 Posições\n"
                + "2 - 1024 Posições\n"
                + "3 - 4096 Posições\n"
                + "4 - Informar Tamanho do Vetor\n"
                + "0 - Sair");

    }

    /**
     * Método de impressão: Aviso de que ainda não existe um vetor
     *
     */
    public void vetorNExistente() {
        System.out.println("**************************");
        System.out.println("Você não possui um vetor!!");
        System.out.println("**************************");

    }

    /**
     * Método de impressão: Menu de escolha das buscas
     *
     */
    public void menuEscolhaBusca() {
        System.out.println("Escolha o tipo de busca:\n"
                + "1 - Busca Binaria\n"
                + "2 - Busca Sequencial em vetor ordenado\n"
                + "2 - Busca Sequencial em vetor desordenado\n"
                + "0 - Cancelar");

    }

    /**
     * Método de impressão: Pergunta o numero a ser buscado
     *
     */
    public void numeroProcurado() {
        System.out.println("Entre com o numero buscado no vetor:");
    }

    /**
     * Método de impressão: Aviso de que se o vetor não estiver ordenado, a
     * busca binária não irá funcionar
     *
     */
    public void avisoBusca() {
        System.out.println("");
        System.out.println("***************   Aviso   ***************");
        System.out.println(" Lembre-se que: para a busca binária ser ");
        System.out.println("   realizada corretamente é necessário ");
        System.out.println("       estar com o vetor ordenado");
        System.out.println("***************   Aviso   ***************");
        System.out.println("");

    }

    /**
     * Método de impressão: Aviso de que o número procurado não está no vetor
     *
     */
    public void numeroProcuradoNEncontrado() {
        System.out.println("*******************************************\n"
                + "O número procurado não se encontra no vetor\n"
                + "*******************************************");
    }

    /**
     * Método de impressão: Exibe o resultado da Busca binária, mostrando a
     * posição do número, e quantas comparações foram utilizadas na busca
     *
     * @param resulBB Resultado do método de busca binária
     * @param procurado Número que foi procurado
     * @param numComp Número de comparações realizadas
     */
    public void ResultadoBuscaBinaria(int resulBB, int procurado, int numComp) {
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Utilizando a Busca Binária:");
        System.out.println("  > O número " + procurado + " está na posição: " + resulBB);
        System.out.println("  > Foram feitas " + numComp + " comparações");

    }

    /**
     * Método de impressão: Exibe o resultado da Busca sequencial no vetor
     * ordenado, mostrando a posição do número, e quantas comparações foram
     * utilizadas na busca
     *
     * @param resulBSO Resultado do método de busca sequencial
     * @param procurado Número que foi procurado
     * @param comp Número de comparações realizadas
     */
    public void ResultadoBuscaSequencialO(int resulBSO, int procurado, int comp) {
        System.out.println("---------------------------------------");
        System.out.println("Utilizando a Busca Sequencial no vetor ordenado:");
        System.out.println("  > O número " + procurado + " está na posição: " + resulBSO);
        System.out.println("  > Foram feitas " + comp + " comparações");
    }

    /**
     * Método de impressão: Exibe o resultado da Busca sequencial no vetor
     * desordenado, mostrando a posição do número, e quantas comparações foram
     * utilizadas na busca
     *
     * @param resulBSD Resultado do método de busca sequencial
     * @param procurado Número que foi procurado
     * @param comp Número de comparações realizadas
     */
    public void ResultadoBuscaSequencialD(int resulBSD, int procurado, int comp) {
        System.out.println("---------------------------------------");
        System.out.println("Utilizando a Busca Sequencial no vetor desordenado:");
        System.out.println("  > O número " + procurado + " está na posição: " + resulBSD);
        System.out.println("  > Foram feitas " + comp + " comparações");
    }

    /**
     * Método de impressão: Pergunta qual tipo de ordenação o usuário deseja
     * realizar
     *
     */
    public void MenuOrdena() {
        System.out.println("Qual tipo de ordenação deseja realizar?\n"
                + "1 - Bubble Sort\n2 - Merge Sort\n2 - Quick Sort\n2 - Heap Sort");

    }

    /**
     * Método de impressão: Exibe os créditos do programa
     *
     */
    public void creditos() {
        System.out.println("#####################################################\n"
                + "Trabalho I, realizado na matéria Estrutura de Dados\n"
                + "Implementado por Higor Chaves e Rafael Viana\n"
                + "Com o auxilio do professor Marcel Kay\n"
                + "Durante o 3º Semestre do curso Sistemas de Informações\n"
                + "Julho/2016 - UFMS\n"
                + "######################################################");
    }

    /**
     * Método de impressão: Exibe o tempo que levou o método BubbleSort
     *
     * @param temp Tempo de execução
     */
    public static void impresaoBubble(double temp) {
        System.out.println("-----------------------");
        System.out.printf("Seu vetor foi ordenado em: %.2f Nano Secundos utilizando BubbleSort!", temp);
        System.out.println("-----------------------");
    }

    /**
     * Método de impressão: Exibe o tempo que levou o método MergeSort
     *
     * @param temp Tempo de execução
     */
    public static void impresaoMerge(double temp) {
        System.out.println("-----------------------");
        System.out.printf("Seu vetor foi ordenado em: %.2f Nano Secundos utilizando MergeSort!", temp);
        System.out.println("-----------------------");
    }

    /**
     * Método de impressão: Exibe o tempo que levou o método QuickSort
     *
     * @param temp Tempo de execução
     */
    public static void impresaoQuick(double temp) {
        System.out.println("-----------------------");
        System.out.printf("Seu vetor foi ordenado em: %.2f Nano Secundos utilizando QuickSort!", temp);
        System.out.println("-----------------------");
    }

    /**
     * Método de impressão: Exibe o tempo que levou o método HeapSort
     *
     * @param temp Tempo de execução
     */
    public static void impresaoHeap(double temp) {
        System.out.println("-----------------------");
        System.out.printf("Seu vetor foi ordenado em: %.2f Nano Secundos utilizando HeapSort!", temp);
        System.out.println("-----------------------");
    }

    public static String gravarBubble(double temp) {
        return "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando BubbleSort!\n";

    }

    public static String gravarMerge(double temp) {
        return "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando MergeSort!\n";

    }

    public static String gravarQuick(double temp) {
        return "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando QuickSort!\n";

    }

    public static String gravarHeap(double temp) {
        return "Seu vetor foi ordenado em:" + String.valueOf(temp) + "Nano Secundos utilizando HeapSort!\n";

    }

    /**
     * Método de impressão: Aviso de que a opção digitada é invalida
     */
    public void opcaoMenuPrincipalInvalida() {
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("Opção Inválida, Tente Novamente");
        System.out.println("*******************************");
        System.out.println("");
    }

    /**
     * Método de impressão: Aviso de que o vetor foi criado
     */
    public void vetorCriado() {
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Vetor criado com sucesso");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
    }

}
