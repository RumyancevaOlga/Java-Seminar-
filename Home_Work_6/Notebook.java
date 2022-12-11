package Home_Work_6;

public class Notebook {
    private float diagonal;
    private String screenType;
    private int rum;
    private int memoryCapacity;
    private int buttery;
    private String os;
    private String brand;

    public Notebook (String brand) {
        this.brand = brand;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getScreenType() {
        if (screenType.equals("TN")) return 1; 
        else if (screenType.equals("VA")) return 2;
        else return 3;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getRum() {
        return rum;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getButtery() {
        return buttery;
    }

    public void setButtery(int buttery) {
        this.buttery = buttery;
    }

    public int getOs() {
        if (os.equals("MacOs")) return 1; 
        else if (os.equals("Linux")) return 2;
        else return 3;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook{" + 
                "brand=" + brand +
                ", diagonal='" + diagonal + '\'' +
                ", screenType=" + screenType +
                ", rum=" + rum +
                ", memoryCapacity=" + memoryCapacity +
                ", buttery=" + buttery +
                ", os=" + os +
                '}';
    }
}
