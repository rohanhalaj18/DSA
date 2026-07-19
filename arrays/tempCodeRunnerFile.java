int i = 0;
        if (arr.length == 0)
            System.out.println(0);
        
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);