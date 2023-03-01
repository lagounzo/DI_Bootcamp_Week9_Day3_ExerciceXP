/**
 * Exercice 3 : Trier Des Chaînes À L'aide Du Tri À Bulles
 * Instructions
 * Soit un tableau de chaînes arr[]. Triez les chaînes données à l'aide de Bubble Sort et affichez le tableau trié.
 *
 * { "GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding" };
 *
 *
 * Dans Bubble Sort, les deux chaînes successives arr[i] et arr[i+1] sont échangées chaque fois que arr[i]> arr[i+1].
 * Les plus grandes valeurs descendent vers le bas et sont donc appelées tri descendant. À la fin de chaque passage,
 * des valeurs plus petites « bouillonnent » progressivement vers le haut et sont donc appelées tri à bulles.
 *
 * Après toutes les passes, nous obtenons toutes les chaînes dans un ordre trié. La complexité de l'algorithme ci-dessus sera O(N2).
 */


package exercice3;

public class BubbleSortStrings {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        String temp = "";
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j-1].compareTo(arr[j]) > 0) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeks", "Quiz", "Practice", "Gblogs", "Coding"};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
