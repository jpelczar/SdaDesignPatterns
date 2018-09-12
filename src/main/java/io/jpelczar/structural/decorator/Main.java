package io.jpelczar.structural.decorator;

public class Main {
    public static void main(String[] args) {
        String inputFilename = "file";
        Component component =
                new ZipFile(
                        new TarFile(
                                new GzFile(
                                        new ReadyFile()
                                )
                        )
                );

        component.setFilename(inputFilename);

        System.out.println("Result: " + component.getFilename());

        component =
                new TarFile(
                        new GzFile(
                                new TarFile(
                                        new ReadyFile()
                                )
                        )
                );

        component.setFilename(inputFilename);

        System.out.println("Result: " + component.getFilename());
    }
}
