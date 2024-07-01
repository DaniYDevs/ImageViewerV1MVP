package software.ulpgc.imageviewer.Interfaces;

public interface Image {
    String id();
    Image next();
    Image prev();
}
