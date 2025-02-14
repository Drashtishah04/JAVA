import java.util.*;
class One {
    public void multi() {
        System.out.println("multi");
    }
}
class Two extends One {
    public void level() {
        System.out.println("level");
    }
}
class Three extends Two {
    public void inheritance() {
        System.out.println("inheritance");
    }
}

class Main {
    public static void main(String[] args) {
        Three m= new Three();
        m.multi();
        m.level();
        m.inheritance();
    }
}
