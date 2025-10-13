package ImageViewer;

public class ImageProxy implements Image{

    Image realImage;
    public ImageProxy(){
        realImage = new RealImage();
    }

    @Override
    public void display() {
        this.realImage.display();
    }
    
}
