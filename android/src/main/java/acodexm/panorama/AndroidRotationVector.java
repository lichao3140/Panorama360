package acodexm.panorama;

public class AndroidRotationVector implements RotationVector {

    float[] values = new float[16];

    public AndroidRotationVector() {
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
        values[0] = 1;
        values[5] = 1;
        values[10] = 1;
        values[15] = 1;
    }

    @Override
    public void updateRotationVector(float[] values) {
        this.values = values;
    }

    @Override
    public float[] getValues() {
        return values;
    }
}
