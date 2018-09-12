package io.jpelczar.structural.decorator;

public class ZipFile implements Component {

    private String filename;
    private Component component;

    public ZipFile(Component component) {
        this.component = component;
    }

    @Override
    public String getFilename() {
        component.setFilename(filename + ".zip");
        return component.getFilename();
    }

    @Override
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
