public class set_zero {
    public static void main(String[] args) {
        // int arr[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        int temp_row[] = new int[arr.length];
        int temp_col[] = new int[arr[0].length];

        for (int i = 0; i < temp_row.length; i++) {
            for (int j = 0; j < temp_col.length; j++) {
                if (arr[i][j] == 0) {
                    temp_row[i] = 1;
                    temp_col[j] = 1;
                }
            }
        }

        for (int i = 0; i < temp_row.length; i++) {
            if (temp_row[i] == 1) {
                for (int j = 0; j < temp_col.length; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < temp_col.length; i++) {
            if (temp_col[i] == 1) {
                for (int j = 0; j < temp_row.length; j++) {
                    arr[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < temp_row.length; i++) {
            for (int j = 0; j < temp_col.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
