package ua.goit.view;

import java.util.List;

public interface View {

    String read();

    void write(Object... objects);

    default void write(List obj) {
        write (obj.toArray ());
    }
}


