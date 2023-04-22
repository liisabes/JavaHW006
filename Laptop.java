public class Laptop {
    String ram;
    String diskCapacity;
    String operatingSystem;
    String color;

    Laptop(String ram, String diskCapacity, String operatingSystem, String color) {
        this.ram = ram;
        this.diskCapacity = diskCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public String getDiskCapacity() {
        return diskCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "\n\nram: " + ram + "\ndisk capacity: " + diskCapacity + "\noperating system: " + operatingSystem + "\ncolor: " + color;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return ram.equals(laptop.ram) && diskCapacity.equals(laptop.diskCapacity) && operatingSystem.equals(laptop.operatingSystem) && color.equals(laptop.color);
    }

    public int hashCode() {
        return 3 * ram.hashCode() + 5 * diskCapacity.hashCode() + 8 * operatingSystem.hashCode() + 12 * color.hashCode();
    }

}
