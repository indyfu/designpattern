package com.pgi.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    public List<com.pgi.memento.EditorState> states = new ArrayList<>();


    public void push(com.pgi.memento.EditorState state) {
        states.add(state);
    }

    public com.pgi.memento.EditorState pop() {
        var lastIndex = states.size() - 1;
        if (lastIndex == -1) {
            return new com.pgi.memento.EditorState("This editor is empty", 0, ""
            );
        }
        var lastState = states.get(lastIndex);
        states.remove(lastIndex);

        return lastState;
    }
}
