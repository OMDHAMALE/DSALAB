import java.util.*;

public class LibraryManagerSimple {
    public static void main(String[] args) {
        
        int[] borrowCounts = {10, 5, 8, 0, 5};
        String[] books = {"Harry Potter", "The Alchemist", "1984", "The Hobbit", "Pride and Prejudice"};

        int n = borrowCounts.length;

        
        int total = 0;
        for (int count : borrowCounts) {
            total += count;
        }
        double average = (double) total / n;
        System.out.println("Average number of books borrowed: " + average);

        
        int max = borrowCounts[0];
        int min = borrowCounts[0];
        String maxBook = books[0];
        String minBook = books[0];

        for (int i = 1; i < n; i++) {
            if (borrowCounts[i] > max) {
                max = borrowCounts[i];
                maxBook = books[i];
            }
            if (borrowCounts[i] < min) {
                min = borrowCounts[i];
                minBook = books[i];
            }
        }

        System.out.println("Book with highest borrowings: " + maxBook + " (" + max + ")");
        System.out.println("Book with lowest borrowings: " + minBook + " (" + min + ")");

        
        int zeroCount = 0;
        for (int count : borrowCounts) {
            if (count == 0)
                zeroCount++;
        }
        System.out.println("Number of books with 0 borrowings: " + zeroCount);

        
        int mode = borrowCounts[0];
        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (borrowCounts[i] == borrowCounts[j])
                    freq++;
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                mode = borrowCounts[i];
            }
        }
        System.out.println("Most frequent borrow count (mode): " + mode);
    }
}