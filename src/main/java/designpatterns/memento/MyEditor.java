package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyEditor {

    private String content;

    private Stack contentStack = new Stack();


    public String getContent() {
        return content;
    }

    public void setContent(String content) {

      contentStack.push(content);

    }

    public Stack getContentStack() {
        return contentStack;
    }

    public void undo(){
        contentStack.pop();
        Object peek = this.contentStack.peek();
        content=(String)peek;
    }

    public Stack printStack(){
        return contentStack;
    }


}
