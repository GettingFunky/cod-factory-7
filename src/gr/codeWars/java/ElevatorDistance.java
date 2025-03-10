package gr.codeWars.java;
class ElevatorDistance {

    public static int elevatorDistance(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            result = result + Math.abs(arr[i+1] - arr[i]);
        }

        return result;
    }
}
