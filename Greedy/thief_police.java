public class thief_police {
    public static void main(String[] args) {
        char arr[] = { 'P', 'T', 'T', 'P', 'T', 'T', 'T', 'P', 'T' };

        int range = 1;
        int count = 0;

        int j = 0;
        int k = 0;
        int Pidx = -1;
        int Tidx = -1;

        // Find First Police and Thief
        for (int i = 0; i < arr.length; i++) {
            if (j == 0 && arr[i] == 'P') {
                j = -1;
                Pidx = i;
            } else if (k == 0 && arr[i] == 'T') {
                k = -1;
                Tidx = i;
            } else if (k == -1 && j == -1) {
                break;
            }
        }

        System.out.println(Pidx + " " + Tidx);

        while (Pidx != -1 && Tidx != -1) {

            int distance = Math.abs(Pidx - Tidx);

            if (distance <= range) {

                count++;

                int oldP = Pidx;
                int oldT = Tidx;

                Pidx = -1;
                Tidx = -1;

                for (int i = oldP + 1; i < arr.length; i++) {
                    if (arr[i] == 'P') {
                        Pidx = i;
                        break;
                    }
                }

                for (int i = oldT + 1; i < arr.length; i++) {
                    if (arr[i] == 'T') {
                        Tidx = i;
                        break;
                    }
                }

            } else {

                if (Pidx < Tidx) {

                    int oldP = Pidx;
                    Pidx = -1;

                    for (int i = oldP + 1; i < arr.length; i++) {
                        if (arr[i] == 'P') {
                            Pidx = i;
                            break;
                        }
                    }

                } else {

                    int oldT = Tidx;
                    Tidx = -1;

                    for (int i = oldT + 1; i < arr.length; i++) {
                        if (arr[i] == 'T') {
                            Tidx = i;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("count is :: " + count);
    }
}
