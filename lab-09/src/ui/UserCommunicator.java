package ui;

import catalog.Catalog;

import java.util.Scanner;

public abstract class UserCommunicator {
    protected Scanner scanner = new Scanner(System.in);
    protected Catalog catalog;
    public UserCommunicator(Catalog catalog) {
        this.catalog = catalog;
    }
    public abstract void run();
}
