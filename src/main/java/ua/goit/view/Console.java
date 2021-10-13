package ua.goit.view;

import java.util.Scanner;
import java.util.stream.Stream;


public class Console implements View {

    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine().trim();
    }

    @Override
    public void write(Object ... objects) {
        Stream.of(objects).forEach(System.out::println);
    }
}
