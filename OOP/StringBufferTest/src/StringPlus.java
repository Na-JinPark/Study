public class StringPlus {
    StringBuilder sb = null;
    StringPlus(){
        sb = new StringBuilder(32);
    }

    public void append(String str){
        sb.append(str);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    /*public void appendFormat(String format, Object... args){
        sb.append(String.format(format,args));
    }

    public void line(){
        sb.append(System.lineSeparator());
    }*/

    //sp.appendFormat("이름 : %s", name);
    //  .line();
    //체인 형식으로 구현하기 위해 변경
    public StringPlus appendFormat(String format, Object... args){
        sb.append(String.format(format,args));
        return this;
    }

    public StringPlus line(){
        sb.append(System.lineSeparator());
        return this;
    }

    public StringPlus appendLine(String str){
        this.line();
        this.append(str);
        return this;
    }
}
