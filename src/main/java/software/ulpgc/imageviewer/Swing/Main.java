package software.ulpgc.imageviewer.Swing;

import software.ulpgc.imageviewer.Interfaces.Image;
import software.ulpgc.imageviewer.Mocks.*;
import software.ulpgc.imageviewer.Presenter.ImagePresenter;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MocksImageLoader().load();
    }
}