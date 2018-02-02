import java.util.BitSet;

public class BitReverseIncrement {
    private BitSet BitReverseCounter;
    private BitSet Carry;
    private BitSet ReverseOne;
    private int carry = 0;
    private int prevAns = 0;
    private int prevCarry = 0;
    private int numBits;

    BitReverseIncrement(int k){
        numBits =k;
        BitReverseCounter = new BitSet(k);
        Carry = new BitSet(k);
        ReverseOne = new BitSet(k);
        ReverseOne.set(k-1);

        System.out.println("The reverse one bit mask value is:");
        printValue(ReverseOne);
    }

    public void incrementCounter(){


        printValue(BitReverseCounter);
    }

    public void printValue(BitSet bitArray) {
        double runningValue =0;
        for(int i =0; i < numBits; i++) {
            if(bitArray.get(i)){
                runningValue = runningValue + Math.pow(2, i);
            }
        }
        System.out.println("The value of this bit array is: " + runningValue);
    }

    public static void main(String[] args) {
        BitReverseIncrement reverseBitCounter = new BitReverseIncrement(4);
        reverseBitCounter.incrementCounter();

    }

}
