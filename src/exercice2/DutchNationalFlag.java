/**
 *  Exercice 2 : Problème Du Drapeau National Hollandais
 * Instructions
 * Trier un tableau de 0, 1 et 2 | Problème de drapeau national néerlandais
 *
 * Soit un tableau A[] composé uniquement de 0, de 1 et de 2. La tâche consiste à écrire une fonction qui trie le tableau donné.
 * Les fonctions doivent mettre tous les 0 en premier, puis tous les 1 et tous les 2 en dernier.
 *
 * Ce problème est également le même que le fameux "problème du drapeau national néerlandais". Le problème a été proposé par Edsger Dijkstra.
 * Le problème est le suivant :
 *
 * Soit N boules de couleur rouge, blanche ou bleue disposées en ligne dans un ordre aléatoire. Vous devez disposer toutes
 * les balles de manière à ce que les balles de même couleur soient adjacentes à l'ordre des balles, l'ordre des couleurs étant rouge,
 * blanc et bleu (c'est-à-dire que toutes les balles de couleur rouge viennent en premier, puis les balles de couleur blanche puis les boules de
 * couleur bleue).
 *
 * Exemples:
 *
 * Input: {0, 1, 2, 0, 1, 2}
 * Output: {0, 0, 1, 1, 2, 2}
 *
 * Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
 * Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 *
 *
 * Suivez les étapes ci-dessous pour résoudre le problème donné :
 *
 * Conservez trois indices bas = 1, moyen = 1 et élevé = N et il y a quatre plages, 1 à faible (la plage contenant 0), faible à moyenne
 * (la plage contenant 1), moyenne à élevée (la plage contenant des éléments inconnus ) et haut à N (la plage contenant 2).
 * Traversez le tableau du début à la fin et le milieu est inférieur à haut. (Le compteur de boucle est i)
 * Si l'élément est 0, échangez l'élément avec l'élément à l'index low et mettez à jour low = low + 1 et mid = mid + 1
 * Si l'élément est 1, alors mettez à jour mid = mid + 1
 * Si l'élément est 2, échangez l'élément avec l'élément à l'index haut et mettez à jour haut = haut - 1 et mettez à jour i = i - 1.
 * Comme l'élément échangé n'est pas traité
 * Imprimez le tableau.
 */

package exercice2;

public class DutchNationalFlag {
    public static void sort012(int arr[], int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        sort012(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
