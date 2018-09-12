package io.jpelczar.structural.decorator;

public class GzFile implements Component {

    private String filename;
    private Component component;

    public GzFile(Component component) {
        this.component = component;
    }

    @Override
    public String getFilename() {
        component.setFilename(filename + ".gz");
        return component.getFilename();
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
