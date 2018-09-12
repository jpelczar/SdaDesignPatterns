package io.jpelczar.structural.decorator;

public class ReadyFile implements Component {

    private String filename;

    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
