/**
 * Exercice 4 : Trouver Le Numéro Manquant
 * Instructions
 * Étant donné un tableau arr[] de taille N-1 avec des entiers dans la plage de [1, N], la tâche consiste à trouver le nombre manquant parmi les N premiers entiers.
 *
 * Remarque : il n'y a pas de doublons dans la liste.
 *
 * Exemples:
 *
 * Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
 * Output: 5
 * Explanation: The missing number between 1 to 8 is 5
 * Input: arr[] = {1, 2, 3, 5}, N = 5
 * Output: 4
 * Explanation: The missing number between 1 to 5 is 4
 *
 *
 * Approche 1 (À L'aide Du Hachage) :
 * L'idée derrière l'approche suivante est
 *
 * Les nombres seront dans la plage (1, N), un tableau de taille N peut être maintenu pour garder une trace des éléments présents
 * dans le tableau donné
 *
 * Créez un tableau temporaire temp[] de taille n + 1 avec toutes les valeurs initiales égales à 0.
 * Parcourez le tableau d'entrée arr[] et faites ce qui suit pour chaque arr[i]
 * si(temp[arr[i]] == 0) temp[arr[i]] = 1
 * Traversez temp[] et affichez l'élément de tableau ayant la valeur 0 (il s'agit de l'élément manquant).
 *
 *
 * Approche 2 (En Utilisant La Sommation Des N Premiers Nombres Naturels) :
 * L'idée derrière l'approche est d'utiliser la sommation des N premiers nombres.
 *
 * Trouvez la somme des nombres dans la plage [1, N] en utilisant la formule N * (N+1)/2. Trouvez maintenant la somme
 * de tous les éléments du tableau et soustrayez-la de la somme des N premiers nombres naturels. Cela donnera la valeur de l'élément manquant.
 *
 * Suivez les étapes mentionnées ci-dessous pour mettre en œuvre l'idée :
 *
 * Calculez la somme des N premiers nombres naturels sous la forme sumtotal= N*(N+1)/2.
 * Parcourez le tableau du début à la fin.
 * Trouvez la somme de tous les éléments du tableau.
 * Imprimer le nombre manquant en tant que SumTotal - somme du tableau
 */


package exercice4;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2; // sum of first N integers
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1; // missing number is one of the first N integers
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missingNumber);
    }
}
