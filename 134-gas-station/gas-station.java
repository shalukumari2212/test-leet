class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0 , totcost=0;

        // // find total  gas 
        // for(int val : gas){
        //     totgas += val;
        // }

        // //find total cost

        // for(int val: cost){
        //     totcost += val;
        // }
        
        // //find exist or not
        // if(totgas < totcost) return -1;

        // //find 
        // int start=0 , curGas=0;
        // for(int i=0 ;i<gas.length ;i++){
        //     curGas += gas[i] - cost [i];

        //     if(curGas < 0) {
        //         start=i+1;
        //         curGas =0;
        //     }

        // }
        // return start;
        int start=0 , curGas=0;
        for(int i=0;i< gas.length ;i++){
            totgas+= gas[i];
            totcost += cost[i];

            curGas += gas[i] -cost[i];
            if(curGas < 0) {
                start=i+1;
                curGas =0;
            } 
            

        }
        return totgas < totcost ? -1 :start;
    }
}