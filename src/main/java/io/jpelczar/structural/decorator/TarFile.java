package io.jpelczar.structural.decorator;

public class TarFile implements Component {

    private String filename;
    private Component component;

    public TarFile(Component component) {
        this.component = component;
    }

    @Override
    public String getFilename() {
        component.setFilename(filename + ".tar");
        return component.getFilename();
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
