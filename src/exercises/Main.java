package exercises;


import books.MonException;
import books.PaperBooks;

import java.util.List;

public class Main {

    static List<PaperBooks> listOfBooks = List.of(
            new PaperBooks(14.99),
            new PaperBooks(36.99),
            new PaperBooks(24.99),
            new PaperBooks(26.99),
            new PaperBooks(36.00));

    //    List<PaperBooks> booksUnderThirty

    List<PaperBooks> resultat =
            listOfBooks.stream()
                    .filter(books -> books.price < 30)
                    .toList();
//                    .anyMatch(booksUnderThirty -> Objects.nonNull(booksUnderThirty));
//                    .anyMatch(Objects::nonNull);

    List<Double> priceMultipliedByTwo = listOfBooks.stream()
            .map(books -> books.price * 2)
            .toList();

    public static void changerPrixLivres(int multiplicateur, List<PaperBooks> booksList) {
        booksList.forEach(books -> books.price *= 2);
    }

//    public static void main(String[] args) throws Erreur {
//
//        try {
//            poatPoatNul();
//            poatPoat();
//        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
//            throw new Erreur("error");
//        }
//    }
//
//
//    public static void poatPoat() throws ArrayIndexOutOfBoundsException {
//        double[] numbers = new double[6];
//        double result = numbers[8];
//    }
//
//    public static void poatPoatNul() {
//        PaperBooks paperBooks = null;
//        int numberOfbooks = paperBooks.numberOfCopiesAvailable;
//    }


    public static void main(String[] args) throws MonException {

        changerPrixLivres(2, listOfBooks);

//        ArrayList<Integer> listeEntier = new ArrayList<>();
//        listeEntier.add(1);
//        listeEntier.add(1);
//        listeEntier.add(2);
//        listeEntier.add(2);
//        listeEntier.add(3);
//        listeEntier.add(3);
//        listeEntier.add(4);
//        listeEntier.add(4);
//        listeEntier.add(5);
//        listeEntier.add(5);
//
//        boolean deuxEstDansLaListe = listeEntier.stream().anyMatch(theInteger -> theInteger == 2);
//
//        List<Integer> oddList = listeEntier.stream()
//                .filter((theInteger) -> theInteger % 2 == 1)
//                .sorted()
//                .filter()
//                .anyMatch()
//                .toList();
//        List<Integer> listSansDoublon = listeEntier.stream().distinct().toList();
//
//        listeEntier.stream().filter(theInteger -> theInteger % 2 == 1).distinct();
//
//        ArrayList<Integer> oddNumberWithForLoop = new ArrayList<>();
//        for (Integer theInteger : listeEntier) {
//            if (theInteger % 2 == 1) {
//                oddNumberWithForLoop.add(theInteger);
//            }
//        }
//
//        ArrayList<Integer> listeFoisDeux = new ArrayList<>();
//
//        listeEntier.forEach(theInteger -> listeFoisDeux.add(theInteger * 2));
    }
}
