package designpatterns.memento;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    public DocumentState createDocState(String content,String fontName,int fontSize){
        return new DocumentState(content,fontName,fontSize);
    }

    @Override
    public String toString() {
        return
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public void restoreDocState(DocumentState state){
        content = state.getContent();
        fontName= state.getFontName();
        fontSize = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
