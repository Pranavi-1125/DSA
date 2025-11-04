 int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                    sum = 0;
                    break;
                } else if (sum > k) {
                    sum = 0;
                    break;
                }
            }
        }