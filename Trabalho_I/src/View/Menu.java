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
                + "7 - Deletar LOG\n"
                + "8 - Créditos\n"
                + "0 - Sair\n");
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
        System.out.println("***************************************\n"
                + "Você não possui um vetor para imprimir!\n"
                + "***************************************");

    }

    /**
     * Método de impressão: Menu de escolha das buscas
     *
     */
    public void menuEscolhaBusca() {
        System.out.println("Escolha o tipo de busca:\n"
                + "1 - Busca Binaria\n"
                + "2 - Busca Sequencial em vetor ordenado\n"
                + "3 - Busca Sequencial em vetor desordenado\n"
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
        System.out.println("\n"
                + "***************   Aviso   ***************\n"
                + " Lembre-se que: para a busca binária ser\n"
                + "   realizada corretamente é necessário \n"
                + "       estar com o vetor ordenado\n"
                + "***************   Aviso   ***************\n");

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
     * Método de impressão: Returna uma String o resultado da Busca sequencial
     * no vetor ordenado, mostrando a posição do número, e quantas comparações
     * foram utilizadas na busca
     *
     * @param resulBB Resultado do método de busca binaria
     * @param procurado Número que foi procurado
     * @param numComp Número de comparações realizadas
     * @return String
     */
    public String gravarBuscaBinaria(int resulBB, int procurado, int numComp) {
        return "Utilizando a Busca Binária:\n"
                + "  > O número " + procurado + " está na posição: " + resulBB + "\n"
                + "  > Foram feitas " + numComp + " comparações\n";
                 
    }

    /**
     *
     * Método de impressão: Busca Binaria Select
     */
    public void BuscaBinariaSelect() {
        System.out.println("Busca Binaria foi Selecionada Pelo Systema Para Melhor Desempenho.");
    }

    /**
     *
     * Método de impressão: Busca Sequencial Select
     */
    public void BuscaSequencialSelect() {
        System.out.println("Busca Sequencial foi Selecionada Pelo Systema.");
    }
//
//    /**
//     * Método de impressão: Retorna uma String o resultado da Busca sequencial no vetor
//     * ordenado, mostrando a posição do número, e quantas comparações foram
//     * utilizadas na busca
//     *
//     * @param resulBSO Resultado do método de busca sequencial
//     * @param procurado Número que foi procurado
//     * @param comp Número de comparações realizadas
//     * @return String
//     */
//    public String gravarBuscaSequencialO(int resulBSO, int procurado, int comp) {
//        return "Utilizando a Busca Sequencial Ordenado:\n"
//                + "  > O número " + procurado + " está na posição: " + resulBSO + "\n"
//                + "  > Foram feitas " + comp + " comparações\n";
//
//    }

    /**
     * Método de impressão: Retorna uma String o resultado da Busca sequencial
     * no vetor desordenado, mostrando a posição do número, e quantas
     * comparações foram utilizadas na busca
     *
     * @param resulBSD Resultado do método de busca sequencial
     * @param procurado Número que foi procurado
     * @param comp Número de comparações realizadas
     * @return String
     */
    public String gravarBuscaSequencialD(int resulBSD, int procurado, int comp) {
        return "Utilizando a Busca Desordenado:\n"
                + "  > O número " + procurado + " está na posição: " + resulBSD + "\n"
                + "  > Foram feitas " + comp + " comparações\n";

    }

    /**
     * Método de impressão: Pergunta qual tipo de ordenação o usuário deseja
     * realizar
     *
     */
    public void MenuOrdena() {
        System.out.println("Qual tipo de ordenação deseja realizar?\n"
                + "1 - Bubble Sort\n2 - Merge Sort\n3 - Quick Sort\n4 - Heap Sort");

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
     * Método de impressão: Retorna uma String com o resultado da Media de 30
     * ordenamentos em vetores desordenado, mostrando resultado da Permutação e
     * Comparação de Cada um dos 4 metodos.
     *
     * @param bubblepermuta Valor da Variavel Permuta do BubbleSort
     * @param bubblecompara Valor da Variavel Comparação do BubbleSort
     * @param mergepermuta Valor da Variavel Permuta do MergeSort
     * @param mergecompara Valor da Variavel Comparação do MergeSort
     * @param heappermuta Valor da Variavel Permuta do HeapSort
     * @param heapcompara Valor da Variavel Comparação do HeapSort
     * @param quickpermuta Valor da Variavel Permuta do QuickSort
     * @param quickcompara Valor da Variavel Comparação do QuickSort
     * @return String
     */
    public String gravarMedia(int bubblepermuta, int bubblecompara, int mergepermuta, int mergecompara, int heappermuta, int heapcompara, int quickpermuta, int quickcompara) {
        return "---------------------Resultado Media de 30 Comparações e Permutações-----------------------------"
                + "\nMedia Utilizando BuubleSort\n"
                + "A média de permutação : " + (bubblepermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (bubblecompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Merge\n"
                + "A média de permutação : " + (mergepermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (mergecompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Quick\n"
                + "A média de permutação : " + (quickpermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (quickcompara / 30) + " vezes!\n"
                + "\nMedia Utilizando Heap\n"
                + "A média de permutação : " + (heappermuta / 30) + " vezes!\n"
                + "A média de comparação : " + (heapcompara / 30) + " vezes!\n"
                + "\"--------------------------------------------->FIM<------------------------------------------\"";
    }

    /**
     * Método de impressão: Retorna uma String o resultado de tempo em segundo,
     * comparções e permutações em Segundos
     *
     *
     * @param temp Valor da Variavel Temp.
     * @param comp Valor da Variavel Comparação.
     * @param perm Valor da Variavel Permuta.
     * @return String
     */
    public String gravarBubble(double temp, int comp, int perm) {
        return "Ordenação utlizando Bubble Sort\n" + "Seu vetor foi ordenado em: " + String.format("%.5f", temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    /**
     * Método de impressão: Retorna uma String o resultado de tempo em segundo,
     * comparções e permutações em Segundos
     *
     *
     * @param temp Valor da Variavel Temp.
     * @param comp Valor da Variavel Comparação.
     * @param perm Valor da Variavel Permuta.
     * @return String
     */
    public String gravarMerge(double temp, int comp, int perm) {
        return "Ordenação utlizando Merge Sort\n" + "Seu vetor foi ordenado em: " + String.format("%.5f", temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    /**
     * Método de impressão: Retorna uma String com o resultado de tempo em
     * segundo, comparções e permutações em Segundos
     *
     *
     * @param temp Valor da Variavel Temp.
     * @param comp Valor da Variavel Comparação.
     * @param perm Valor da Variavel Permuta.
     * @return String
     */
    public String gravarQuick(double temp, int comp, int perm) {
        return "Ordenação utlizando Quick Sort\n" + "Seu vetor foi ordenado em: " + String.format("%.5f", temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    /**
     * Método de impressão: Retorna uma String com o resultado de tempo em
     * segundo, comparções e permutações em Segundos
     *
     *
     * @param temp Valor da Variavel Temp.
     * @param comp Valor da Variavel Comparação.
     * @param perm Valor da Variavel Permuta.
     * @return String
     */
    public String gravarHeap(double temp, int comp, int perm) {
        return "Ordenação utlizando Heap Sort\n" + "Seu vetor foi ordenado em: " + String.format("%.5f", temp) + " Segundos!\n"
                + "   > Foram feitas " + comp + " comparações\n"
                + "   > E realizadas " + perm + " permutações\n";

    }

    /**
     * Método de impressão: Aviso de que a opção digitada é invalida
     */
    public void opcaoMenuPrincipalInvalida() {
        System.out.println("\n"
                + "*******************************\n"
                + "Opção Inválida, Tente Novamente\n"
                + "*******************************\n");

    }

    /**
     * Método de impressão: Aviso de que o vetor foi criado
     */
    public void vetorCriado() {
        System.out.println("\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Vetor criado com sucesso\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }

    /**
     * Método de impressão: Mostra local Salvo o Arquivo
     *
     * @param dir CaminhoDoArquivo.
     */
    public void logSalvoInforma(String dir) {
        System.out.println("Log salvo em " + dir);
    }

    /**
     * Método de impressão: Mostra erro quando arquivo de log nao iniciado.
     */
    public void logErro() {
        System.out.println("Log nao iniciado");
    }

    /**
     * Método de impressão: Avisa que o arquivo de log foi apagado com exito.
     */
    public void logApagado() {
        System.out.println("Log Apagado Com sucesso");
    }

    /**
     * Método de impressão: COMEÇO DO ARQUVI LOG.
     */
    public void logInicia() {
        System.out.println("########################################INICIO LOG######################\n");
    }

    /**
     * Método de impressão: FIM DO LOG.
     */
    public void logFim() {
        System.out.println("########################################FIM LOG##########################\n");
    }

}
