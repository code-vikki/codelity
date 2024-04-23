package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private List<DocumentState> lstOfDocumentState = new ArrayList<>();

    public void addState(DocumentState state){
        lstOfDocumentState.add(state);
    }

    public DocumentState getState(int index){
        return lstOfDocumentState.get(index);
    }

}
