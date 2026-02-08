package prob5;

import java.util.Vector;

public class DragonLaunch {
    public static boolean willDragonEatOrNot(Vector<Person> v) {
        boolean removed;

        do {
            removed = false;
            for (int i = 0; i < v.size() - 1; i++) {
                char first = v.get(i).getGender();
                char second = v.get(i + 1).getGender();

                // Only B-G pair vanishes
                if (first == 'B' && second == 'G') {
                    v.remove(i + 1); // remove G
                    v.remove(i);     // remove B
                    removed = true;
                    break;           // restart from beginning
                }
            }
        } while (removed);

        // If vector is empty, dragon starves; otherwise, dragon eats
        return !v.isEmpty();
    }
}
