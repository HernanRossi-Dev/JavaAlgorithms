import java.util.BitSet;

public class BitReverseIncrement {
    private BitSet BitReverseCounter, Carry, PrevAns, PrevCarry, Ans;
    private BitSet ReverseOne;
    private int numBits;

    BitReverseIncrement(int k){
        numBits =k;
        BitReverseCounter = new BitSet(k);
        ReverseOne = new BitSet(k);
        ReverseOne.set(k-1);
        printBits(ReverseOne);
        printValue(ReverseOne);
    }

    public void incrementCounter(){
        PrevAns = new BitSet();
        PrevCarry = new BitSet();
        Ans = (BitSet)BitReverseCounter.clone();
        Ans.xor(ReverseOne);
        Carry = (BitSet)BitReverseCounter.clone();
        Carry.and(ReverseOne);
        int setBitIndex =0;
        while(Carry.cardinality() != 0){
            setBitIndex = Carry.nextSetBit(0);

            Carry.flip(setBitIndex);
            if(setBitIndex -1 < 0){

            }else{
                Carry.flip(setBitIndex-1);
            }
            PrevAns = (BitSet) Ans.clone();
            PrevCarry = (BitSet) Carry.clone();

            Ans.xor(PrevCarry);
            Carry.and(PrevAns);
        }
        BitReverseCounter = (BitSet)Ans.clone();
        System.out.println("The incremented counter is: ");
        printBits(BitReverseCounter);
        printValue(BitReverseCounter);
    }

    public void printBits(BitSet bitArray){
        System.out.println("Printing the bits of the array: ");
        for(int i = numBits -1 ; i >= 0; i--){
            if(bitArray.get(i)){
                System.out.print(" [1]");
            } else {
                System.out.print(" [0]");
            }

        }
        System.out.println("\n");
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
        for(int i =0; i< 6; i++) {
            System.out.print("\n**** Incrementing\n");
            reverseBitCounter.incrementCounter();
        }
    }
}
