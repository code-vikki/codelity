package designpatterns;

import designpatterns.memento.*;

public class Demo {
    public static void main(String[] args) {
//        Editor editor = new Editor();
//        History history = new History();
//        editor.setContent("a");
//        EditorState state = editor.createState();
//        history.push(state);
//
//        editor.setContent("b");
//        EditorState state1 = editor.createState();
//        history.push(state1);
//
//        editor.setContent("c");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//
//
//        System.out.println(editor.getContent());
        Document document = new Document();
        DocumentHistory history = new DocumentHistory();
        //first state
        document.setContent("Hi there");
        document.setFontName("arial");
        document.setFontSize(12);
        DocumentState docState = document.createDocState
                (document.getContent(), document.getFontName(), document.getFontSize());
        history.addState(docState);
        //second state
        document.setContent("Bye");
        document.setFontName("Times New Roman");
        document.setFontSize(10);
        DocumentState docState1 = document.createDocState(document.getContent(), document.getFontName(), document.getFontSize());
        history.addState(docState1);

        //undo
        DocumentState state = history.getState(1);
        document.restoreDocState(state);
        System.out.println("Current state is " + document);


        document.restoreDocState( history.getState(0));
        System.out.println("Previous state is " + document);



    }
}
