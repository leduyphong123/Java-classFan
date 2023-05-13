public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int value) {
        if(this.on){
            switch (value) {
                case 1:
                    this.speed = SLOW;
                    break;
                case 2:
                    this.speed = MEDIUM;
                    break;
                case 3:
                    this.speed = FAST;
                    break;
                default:
                    break;
            }
        }
    }

    public void getSpeed() {
        if (this.on){
            System.out.print(this.speed);
        }
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff() {
        this.on = false;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setRadius(double value) {
        if (this.on){
            this.radius = value;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String value) {
        if (this.on){
            this.color = value;
        }
    }

    public String getColor() {
        return this.color;
    }
    public String toString(){
        if(this.on){
            return "speed = "+this.speed+" color = "+this.color + " radius = " + this.radius;
        }else {
            return "fan is on";
        }
    }
}
