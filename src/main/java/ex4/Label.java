package ex4;

public class Label {
    private final String _label;

    public Label(String label) {
        _label = label;
    }

    public void display() {
        System.out.println("display: " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }

    public boolean isNull(){
        return false;
    }

    // 팩토리 메소드
    public static Label newNull() {
        return NullLabel.getInstance();
    }

    private static class NullLabel extends Label {
        // 싱글톤
        private static final NullLabel sigleton = new NullLabel();
        private static NullLabel getInstance() {
            return sigleton;
        }

        private NullLabel() {
            super("(none)");
        }

        @Override
        public void display() {
        }

        @Override
        public boolean isNull() {
            return true;
        }
    }
}
