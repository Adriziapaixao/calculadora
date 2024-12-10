public class LacoRepeticao {

    public static void main(String args[]) {

        int[] vetor = {5, 10, 22, 30, 35};
        System.out.println("\n=== Impriomindo os números fo vetor com for ===");
        for (int i = 0; i <vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("\n=== Impriomindo os números fo vetor com while ===");
        int index = 0;
        while (index < vetor.length){
            System.out.println(vetor[index]);
            index++;
        }

        System.out.println("\n=== Impriomindo os números fo vetor com do/while ===");
        index = 0;
        do {
            System.out.println(vetor[index]);
            index++;
        } while (index < vetor.length);


    }


}
